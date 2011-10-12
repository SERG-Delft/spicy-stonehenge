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
	/*Market data summary.*/
	$mktSummary = GetMarketSummary()->marketSummaryData;
	$tsia = round($mktSummary->TSIA, 2);
	$gain = round($mktSummary->TSIA - $mktSummary->openTSIA, 2);
	$volume = $mktSummary->volume;
	$topGainers = $mktSummary->topGainers;
	$topLosers = $mktSummary->topLosers;

	/*Account information for the user.*/
	$accountDataReturn = GetAccountData(GetUserFromCookie());

	/*Holding information for a particular user*/	
	$holdings = GetHoldings(GetUserFromCookie());
	$holdingInfo = GetHoldingInformation($holdings);
	$noOfHoldings = $holdingInfo->noOfHoldings;
	$totalHoldings = $holdingInfo->totalHoldings;
}

?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="generator" content="Adobe GoLive" />
		<title>Apache Stonehenge - PHP StockTrader - Home</title>
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
				print ("<div class=\"main-title\"><h1>Home</h1><script type=\"text/javascript\">var thisdate = new Date();
					document.writeln(thisdate.toLocaleString());</script></div>");
				print ("<h3>Welcome ".GetUserFromCookie()."</h3>");
			?>

				<table>
				<tr>
				<td>
				<div class="left">
					<table class="normal">
						<thead><tr><th colspan="2">User Statistics</th></tr></thead>

						<?php
							if($accountDataReturn)
							{
								print ("<tbody>");
								print ("<tr><td class=\"left\">Account ID:</td>
									<td>".($accountDataReturn->accountID)."</td></tr>");
								print ("<tr><td class=\"left\">Account Created:</td>
									<td>".date("m/d/Y h:i:s A", $accountDataReturn->creationDate)."</td></tr>");
								print ("<tr><td class=\"left\">Total Logins:</td>
									<td>".$accountDataReturn->loginCount."</td></tr>");
								print ("<tr><td class=\"left\">Session Created:</td>
									<td>".date("m/d/Y h:i:s A", $accountDataReturn->lastLogin)."</td></tr>");
								print ("</tbody>");
							}
						?>

						<thead><tr><th colspan="2">Summary</th></tr></thead>
						<?php
							if (!($holdingInfo == NULL) || ($accountDataReturn == NULL))
							{
								print ("<tbody>");
								print ("<tr><td class=\"left\">Cash Balance:</td>
									<td>".$accountDataReturn->balance."</td></tr>");

								print ("<tr><td class=\"left\">Number of Holdings:</td>
									<td>".$noOfHoldings."</td></tr>");
								
								print ("<tr><td class=\"left\">Total of Holdings:</td><td>");
								printf("$ %.2f",$totalHoldings);
								print ("</td></tr>");

								print ("<tr><td class=\"left\">Sum of Cash and Holdings:</td><td>");
								printf("$ %.2f",($totalHoldings + ($accountDataReturn->balance)));
								print ("</td></tr>");

								print ("<tr><td class=\"left\">Opening Balance:</td><td>");
								printf ("$ %.2f", $accountDataReturn->openBalance);
								print ("</td></tr>");

								print ("<tr><td class=\"left\">Current Gain/(Loss):</td>
									<td><span class=\"price\">");
								$gain =  (($totalHoldings + ($accountDataReturn->balance)) - $accountDataReturn->openBalance);
								if ($gain < 0)
								{
									printf("$ (%.2f)", ((-1) * $gain));
								}
								else if ($gain >= 0)
								{
									printf("$ %.2f", $gain);
								}
								$gainPercent = round((($gain/$accountDataReturn->openBalance) * 100), 2);
								print ("</span></td></tr>");


								print ("<tr><td class=\"left\">%Gain/(Loss):</td><td>");

								if ($gainPercent > 0)
								{
									print ("<span class=\"price-gain\">".$gainPercent."%</span>");
								}
								else if ($gainPercent < 0)
								{
									print ("<span class=\"price-loss\">".$gainPercent."%</span>");
								}
								else
								{
									print ("<span>".$gainPercent."%</span>");
								}
								print ("</td></tr>");
								print("</tbody>");
							}
							?>
							</table>
						</td>

						<td>
						<div class="right">
						<h3>Market Summary</h3>
							<p><?php print(date("D, F j, Y, g:i a")); ?></p>

							<table class="table-outer" cellspacing="0">
							<?php
							if (!($holdingInfo == NULL) || ($accountDataReturn == NULL))
							{
								print ("<tr><td class=\"special\">Trade Stock Index (TSIA)</td><td>");
								print($tsia);
								print(" ");
								print("<span");	

								if ($gain > 0)
								{
									print (" class=\"price-gain\">$");
								}
								else if ($gain < 0)
								{
									print (" class=\"price-loss\">$");
								}
								else
								{
									print(">");
								}
								printf("%.2f</span>", $gain);
								print ("</td></tr>");

								print ("<tr><td class=\"special\">Trading Volume</td><td>");

								print ($volume);
								print ("</td></tr>");

								print("<tr><td class=\"special\">Top Gainers</td><td>");
								print ("<table class=\"table-inner\" cellspacing=\"0\">");
								print("<thead><tr><th>Symbol</th><th>Price</th><th>Change</th></tr></thead>");
								print("<tbody>");

								/* Tiago: Quick hack */
								if ($topGainers == null)
									$topGainers = array();

								foreach($topGainers as $gainer)
								{
									print ("<tr><td><form action = \"quotes.php\" method = \"post\">
										<input type=\"hidden\" name=\"SYMBOLS\" value=\"".$gainer->symbol."\"/>
										<input type=\"submit\" name=\"GETQUOTE\" value=\"".$gainer->symbol."\"></input></form></td>");

									printf ("<td>$%.2f</td>", $gainer->price);
									print ("<td><span");

									if (($gainer->change) > 0)
									{
										print ("class=\"price-gain\">$");
									}
									else if (($gainer->change) < 0)
									{
										print ("class=\"price-loss\">$");
									}
									else
									{
										print(">$");
									}

									printf ("%.2f", $gainer->change);
									print ("</span></td>");	
									print ("</form></tr>");
								}	

								print ("</tbody></table></td></tr>");

								print ("<tr><td class=\"special\">Top Losers</td><td>
									<table class=\"table-inner\" cellspacing=\"0\"><thead>
									<tr><th>Symbol</th><th>Price</th><th>Change</th></tr></thead><tbody>");
								
								/* Tiago: quick hack */
								if ($topLosers == null)
									$topLosers = array();

								foreach($topLosers as $loser)
								{
									print ("<tr><td><form action = \"quotes.php\" method = \"post\">
										<input type=\"submit\" name=\"SYMBOLS\" value=\"".
										$loser->symbol."\"></input></form></td>");

									printf ("<td>$%.2f</td>", $loser->price);
									print ("<td><span");

									if (($loser->change) > 0)
									{
										print (" class=\"price-gain\">$");
									}
									else if (($loser->change) < 0)
									{
										print (" class=\"price-loss\">$");
									}
									else
									{
										print(">$");
									}	
									printf ("%.2f", $loser->change);
									print ("</span></td>");	
									print ("</tr>");

									$index++;
									$loser = $topLosers->QuoteDataBean[$index];
								}
								print("</tbody></table>");
								print("</td></tr></table>");
								print("</div>");
								print("</td></tr></table>");
							}
							?>

			<div class="bottom">
			<form method="post"  action="quotes.php">
				<input type="text" name="SYMBOLS" size="25"/>
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
