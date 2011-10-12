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

?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="generator" content="Adobe GoLive" />
		<title>Apache Stonehenge - PHP StockTrader - Glossary</title>
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
					<h1>Glossary</h1>
					<script type="text/javascript">
						var thisdate = new Date();
						document.writeln(thisdate.toLocaleString());
					</script>
				</div>
				<table align="center" class="glossary" >
					<thead>
						<tr>
							<th>Term</th>
							<th>Description</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="left">Account ID</td>
							<td>A unique Integer based key. Each user is assigned an account ID at account creation time.</td>
						</tr>
						<tr>
							<td class="left">Account Created</td>
							<td>The time and date the users account was first created.</td>
						</tr>
						<tr>
							<td class="left">Cash Balance</td>
							<td>The current cash balance in the users account. This does not include current stock holdings.</td>
						</tr>
							<td class="left">Company</td>
							<td>The full company name for an individual stock.</td>
						<tr>
							<td class="left">Current Gain/Loss</td>
							<td>The total gain or loss of this account, computed by substracting the current sum of cash/holdings minus the opening account balance.</td>
						</tr>
							<td class="left">Current Price</td>
							<td>The current trading price for a given stock symbol.</td>
						<tr>
							<td class="left">Gain/Loss</td>
							<td>The current gain or loss of an individual stock holding, computed as (current market value - holding basis).</td>
						</tr>
						<tr>
							<td class="left">Last Login</td>
							<td>The date and time this user last logged in to Trade.</td>
						</tr>
						<tr>
							<td class="left">Market Value</td>
							<td>The current total value of a stock holding, computed as (quantity * current price).</td>
						</tr>
						<tr>
							<td class="left">Number of Holdings</td>
							<td>The total number of stocks currently owned by this account.</td>
						</tr>
						<tr>
							<td class="left">Open Price</td>
							<td>The price of a given stock at the open of the trading session.</td>
						</tr>
						<tr>
							<td class="left">Order ID</td>
							<td>A unique Integer based key. Each order is assigned an order ID at order creation time.</td>
						</tr>
						<tr>
							<td class="left">Opening Balance</td>
							<td>The initial cash balance in this account when it was opened.</td>
						</tr>
						<tr>
							<td class="left">Order Status</td>
							<td>orders are opened, processed, closed and completed. Order status shows the current stat for this order.</td>
						</tr>
						<tr>
							<td class="left">Price Range</td>
							<td>The low and high prices for this stock during the current trading session</td>
						</tr>
						<tr>
							<td class="left">Purchase Date</td>
							<td>The date and time the a stock was purchased.</td>
						</tr>
						<tr>
							<td class="left">Purchase Price</td>
							<td>The price used when purchasing the stock.</td>
						</tr>
						<tr>
							<td class="left">Purchase Basis</td>
							<td>The total cost to purchase this holding. This is computed as (quantity * purchase price).</td>
						</tr>
						<tr>
							<td class="left">Quantity</td>
							<td>The number of stock shares in the order or user holding.</td>
						</tr>
						<tr>
							<td class="left">Session Created</td>
							<td>An HTTP session is created for each user at during login. Session created shows the time and day when the session was created.</td>
						</tr>
						<tr>
							<td class="left">Sum of Cash/Holdings</td>
							<td>The total current value of this account. This is the sum of the cash balance along with the value of current stock holdings.</td>
						</tr>
						<tr>
							<td class="left">Symbol</td>
							<td>The symbol for a Trade stock.</td>
						</tr>
						<tr>
							<td class="left">Total Logins</td>
							<td>The total number of logins performed by this user.</td>
						</tr>
						<tr>
							<td class="left">Total Logouts</td>
							<td>The total number of logouts performed by this user.</td>
						</tr>
						<tr>
							<td class="left">Total of Holdings</td>
							<td>The current total value of all stock holdings in this account given the current valuation of each stock held.</td>
						</tr>
						<tr>
							<td class="left">Top gainers</td>
							<td>The list of stocks (matching LIKE CLAUSE 's:1__%' per WebSphere Trade 6.1 behavior) gaining the most in price during the current trading session.</td>
						</tr>
						<tr>
							<td class="left">Top Losers</td>
							<td>The list of stocks (matching LIKE CLAUSE 's:1__%' per WebSphere Trade 6.1 behavior) falling the most in price during the current trading session.</td>
						</tr>
						<tr>
							<td class="left">Trader Stock Index (TSIA)</td>
							<td>A computed index of the top 20 stocks (matching LIKE CLAUSE 's:1__%' per WebSphere Trade 6.1 behavior) in Trade.</td>
						</tr>
						<tr>
							<td class="left">Trading Volume</td>
							<td>The total number of shares traded for stocks (matching LIKE CLAUSE 's:1__%' per WebSphere Trade 6.1 behavior) during this trading session.</td>
						</tr>
						<tr>
							<td class="left">Txn Fee</td>
							<td>The fee charged by the brokerage to process this order.</td>
						</tr>
						<tr>
							<td class="left">Type</td>
							<td>The order type (buy or sell).</td>
						</tr>
						<tr>
							<td class="left">User ID</td>
							<td>The unique user ID for the account chosen by the user at account registration.</td>
						</tr>
						<tr>
							<td class="left">Volume</td>
							<td>The total number of shares traded for this stock.</td>
						</tr>
					</tbody>
				</table>
								
				
				
			
			</div>
			<div id="footer">
				<div style="float:right;">Powered by 
				<a href="http://wso2.org/projects/wsf/php"><img align="top" src="images/powered-by-logo.gif" style="margin-top:-3px; margin-left: 0px;"/></a></div>
			</div>
		</div>
	</body>

</html>
