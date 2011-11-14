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
 
 package nl.tudelft.stocktrader.dal;

import java.util.List;

import nl.tudelft.stocktrader.dal.configservice.BSConfig;
import nl.tudelft.stocktrader.dal.configservice.ClientConfig;
import nl.tudelft.stocktrader.dal.configservice.OPSConfig;
import nl.tudelft.stocktrader.dal.configservice.ServiceLocation;

public interface ConfigServiceDAO {
	
	List<ServiceLocation> getQSLocations();
	
	List<ServiceLocation> getESLocations();
	
    List<ServiceLocation> getBSLocations();

    List<ServiceLocation> getOPSLocations();

    ClientConfig getClientConfig(String clientName);

    BSConfig getBSConfig(String bsName);

    boolean setClientToBS(String clientName, String bsName);

    boolean setBSToOPS(String bs, String ops);

    OPSConfig getOPSConfig(String opsName);

    boolean setServiceLocation(String serviceName, String serviceUrl, Boolean isSec);
    
    // These methods came from a different class with the same name
    boolean updateConfigService(String url);
    
    String getConfigService();
}
