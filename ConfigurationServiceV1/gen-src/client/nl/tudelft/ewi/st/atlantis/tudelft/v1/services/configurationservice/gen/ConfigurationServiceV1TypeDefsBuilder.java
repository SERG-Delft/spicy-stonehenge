
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice.gen;

import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.ebayopensource.turmeric.runtime.common.impl.internal.schema.BaseTypeDefsBuilder;
import org.ebayopensource.turmeric.runtime.common.impl.internal.schema.FlatSchemaComplexTypeImpl;
import org.ebayopensource.turmeric.runtime.common.impl.internal.schema.FlatSchemaElementDeclImpl;
import org.ebayopensource.turmeric.runtime.common.types.SOAFrameworkCommonTypeDefsBuilder;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class ConfigurationServiceV1TypeDefsBuilder
    extends BaseTypeDefsBuilder
{

    private final static String NS1 = "http://www.ebayopensource.org/turmeric/common/v1/types";
    private final static String NS2 = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services";
    private final static String NS3 = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types";

    public void build() {
        ArrayList<FlatSchemaComplexTypeImpl> complexTypes = new ArrayList<FlatSchemaComplexTypeImpl>();
        addComplexTypes0(complexTypes);
         
        addComplexTypeElements0(complexTypes);
         
        HashMap<QName, FlatSchemaElementDeclImpl> rootElements = new HashMap<QName, FlatSchemaElementDeclImpl>();
        addRootElements0(complexTypes, rootElements);
         
        SOAFrameworkCommonTypeDefsBuilder.includeTypeDefs(complexTypes, rootElements);
         
        m_complexTypes = complexTypes;
        m_rootElements = rootElements;
    }

    private void addComplexTypes0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes) {
        // Type #0 (BaseRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "BaseRequest")));
        // Type #1 (GetBSLocationsRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetBSLocationsRequest")));
        // Type #2 (getOPSLocationsRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "getOPSLocationsRequest")));
        // Type #3 (GetBSConfigRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetBSConfigRequest")));
        // Type #4 (BaseResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "BaseResponse")));
        // Type #5 (SetClientToBSResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SetClientToBSResponse")));
        // Type #6 (SetClientToBSRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SetClientToBSRequest")));
        // Type #7 (GetBSConfigResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetBSConfigResponse")));
        // Type #8 (GetOPSConfigRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetOPSConfigRequest")));
        // Type #9 (GetBSLocationsResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetBSLocationsResponse")));
        // Type #10 (SetServiceLocationResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SetServiceLocationResponse")));
        // Type #11 (GetClientConfigRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetClientConfigRequest")));
        // Type #12 (GetOPSConfigResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetOPSConfigResponse")));
        // Type #13 (SetServiceLocationRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SetServiceLocationRequest")));
        // Type #14 (GetClientConfigResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetClientConfigResponse")));
        // Type #15 (SetBSToOPSRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SetBSToOPSRequest")));
        // Type #16 (SetBSToOPSResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SetBSToOPSResponse")));
        // Type #17 (ServiceLocation)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "ServiceLocation")));
        // Type #18 (ErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorData")));
        // Type #19 (CommonErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "CommonErrorData")));
        // Type #20 (ExtensionType)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ExtensionType")));
        // Type #21 (ErrorParameter)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorParameter")));
        // Type #22 (ErrorMessage)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorMessage")));
        // Type #23 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #24 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #25 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #26 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
    }

    private void addComplexTypeElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes) {
        FlatSchemaComplexTypeImpl currType;
         
        // Type #0 (BaseRequest)
        currType = complexTypes.get(0);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #1 (GetBSLocationsRequest)
        currType = complexTypes.get(1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #2 (getOPSLocationsRequest)
        // type has no child elements
         
        // Type #3 (GetBSConfigRequest)
        currType = complexTypes.get(3);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "BSName"), 1);
         
        // Type #4 (BaseResponse)
        currType = complexTypes.get(4);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #5 (SetClientToBSResponse)
        currType = complexTypes.get(5);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #6 (SetClientToBSRequest)
        currType = complexTypes.get(6);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "Bs"), 1);
        currType.addSimpleElement(new QName(NS2, "Client"), 1);
         
        // Type #7 (GetBSConfigResponse)
        currType = complexTypes.get(7);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "DBHostName"), 1);
        currType.addSimpleElement(new QName(NS2, "DBName"), 1);
        currType.addSimpleElement(new QName(NS2, "DBPort"), 1);
        currType.addSimpleElement(new QName(NS2, "OPS"), 1);
        currType.addSimpleElement(new QName(NS2, "OPSName"), 1);
        currType.addSimpleElement(new QName(NS2, "Sec"), 1);
         
        // Type #8 (GetOPSConfigRequest)
        currType = complexTypes.get(8);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "OPSName"), 1);
         
        // Type #9 (GetBSLocationsResponse)
        currType = complexTypes.get(9);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addComplexElement(new QName(NS2, "locations"), complexTypes.get(17), -1);
         
        // Type #10 (SetServiceLocationResponse)
        currType = complexTypes.get(10);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #11 (GetClientConfigRequest)
        currType = complexTypes.get(11);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "clientName"), 1);
         
        // Type #12 (GetOPSConfigResponse)
        currType = complexTypes.get(12);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "DBHostName"), 1);
        currType.addSimpleElement(new QName(NS2, "DBName"), 1);
        currType.addSimpleElement(new QName(NS2, "DBPort"), 1);
         
        // Type #13 (SetServiceLocationRequest)
        currType = complexTypes.get(13);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addComplexElement(new QName(NS2, "location"), complexTypes.get(17), 1);
         
        // Type #14 (GetClientConfigResponse)
        currType = complexTypes.get(14);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "BS"), 1);
        currType.addSimpleElement(new QName(NS2, "BSName"), 1);
        currType.addSimpleElement(new QName(NS2, "Sec"), 1);
         
        // Type #15 (SetBSToOPSRequest)
        currType = complexTypes.get(15);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "Bs"), 1);
        currType.addSimpleElement(new QName(NS2, "Ops"), 1);
         
        // Type #16 (SetBSToOPSResponse)
        currType = complexTypes.get(16);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #17 (ServiceLocation)
        currType = complexTypes.get(17);
        currType.addSimpleElement(new QName(NS3, "ServiceURL"), 1);
        currType.addSimpleElement(new QName(NS3, "ServiceName"), 1);
        currType.addSimpleElement(new QName(NS3, "Sec"), 1);
         
        // Type #18 (ErrorData)
        currType = complexTypes.get(18);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(21), -1);
         
        // Type #19 (CommonErrorData)
        currType = complexTypes.get(19);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(21), -1);
        currType.addSimpleElement(new QName(NS1, "errorName"), 1);
        currType.addSimpleElement(new QName(NS1, "cause"), 1);
        currType.addSimpleElement(new QName(NS1, "resolution"), 1);
        currType.addSimpleElement(new QName(NS1, "errorGroups"), 1);
        currType.addSimpleElement(new QName(NS1, "organization"), 1);
         
        // Type #20 (ExtensionType)
        currType = complexTypes.get(20);
        currType.addSimpleElement(new QName(NS1, "id"), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "contentType"), 1);
        currType.addSimpleElement(new QName(NS1, "value"), 1);
         
        // Type #21 (ErrorParameter)
        currType = complexTypes.get(21);
        currType.addAttribute(new QName(NS1, "name"));
         
        // Type #22 (ErrorMessage)
        currType = complexTypes.get(22);
        currType.addComplexElement(new QName(NS1, "error"), complexTypes.get(19), -1);
         
        // Type #23 (<Anonymous>)
        currType = complexTypes.get(23);
        currType.addSimpleElement(new QName(NS2, "in"), 1);
         
        // Type #24 (<Anonymous>)
        // type has no child elements
         
        // Type #25 (<Anonymous>)
        currType = complexTypes.get(25);
        currType.addComplexElement(new QName(NS2, "locations"), complexTypes.get(17), -1);
         
        // Type #26 (<Anonymous>)
        currType = complexTypes.get(26);
        currType.addComplexElement(new QName(NS2, "locations"), complexTypes.get(17), -1);
    }

    private void addRootElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes, HashMap<QName, FlatSchemaElementDeclImpl> rootElements) {
        rootElements.put(new QName(NS2, "setBSToOPSResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "setBSToOPSResponse"), complexTypes.get(16)));
        rootElements.put(new QName(NS2, "getOPSLocationsResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOPSLocationsResponse"), complexTypes.get(26)));
        rootElements.put(new QName(NS2, "getESLocationsResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getESLocationsResponse"), complexTypes.get(25)));
        rootElements.put(new QName(NS2, "getClientConfigResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getClientConfigResponse"), complexTypes.get(14)));
        rootElements.put(new QName(NS2, "getOPSConfigResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOPSConfigResponse"), complexTypes.get(12)));
        rootElements.put(new QName(NS2, "getClientConfigRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getClientConfigRequest"), complexTypes.get(11)));
        rootElements.put(new QName(NS2, "getBSLocationsResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getBSLocationsResponse"), complexTypes.get(9)));
        rootElements.put(new QName(NS2, "getBSLocationsRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getBSLocationsRequest"), complexTypes.get(1)));
        rootElements.put(new QName(NS2, "getOPSConfigRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOPSConfigRequest"), complexTypes.get(8)));
        rootElements.put(new QName(NS2, "getESLocationsRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getESLocationsRequest"), complexTypes.get(24)));
        rootElements.put(new QName(NS2, "setClientToBSRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "setClientToBSRequest"), complexTypes.get(6)));
        rootElements.put(new QName(NS2, "setBSToOPSRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "setBSToOPSRequest"), complexTypes.get(15)));
        rootElements.put(new QName(NS2, "setServiceLocationResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "setServiceLocationResponse"), complexTypes.get(10)));
        rootElements.put(new QName(NS2, "getBSConfigRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getBSConfigRequest"), complexTypes.get(3)));
        rootElements.put(new QName(NS2, "getBSConfigResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getBSConfigResponse"), complexTypes.get(7)));
        rootElements.put(new QName(NS2, "setClientToBSResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "setClientToBSResponse"), complexTypes.get(5)));
        rootElements.put(new QName(NS2, "getOPSLocationsRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOPSLocationsRequest"), complexTypes.get(2)));
        rootElements.put(new QName(NS2, "setServiceLocationRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "setServiceLocationRequest"), complexTypes.get(13)));
        rootElements.put(new QName(NS2, "getOPSLocations"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOPSLocations"), complexTypes.get(23)));
    }

}
