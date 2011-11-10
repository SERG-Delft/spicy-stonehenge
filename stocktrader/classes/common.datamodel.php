<?php
class BaseRequest {

    /**
     * @var array[0, unbounded] of (object)ExtensionType
     */
    public $extension;

}

class ExtensionType {

    /**
     * @var positiveInteger
     */
    public $id;

    /**
     * @var string
     */
    public $version;

    /**
     * @var string
     */
    public $contentType;

    /**
     * @var string
     */
    public $value;

    /**
     * @var array[0, unbounded] of anonymous0
     */
    public $blah;

}

class BaseResponse {

    /**
     * @var string
     *     NOTE: ack should follow the following restrictions
     *     You can have one of the following value
     *     Success
     *     Failure
     *     Warning
     *     PartialFailure
     */
    public $ack;

    /**
     * @var (object)ErrorMessage
     */
    public $errorMessage;

    /**
     * @var string
     */
    public $version;

    /**
     * @var dateTime
     */
    public $timestamp;

    /**
     * @var array[0, unbounded] of (object)ExtensionType
     */
    public $extension;

}

class ErrorMessage {

    /**
     * @var array[0, unbounded] of (object)CommonErrorData
     */
    public $error;

}

class ErrorData {

    /**
     * @var long
     */
    public $errorId;

    /**
     * @var string
     */
    public $domain;

    /**
     * @var string
     */
    public $subdomain;

    /**
     * @var token
     *     NOTE: severity should follow the following restrictions
     *     You can have one of the following value
     *     Error
     *     Warning
     */
    public $severity;

    /**
     * @var token
     *     NOTE: category should follow the following restrictions
     *     You can have one of the following value
     *     System
     *     Application
     *     Request
     */
    public $category;

    /**
     * @var string
     */
    public $message;

    /**
     * @var token
     */
    public $exceptionId;

    /**
     * @var array[0, unbounded] of ErrorParameter
     */
    public $parameter;

}

class CommonErrorData extends ErrorData {

    /**
     * @var string
     */
    public $errorName;

    /**
     * @var string
     */
    public $cause;

    /**
     * @var string
     */
    public $resolution;

    /**
     * @var string
     */
    public $errorGroups;

    /**
     * @var string
     */
    public $organization;

    /**
     * @var array[0, unbounded] of anonymous1
     */
    public $blah;

}


//common data types used by services

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

?>
