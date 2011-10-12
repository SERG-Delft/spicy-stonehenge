<?php

require_once("common.datamodel.php");

// PHP classes corresponding to the data types in defined in WSDL
class getClientConfigRequest extends BaseRequest {

    /**
     * @var string
     */
    public $clientName;

}

class getClientConfigResponse extends BaseResponse {

    /**
     * @var string
     */
    public $BS;

    /**
     * @var string
     */
    public $BSName;

    /**
     * @var boolean
     */
    public $Sec;

}

class getBSConfigRequest extends BaseRequest {

    /**
     * @var string
     */
    public $BSName;

}

class getBSConfigResponse extends BaseResponse {

    /**
     * @var string
     */
    public $DBHostName;

    /**
     * @var string
     */
    public $DBName;

    /**
     * @var int
     */
    public $DBPort;

    /**
     * @var string
     */
    public $OPS;

    /**
     * @var string
     */
    public $OPSName;

    /**
     * @var boolean
     */
    public $Sec;

}

class getOPSConfigRequest extends BaseRequest {

    /**
     * @var string
     */
    public $OPSName;

}

class getOPSConfigResponse extends BaseResponse {

    /**
     * @var string
     */
    public $DBHostName;

    /**
     * @var string
     */
    public $DBName;

    /**
     * @var int
     */
    public $DBPort;

}

class setClientToBSRequest extends BaseRequest {

    /**
     * @var string
     */
    public $Bs;

    /**
     * @var string
     */
    public $Client;

}

class setClientToBSResponse extends BaseResponse {

}

class setBSToOPSRequest extends BaseRequest {

    /**
     * @var string
     */
    public $Bs;

    /**
     * @var string
     */
    public $Ops;

}

class setBSToOPSResponse extends BaseResponse {

}

class getBSLocationsRequest extends BaseRequest {

}

class getBSLocationsResponse extends BaseResponse {

    /**
     * @var array[1, unbounded] of (object)ServiceLocation
     */
    public $locations;

}

class ServiceLocation {

    /**
     * @var string
     */
    public $ServiceURL;

    /**
     * @var string
     */
    public $ServiceName;

    /**
     * @var boolean
     */
    public $Sec;

}

class setServiceLocationRequest extends BaseRequest {

    /**
     * @var (object)ServiceLocation
     */
    public $location;

}

class setServiceLocationResponse extends BaseResponse {

}

class getOPSLocationsRequest {

}

class getOPSLocationsResponse {

    /**
     * @var array[1, unbounded] of (object)ServiceLocation
     */
    public $locations;

}
?>
