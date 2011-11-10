<?php

require_once("common.datamodel.php");

/* These classes are, apparently, LOCAL! NOT based on WSDL. */
class userAccountSummary
{
	public $totalBuys; //double
	public $totalSells; //double
	public $totalTax; //double
	public $totalImpact; //double
}

class holdingInformation
{
	public $totalHoldings;
	public $noOfHoldings;
}
/**/

class getOrdersRequest extends BaseRequest {

    /**
     * @var string
     */
    public $userID;

}

class getOrdersResponse extends BaseResponse {

    /**
     * @var array[0, unbounded] of (object)OrderData
     */
    public $orderData;

}

class OrderData {

    /**
     * @var int
     */
    public $accountID;

    /**
     * @var int
     */
    public $holdingID;

    /**
     * @var int
     */
    public $orderID;

    /**
     * @var string
     */
    public $orderType;

    /**
     * @var string
     */
    public $orderStatus;

    /**
     * @var dateTime
     */
    public $openDate;

    /**
     * @var dateTime
     */
    public $completionDate;

    /**
     * @var double
     */
    public $quantity;

    /**
     * @var double
     */
    public $price;

    /**
     * @var double
     */
    public $orderFee;

    /**
     * @var string
     */
    public $symbol;

}

class getAccountDataRequest extends BaseRequest {

    /**
     * @var string
     */
    public $userID;

}

class getAccountDataResponse extends BaseResponse {

    /**
     * @var (object)AccountData
     */
    public $accountData;

}

class AccountData {

    /**
     * @var string
     */
    public $profileID;

    /**
     * @var double
     */
    public $openBalance;

    /**
     * @var double
     */
    public $balance;

    /**
     * @var dateTime
     */
    public $creationDate;

    /**
     * @var dateTime
     */
    public $lastLogin;

    /**
     * @var int
     */
    public $logoutCount;

    /**
     * @var int
     */
    public $loginCount;

    /**
     * @var int
     */
    public $accountID;
	
	/**
     * @var string
     */
    public $currencyType;

}

class getAccountProfileDataRequest extends BaseRequest {

    /**
     * @var string
     */
    public $userID;

}

class getAccountProfileDataResponse extends BaseResponse {

    /**
     * @var (object)AccountProfileData
     */
    public $accountProfileData;

}

class AccountProfileData {

    /**
     * @var string
     */
    public $creditCard;

    /**
     * @var string
     */
    public $email;

    /**
     * @var string
     */
    public $address;

    /**
     * @var string
     */
    public $fullName;

    /**
     * @var string
     */
    public $password;

    /**
     * @var string
     */
    public $userID;

}

class updateAccountProfileRequest extends BaseRequest {

    /**
     * @var (object)AccountProfileData
     */
    public $accountProfileData;

}

class updateAccountProfileResponse extends BaseResponse {

    /**
     * @var (object)AccountProfileData
     */
    public $accountProfileData;

}

class buyRequest extends BaseRequest {

    /**
     * @var string
     */
    public $userID;

    /**
     * @var string
     */
    public $symbol;

    /**
     * @var double
     */
    public $quantity;

    /**
     * @var int
     */
    public $orderProcessingMode;

}

class buyResponse extends BaseResponse {

    /**
     * @var (object)OrderData
     */
    public $orderData;

}

class sellRequest extends BaseRequest {

    /**
     * @var string
     */
    public $userID;

    /**
     * @var int
     */
    public $holdingID;

    /**
     * @var int
     */
    public $orderProcessingMode;

}

class sellResponse extends BaseResponse {

    /**
     * @var (object)OrderData
     */
    public $orderData;

}

class getHoldingsRequest extends BaseRequest {

    /**
     * @var string
     */
    public $userID;

}

class getHoldingsResponse extends BaseResponse {

    /**
     * @var array[0, unbounded] of (object)HoldingData
     */
    public $holdingData;

}

class HoldingData {

    /**
     * @var string
     */
    public $quoteID;

    /**
     * @var dateTime
     */
    public $purchaseDate;

    /**
     * @var double
     */
    public $purchasePrice;

    /**
     * @var double
     */
    public $quantity;

    /**
     * @var int
     */
    public $holdingID;

}

class getClosedOrdersRequest extends BaseRequest {

    /**
     * @var string
     */
    public $userID;

}

class getClosedOrdersResponse extends BaseResponse {

    /**
     * @var array[0, unbounded] of (object)OrderData
     */
    public $orderData;

}

class getMarketSummaryRequest extends BaseRequest {

}

class getMarketSummaryResponse extends BaseResponse {

    /**
     * @var (object)MarketSummaryData
     */
    public $marketSummaryData;

}

class MarketSummaryData {

    /**
     * @var dateTime
     */
    public $summaryDate;

    /**
     * @var array[1, unbounded] of (object)QuoteData
     */
    public $topLosers;

    /**
     * @var array[1, unbounded] of (object)QuoteData
     */
    public $topGainers;

    /**
     * @var double
     */
    public $volume;

    /**
     * @var double
     */
    public $openTSIA;

    /**
     * @var double
     */
    public $TSIA;

}

class QuoteData {

    /**
     * @var double
     */
    public $volume;

    /**
     * @var double
     */
    public $change;

    /**
     * @var double
     */
    public $high;

    /**
     * @var double
     */
    public $low;

    /**
     * @var double
     */
    public $open;

    /**
     * @var double
     */
    public $price;

    /**
     * @var string
     */
    public $companyName;

    /**
     * @var string
     */
    public $symbol;

}

class getQuoteRequest extends BaseRequest {

    /**
     * @var string
     */
    public $symbol;

}

class getQuoteResponse extends BaseResponse {

    /**
     * @var (object)QuoteData
     */
    public $quoteData;

}

class getHoldingRequest extends BaseRequest {

    /**
     * @var string
     */
    public $userID;

    /**
     * @var int
     */
    public $holdingID;

}

class getHoldingResponse extends BaseResponse {

    /**
     * @var (object)HoldingData
     */
    public $holdingData;

}

class getTopOrdersRequest extends BaseRequest {

    /**
     * @var string
     */
    public $userID;

}

class getTopOrdersResponse extends BaseResponse {

    /**
     * @var array[0, unbounded] of (object)OrderData
     */
    public $orderData;

}

class sellEnhancedRequest extends BaseRequest {

    /**
     * @var string
     */
    public $userID;

    /**
     * @var int
     */
    public $holdingID;

    /**
     * @var double
     */
    public $quantity;

}

class sellEnhancedResponse extends BaseResponse {

    /**
     * @var (object)OrderData
     */
    public $orderData;

}

class loginRequest {

    /**
     * @var string
     */
    public $userID;

    /**
     * @var string
     */
    public $password;

}

class loginResponse {

    /**
     * @var (object)AccountData
     */
    public $account;

}

class logoutRequest {

    /**
     * @var string
     */
    public $userID;

}

class logoutResponse {

}

class getAllQuotesRequest {

    /**
     * @var int
     */
    public $start;

    /**
     * @var int
     */
    public $limit;

}

class getAllQuotesResponse {

    /**
     * @var array[0, unbounded] of (object)QuoteData
     */
    public $quotes;

}

class registerRequest {

    /**
     * @var string
     */
    public $userID;

    /**
     * @var string
     */
    public $password;

    /**
     * @var string
     */
    public $fullname;

    /**
     * @var string
     */
    public $address;

    /**
     * @var string
     */
    public $email;

    /**
     * @var string
     */
    public $creditcard;

    /**
     * @var double
     */
    public $openBalance;

    /**
     * @var string
     */
    public $currencyType;

}

class registerResponse {

    /**
     * @var string
     */
    public $out;

}

class getWalletDataRequest {

    /**
     * @var string
     */
    public $userID;

}

class getWalletDataResponse {

    /**
     * @var (object)WalletData
     */
    public $walletData;

}


//class updateWalletDataRequest {

    /**
     * @var (object)WalletData
     */
  //  public $walletData;

//}



//class updateWalletDataResponse {

    /**
     * @var (object)WalletData
     */
//    public $newWalletData;

//}

?>
