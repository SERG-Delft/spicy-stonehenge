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
     * @var int
     */
    public $exchAmount;

}

class exchangeCurrencyResponse extends BaseResponse {

    /**
     * @var string
     */
    public $exchResult;

}
?>
