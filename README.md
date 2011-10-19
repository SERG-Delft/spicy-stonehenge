# What is Spicy Stonehenge

Spicy Stonehenge is an implementation of Apache Stonehenge [1] built on top of the Turmeric SOA platform [2]. Our goal with this project is to create a use case that researchers can use to validate their research and compare results by using a common platform.

# Quick Overview

The Stonehenge system is composed of 3 web services, 1 web application and 1 database.

The services are described as follows:

*   **Business Service** - Provides the business logic required for the web application to operate.
*   **Configuration Service** - Acts as a directory where references to all the instances of the web services are kept. Whenever the trader client wants to perform an action, it must first ask the configuration service for an endpoint.
*   **Order Processing Service** - Whenever a buy or sell order is made, the business service will interact with the Order Processing Service to make the order final.

In this project, it’s common to see the abbreviations BS and OPS, these refer to the Business and Order Processing services respectively.

The database runs off an Apache Derby server and a skeleton of it is also provided as part of this project. This database was not available as part of the original project and was built from scratch.

The web application is built using PHP and most of the code is reused from the original project. Some minor changes have been made to accommodate the new, Turmeric-powered web services.

# Deploying Spicy Stonehenge

In this section we’ll cover how to deploy Spicy Stonehenge on Turmeric SOA with the Turmeric monitoring enabled. This is merely a walkthrough of how to go from source code to a running system. For any questions of how and why it works, please feel free to ask your question at Turmeric SOA’s forums [3] or directly contact me at t.a.espinha [at] tudelft [dot] nl if the question is about this implementation of Stonehenge.

## Walkthrough

### Setting up Jetty with the web services

1. Start by cloning the git repository from https://github.com/etiago/spicy-stonehenge

2. The projects must be compiled with Maven (or m2e if you prefer) and you should start by compiling the TradeTypeLibrary and the common-library.

3. After these two projects have been compiled, you can proceed to compile the remaining projects always making sure you compile first the <project-name> and afterwards the <project-name>Impl.
Just for reference, <project-name> projects describe web service interfaces for Turmeric SOA.
<project-name>Impl projects describe web service implementations, which rely on the interfaces for its implementation.

4. When all the projects have been compiled, inside each project there is a target/ folder which contains a JAR file. This JAR file should be decompressed and it should result in a folder per service. The next step involves setting up Jetty, the application server.

5. At this point we should have all the folders resulting from the decompression of the web service JARs. We then need to proceed to download and unzip Jetty from http://docs.codehaus.org/display/JETTY/Downloading+Jetty

6. After unzipping Jetty, it is ready to run but before we start it, we must copy all the folders mentioned in 4. and 5. to the folder <jetty>/webapps/

7. Additionally, both security and console services for Turmeric should be downloaded from https://www.ebayopensource.org/index.php/Turmeric/Downloads and deployed similarly alongside the ones mentioned in step 6. **Remember** to deploy these services as a folder and **NOT** as a WAR file!

8. This completes setting up the web services.

### Setting up the database

Deploying the Spicy Stonehenge project involves two databases. One contains all the data required for the web application (in this tutorial called “stonehenge”) and the other stores the monitoring data collected by Turmeric SOA (in this tutorial called “turmericdb”).

Before actually moving onto the deployment of the database, we must start by downloading Apache Derby from http://db.apache.org/derby/derby_downloads.html. After unpacking it, we must first start Derby as a network server and then create the two databases. This can be achieved by first executing the startNetworkServer(.bat if on Windows) and then using the tool `ij` under the <derby>/bin/ folder.

In this tool (after the server is started), the following commands should be issued:
connect ‘jdbc:derby://localhost:1527/stonehenge;create=true’;
disconnect;
connect ‘jdbc:derby://localhost:1527/turmericdb;create=true’;

After executing these commands, if no error is shown, the two databases will have been created.

At this point, an additional step is needed to load the skeleton and stub data into the stonehenge database. (This step is not needed for turmericdb as Turmeric will create the skeleton itself)

To do so, we require another tool called Apache DdlUtils. This tool allows us to load data into all types of databases, just as long as they provide a JDBC connector. This tool, as well as the configuration files to make it work, is provided in the git repository under the folder database.

The only step necessary to use DdlUtils is to invoke the ant target for data import, by executing the following command:
ant import-target-db
(**Note:** This walkthrough assumes you have a working installation of Apache Ant. More info at [4])

After this step completes successfully, you will have loaded the database structure and data for the stonehenge database.

### Setting up the web application

For this step, you are expected to have a working Apache + PHP installation. You are also required to have the WSO2 PHP library for web services installed in your Apache (more info at [5] - a DLL is provided for Windows and the library must be compiled manually for Linux).

After the web application is setup, all that is left to do is copy the contents of the stocktrader folder into the document root of your Apache installation and you’re good to go!

If you should require more in-depth guidance to go through any of these steps, feel free to e-mail me at t.a.espinha [at] tudelft [dot] nl.

[1] - http://incubator.apache.org/stonehenge/
[2] - https://www.ebayopensource.org/index.php/Turmeric/HomePage
[3] - https://www.ebayopensource.org/forum/
[4] - http://ant.apache.org/
[5] - http://wso2.com/products/web-services-framework/php/
