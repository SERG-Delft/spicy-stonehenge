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

require_once("request_processor.php");

//$successfulExchange = false;/*change the logic here*/
$infor = "";

if(!IsLoggedIn())
{
	header("Location: login.php");
}
else
{
	//print("user login");
	/*If the user requested to update his profile information*/

	if (isset($_POST['EXCHANGEREQUEST'])){
		$userID = GetUserFromCookie();
		$baseCurrency = $_POST['BASECURRENCY'];	
		$aimCurrency = $_POST['AIMCURRENCY'];
		$exchAmount = $_POST['EXCHAMOUNT'];
		if($exchAmount != null && ($baseCurrency != $aimCurrency)){
			$currencySupported = checkCurrency($userID, $baseCurrency, $aimCurrency); 
			if($currencySupported){
				$amountEnough = checkAmount($userID, $baseCurrency, $exchAmount);
				if($amountEnough){				
					$exchResult = ExchangeCurrency ($baseCurrency,$aimCurrency,$exchAmount);
					if($exchResult>0){
						$userWalletDataReturn = updateWalletData($userID, $baseCurrency,$aimCurrency,$exchAmount, $exchResult);
						$infor = "";
					}
					
				}else{
					$infor = "Sorry, you don't have enough amount, pleas input less.";
				}
			}else{
				$infor = "Sorry, the currency you chose is not supported, please choose another one.";
			}
		}else{
			$infor = "Please input the exchange amount or choose the currencies.";
		}
		
	}
	$userWalletDataReturn = GetWalletData(GetUserFromCookie());
}
    
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="generator" content="Adobe GoLive" />
		<title>Apache Stonehenge - PHP StockTrader - Login</title>
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
	
			<div class="main-title">
			<h1>Exchange</h1>
			<script type="text/javascript">
				var thisdate = new Date();
				document.writeln(thisdate.toLocaleString());
			</script>
			</div>
		
			<div class="exchange" align="center">
				<form method="post"  action="exchange.php">
					<table>
					<tr>  
						<td>Exchanged Amount: </td>
						<td><input name="EXCHAMOUNT" type="text" id="" size="15"/></td>					
                        <td>From Currency</td>
                        <td><select name="BASECURRENCY" align="center">
                                <option value="EUR">EUR</option>
                                <option value="USD">USD</option>
                                <option value="GBP">GBP</option>
								<option value="CNY">CNY</option>
								<option value="INR">INR</option>
								<option value="CSD">CSD</option>
                            </select>
                        </td>
                        <td>To Currency</td>
                        <td><select name="AIMCURRENCY" align="center">
                                <option value="EUR">EUR</option>
                                <option value="USD">USD</option>
                                <option value="GBP">GBP</option>
								<option value="CNY">CNY</option>
								<option value="INR">INR</option>
                            </select>
                        </td>
                        
                    	
                     </tr>
					</table>
					<input type = "submit" name = "EXCHANGEREQUEST" value = "Exchange" class="button" align="center"/> 
                </form>
				</p>
				</p>
				<?php
		/*Display the wallet information of a the user*/
					print("<p style=\"color: red\" align=\"center\">".$infor."</p>");		
					if ($userWalletDataReturn)	//set as wallet
					{
						print("User's current wallet status:");
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
							<td class=\"left\">INR Balance:</td>
							<td>".$userWalletDataReturn->inr."</td></tr>");						
						print("</tbody></table>");
					}	
					
		
		?>
          	</p>
			</div>	
		</div>
		
			<div id="footer">
				<div style="float:right;">Powered by 
				<a href="http://wso2.org/projects/wsf/php"><img align="top" src="images/powered-by-logo.gif" style="margin-top:-3px; margin-left: 0px;"/></a></div>
			</div>
		</div>
	
	</body>
</html>
<?php exit; ?>
