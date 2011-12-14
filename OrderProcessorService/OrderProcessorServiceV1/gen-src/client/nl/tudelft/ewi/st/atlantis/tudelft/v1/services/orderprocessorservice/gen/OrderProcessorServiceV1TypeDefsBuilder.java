
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice.gen;

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
public class OrderProcessorServiceV1TypeDefsBuilder
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
        // Type #0 (BaseResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "BaseResponse")));
        // Type #1 (IsOnlineResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "IsOnlineResponse")));
        // Type #2 (SubmitOrderResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SubmitOrderResponse")));
        // Type #3 (BaseRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "BaseRequest")));
        // Type #4 (IsOnlineRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "IsOnlineRequest")));
        // Type #5 (SubmitOrderRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SubmitOrderRequest")));
        // Type #6 (OrderData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "OrderData")));
        // Type #7 (ErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorData")));
        // Type #8 (CommonErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "CommonErrorData")));
        // Type #9 (ExtensionType)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ExtensionType")));
        // Type #10 (ErrorParameter)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorParameter")));
        // Type #11 (ErrorMessage)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorMessage")));
    }

    private void addComplexTypeElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes) {
        FlatSchemaComplexTypeImpl currType;
         
        // Type #0 (BaseResponse)
        currType = complexTypes.get(0);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(11), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(9), -1);
         
        // Type #1 (IsOnlineResponse)
        currType = complexTypes.get(1);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(11), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(9), -1);
        currType.addSimpleElement(new QName(NS2, "output"), 1);
         
        // Type #2 (SubmitOrderResponse)
        currType = complexTypes.get(2);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(11), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(9), -1);
         
        // Type #3 (BaseRequest)
        currType = complexTypes.get(3);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(9), -1);
         
        // Type #4 (IsOnlineRequest)
        currType = complexTypes.get(4);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(9), -1);
         
        // Type #5 (SubmitOrderRequest)
        currType = complexTypes.get(5);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(9), -1);
        currType.addComplexElement(new QName(NS2, "data"), complexTypes.get(6), 1);
         
        // Type #6 (OrderData)
        currType = complexTypes.get(6);
        currType.addSimpleElement(new QName(NS3, "accountID"), 1);
        currType.addSimpleElement(new QName(NS3, "holdingID"), 1);
        currType.addSimpleElement(new QName(NS3, "orderID"), 1);
        currType.addSimpleElement(new QName(NS3, "orderType"), 1);
        currType.addSimpleElement(new QName(NS3, "orderStatus"), 1);
        currType.addSimpleElement(new QName(NS3, "openDate"), 1);
        currType.addSimpleElement(new QName(NS3, "completionDate"), 1);
        currType.addSimpleElement(new QName(NS3, "quantity"), 1);
        currType.addSimpleElement(new QName(NS3, "price"), 1);
        currType.addSimpleElement(new QName(NS3, "orderFee"), 1);
        currType.addSimpleElement(new QName(NS3, "symbol"), 1);
         
        // Type #7 (ErrorData)
        currType = complexTypes.get(7);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(10), -1);
         
        // Type #8 (CommonErrorData)
        currType = complexTypes.get(8);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(10), -1);
        currType.addSimpleElement(new QName(NS1, "errorName"), 1);
        currType.addSimpleElement(new QName(NS1, "cause"), 1);
        currType.addSimpleElement(new QName(NS1, "resolution"), 1);
        currType.addSimpleElement(new QName(NS1, "errorGroups"), 1);
        currType.addSimpleElement(new QName(NS1, "organization"), 1);
         
        // Type #9 (ExtensionType)
        currType = complexTypes.get(9);
        currType.addSimpleElement(new QName(NS1, "id"), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "contentType"), 1);
        currType.addSimpleElement(new QName(NS1, "value"), 1);
         
        // Type #10 (ErrorParameter)
        currType = complexTypes.get(10);
        currType.addAttribute(new QName(NS1, "name"));
         
        // Type #11 (ErrorMessage)
        currType = complexTypes.get(11);
        currType.addComplexElement(new QName(NS1, "error"), complexTypes.get(8), -1);
    }

    private void addRootElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes, HashMap<QName, FlatSchemaElementDeclImpl> rootElements) {
        rootElements.put(new QName(NS2, "submitOrderRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "submitOrderRequest"), complexTypes.get(5)));
        rootElements.put(new QName(NS2, "isOnlineRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "isOnlineRequest"), complexTypes.get(4)));
        rootElements.put(new QName(NS2, "isOnlineResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "isOnlineResponse"), complexTypes.get(1)));
        rootElements.put(new QName(NS2, "submitOrderResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "submitOrderResponse"), complexTypes.get(2)));
    }

}
