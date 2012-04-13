# What is Spicy Stonehenge

Spicy Stonehenge is an implementation of Apache Stonehenge [1] built on top of the Turmeric SOA platform [2]. Our goal with this project is to create a use case that researchers can use to validate their research and compare results by using a common platform.

# Quick Overview

The Stonehenge system is composed of 5 web services, 1 web application and 2 databases.

The services are described as follows:

*   **Business Service** - Provides the business logic required for the web application to operate.
*   **Configuration Service** - Acts as a directory where references to all the instances of the web services are kept. Whenever the trader client wants to perform an action, it must first ask the configuration service for an endpoint.
*   **Order Processing Service** - Whenever a buy or sell order is made, the business service will interact with the Order Processing Service to make the order final.
*   **Exchange Service** - If a purchase is made in a currency different from that of the wallet used, it gets converted by the Exchange Service which uses real currency data from Google.
*   **Quote Service** - The quote service provides live quote information from Yahoo Finance. This service can be used directly to query the price of a certain stock symbol. It is also used indirectly whenever an order is placed as the Order Processing Service queries it to find the right price at which to place the order.

In this project, it’s common to see the abbreviations BS and OPS, these refer to the Business and Order Processing services respectively.

The databases run off an Apache Derby server and skeletons for them are also provided as part of this project. This database was not available as part of the original project and was built from scratch.

The web application is built using PHP and most of the code is reused from the original project. Some minor changes have been made to accommodate the new, Turmeric-powered web services.

# Deploying Spicy Stonehenge

In this section we’ll cover how to deploy Spicy Stonehenge on Turmeric SOA. This is merely a walkthrough of how to go from source code to a running system. For any questions of how and why it works, please feel free to ask your question at Turmeric SOA’s forums [3] or directly contact me at t.a.espinha [at] tudelft [dot] nl if the question is about this implementation of Stonehenge.

## Walkthrough

### Setting up Jetty with the web services

1. Start by cloning the git repository from https://github.com/SERG-Delft/spicy-stonehenge

2. The projects must be compiled with Maven (or m2e if you prefer) and you should start by compiling the TradeTypeLibrary and the common-library.

3. After these two projects have been compiled, you can proceed to compile the remaining projects always making sure you compile first the <project-name>, then the <project-name>Impl and finally the project ending in -war. Each service has these three folders conveniently placed inside one folder so you should be able to find them easily.

Just for reference, <project-name> projects describe web service interfaces for Turmeric SOA.
<project-name>Impl projects describe web service implementations, which rely on the interfaces for its implementation.
Projects ending in -war are merely packaging projects.

4. When all the projects have been compiled, inside the -war folder of each project there is a target/ folder which contains a WAR file and a folder with the contents of the WAR file. It is the uncompressed folder we will be using for the purposes of this walkthrough. The next step involves setting up Jetty. Later we will come back to the -war projects. 

5. At this point we should have all the folders resulting from the compilation of the -war projects. We then need to proceed to download and unzip Jetty Turmeric from the download page in the GitHub project. The file in question is jetty-turmeric-1.1.0.zip. This distribution of Jetty includes all the Turmeric libraries required to make it work.

6. After unzipping Jetty, it is ready to run but before we start it, we must copy all the folders named *-war/target/<project-name>/ into <jetty>/webapps/. Keep in mind that the name of the folder chosen inside webapps/ will also be the name used in the URL whenever the service is to be invoked.

7. This completes setting up the web services.

### Setting up the databases

Deploying the Spicy Stonehenge project involves two databases. The skeleton for these is provided under the "databases/" folder.

Before actually moving onto the deployment of the database, we must start by downloading Apache Derby from http://db.apache.org/derby/derby_downloads.html. After unpacking it, we must first start Derby as a network server and then load the skeleton onto the database.

To do so, we require another tool called Apache DdlUtils. This tool allows us to load data into all types of databases, just as long as they provide a JDBC connector.

The only step necessary to use DdlUtils is to invoke the ant targets for data import, by executing the following commands:

> ant import-stonehenge-db
> ant import-quotes-db

(**Note:** This walkthrough assumes you have a working installation of Apache Ant. More info at [4])

After this step completes successfully, you will have loaded the database structure and data for the stonehenge and quotes databases.

### Setting up the web application - currently not working

For this step, you are expected to have a working Apache + PHP installation. You are also required to have the WSO2 PHP library for web services installed in your Apache (more info at [5] - a DLL is provided for Windows and the library must be compiled manually for Linux).

After the web application is setup, all that is left to do is copy the contents of the stocktrader folder into the document root of your Apache installation and you’re good to go!

If you should require more in-depth guidance to go through any of these steps, feel free to e-mail me at t.a.espinha [at] tudelft [dot] nl.

### References

[1] - http://incubator.apache.org/stonehenge/

[2] - https://www.ebayopensource.org/index.php/Turmeric/HomePage

[3] - https://www.ebayopensource.org/forum/

[4] - http://ant.apache.org/

[5] - http://wso2.com/products/web-services-framework/php/
