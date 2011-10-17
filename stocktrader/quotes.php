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

$isReply = false;

if(!IsLoggedIn())
{
	header("Location: login.php");
}
else if(isset($_POST['GETQUOTE']))
{
	/*This is a request to get quote information for a particular symbol*/
	$symbol = $_POST['SYMBOLS'];
	if ($symbol)
	{
		$quotesReturn = GetQuote($symbol);
	}
}
else if (isset($_POST['BUY']) || isset($_POST['SELL']))
{
	/*This is a buy or sell request*/
	$quantity = $_POST['QUANTITY'];
	$userID = GetUserFromCookie();
	$isBuy = FALSE;
	$isSell = FALSE;

	$buyReturn = null;
	
	if (isset($_POST['BUY']))
	{
		$mode = 0;
		$isBuy = TRUE;
		$symbol = $_POST['SYMBOL'];
		$response = Buy($userID, $symbol, $quantity, $mode);

		if ($response->orderData->orderID)
		{
			$buyReturn = $response->orderData;
			$isReply = TRUE;
		}
		else
		{
			$response = NULL;
		}
	}
	else if(isset($_POST['SELL']))
	{
		$isSell = TRUE;
		$holdingID = $_POST['HOLDINGID'];
		$response = SellEnhanced($userID, $holdingID, $quantity);
		if ($response != null)
		{
			$sellEnhancedReturn = $response;
			$isReply = TRUE;
		}
		else
		{
			$response = NULL;
		}
	}
}
else
{
	/*If not above, the user has just wanted to
	visit the quote page*/
	$quotesInitialPage = TRUE;
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

			<?php
				$getClosedOrdersReturn = GetClosedOrders();
				if ($getClosedOrdersReturn)
				{
					/*Checking whether there is new status change happened in the 
					related to a particular order.*/
					print ("<p style=\"color: red\" align=\"center\">Trade Alert: The following orders have completed.</p>");
					print("<table class=\"table-outer\" cellspacing=\"0\" align=\"center\"><thead>
						<tr><th>Order ID</th><th>Order Status</th><th>Creation Date</th><th>Completion Date</th>
						<th>Txn Fee</th><th>Type</th><th>Symbol</th><th>Quantity</th></tr></thead><tbody>");

					$index = 0;
					while ($getClosedOrdersReturn->OrderDataBean[$index])
					{
						print ("<tr><td>".$getClosedOrdersReturn->OrderDataBean[$index]->orderID."</td>
							<td>".$getClosedOrdersReturn->OrderDataBean[$index]->orderStatus."</td>
							<td>".date("m/d/Y h:i:s A", $getClosedOrdersReturn->OrderDataBean[$index]->openDate)."</td>
							<td>".date("m/d/Y h:i:s A", $getClosedOrdersReturn->OrderDataBean[$index]->completionDate)."</td>
							<td>$".$getClosedOrdersReturn->OrderDataBean[$index]->orderFee."</td>
							<td>".$getClosedOrdersReturn->OrderDataBean[$index]->orderType."</td>
							<td>".$getClosedOrdersReturn->OrderDataBean[$index]->symbol."</td>
							<td>".$getClosedOrdersReturn->OrderDataBean[$index]->quantity."</td></tr>");
						$index ++;
					}
					print("</tbody></table><br/><br/>");
				}

				if ($isReply == TRUE)
				{
					if ($isBuy) {
						$orderID = $buyReturn->orderID;
						$quantity = $buyReturn->quantity;
						$strOperation = "buy";
						$orderStatus = $buyReturn->orderStatus;
						$openDate = $buyReturn->openDate;
						$orderType = $buyReturn->orderType;
						$symbol = $buyReturn->symbol;
						$orderFee = $buyReturn->orderFee;
					} elseif ($isSell) {
						$orderID = $sellEnhancedReturn->orderData->orderID;
                                                $quantity = $sellEnhancedReturn->orderData->quantity;
                                                $strOperation = "sell";
                                                $orderStatus = $sellEnhancedReturn->orderData->orderStatus;
                                                $openDate = $sellEnhancedReturn->orderData->openDate;
                                                $orderType = $sellEnhancedReturn->orderData->orderType;
						$symbol = $sellEnhancedReturn->orderData->symbol;
						$orderFee = $sellEnhancedReturn->orderData->orderFee;
					}

					/*Check whether the user has requested to buy or sell some quote.*/
					print ("<div class=\"main-title\"><h1>New Order</h1>
						<script type=\"text/javascript\">var thisdate = new Date();
					document.writeln(thisdate.toLocaleString());</script></div>");
					print ("<p align=\"center\">Order ".$orderID." to ".$strOperation." ".$quantity." shares of ".$symbol." has been submitted for processing.</p>");
					print ("<p align=\"center\">Order Details:</p>");
					print ("<table class=\"table-outer\" cellspacing=\"0\" align=\"center\"><thead><tr>
						<th>Order ID</th><th>Order Status</th><th>Creation Date</th>
						<th>Completion Date</th><th>Txn Fee</th><th>Type</th><th>Symbol</th>
							<th>Quantity</th></tr></thead>
							<tbody>");

					print ("<tr><td>".$orderID."</td><td>".$orderStatus.
						"</td><td>".date("m/d/Y h:i:s A", $openDate)."</td><td>Pending".
						"</td><td>$".$orderFee."</td><td>".$orderType.
						"</td><td>".$symbol."</td><td>".$quantity."</td></tr>");
					print ("</tbody></table>");
				}

				else if (isset($_POST['GETQUOTE']))
				{
					print("<div class=\"main-title\"><h1>Stock Quotes</h1>");
					print("<script type=\"text/javascript\">var thisdate = new Date();
					document.writeln(thisdate.toLocaleString());</script>"); 
					print("</div>");
					print("<table class=\"table-outer\" cellspacing=\"0\" align=\"center\"><thead>
						<tr><th>Symbol</th><th>Company</th><th>Volume</th><th>Price Range</th>
						<th>Open Price</th><th>Current Price</th><th>Gain(Loss)</th><th>Trade</th></tr></thead><tbody>");

					if ($quotesReturn->symbol)
					{
						print ("<tr><td>".$quotesReturn->symbol."</td><td>".$quotesReturn->companyName.
							"</td><td>".$quotesReturn->volume."</td><td>$".$quotesReturn->low."-$".
							$quotesReturn->high."</td><td>$".$quotesReturn->open."</td>
							<td>$".$quotesReturn->price."</td><td>");

						if ($quotesReturn->change > 0)
						{
							print ("<span class=\"price-gain\">$".number_format($quotesReturn->change, 2)."</span>");
						}
						else if ($quotesReturn->change < 0)
						{
							print ("<span class=\"price-loss\">$".number_format($quotesReturn->change, 2)."</span>");
						}
						else
						{
							print ("<span>$".$quotesReturn->change."</span>");
						}
						print("</td><td><form action=\"confirmation.php\" method=\"post\">
							<input type=\"hidden\" name=\"QUANTITY\" value=\"".$quotesReturn->volume."\">
							<input type=\"hidden\" name=\"SYMBOL\" value=\"".$quotesReturn->symbol."\">
							<input type=\"hidden\" name=\"PRICE\" value=\"".$quotesReturn->price."\">
							<input type=\"submit\" name=\"BUY\" value=\"Buy\"></input></form></td></tr>");
					}
					print("</tbody></table>");
				}
				else if($quotesInitialPage == TRUE)
				{
					print("<div class=\"main-title\"><h1>Stock Quotes</h1>");
					print("<script type=\"text/javascript\">var thisdate = new Date();
					document.writeln(thisdate.toLocaleString());</script>"); 
					print("</div>");
					print("<table class=\"table-outer\" cellspacing=\"0\" align=\"center\"><thead>
						<tr><th>Symbol</th><th>Company</th><th>Volume</th><th>Price Range</th>
						<th>Open Price</th><th>Current Price</th><th>Gain(Loss)</th><th>Trade</th></tr></thead><tbody>");
					
					/* Tiago: I redid the whole cycle below. The original was stupid. */

					$aQuotes = GetAllQuotes();
					foreach($aQuotes as $quotesReturn)
					{
						if ($quotesReturn)
						{
							if ($quotesReturn->symbol)
							{
								print ("<tr><td>".$quotesReturn->symbol."</td><td>".$quotesReturn->companyName.
									"</td><td>".$quotesReturn->volume."</td><td>$".$quotesReturn->low."-$".
									$quotesReturn->high."</td><td>$".$quotesReturn->open."</td>
									<td>$".$quotesReturn->price."</td><td>");

								if ($quotesReturn->change > 0)
								{
									print ("<span class=\"price-gain\">$".number_format($quotesReturn->change, 2)."</span>");
								}
								else if ($quotesReturn->change < 0)
								{
									print ("<span class=\"price-loss\">$".number_format($quotesReturn->change, 2)."</span>");
								}
								else
								{
									print ("<span>$".$quotesReturn->change."</span>");
								}
								print("</td><td><form action=\"confirmation.php\" method=\"post\">
									<input type=\"hidden\" name=\"QUANTITY\" value=\"".$quotesReturn->volume."\">
									<input type=\"hidden\" name=\"SYMBOL\" value=\"".$quotesReturn->symbol."\">
									<input type=\"hidden\" name=\"PRICE\" value=\"".$quotesReturn->price."\">
									<input type=\"submit\" name=\"BUY\" value=\"Buy\"></input></form></td></tr>");
							}
						}
					}
					print("</tbody></table>");

				}

				else
				{
					print("<div class=\"main-title\"><h1>Stock Quotes</h1>");
					print("<script type=\"text/javascript\">var thisdate = new Date();
					document.writeln(thisdate.toLocaleString());</script>"); 
					print("</div>");
				}

			?>
				
			<div class="bottom">

			<form method = "post"  action = "quotes.php">
			<input type="text" value="FIXME" name="SYMBOLS" size="25"/>
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
<?php exit; ?>
