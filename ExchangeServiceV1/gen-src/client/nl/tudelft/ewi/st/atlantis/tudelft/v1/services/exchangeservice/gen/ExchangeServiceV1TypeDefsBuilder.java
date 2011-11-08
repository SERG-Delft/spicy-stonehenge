
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

    private final static String NS1 = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services";
    private final static String NS2 = "http://www.ebayopensource.org/turmeric/common/v1/types";
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
        // Type #0 (checkAmountRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "checkAmountRequest")));
        // Type #1 (checkCurrencyReponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "checkCurrencyReponse")));
        // Type #2 (BaseResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "BaseResponse")));
        // Type #3 (ExchangeCurrencyResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ExchangeCurrencyResponse")));
        // Type #4 (checkCurrencyRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "checkCurrencyRequest")));
        // Type #5 (BaseRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "BaseRequest")));
        // Type #6 (ExchangeCurrencyRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ExchangeCurrencyRequest")));
        // Type #7 (WalletData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "WalletData")));
        // Type #8 (ErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "ErrorData")));
        // Type #9 (CommonErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "CommonErrorData")));
        // Type #10 (ExtensionType)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "ExtensionType")));
        // Type #11 (ErrorParameter)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "ErrorParameter")));
        // Type #12 (ErrorMessage)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "ErrorMessage")));
        // Type #13 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #14 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #15 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #16 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #17 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
    }

    private void addComplexTypeElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes) {
        FlatSchemaComplexTypeImpl currType;
         
        // Type #0 (checkAmountRequest)
        currType = complexTypes.get(0);
        currType.addSimpleElement(new QName(NS1, "userID"), 1);
        currType.addSimpleElement(new QName(NS1, "currencyType"), 1);
        currType.addSimpleElement(new QName(NS1, "checkAmount"), 1);
         
        // Type #1 (checkCurrencyReponse)
        currType = complexTypes.get(1);
        currType.addSimpleElement(new QName(NS1, "currencyExist"), 1);
         
        // Type #2 (BaseResponse)
        currType = complexTypes.get(2);
        currType.addSimpleElement(new QName(NS2, "ack"), 1);
        currType.addComplexElement(new QName(NS2, "errorMessage"), complexTypes.get(12), 1);
        currType.addSimpleElement(new QName(NS2, "version"), 1);
        currType.addSimpleElement(new QName(NS2, "timestamp"), 1);
        currType.addComplexElement(new QName(NS2, "extension"), complexTypes.get(10), -1);
         
        // Type #3 (ExchangeCurrencyResponse)
        currType = complexTypes.get(3);
        currType.addSimpleElement(new QName(NS2, "ack"), 1);
        currType.addComplexElement(new QName(NS2, "errorMessage"), complexTypes.get(12), 1);
        currType.addSimpleElement(new QName(NS2, "version"), 1);
        currType.addSimpleElement(new QName(NS2, "timestamp"), 1);
        currType.addComplexElement(new QName(NS2, "extension"), complexTypes.get(10), -1);
        currType.addSimpleElement(new QName(NS1, "exchResult"), 1);
         
        // Type #4 (checkCurrencyRequest)
        currType = complexTypes.get(4);
        currType.addSimpleElement(new QName(NS1, "userID"), 1);
        currType.addSimpleElement(new QName(NS1, "inputCurrency"), 1);
         
        // Type #5 (BaseRequest)
        currType = complexTypes.get(5);
        currType.addComplexElement(new QName(NS2, "extension"), complexTypes.get(10), -1);
         
        // Type #6 (ExchangeCurrencyRequest)
        currType = complexTypes.get(6);
        currType.addComplexElement(new QName(NS2, "extension"), complexTypes.get(10), -1);
        currType.addSimpleElement(new QName(NS1, "baseCurrency"), 1);
        currType.addSimpleElement(new QName(NS1, "aimCurrency"), 1);
        currType.addSimpleElement(new QName(NS1, "exchAmount"), 1);
         
        // Type #7 (WalletData)
        currType = complexTypes.get(7);
        currType.addSimpleElement(new QName(NS3, "userID"), 1);
        currType.addSimpleElement(new QName(NS3, "eur"), 1);
        currType.addSimpleElement(new QName(NS3, "usd"), 1);
        currType.addSimpleElement(new QName(NS3, "gbp"), 1);
        currType.addSimpleElement(new QName(NS3, "cny"), 1);
        currType.addSimpleElement(new QName(NS3, "inr"), 1);
         
        // Type #8 (ErrorData)
        currType = complexTypes.get(8);
        currType.addSimpleElement(new QName(NS2, "errorId"), 1);
        currType.addSimpleElement(new QName(NS2, "domain"), 1);
        currType.addSimpleElement(new QName(NS2, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS2, "severity"), 1);
        currType.addSimpleElement(new QName(NS2, "category"), 1);
        currType.addSimpleElement(new QName(NS2, "message"), 1);
        currType.addSimpleElement(new QName(NS2, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS2, "parameter"), complexTypes.get(11), -1);
         
        // Type #9 (CommonErrorData)
        currType = complexTypes.get(9);
        currType.addSimpleElement(new QName(NS2, "errorId"), 1);
        currType.addSimpleElement(new QName(NS2, "domain"), 1);
        currType.addSimpleElement(new QName(NS2, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS2, "severity"), 1);
        currType.addSimpleElement(new QName(NS2, "category"), 1);
        currType.addSimpleElement(new QName(NS2, "message"), 1);
        currType.addSimpleElement(new QName(NS2, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS2, "parameter"), complexTypes.get(11), -1);
        currType.addSimpleElement(new QName(NS2, "errorName"), 1);
        currType.addSimpleElement(new QName(NS2, "cause"), 1);
        currType.addSimpleElement(new QName(NS2, "resolution"), 1);
        currType.addSimpleElement(new QName(NS2, "errorGroups"), 1);
        currType.addSimpleElement(new QName(NS2, "organization"), 1);
         
        // Type #10 (ExtensionType)
        currType = complexTypes.get(10);
        currType.addSimpleElement(new QName(NS2, "id"), 1);
        currType.addSimpleElement(new QName(NS2, "version"), 1);
        currType.addSimpleElement(new QName(NS2, "contentType"), 1);
        currType.addSimpleElement(new QName(NS2, "value"), 1);
         
        // Type #11 (ErrorParameter)
        currType = complexTypes.get(11);
        currType.addAttribute(new QName(NS2, "name"));
         
        // Type #12 (ErrorMessage)
        currType = complexTypes.get(12);
        currType.addComplexElement(new QName(NS2, "error"), complexTypes.get(9), -1);
         
        // Type #13 (<Anonymous>)
        currType = complexTypes.get(13);
        currType.addComplexElement(new QName(NS1, "walletData"), complexTypes.get(7), 1);
         
        // Type #14 (<Anonymous>)
        currType = complexTypes.get(14);
        currType.addSimpleElement(new QName(NS1, "amountEnough"), 1);
         
        // Type #15 (<Anonymous>)
        currType = complexTypes.get(15);
        currType.addSimpleElement(new QName(NS1, "currencyExist"), 1);
         
        // Type #16 (<Anonymous>)
        currType = complexTypes.get(16);
        currType.addSimpleElement(new QName(NS1, "userID"), 1);
        currType.addSimpleElement(new QName(NS1, "inputCurrency"), 1);
         
        // Type #17 (<Anonymous>)
        currType = complexTypes.get(17);
        currType.addSimpleElement(new QName(NS1, "userID"), 1);
        currType.addSimpleElement(new QName(NS1, "fromCurrency"), 1);
        currType.addSimpleElement(new QName(NS1, "toCurrency"), 1);
        currType.addSimpleElement(new QName(NS1, "fromAmount"), 1);
        currType.addSimpleElement(new QName(NS1, "toAmount"), 1);
    }

    private void addRootElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes, HashMap<QName, FlatSchemaElementDeclImpl> rootElements) {
        rootElements.put(new QName(NS1, "checkCurrencyRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS1, "checkCurrencyRequest"), complexTypes.get(4)));
        rootElements.put(new QName(NS1, "updateWalletDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS1, "updateWalletDataRequest"), complexTypes.get(17)));
        rootElements.put(new QName(NS1, "checkCurrency"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS1, "checkCurrency"), complexTypes.get(16)));
        rootElements.put(new QName(NS1, "updateWalletDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS1, "updateWalletDataResponse"), complexTypes.get(13)));
        rootElements.put(new QName(NS1, "checkAmountRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS1, "checkAmountRequest"), complexTypes.get(0)));
        rootElements.put(new QName(NS1, "exchangeCurrencyRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS1, "exchangeCurrencyRequest"), complexTypes.get(6)));
        rootElements.put(new QName(NS1, "checkAmountResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS1, "checkAmountResponse"), complexTypes.get(14)));
        rootElements.put(new QName(NS1, "checkCurrencyResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS1, "checkCurrencyResponse"), complexTypes.get(15)));
        rootElements.put(new QName(NS1, "exchangeCurrencyResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS1, "exchangeCurrencyResponse"), complexTypes.get(3)));
    }

}
