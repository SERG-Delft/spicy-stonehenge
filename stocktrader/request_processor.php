<?php
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
error_reporting(E_ALL);
ini_set('display_errors', 1);

//require_once('configservice.classmap.php');
require_once('classes/BusinessService.datamodel.php');
require_once('utils/wsclient.util.php');

define ("STATUS_SUCCESS", 1);
define ("STATUS_FAILURE", 0);
define ("TRUE", 1);
define ("FALSE", 0);
define ("ORDER_TYPE_BUY", "buy");
define ("ORDER_TYPE_SELL", "sell");
define ("COOKIE_USERNAME", "username");
define ("COOKIE_ENDPOINT", "endpoint");

/*this will set the default end point if end point is NOT already set.*/
//SetDefaultEndpoint(); 

/**
 * This method registes a new user in the system
 * @param userID id of the user
 * @param password password of the user
 * @param fullname full name of the user
 * @param address address of the user
 * @param email email address of the user
 * @param creditcard credit card number of the user
 * @param openBalance initial balance of the user
 * @return account details of the registerd user on success. NULL otherwise.
 */

function RegisterUser($userID, $password, $fullname, 
	$address, $email, $creditcard, $openBalance)
{
	$proxy = GetProxy("register", BUSINESS_CLASSMAP);
	$input = new registerRequest();
	$input->userID = $userID;
	$input->password = $password;
	$input->fullname = $fullname;
	$input->address = $address;
	$input->email = $email;
	$input->creditcard = $creditcard;
	$input->openBalance = $openBalance;

	$response = $proxy->register($input);
	return $response;
}

/**
 * Updates account profile information
 * @param userID id of the user
 * @param fullname full name of the user
 * @param email email address of the user
 * @param address address of the user
 * @param creditcard credit card number of the user
 * @param password password of the user
 * @return account details of the modified user on success. NULL otherwise.
 */

function UpdateAccountProfile($userID, $fullName, $email, 
	$address, $creditCard, $password)
{
	$proxy = GetProxy("updateAccountProfile",BUSINESS_CLASSMAP);
	$input = new updateAccountProfileRequest();
	$input->accountProfileData = new AccountProfileData();
	$input->accountProfileData->userID = $userID;
	$input->accountProfileData->password = $password;
	$input->accountProfileData->fullName = $fullName;
	$input->accountProfileData->address = $address;
	$input->accountProfileData->email = $email;
	$input->accountProfileData->creditCard = $creditCard;
    $response = $proxy->updateAccountProfile($input);
	return $response;
}

/**
 * Given the order details of a user, this method calculates summery of
 * activities of the user. This includes total money spent on buying stocks
 * total money earned from selling them etc.
 * @param ordersReturn collection of orders of a user
 * @return summery of user's activities
 */

function GetUserAccountSummary($ordersReturn)
{
	/* Tiago: added NULL check for when there's no orders */
	if ($ordersReturn == NULL) {
		$accountSummary = new userAccountSummary();
        	$accountSummary->totalBuys = 0;
        	$accountSummary->totalSells = 0;
        	$accountSummary->totalTax = 0;
        	$accountSummary->totalImpact = 0;
        	return $accountSummary;
	}

	$buys = 0;
	$tax = 0;
	$sells = 0;
	foreach($ordersReturn as $order)
	{
		if ($order->orderType == ORDER_TYPE_BUY)
		{
			$buys = $buys + (($order->price) * 
				($order->quantity)) + 
				($order->orderFee);
		}
		else if ($order->orderType == ORDER_TYPE_SELL)
		{
			$sells = $sells +  (($order->price) * 
				($order->quantity)) - 
				($ordersReturn[$index]->orderFee);
		}
		$tax = $tax + $order->orderFee;
	}
	$accountSummary = new userAccountSummary();
	$accountSummary->totalBuys = $buys;
	$accountSummary->totalSells = $sells;
	$accountSummary->totalTax = $tax;
	$accountSummary->totalImpact = $buys + $tax - $sells;
	return $accountSummary;
}

/**
 * Given the holdings of a user, this methods calculate total market value of 
 * holding and number of holdings
 * @param holdings collection of holdings of a user
 * @return summery of holding details
 */

function GetHoldingInformation($holdings)
{
	if ($holdings == null) {
		$holdingInfo = new holdingInformation();
        	$holdingInfo->totalHoldings = 0;
        	$holdingInfo->noOfHoldings = 0;

        	return $holdingInfo;
	}

	$holdingsReturn = $holdings;
	$index = 0;
	$totalHoldings= 0;
	$marketValue = 0;
	while($holdingsReturn->HoldingDataBean[$index])
	{
			$bean = $holdingsReturn->HoldingDataBean[$index];
			if (!$quoteInfo[$bean->quoteID])
			{
				$quotes = GetQuote($bean->quoteID);
				if ($quotes)
					$quotesReturn = $quotes->getQuoteReturn;
				$quoteInfo[$bean->quoteID] = $quotesReturn->price;
			}
			$marketValue = $marketValue + ($quoteInfo[$bean->quoteID]) * ($bean->quantity); 

		$totalHoldings = $totalHoldings + $holdingsReturn->HoldingDataBean[$index]->quantity *
			$holdingsReturn->HoldingDataBean[$index]->purchasePrice;
		$index ++;
	}
}

/**
 * Writes user id to cookie
 * @param username user id of the current user
 */

function WriteCookie($username)
{
	setcookie(COOKIE_USERNAME, $username, time()+3600);
}

/**
 * Deletes user id from cookie
 * @param username user id of current user
 */
function DeleteCookie($username)
{
	setcookie(COOKIE_USERNAME, $username, time()-3600);
	if (isset($_COOKIE[COOKIE_USERNAME]))
		unset($_COOKIE[COOKIE_USERNAME]);
}

/** 
 * When user logout, user id will be deleted from the cookie
 * @param username user id of current user
 */

function LogoutUser($username)
{
	$proxy = GetProxy("logout", BUSINESS_CLASSMAP);
	$input = new logoutRequest();
	$input->userID = $username;
	$response = $proxy->logout($input);
	DeleteCookie($username);
}

/**
 * Gets user id from cookie
 */

function GetUserFromCookie()
{
	return ($_COOKIE[COOKIE_USERNAME]);
}

/**
 * Checks whether user is logged in. If so, user id cookie would have
 * been already set. Checking whether cookie is set equals to check 
 * whether user is logged in
 */

function IsLoggedIn()
{
	return isset($_COOKIE[COOKIE_USERNAME]);
}

/**
 * Gets user id of current user
 */

function GetUser()
{
	return ($_COOKIE[COOKIE_USERNAME]);
}

/**
 * Store business service's endpoint in cookie
 * @param endPoint end point address of the business service
 */

function WriteEndpoint($endPoint)
{
	setcookie(COOKIE_ENDPOINT, $endPoint, time()+3600);
}

/**
 * Sets default end point
 */

function SetDefaultEndpoint()
{
	if(GetEndpoint() == "")
		WriteEndpoint(DEFAULT_ENDPOINT);
}

/**
 * Gets stored end point address of business service
 */

function GetEndpoint()
{
	// return ($_COOKIE[COOKIE_ENDPOINT]);
}

/**
 * Gets proxy object to make communication with business service
 */



/**
 * Sends login request to verify whether current user is authorized
 * @param userid user id of current user
 * @param password password given by current user
 * @return profile id of the user if login is success. NULL otherwise
 */
 
function Login($userid, $password)
{
	$proxy = GetProxy("login", BUSINESS_CLASSMAP);
	$input = new loginRequest();
	$input->userID = $userid;
	$input->password = $password;
	$response = $proxy->login($input);

	return $response->account->profileID;
}

/**
 * Gets orders of current user
 * @param userid user id of current user
 * @return collection of orders of the user
 */

function GetOrders($userid)
{
	$proxy = GetProxy("getOrders", BUSINESS_CLASSMAP);
	$input = new getOrdersRequest();
	$input->userID = $userid;
	$response = $proxy->getOrders($input);
	return $response;
}

/**
 * Gets market summary
 * @return market summery
 */

function GetMarketSummary()
{
	$proxy = GetProxy("getMarketSummary", BUSINESS_CLASSMAP);
    $input = new getMarketSummaryRequest();
	$response = $proxy->getMarketSummary($input);
	return $response;
}

/**
 * Gets account details of current user
 * @param userid user id of current user
 * @return account details if success. NULL otherwise
 */

function GetAccountData($userid)
{
	$proxy = GetProxy("getAccountData", BUSINESS_CLASSMAP);
    $input = new getAccountDataRequest();
	$input->userID = $userid;
    $response = $proxy->getAccountData($input);
	return $response->accountData;
}

/**
 * Gets account profile information of current user
 * @param userid user id of current user
 * @return account profile data of current user if success. NULL otherwise
 */

function GetAccountProfileData($userid)
{
	$proxy = GetProxy("getAccountProfileData", BUSINESS_CLASSMAP);
    $input = new getAccountProfileDataRequest();
	$input->userID = $userid;
    $response = $proxy->getAccountProfileData($input);
	return $response->accountProfileData;
}

/**
 * Gets holding details of given user
 * @param userid user id of current user
 * returns collection of holding if success. NULL otherwise
 */

function GetHoldings($userid)
{
	$proxy = GetProxy("getHoldings", BUSINESS_CLASSMAP);
    $input = new getHoldingsRequest();
	$input->userID = $userid;
    $response = $proxy->getHoldings($input);
	return $response->holdingData;
}

/**
 * Gets quote of given symbol
 * @param symbol id of the stock
 * @return details of the symbol when success. NULL otherwise
 */

function GetQuote($symbol)
{
	$proxy = GetProxy("getQuote", BUSINESS_CLASSMAP);
        $input = new getQuoteRequest();
	$input->symbol = $symbol;
	$input->symbol = "s:AAPL";
	$response = $proxy->getQuote($input);
	return $response->quoteData;
}

/**
 * Gets all the quotes in the database
 * Tiago: this method was added by me as at some point we want
 * all the quotes, not just specific ones.
 * @return details of the symbols when success. NULL otherwise
 */
function GetAllQuotes()
{
        $proxy = GetProxy("getAllQuotes", BUSINESS_CLASSMAP);
        $input = new getAllQuotesRequest();
        $response = $proxy->getAllQuotes($input);
        return $response->quotes;
}

/**
 * Sells given holding or part of it of given user
 * @param userID user id of current user
 * @param holdingID holding id of the holding
 * @param quantity number of stocks to be sold
 * @return details of sell order if success. NULL otherwise
 */

function SellEnhanced($userID, $holdingID, $quantity)
{
	$proxy = GetProxy();
    $input = new sellEnhanced();
	$input->userID = $userID;
	$input->holdingID = $holdingID;
	$input->quantity = $quantity;
    $response = $proxy->sellEnhanced($input);
	return $response;
}

/**
 * Buys number of stocks of given symbol 
 * @param userID user id of current user
 * @param symbol symbol of needed stock
 * @quantity number of stocks needed
 * @mode mode of buying
 * @return details of buy order if success. NULL otherwise
 */

function Buy($userID, $symbol, $quantity, $mode)
{
	$proxy = GetProxy("buy", BUSINESS_CLASSMAP);
    	$input = new buyRequest();
	$input->symbol = $symbol;
	$input->userID = $userID;
	$input->quantity = $quantity;
	$input->orderProcessingMode = $mode;
    	$response = $proxy->buy($input);
	return $response;
}

/**
 * Gets closed orders of current user
 * @return collection of orders whose status is closed
 */

function GetClosedOrders()
{
	$proxy = GetProxy("getClosedOrders", BUSINESS_CLASSMAP);
	$input = new getClosedOrdersRequest();
	$input->userID = GetUserFromCookie();
	if($input->userID)
	{
		$response = $proxy->getClosedOrders($input);
		$getClosedOrdersReturn = $response->orderData;
	}
	return $getClosedOrdersReturn;
}

/**
 * Gets closed orders of current user if there are any. Then prints it
 */

function checkForClosedOrders()
{
	$proxy = GetProxy();
	$input = new getClosedOrders();
	$input->userID = GetUserFromCookie();
	if($input->userID)
	{
		$response = $proxy->getClosedOrders($input);
		$getClosedOrdersReturn = $response->getClosedOrdersReturn;

		$index = 0;
		while ($getClosedOrdersReturn->OrderDataBean[$index])
		{
			print("THIS IS THE ID OF THE JUST CLOSED ORDER:");
			print($getClosedOrdersReturn->OrderDataBean[$index]->orderID);
			print("\n");
			$index ++;
		}
	}
}

?>
