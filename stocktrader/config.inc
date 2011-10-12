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
 
//require_once('configservice.classmap.php');
require_once('utils/wsclient.util.php');

session_start();

function display_db_select_form() {
	$str = <<<EOF
	<tr>
		<td colspan="2"><h2>Select database</h2></td>
	</tr>
	<tr>
		<td><form action="config.php" method="post">
			<select name="database">	
				<option value="mssql">MSSQL</option>
				<option value="mysql">MySQL</option>
			</select>
			<input type="hidden" name="dbselect" value="true" />
		</td>
		<td>
			<input type="submit" value="Select" class="button" />
			</form>
		</td>
	</tr>
EOF;
	echo $str; 
}

function display_new_form($type) {
	$str = <<<EOF
	<tr>
		<td style="width: 290px;">Service Type</td>
		<td>
EOF;
	if ($type == 'BS') {
		$str .= <<<EOF
			<input type="radio" name="service_type" value="BS" checked="checked" />&nbsp; Business Service <br />
			<input type="radio" name="service_type" value="OPS" />&nbsp; Order Processing Service
EOF;
	} else if ($type == 'OPS') {
		$str .= <<<EOF
			<input type="radio" name="service_type" value="BS" />&nbsp; Business Service <br />
			<input type="radio" name="service_type" value="OPS" checked="checked" />&nbsp; Order Processing Service	
EOF;
	}
	
	$str .= <<<EOF
		</td>
	</tr>	
	<tr>
		<td>Service Name</td>
		<td><input type="text" id="sn" name="service_name" value="" style="width: 290px;" /></td>
	</tr>	
	<tr>
		<td>Service URL</td>
		<td><input type="text" name="service_url" value="" style="width: 290px;" /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td><input type="checkbox" name="service_sec" value="" />&nbsp; Use secure messaging</td>
	</tr>	
	<tr>
		<td colspan="2">
		<script type="text/javascript">
		function check_name() {
			var type = ""
			for (i = 0; i < document.stoneform.service_type.length; i++) {
				if (document.stoneform.service_type[i].checked == true) {
					type = document.stoneform.service_type[i].value
				}
			}						
			var name = document.getElementById("sn")
			var found = name.value.match( new RegExp(type + "$") )
			if (found == null) {
				alert("Service name should end in " + type)
				return false
			} else {
				return true
			}
		}		
		</script>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" name="submit" value="Add" class="button" onClick="return check_name()"/>&nbsp;<a href="config.php" style="border: 0px; text-decoration: none;"><input class="button" type="button" value="Cancel" /></a>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<div id="error"></div>
		</td>
	</tr>
EOF;
	echo $str;	
}

/*function get_proxy() {
	global $class_map;
	
	$client = new WSClient(array("wsdl" =>"http://atlantis.st.ewi.tudelft.nl:8080/configuration/ConfigurationServiceV1?wsdl",
    							 "classmap" => $class_map));	
	$proxy = $client->getProxy();
	
	return $proxy;
}*/

function display_bs_ops_conf_form() {
	
	//$proxy = get_proxy();
	$proxy = GetProxy("getClientConfig", CONFIG_CLASSMAP);

	$input = new getClientConfigRequest();
	$input->clientName = "PHP_CLIENT";
	$response = $proxy->getClientConfig($input);

	$bs = $response->BSName;

	$proxy = GetProxy("getBSConfig", CONFIG_CLASSMAP);
	
	$input = new getBSConfigRequest();
	$input->BSName = $bs;
	$response = $proxy->getBSConfig($input);
				
	$ops = $response->OPSName;
	
	$str = <<<EOF
	<tr>
		<td style="padding: 10px;">Business Service</td>
		<td>
		<select name="bs">
EOF;

	$proxy = GetProxy("getBSLocations", CONFIG_CLASSMAP);

	$input = new getBSLocationsRequest();
	$response = $proxy->getBSLocations($input);

	$response->locations = $response->locations == null ? array() : $response->locations;
	foreach($response->locations as $location) {
		$str .= '<option value="' .
				$location->ServiceName .
				'"';
		if ($location->ServiceName == $bs) {
			$str .= ' selected="selected"';
		}
		$str .= '>' .
				$location->ServiceName .
				'</option>';
	}
	
	$str .= '</select></td></tr>';
	echo $str;
	
	$str = <<<EOF
	<tr>
		<td style="padding: 10px;">Order Processing Service</td>
		<td><select name="ops" id="ops">
EOF;

	$proxy = GetProxy("getOPSLocations", CONFIG_CLASSMAP);

	$input = new getOPSLocationsRequest();
	$response = $proxy->getOPSLocations($input);

	$response->locations = $response->locations == null ? array() : $response->locations;
	foreach($response->locations as $location) {
		$str .= '<option value="' .
				$location->ServiceName .
				'"';
		if ($location->ServiceName == $ops) {
			$str .= ' selected="selected"';
		}
		$str .= '>' .
				$location->ServiceName .
				'</option>';
	}
	$str .= '</select></td></tr>';
	echo $str;
	
	$str = <<<EOF
	<tr>		
		<td style="text-align: center;" colspan="2">
			<input type="hidden" name="form_type" value="basic" />
			<input type="submit" name="submit" class="button" value="Set" /><br /><br />
			<input type="submit" name="submit" class="button" value="Restore Defaults" />
			<input type="submit" name="submit" class="button" value="Advanced Configuration" />
		</td>
	</tr>
EOF;
	echo $str;
}

function update_clienttobs($bs) {
	
	//$proxy = get_proxy();
	$proxy = GetProxy("setClientToBS", CONFIG_CLASSMAP);

	$input = new setClientToBSRequest();
	$input->Bs = $bs;
	$input->Client = "PHP_CLIENT";
	
	$proxy->setClientToBS($input);
}

function update_bstoops($ops, $bs) {
	
	//$proxy = get_proxy();
	$proxy = GetProxy("setBSToOPS", CONFIG_CLASSMAP);	

	$input = new setBSToOPSRequest();
	$input->Bs = $bs;
	$input->Ops = $ops;
	
	$proxy->setBSToOPS($input);
}

function update_service($name, $url, $sec) {
	$proxy = get_proxy();
	
	$input = new SetServiceLocation();
	$input->location = new ServiceLocation();
	$input->location->Sec = $sec ? "true" : "false";
	$input->location->ServiceName = $name;
	$input->location->ServiceURL = $url;
	
	$proxy->SetServiceLocation($input);
}

function update_params($post, $type) {	
	if ($type == "basic") {
		update_clienttobs($post['bs']);
		update_bstoops($post['ops'], $post['bs']);			
	} else if ($type == "advanced") {
		$bssec = (isset($_POST['bs_sec'])) ? true : false;
		$opssec = (isset($_POST['ops_sec'])) ? true : false;
		update_clienttobs($post['bs_name']);
		update_bstoops($post['bs_name'], $post['ops_name']);
		update_service($post['bs_name'], $post['bs_url'], $bssec);
		update_service($post['ops_name'], $post['ops_url'], $opssec);		
	} else if ($type == "addnew") {
		if (isset($post['service_name']) &&
			isset($post['service_url']) ) {
		update_service($post['service_name'], $post['service_url'], $post['service_sec']);
			}
	}
}

function restore_defaults() {
	$post = array('bs' => 'DOTNET_BS', 'ops' => 'DOTNET_OPS');
	update_params($post, "basic");
}

function display_advanced_config_form() {	
	
	//$proxy = get_proxy();
	$proxy = GetProxy("getClientConfig", CONFIG_CLASSMAP);	

	$input = new getClientConfigRequest();
	$input->clientName = "PHP_CLIENT";
	
	$response = $proxy->getClientConfig($input);
		
	$bs = $response->BSName;

	$proxy = GetProxy("getBSConfig", CONFIG_CLASSMAP);	
	$input = new getBSConfigRequest();
	$input->BSName = $bs;

	$response = $proxy->getBSConfig($input);
				
	$ops = $response->OPSName;
	
	$proxy = GetProxy("getBSLocations", CONFIG_CLASSMAP);	
	$input = new getBSLocationsRequest();
	$response = $proxy->getBSLocations($input);
	
	$bs_list = array();
	foreach($response->locations as $location) {
		$bs_list[$location->ServiceName] =
			$location->ServiceURL .
			'##' .
			$location->Sec;
	}
	
	$proxy = GetProxy("getOPSLocations", CONFIG_CLASSMAP);	
	$input = new getOPSLocationsRequest();
	$response = $proxy->getOPSLocations($input);
	
	$ops_list = array();
	foreach($response->locations as $location) {
		$ops_list[$location->ServiceName] =
			$location->ServiceURL .
			'##' .
			$location->Sec;
	}
	
	// business service options
	$str = <<<EOF
	<tr>
		<td style="width: 290px;">Business Service</td>
		<td>
		<script type="text/javascript">
		function change_bs(bs) {
			var bslist = new Array()

EOF;
	foreach ($bs_list as $k => $v) {			
		$str .= 'bslist["' . $k . '"] = "' . $v . '"' . "\n";
	}
		
	$str .= <<<EOF
			var bsurl = document.getElementById("bs_url")
			var bssec = document.getElementById("bs_sec")
			var url = bslist[bs.value].split('##')
			bsurl.value = url[0]
			if (url[1] == 1) {
				bssec.checked = true
			} else {
				bssec.checked = false
			}
		}
		</script>
		<select name="bs_name" id="bs_name" onChange="change_bs(this);">
EOF;
	
	foreach ($bs_list as $k => $v) {
		$str .= '<option value="' . $k . '"';
		if ($k == $bs) {
			 $str .= ' selected="selected"';
		}
		$str .= '>' . $k . '</option>';
	}
	$str .= '</select> <a href="config.php?type=BS">Add New</a></td></tr>';
	echo $str;
	
	$default_url = preg_split("/##/", $bs_list[$bs]);
	$str = <<<EOF
	<tr>
		<td>Business Service URL</td>
		<td><input type="text" name="bs_url" id="bs_url" value="$default_url[0]" style="width: 290px;"/></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td><input type="checkbox" name="bs_sec" id="bs_sec"
EOF;
	if ($default_url[1] == "true") {
		$str .= ' checked="checked"';
	}
	$str .= <<<EOF
		/> Use secure messaging</td>
	</tr>
	<tr>
		<td colspan="2">&nbsp;</td>
	</tr>
EOF;
	echo $str;
	
	// order processor service options
	$str = <<<EOF
	<tr>
		<td>Order Processing Service</td>
		<td>
		<script type="text/javascript">
		function change_ops(ops) {
			var opslist = new Array()
			
EOF;
	
	foreach ($ops_list as $k => $v) {
		$str .= 'opslist["' . $k . '"] = "' . $v . '"' . "\n";
	}

	$str .= <<<EOF
			var opsurl = document.getElementById("ops_url")
			var opssec = document.getElementById("ops_sec")
			var url = opslist[ops.value].split('##')
			opsurl.value = url[0]
			if (url[1] == 1) {
				opssec.checked = true
			} else {
				opssec.checked = false
			}
		}
		</script>
		<select name="ops_name" id="ops_name" onChange="change_ops(this);">
EOF;

	foreach($ops_list as $k => $v) {
		$str .= '<option value="' . $k . '"';
		if ($k == $ops) {
			$str .= ' selected="selected"';
		}
		$str .= '>' . $k . '</option>';			
	}
	$str .= '</select> <a href="config.php?type=OPS">Add New</a></td></tr>';
	echo $str;
	
	$default_url = preg_split("/##/", $ops_list[$ops]);
	$str = <<<EOF
	<tr>
		<td>Order Processing Service URL</td>
		<td><input type="text" name="ops_url" id="ops_url" value="$default_url[0]" style="width: 290px;"/></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td><input type="checkbox" name="ops_sec" id="ops_sec"
EOF;
	if ($default_url[1] == "true") {
		$str .= ' checked="checked"';
	}
	$str .= <<<EOF
		/> Use secure messaging</td>
	</tr>
EOF;
	echo $str;
	
	$str = <<<EOF
	<tr>		
		<td style="text-align: center;" colspan="2">
			<input type="hidden" name="form_type" value="advanced" />
			<input type="submit" name="submit" class="button" value="Set" /><br /><br />
			<input type="submit" name="submit" class="button" value="Restore Defaults" />
			<input type="submit" name="submit" class="button" value="Basic Configuration" />
		</td>
	</tr>
EOF;
	echo $str;
}

?>
