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

$isSell = false;

require_once("request_processor.php");
if(!IsLoggedIn())
{
	header("Location: login.php");
}
else
{
	if ($_POST['SELL'])
	{
		$isSell = $_POST['SELL'];
		$holdingID = $_POST['HOLDINGID'];
		$quantity = $_POST['QUANTITY'];
		$symbol = $_POST['SYMBOL'];
	}
	else if ($_POST['BUY'])
	{
		$quantity = $_POST['QUANTITY'];
		$symbol = $_POST['SYMBOL'];
		$price = $_POST['PRICE'];
		$isBuy = $_POST['BUY'];
	}
	else
	{
		print ("This is not buy or sell.");
	}
}
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="generator" content="Adobe GoLive" />
		<title>Apache Stonehenge - PHP StockTrader - Quote</title>
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
					<h1>Trade</h1>
					<script type=\"text/javascript\">
						var thisdate = new Date();
						document.writeln(thisdate.toLocaleString());
					</script>
				</div>
				
				<div id="confirm">
				<h2>Trade Confirmation</h2>
				<div class="confirm-content">
					<form action="quotes.php" method="post">
					<?php

						if ($isSell)
						{
							print("<p>You have requested to sell all or part of your holding ".$holdingID.". 
									This holding has a total of ".$quantity." shares of stock ".$symbol.". 
									Please indicate how many share to sell.</p>");

							print("<nobr>Number of Shares: <input type=\"text\" name=\"QUANTITY\" value=\"".$quantity."\" id=\"\" size=\"10\"/>");
							print ("<input type=\"hidden\" name=\"HOLDINGID\" value=\"".$holdingID."\"></input>");
							print ("<input type=\"submit\" name=\"SELL\" value=\"Sell\" class=\"button\"/>");
						}
						else if ($isBuy)
						{
							print("<nobr>Number of Shares: <input type=\"text\" name=\"QUANTITY\" value=\"".$quantity."\" id=\"\" size=\"10\"/>");
							print("<p>You have requested to buy shares of ".$symbol." which is currently trading at $".$price.".</p>");
							print ("<input type=\"hidden\" name=\"SYMBOL\" value=\"".$symbol."\"></input>");
							print ("<input type=\"submit\" name=\"BUY\" value=\"Buy\" class=\"button\"/>");
						}
						else
						{
						}
						print ("<input type=\"submit\" name = \"CANCEL\" value=\"Cancel\" class=\"button\"/></nobr>");
					?>
					</form>
				</div>
				</div>
				
			<div class="bottom">
			<form method = "post"  action = "quotes.php">
			<input type="text" value="<?php print ($symbol); ?>" name="SYMBOLS" size="25"/>
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
