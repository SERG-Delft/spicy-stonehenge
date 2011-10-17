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
if(!IsLoggedIn())
{
	header("Location: login.php");
}
else
{
	$holdingsReturn = GetHoldings(GetUserFromCookie());
}
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="generator" content="Adobe GoLive" />
		<title>Apache Stonehenge - PHP StockTrader - Portfolio</title>
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
					print ("<p style=\"color: red\" align=\"center\">Trade Alert: The following orders have completed.</p>");
					print("<table class=\"table-outer\" cellspacing=\"0\" align=\"center\"><thead>
						<tr><th>Order ID</th><th>Order Status</th><th>Creation Date</th><th>Completion Date</th>
						<th>Txn Fee</th><th>Type</th><th>Symbol</th><th>Quantity</th></tr></thead><tbody>");

					$index = 0;
					while ($getClosedOrdersReturn[$index])
					{
						print ("<tr><td>".$getClosedOrdersReturn[$index]->orderID."</td>
							<td>".$getClosedOrdersReturn[$index]->orderStatus."</td>
							<td>".date("m/d/Y h:i:s A", $getClosedOrdersReturn[$index]->openDate)."</td>
							<td>".date("m/d/Y h:i:s A", $getClosedOrdersReturn[$index]->completionDate)."</td>
							<td>$".$getClosedOrdersReturn[$index]->orderFee."</td>
							<td>".$getClosedOrdersReturn[$index]->orderType."</td>
							<td>".$getClosedOrdersReturn[$index]->symbol."</td>
							<td>".$getClosedOrdersReturn[$index]->quantity."</td></tr>");
						$index ++;
					}
					print("</tbody></table><br/><br/>");
				}

				if ($holdingsReturn)
				{
					print ("<div class=\"main-title\">
						<h1>Portfolio Information</h1><script type=\"text/javascript\">var thisdate = new Date();
					document.writeln(thisdate.toLocaleString());</script></div>");

					print ("<table class=\"table-outer\" cellspacing=\"0\" align=\"center\">
						<thead><tr><th>Holding ID</th><th>Purchase Date</th><th>Symbol</th>
						<th>Quantity</th><th>Purchase Price</th><th>Current Price</th>
						<th>Purchase Basis</th><th>Market Value</th><th>Gain(Loss)</th>
						<th>Trade</th></tr></thead><tbody>");

					$index = 0;
					$purchaseBasis = 0;
					$marketValue = 0;
					$gain = 0;
					$quoteInfo = array();

					foreach($holdingsReturn as $bean) {
						if (!isset($quoteInfo[$bean->quoteID]))
						{
							$quotes = GetQuote($bean->quoteID);
							if ($quotes)
								$quotesReturn = $quotes;
							$quoteInfo[$bean->quoteID] = $quotesReturn->price;
						}

						$purchaseBasis = $purchaseBasis + ($bean->purchasePrice) * ($bean->quantity);
						$marketValue = $marketValue + ($quoteInfo[$bean->quoteID]) * ($bean->quantity); 
						$gain = ($quoteInfo[$bean->quoteID] - $bean->purchasePrice) * ($bean->quantity);

						print("<tr><td>".$bean->holdingID."</td><td><nobr>".date("m/d/Y h:i:s A", $bean->purchaseDate)."</nobr></td><td>
							<form action=\"quotes.php\" method=\"post\">
							<input type=\"hidden\" name=\"SYMBOLS\" value=\"".$bean->quoteID."\"/>	
							<input type=\"submit\" name=\"GETQUOTE\" value=\"".$bean->quoteID."\"></input>
							</form></td>
							<td class=\"currency\">".$bean->quantity."</td><td class=\"currency\">$"
							.$bean->purchasePrice."</td><td class=\"currency\">$".$quoteInfo[$bean->quoteID]."</td><td class=\"currency\">$".
							(($bean->purchasePrice) * ($bean->quantity))."</td><td class=\"currency\">$".($quoteInfo[$bean->quoteID] * ($bean->quantity)).
							"</td><td class=\"currency\">");

						if ($gain > 0)
						{
							print ("<span class=\"price-gain\">".number_format($gain, 2)."</span>");
						}
						else if ($gain < 0)
						{
							print ("<span class=\"price-loss\">".number_format($gain, 2)."</span>");
						}
						else
						{
							print ("<span>".$gain."</span>");
						}
						print("</td><td class=\"currency\">");
						print("<form action = \"confirmation.php\" method = \"post\">");
						print("<input type=\"hidden\" name=\"HOLDINGID\" value=\"".$bean->holdingID."\"></input>");
						print("<input type=\"hidden\" name=\"QUANTITY\" value=\"".$bean->quantity."\"></input>");
						print("<input type=\"hidden\" name=\"SYMBOL\" value=\"".$bean->quoteID."\"></input>");
						print("<input type=\"submit\" value = \"Sell\" name=\"SELL\">");
						print("</input></td></tr></form>");

						$index ++;
					}
					print ("<tr class=\"total\"><td colspan=\"6\">Totals</td><td class=\"currency\">$".$purchaseBasis.
						"</td><td class=\"currency\">$".$marketValue."</td><td>");

					$gain = $marketValue - $purchaseBasis;
					if ($gain < 0)
					{
						print ("<span class=\"price-loss\">$".number_format($gain, 2)."</span></td><td></td></tr>");
					}
					else if ($gain > 0)
					{
						print ("<span class=\"price-gain\">$".number_format($gain, 2)."</span></td><td></td></tr>");
					}		
					else
					{
						print ("<span>$".$gain."</span></td><td></td></tr>");
					}
					print ("</tbody></table>");
				}
			?>
			<div class="bottom">
			<form action = "quotes.php" method = "post">
			<input type="text" value="" name="SYMBOLS" id="" size="25"/><input type="submit" name="GETQUOTE" value="Get Quote" class="button"/>
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
