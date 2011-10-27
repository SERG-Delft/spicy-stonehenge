
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.gen;

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
public class ExchangeServiceV1TypeDefsBuilder
    extends BaseTypeDefsBuilder
{

    private final static String NS1 = "http://www.ebayopensource.org/turmeric/common/v1/types";
    private final static String NS2 = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services";

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
        // Type #1 (ExchangeCurrencyResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "ExchangeCurrencyResponse")));
        // Type #2 (BaseRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "BaseRequest")));
        // Type #3 (ExchangeCurrencyRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "ExchangeCurrencyRequest")));
        // Type #4 (ErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorData")));
        // Type #5 (CommonErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "CommonErrorData")));
        // Type #6 (ExtensionType)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ExtensionType")));
        // Type #7 (ErrorParameter)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorParameter")));
        // Type #8 (ErrorMessage)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorMessage")));
    }

    private void addComplexTypeElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes) {
        FlatSchemaComplexTypeImpl currType;
         
        // Type #0 (BaseResponse)
        currType = complexTypes.get(0);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(8), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(6), -1);
         
        // Type #1 (ExchangeCurrencyResponse)
        currType = complexTypes.get(1);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(8), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(6), -1);
        currType.addSimpleElement(new QName(NS2, "exchResult"), 1);
         
        // Type #2 (BaseRequest)
        currType = complexTypes.get(2);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(6), -1);
         
        // Type #3 (ExchangeCurrencyRequest)
        currType = complexTypes.get(3);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(6), -1);
        currType.addSimpleElement(new QName(NS2, "baseCurrency"), 1);
        currType.addSimpleElement(new QName(NS2, "aimCurrency"), 1);
        currType.addSimpleElement(new QName(NS2, "exchAmount"), 1);
         
        // Type #4 (ErrorData)
        currType = complexTypes.get(4);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(7), -1);
         
        // Type #5 (CommonErrorData)
        currType = complexTypes.get(5);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(7), -1);
        currType.addSimpleElement(new QName(NS1, "errorName"), 1);
        currType.addSimpleElement(new QName(NS1, "cause"), 1);
        currType.addSimpleElement(new QName(NS1, "resolution"), 1);
        currType.addSimpleElement(new QName(NS1, "errorGroups"), 1);
        currType.addSimpleElement(new QName(NS1, "organization"), 1);
         
        // Type #6 (ExtensionType)
        currType = complexTypes.get(6);
        currType.addSimpleElement(new QName(NS1, "id"), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "contentType"), 1);
        currType.addSimpleElement(new QName(NS1, "value"), 1);
         
        // Type #7 (ErrorParameter)
        currType = complexTypes.get(7);
        currType.addAttribute(new QName(NS1, "name"));
         
        // Type #8 (ErrorMessage)
        currType = complexTypes.get(8);
        currType.addComplexElement(new QName(NS1, "error"), complexTypes.get(5), -1);
    }

    private void addRootElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes, HashMap<QName, FlatSchemaElementDeclImpl> rootElements) {
        rootElements.put(new QName(NS2, "exchangeCurrencyRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "exchangeCurrencyRequest"), complexTypes.get(3)));
        rootElements.put(new QName(NS2, "exchangeCurrencyResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "exchangeCurrencyResponse"), complexTypes.get(1)));
    }

}
