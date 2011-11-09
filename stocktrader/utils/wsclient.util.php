<?php

define("CONFIG_CLASSMAP",0);
define("BUSINESS_CLASSMAP",1);
/*for exchange service*/
define("EXCHANGE_CLASSMAP",2);

define("CONFIG_WSDL","http://localhost:8080/configuration-service-war/ConfigurationServiceV1?wsdl");
define("BUSINESS_WSDL","http://localhost:8080/business-service-war/BusinessServiceV1?wsdl");
/*for exchange service*/
define("EXCHANGE_WSDL","http://localhost:8080/exchange-service-war/ExchangeServiceV1?wsdl");

define("CONFIG_DEFAULT_ENDPOINT", "http://localhost:8080/configuration-service-war/ConfigurationServiceV1");

define ("CLIENT_NAME", "PHP_CLIENT");

require_once("classes/ConfigService.datamodel.php");
require_once("classes/BusinessService.datamodel.php");
/*for exchange service*/
require_once("classes/ExchangeService.datamodel.php");


/*for exchange service*/
function GetProxy($methodName, $constClassmap)
{
	$aWSDL = array(CONFIG_CLASSMAP => CONFIG_WSDL, BUSINESS_CLASSMAP => BUSINESS_WSDL, EXCHANGE_CLASSMAP => EXCHANGE_WSDL);

	$sEndpoint = null;
	if ($constClassmap == CONFIG_CLASSMAP) {
		$sEndpoint = CONFIG_DEFAULT_ENDPOINT;
	} else if ($constClassmap == BUSINESS_CLASSMAP) {
		$sEndpoint = GetBSEndPoint();
	} else if ($constClassmap == EXCHANGE_CLASSMAP) {
		$sEndpoint = "http://localhost:8080/exchange-service-war/ExchangeServiceV1";
	}

	/*define the class map */
    	$client = new WSClient(array ("wsdl" => $aWSDL[$constClassmap],
			"classmap" => GetClassMap($constClassmap),
			"to" => $sEndpoint,
			"useSOAP" => 1.1,
			"httpHeaders" => array("X-TURMERIC-OPERATION-NAME" => $methodName)));
		//We can set this port through tcpmon

	$proxy = $client->getProxy();
	return $proxy;
}


/*
 * Get the endpoint of business service
 */
function GetBSEndPoint()
{
//	global $class_map;
	
//	$client = new WSClient(
//              array("wsdl" => "http://atlantis.st.ewi.tudelft.nl:8080/configuration/ConfigurationServiceV1?wsdl",
//                    "classmap" => $class_map,
//		    "to"=>"http://atlantis.st.ewi.tudelft.nl:8080/configuration/ConfigurationServiceV1",
//		    "useSOAP" => 1.1,
//                    "httpHeaders" => array("X-TURMERIC-OPERATION-NAME"=>"getClientConfig")
//		   )
//			      );

//	$proxy = $client->getProxy();

	$proxy = GetProxy("getClientConfig", CONFIG_CLASSMAP);
	
	$input = new getClientConfigRequest();
	$input->clientName = CLIENT_NAME;
	$response = $proxy->getClientConfig($input);	

	return $response->BS;
}

function GetClassMap($constWS) {
	$aConfig = array(
	    "BaseRequest" => "BaseRequest",
	    "ExtensionType" => "ExtensionType",
	    "getClientConfigRequest" => "getClientConfigRequest",
	    "BaseResponse" => "BaseResponse",
	    "ErrorMessage" => "ErrorMessage",
	    "ErrorData" => "ErrorData",
	    "CommonErrorData" => "CommonErrorData",
	    "getClientConfigResponse" => "getClientConfigResponse",
	    "getBSConfigRequest" => "getBSConfigRequest",
	    "getBSConfigResponse" => "getBSConfigResponse",
	    "getOPSConfigRequest" => "getOPSConfigRequest",
	    "getOPSConfigResponse" => "getOPSConfigResponse",
	    "setClientToBSRequest" => "setClientToBSRequest",
	    "setClientToBSResponse" => "setClientToBSResponse",
	    "setBSToOPSRequest" => "setBSToOPSRequest",
	    "setBSToOPSResponse" => "setBSToOPSResponse",
	    "getBSLocationsRequest" => "getBSLocationsRequest",
	    "getBSLocationsResponse" => "getBSLocationsResponse",
	    "ServiceLocation" => "ServiceLocation",
	    "setServiceLocationRequest" => "setServiceLocationRequest",
	    "setServiceLocationResponse" => "setServiceLocationResponse",
	    "getOPSLocationsRequest" => "getOPSLocationsRequest",
	    "getOPSLocationsResponse" => "getOPSLocationsResponse");

	$aBusiness = array(
		"BaseRequest" => "BaseRequest",
		"ExtensionType" => "ExtensionType",
		"getOrdersRequest" => "getOrdersRequest",
		"BaseResponse" => "BaseResponse",
		"ErrorMessage" => "ErrorMessage",
		"ErrorData" => "ErrorData",
		"CommonErrorData" => "CommonErrorData",
		"getOrdersResponse" => "getOrdersResponse",
		"OrderData" => "OrderData",
		"getAccountDataRequest" => "getAccountDataRequest",
		"getAccountDataResponse" => "getAccountDataResponse",
		"AccountData" => "AccountData",
		"getAccountProfileDataRequest" => "getAccountProfileDataRequest",
		"getAccountProfileDataResponse" => "getAccountProfileDataResponse",
		"AccountProfileData" => "AccountProfileData",
		"updateAccountProfileRequest" => "updateAccountProfileRequest",
		"updateAccountProfileResponse" => "updateAccountProfileResponse",
		"buyRequest" => "buyRequest",
		"buyResponse" => "buyResponse",
		"sellRequest" => "sellRequest",
		"sellResponse" => "sellResponse",
		"getHoldingsRequest" => "getHoldingsRequest",
		"getHoldingsResponse" => "getHoldingsResponse",
		"HoldingData" => "HoldingData",
		"getClosedOrdersRequest" => "getClosedOrdersRequest",
		"getClosedOrdersResponse" => "getClosedOrdersResponse",
		"getMarketSummaryRequest" => "getMarketSummaryRequest",
		"getMarketSummaryResponse" => "getMarketSummaryResponse",
		"MarketSummaryData" => "MarketSummaryData",
		"QuoteData" => "QuoteData",
		"getQuoteRequest" => "getQuoteRequest",
		"getQuoteResponse" => "getQuoteResponse",
		"getHoldingRequest" => "getHoldingRequest",
		"getHoldingResponse" => "getHoldingResponse",
		"getTopOrdersRequest" => "getTopOrdersRequest",
		"getTopOrdersResponse" => "getTopOrdersResponse",
		"sellEnhancedRequest" => "sellEnhancedRequest",
		"sellEnhancedResponse" => "sellEnhancedResponse",
		"loginRequest" => "loginRequest",
		"loginResponse" => "loginResponse",
		"logoutRequest" => "logoutRequest",
		"logoutResponse" => "logoutResponse",
		"getAllQuotesRequest" => "getAllQuotesRequest",
		"getAllQuotesResponse" => "getAllQuotesResponse",
		"registerRequest" => "registerRequest",
		"registerResponse" => "registerResponse",
		"getWalletDataRequest" => "getWalletDataRequest",
		"getWalletDataResponse" => "getWalletDataResponse",
		"WalletData" => "WalletData",
		//"updateWalletDataRequest" => "updateWalletDataRequest",
		//"updateWalletDataResponse" => "updateWalletDataResponse"
		);
		
		/*for exchange service*/
	$aExchange = array(
		"BaseRequest" => "BaseRequest",
		"ExtensionType" => "ExtensionType",
		"BaseResponse" => "BaseResponse",
		"ErrorMessage" => "ErrorMessage",
		"ErrorData" => "ErrorData",
		"CommonErrorData" => "CommonErrorData",
		"exchangeCurrencyRequest" => "exchangeCurrencyRequest",
		"exchangeCurrencyResponse" => "exchangeCurrencyResponse",
		"updateWalletDataRequest" => "updateWalletDataRequest",
		"updateWalletDataResponse" => "updateWalletDataResponse",
		"WalletData" => "WalletData",
		"checkCurrencyRequest" => "checkCurrencyRequest",
		"checkCurrencyResponse" => "checkCurrencyResponse",
		"checkAmountRequest" => "checkAmountRequest",
		"checkAmountResponse" => "checkAmountResponse");	
		

		/*for exchange service*/
	$aClassmap = array(CONFIG_CLASSMAP => $aConfig, BUSINESS_CLASSMAP => $aBusiness, EXCHANGE_CLASSMAP => $aExchange);

	return $aClassmap[$constWS];
}
?>
