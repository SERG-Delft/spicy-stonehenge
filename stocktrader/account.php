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

ini_set('display_errors', 1);
require_once("request_processor.php");
if(!IsLoggedIn())
{
	header("Location: login.php");
}
else
{
	/*If the user requested to update his profile information*/
	if (isset($_POST['UPDATEUSERPROFILE']))
	{
		$userID = GetUserFromCookie();
		$password = $_POST['PASSWORD'];
		$fullName = $_POST['FULLNAME'];
		$address = $_POST['ADDRESS'];
		$email = $_POST['EMAIL'];
		$creditCard = $_POST['CREDITCARD'];

		UpdateAccountProfile($userID, 
			$fullName, $email, $address, $creditCard, $password);
	}
	if(isset($_POST['EXCHANGE']))
	{
		header("Location: exchange.php");
	}
	$ordersReturn = GetOrders(GetUserFromCookie())->orderData;
	$accountSummary = GetUserAccountSummary($ordersReturn);
	$userAccountDataReturn = 
		GetAccountData(GetUserFromCookie());
	$userAccountProfileDataReturn = 
		GetAccountProfileData(GetUserFromCookie());
		//for wallet
	$userWalletDataReturn = 
		GetWalletData(GetUserFromCookie());
}

function FormatDate($date) {
	if ($date) {
		return date("m/d/Y h:i:s A", $date);
	}
	return "-";
}
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="generator" content="Adobe GoLive" />
		<title>Apache Stonehenge - PHP StockTrader - Account</title>
		<link href="style.css" rel="stylesheet" type="text/css" media="all" />
	</head>

	<body>
		<div id="content">
			<div id="header">
				<div class="logo"><img src="images/logo.png"></div>
			</div>
			<div id="header-links">
				<table>
					<tr>
					<td>
						<a href="index.php">Welcome</a>
					</td>
					<td>
						<a href="home.php">Home</a>
					</td>
					<td>
						<a href="account.php">Account</a>
					</td>
					<td>
						<a href="portfolio.php">Portfolio</a>
					</td>
					<td>
						<a href="quotes.php">Quotes/Trade</a>
					</td>
					<td>
						<a href="exchange.php">Exchange</a>
					</td>
					<td>
						<a href="glossary.php">Glossary</a>
					</td>
					<td>
						<a href="config.php">Config</a>
					</td>
					<td>
						<a href="login.php">Login/Logout</a>
					</td>
					</tr>
				</table>
			</div>
			<div id="middle">

			<?php
				$getClosedOrdersReturn = GetClosedOrders();

				/*Checking whether there is new status change happened in the 
				related to a particular order.*/
				if ($getClosedOrdersReturn)
				{
					print ("<p style=\"color: red\" align=\"center\">Trade Alert: 
						The following orders have completed.</p>");
					print("<table class=\"table-outer\" 
						cellspacing=\"0\" align=\"center\"><thead>
						<tr><th>Order ID</th><th>Order Status</th>
						<th>Creation Date</th><th>Completion Date</th>
						<th>Txn Fee</th><th>Type</th><th>Symbol</th>
						<th>Quantity</th></tr></thead><tbody>");

					$index = 0;
					while ($getClosedOrdersReturn[$index])
					{
						print ("<tr><td>".$getClosedOrdersReturn[$index]->orderID."</td>
							<td>".$getClosedOrdersReturn[$index]->orderStatus."</td>
							<td>".FormatDate($getClosedOrdersReturn[$index]->openDate)."</td>
							<td>".FormatDate($getClosedOrdersReturn[$index]->completionDate)."</td>
							<td>$".$getClosedOrdersReturn[$index]->orderFee."</td>
							<td>".$getClosedOrdersReturn[$index]->orderType."</td>
							<td>".$getClosedOrdersReturn[$index]->symbol."</td>
							<td>".$getClosedOrdersReturn[$index]->quantity."</td></tr>");
						$index ++;
					}
					print("</tbody></table><br/><br/>");
				}

				/*Display the account summary information of a particular user.*/
				if ($accountSummary)
				{	
					print ("<div class=\"main-title\"><h1>Account Information
						</h1><script type=\"text/javascript\">var thisdate = new Date();
					document.writeln(thisdate.toLocaleString());</script></div>");

					print ("<table class=\"table-outer\" cellspacing=\"0\" align=\"center\">
						<thead><tr><th>Subtotal Buys</th><th>Subtotal Sells</th><th>Subtotal Fees
						</th><th>Net Impact Cash Balance</th></tr></thead><tbody><tr>");

					printf("<td class=\"currency\">$%.2f</td>", $accountSummary->totalBuys);
					printf("<td class=\"currency\">$%.2f</td>", $accountSummary->totalSells);
					printf("<td class=\"currency\">$%.2f</td>", $accountSummary->totalTax);
					printf("<td class=\"currency\">");

					if ($accountSummary->totalImpact > 0)
					{
						printf("<span class=\"price-loss\">$%.2f</span>", $accountSummary->totalImpact);
					}
					else if ($accountSummary->totalImpact < 0)
					{
						printf("<span class=\"price-gain\">$%.2f</span>", $accountSummary->totalImpact);
					}
					else
					{
						printf("<span>($%.2f)</span>", $accountSummary->totalImpact);
					}
					printf("</td></tr></tbody></table>");
				}

				/*Display the orders a particular user is associated with.*/
				if ($ordersReturn)
				{
					print("<div><p><b>Total Orders Shown</b></p></div>");
					print("<table class=\"table-outer\" cellspacing=\"0\" align=\"center\"><thead><tr>");
					print("<th>Order ID</th><th>Order Status</th><th>Creation Date</th><th>Completion Date
						</th><th>Txn Fee</th><th>Type</th><th>Symbol</th><th>Quantity</th><th>Price
						</th><th>Total</th></tr></thead><tbody>");
					
					foreach($ordersReturn as $order)
					{
						print ("<tr><td>".$order->orderID."</td>
							<td>".$order->orderStatus."</td>
							<td>".FormatDate($order->openDate)."
							</td><td>".FormatDate($order->completionDate)."</td>
							<td class=\"currency\">$".$order->orderFee."</td>
							<td>".$order->orderType."</td>");
							
						print ("<td><form action = \"quotes.php\" method = \"post\">
							<input type=\"hidden\" name=\"SYMBOLS\" value=\"".
							$order->symbol."\"/>
							<input type=\"submit\" name=\"GETQUOTE\" value=\"".
							$order->symbol."\"/></form></td>");

						print ("<td class=\"currency\">".$order->quantity."</td>
							<td class=\"currency\">$".$order->price."</td>
							<td class=\"currency\">$".(($order->price * 
							$order->quantity) + 
							$order->orderFee)."</td></tr>");

					}
					print ("</tbody></table>");
				}
				
				/*Display the account profile information associted to a 
				the user.*/
				if ($userAccountProfileDataReturn)
				{
					print ("<form action = \"account.php\"  method =\"post\">
						<table class=\"profile\" cellspacing=\"0\" width=\"100%\"><thead><tr>
						<th>Update Account Profile:".GetUserFromCookie()."</th></tr></thead><tbody><tr><td>");
					print ("<table cellspacing=\"0\" align=\"center\">");
					print ("<tr><td>Full Name:</td><td><input name=\"FULLNAME\" type=\"text\" value=\"".
						$userAccountProfileDataReturn->fullName."\" id=\"\" size=\"25\"/>
						</td><td>Email Address:</td><td><input name=\"EMAIL\" type=\"text\" value=\"".
						$userAccountProfileDataReturn->email."\" id=\"\" size=\"25\"/></td></tr>");
					print ("<tr><td>Address:</td><td><input name=\"ADDRESS\" type=\"text\" value=\"".
						$userAccountProfileDataReturn->address."\" id=\"\" size=\"25\"/></td>
						<td>Password:</td><td><input type=\"password\" name=\"PASSWORD\" type=\"text\" value=\"".
						$userAccountProfileDataReturn->password."\" id=\"\" size=\"25\"/></td></tr>");
					print ("<tr><td>Credit Card:</td><td><input name=\"CREDITCARD\" type=\"text\" value=\"".
						$userAccountProfileDataReturn->creditCard."\" id=\"\" size=\"25\"/></td>
						<td>Confirm Password:</td><td><input type=\"password\" name=\"PASSWORD\" type=\"text\" value=\"".
						$userAccountProfileDataReturn->password."\" id=\"\" size=\"25\"/></td></tr>");
					print ("<tr><td colspan=\"4\" class=\"button\"><input type=\"submit\" 
						name=\"UPDATEUSERPROFILE\"value=\"Update\" class=\"button\"/></td></tr>");
					print ("</table></form>");

					/*Display the account information of a the user*/
					if ($userAccountDataReturn)	
					{
						print("<table align=\"center\" class=\"profile-content\" cellspacing=\"0\"><tbody>");
						print ("<tr><td class=\"left\">Account ID:</td>
							<td>".$userAccountDataReturn->accountID."</td><td class=\"left\">
							Account Created</td><td>".FormatDate($userAccountDataReturn->creationDate)."</td></tr>");
						print ("<tr><td class=\"left\">User ID:</td>
							<td>".$userAccountDataReturn->profileID."</td><td class=\"left\">
							Last Login:</td><td>".FormatDate($userAccountDataReturn->lastLogin)."</td></tr>");
						print ("<tr><td class=\"left\">Opening Balance:</td>
							<td>".$userAccountDataReturn->openBalance."".$userAccountDataReturn->currencyType."</td>
							<td class=\"left\">Total Logins:</td>
							<td>".$userAccountDataReturn->loginCount."</td></tr>");
						print("<tr><td class=\"left\">Cash Balance:</td>");
							
						if ($userAccountDataReturn->balance > 0)
						{
							print("<td><span class=\"price-gain\">".
								$userAccountDataReturn->balance."".$userAccountDataReturn->currencyType."</span></td>");
						}
						else if($userAccountDataReturn->balance < 0)
						{
							print("<td><span class=\"price-loss\">".
								(-1) * $userAccountDataReturn->balance."".$userAccountDataReturn->currencyType."</span></td>");
						}
						else
						{
							print("<td>".$userAccountDataReturn->balance."".$userAccountDataReturn->currencyType."</td>");
						}	
						print("<td class=\"left\">Total Logouts:</td>
							<td>".$userAccountDataReturn->logoutCount."</td></tr>");
						//print("<td class=\"left\">Currency Type:</td>
							//<td>".$userAccountDataReturn->currencyType."</td></tr>");
						print("</tbody></table>");
					}
					
					/*Display the wallet information of a the user*/
					if ($userWalletDataReturn)	//set as wallet
					{
						print("<table align=\"center\" class=\"profile-content\" cellspacing=\"0\"><tbody>");
						print ("<tr><td class=\"left\">User ID:</td>
							<td>".$userWalletDataReturn->userID."</td>
							<td class=\"left\">USD Balance:</td>
							<td>".$userWalletDataReturn->usd."</td></tr>");
						print ("<tr><td class=\"left\">EUR Balance:</td>
							<td>".$userWalletDataReturn->eur."</td>
							<td class=\"left\">GBP Balance:</td>
							<td>".$userWalletDataReturn->gbp."</td>	</tr>");
						print("<tr><td class=\"left\">CNY Balance:</td>
							<td>".$userWalletDataReturn->cny."</td>
							<td class=\"left\">IBR Balance:</td>
							<td>".$userWalletDataReturn->inr."</td></tr>");						
						print("</tbody></table>");
						print ("<tr><td colspan=\"4\" class=\"button\"><input type=\"submit\" 
						name=\"EXCHANGE\"value=\"Exchange\" class=\"button\"/></td></tr>");
					}					
					
					
					
					
					print("</td></tr></tbody></table>");
				}
			?>
			<div class="bottom">
			<form method = "post"  action = "quotes.php">
			<input type="text" value="<?php print ("SYMBOL"); ?>" name="SYMBOLS" size="25"/>
			<input type="submit" value="Get Quote" name="GETQUOTE" class="button"/>
			</form>
			</div>
			</div>
			<div id="footer">
				<div style="float:right;">Powered by 
				<a href="http://wso2.org/projects/wsf/php"><img align="top" src="images/powered-by-logo.gif" style="margin-top:-3px; margin-left: 0px;"/></a></div>
			</div>
		</div>
	</body>

</html>
<?php 

/* Tiago: Without this, I get a segfault. Whale oil beef hooked! */
exit; 

?>
