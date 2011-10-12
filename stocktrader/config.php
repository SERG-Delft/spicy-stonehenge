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

require_once ("request_processor.php");
require_once ("config.inc");

// session_start();

if (isset($_POST['dbselect']) && ($_POST['dbselect'] == "true")) {
	$_SESSION['database'] = $_POST['database'];
}

if (isset($_POST['submit'])) {
	if ($_POST['submit'] == "Set") {
		update_params($_POST, $_POST['form_type']);
	} else if ($_POST['submit'] == "Restore Defaults") {		
		restore_defaults();
	} else if ($_POST['submit'] == "Advanced Configuration") {
		$_SESSION['advanced_config'] = true;
	} else if ($_POST['submit'] == "Basic Configuration") {
		unset($_SESSION['advanced_config']);
	} else if ($_POST['submit'] == "Add") {
		update_params($_POST, "addnew");
	}
}

?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<title>Apache Stonehenge - PHP StockTrader - Configuration
		<?php echo (isset($_SESSION['advanced_config']) && ($_SESSION['advanced_config'] == true)) ? " : Advanced " : ""; ?>
		</title>
		<link href="style.css" rel="stylesheet" type="text/css" media="all" />
	</head>

	<body>

	<form method="post" action="config.php" name="stoneform">

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

		<div class="main-title">
		<h1>Configuration <?php echo (isset($_SESSION['advanced_config']) && ($_SESSION['advanced_config'] == true)) ? " : Advanced " : ""; ?></h1>
		<script type="text/javascript">
			var thisdate = new Date();
			document.writeln(thisdate.toLocaleString());
		</script>
		</div>
		
		<table border="0" align="center">

<?php 

	if (isset($_SESSION['advanced_config']) && ($_SESSION['advanced_config'] == true)) {
		if (isset($_GET['type']) && ($_GET['type'] == 'BS')) {
			display_new_form('BS');
		} else if (isset($_GET['type']) && ($_GET['type'] == 'OPS')) {
			display_new_form('OPS');
		} else {
			display_advanced_config_form();
		}
	} else {
		display_bs_ops_conf_form();	
	}	

?>

		</table>
		
		</div>
		<div id="footer">
				<div style="float:right;">Powered by 
				<a href="http://wso2.org/projects/wsf/php"><img align="top" src="images/powered-by-logo.gif" style="margin-top:-3px; margin-left: 0px;"/></a></div>
	</div>

		</div>
		</form>
	</body>
</html>
<?php exit; ?>
