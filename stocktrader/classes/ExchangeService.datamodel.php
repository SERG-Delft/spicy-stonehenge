<?php

// PHP classes corresponding to the data types in defined in WSDL
require_once("common.datamodel.php");

class exchangeCurrencyRequest extends BaseRequest {

    /**
     * @var string
     */
    public $baseCurrency;

    /**
     * @var string
     */
    public $aimCurrency;

    /**
     * @var double
     */
    public $exchAmount;

}

class exchangeCurrencyResponse extends BaseResponse {

    /**
     * @var double
     */
    public $exchResult;

}

class updateWalletDataRequest {

    /**
     * @var string
     */
    public $userID;

    /**
     * @var string
     */
    public $fromCurrency;

    /**
     * @var string
     */
    public $toCurrency;

    /**
     * @var double
     */
    public $fromAmount;

    /**
     * @var double
     */
    public $toAmount;

}

class updateWalletDataResponse {

    /**
     * @var (object)WalletData
     */
    public $walletData;

}

class WalletData {

    /**
     * @var string
     */
    public $userID;

    /**
     * @var double
     */
    public $eur;

    /**
     * @var double
     */
    public $usd;

    /**
     * @var double
     */
    public $gbp;

    /**
     * @var double
     */
    public $cny;

    /**
     * @var double
     */
    public $inr;

}

class checkCurrencyRequest {

    /**
     * @var string
     */
    public $userID;

    /**
     * @var string
     */
    public $inputCurrency;

}

class checkCurrencyResponse {

    /**
     * @var boolean
     */
    public $currencyExist;

}

class checkAmountRequest {

    /**
     * @var string
     */
    public $userID;

    /**
     * @var string
     */
    public $currencyType;

    /**
     * @var double
     */
    public $checkAmount;

}

class checkAmountResponse {

    /**
     * @var boolean
     */
    public $amountEnough;

}
?>
