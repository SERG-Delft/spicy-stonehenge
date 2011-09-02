
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.gen;

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
public class BusinessServiceV1TypeDefsBuilder
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
        // Type #1 (GetTopOrdersResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetTopOrdersResponse")));
        // Type #2 (SellResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellResponse")));
        // Type #3 (BuyResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "BuyResponse")));
        // Type #4 (GetAccountProfileDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountProfileDataResponse")));
        // Type #5 (BaseRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "BaseRequest")));
        // Type #6 (GetOrdersRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetOrdersRequest")));
        // Type #7 (UpdateAccountProfileResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "UpdateAccountProfileResponse")));
        // Type #8 (SellEnhancedRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellEnhancedRequest")));
        // Type #9 (GetQuoteResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetQuoteResponse")));
        // Type #10 (GetHoldingRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingRequest")));
        // Type #11 (GetAccountDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountDataRequest")));
        // Type #12 (GetOrdersResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetOrdersResponse")));
        // Type #13 (GetAccountProfileDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountProfileDataRequest")));
        // Type #14 (GetQuoteRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetQuoteRequest")));
        // Type #15 (GetClosedOrdersResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetClosedOrdersResponse")));
        // Type #16 (GetTopOrdersRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetTopOrdersRequest")));
        // Type #17 (GetHoldingResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingResponse")));
        // Type #18 (SellRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellRequest")));
        // Type #19 (BuyRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "BuyRequest")));
        // Type #20 (SellEnhancedResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellEnhancedResponse")));
        // Type #21 (UpdateAccountProfileRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "UpdateAccountProfileRequest")));
        // Type #22 (GetClosedOrdersRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetClosedOrdersRequest")));
        // Type #23 (GetMarketSummaryRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetMarketSummaryRequest")));
        // Type #24 (GetHoldingsResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingsResponse")));
        // Type #25 (GetAccountDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountDataResponse")));
        // Type #26 (GetHoldingsRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingsRequest")));
        // Type #27 (GetMarketSummaryResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetMarketSummaryResponse")));
        // Type #28 (AccountData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "AccountData")));
        // Type #29 (MarketSummaryData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "MarketSummaryData")));
        // Type #30 (QuoteData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "QuoteData")));
        // Type #31 (OrderData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "OrderData")));
        // Type #32 (HoldingData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "HoldingData")));
        // Type #33 (AccountProfileData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "AccountProfileData")));
        // Type #34 (ErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorData")));
        // Type #35 (CommonErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "CommonErrorData")));
        // Type #36 (ExtensionType)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ExtensionType")));
        // Type #37 (ErrorParameter)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorParameter")));
        // Type #38 (ErrorMessage)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorMessage")));
    }

    private void addComplexTypeElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes) {
        FlatSchemaComplexTypeImpl currType;
         
        // Type #0 (BaseResponse)
        currType = complexTypes.get(0);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
         
        // Type #1 (GetTopOrdersResponse)
        currType = complexTypes.get(1);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(31), -1);
         
        // Type #2 (SellResponse)
        currType = complexTypes.get(2);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(31), 1);
         
        // Type #3 (BuyResponse)
        currType = complexTypes.get(3);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(31), 1);
         
        // Type #4 (GetAccountProfileDataResponse)
        currType = complexTypes.get(4);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "accountProfileData"), complexTypes.get(33), 1);
         
        // Type #5 (BaseRequest)
        currType = complexTypes.get(5);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
         
        // Type #6 (GetOrdersRequest)
        currType = complexTypes.get(6);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #7 (UpdateAccountProfileResponse)
        currType = complexTypes.get(7);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "accountProfileData"), complexTypes.get(33), 1);
         
        // Type #8 (SellEnhancedRequest)
        currType = complexTypes.get(8);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "holdingID"), 1);
        currType.addSimpleElement(new QName(NS2, "quantity"), 1);
         
        // Type #9 (GetQuoteResponse)
        currType = complexTypes.get(9);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "quoteData"), complexTypes.get(30), 1);
         
        // Type #10 (GetHoldingRequest)
        currType = complexTypes.get(10);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "holdingID"), 1);
         
        // Type #11 (GetAccountDataRequest)
        currType = complexTypes.get(11);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #12 (GetOrdersResponse)
        currType = complexTypes.get(12);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(31), -1);
         
        // Type #13 (GetAccountProfileDataRequest)
        currType = complexTypes.get(13);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #14 (GetQuoteRequest)
        currType = complexTypes.get(14);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "symbol"), 1);
         
        // Type #15 (GetClosedOrdersResponse)
        currType = complexTypes.get(15);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(31), -1);
         
        // Type #16 (GetTopOrdersRequest)
        currType = complexTypes.get(16);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #17 (GetHoldingResponse)
        currType = complexTypes.get(17);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "holdingData"), complexTypes.get(32), 1);
         
        // Type #18 (SellRequest)
        currType = complexTypes.get(18);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "holdingID"), 1);
        currType.addSimpleElement(new QName(NS2, "orderProcessingMode"), 1);
         
        // Type #19 (BuyRequest)
        currType = complexTypes.get(19);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "symbol"), 1);
        currType.addSimpleElement(new QName(NS2, "quantity"), 1);
        currType.addSimpleElement(new QName(NS2, "orderProcessingMode"), 1);
         
        // Type #20 (SellEnhancedResponse)
        currType = complexTypes.get(20);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(31), 1);
         
        // Type #21 (UpdateAccountProfileRequest)
        currType = complexTypes.get(21);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "accountProfileData"), complexTypes.get(33), 1);
         
        // Type #22 (GetClosedOrdersRequest)
        currType = complexTypes.get(22);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #23 (GetMarketSummaryRequest)
        currType = complexTypes.get(23);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
         
        // Type #24 (GetHoldingsResponse)
        currType = complexTypes.get(24);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "holdingData"), complexTypes.get(32), -1);
         
        // Type #25 (GetAccountDataResponse)
        currType = complexTypes.get(25);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "accountData"), complexTypes.get(28), 1);
         
        // Type #26 (GetHoldingsRequest)
        currType = complexTypes.get(26);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #27 (GetMarketSummaryResponse)
        currType = complexTypes.get(27);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(38), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(36), -1);
        currType.addComplexElement(new QName(NS2, "marketSummaryData"), complexTypes.get(29), 1);
         
        // Type #28 (AccountData)
        currType = complexTypes.get(28);
        currType.addSimpleElement(new QName(NS3, "profileID"), 1);
        currType.addSimpleElement(new QName(NS3, "openBalance"), 1);
        currType.addSimpleElement(new QName(NS3, "balance"), 1);
        currType.addSimpleElement(new QName(NS3, "creationDate"), 1);
        currType.addSimpleElement(new QName(NS3, "lastLogin"), 1);
        currType.addSimpleElement(new QName(NS3, "logoutCount"), 1);
        currType.addSimpleElement(new QName(NS3, "loginCount"), 1);
        currType.addSimpleElement(new QName(NS3, "accountID"), 1);
         
        // Type #29 (MarketSummaryData)
        currType = complexTypes.get(29);
        currType.addSimpleElement(new QName(NS3, "summaryDate"), 1);
        currType.addComplexElement(new QName(NS3, "topLosers"), complexTypes.get(30), -1);
        currType.addComplexElement(new QName(NS3, "topGainers"), complexTypes.get(30), -1);
        currType.addSimpleElement(new QName(NS3, "volume"), 1);
        currType.addSimpleElement(new QName(NS3, "openTSIA"), 1);
        currType.addSimpleElement(new QName(NS3, "TSIA"), 1);
         
        // Type #30 (QuoteData)
        currType = complexTypes.get(30);
        currType.addSimpleElement(new QName(NS3, "volume"), 1);
        currType.addSimpleElement(new QName(NS3, "change"), 1);
        currType.addSimpleElement(new QName(NS3, "high"), 1);
        currType.addSimpleElement(new QName(NS3, "low"), 1);
        currType.addSimpleElement(new QName(NS3, "open"), 1);
        currType.addSimpleElement(new QName(NS3, "price"), 1);
        currType.addSimpleElement(new QName(NS3, "companyName"), 1);
        currType.addSimpleElement(new QName(NS3, "symbol"), 1);
         
        // Type #31 (OrderData)
        currType = complexTypes.get(31);
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
         
        // Type #32 (HoldingData)
        currType = complexTypes.get(32);
        currType.addSimpleElement(new QName(NS3, "quoteID"), 1);
        currType.addSimpleElement(new QName(NS3, "purchaseDate"), 1);
        currType.addSimpleElement(new QName(NS3, "purchasePrice"), 1);
        currType.addSimpleElement(new QName(NS3, "quantity"), 1);
        currType.addSimpleElement(new QName(NS3, "holdingID"), 1);
         
        // Type #33 (AccountProfileData)
        currType = complexTypes.get(33);
        currType.addSimpleElement(new QName(NS3, "creditCard"), 1);
        currType.addSimpleElement(new QName(NS3, "email"), 1);
        currType.addSimpleElement(new QName(NS3, "address"), 1);
        currType.addSimpleElement(new QName(NS3, "fullName"), 1);
        currType.addSimpleElement(new QName(NS3, "password"), 1);
        currType.addSimpleElement(new QName(NS3, "userID"), 1);
         
        // Type #34 (ErrorData)
        currType = complexTypes.get(34);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(37), -1);
         
        // Type #35 (CommonErrorData)
        currType = complexTypes.get(35);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(37), -1);
        currType.addSimpleElement(new QName(NS1, "errorName"), 1);
        currType.addSimpleElement(new QName(NS1, "cause"), 1);
        currType.addSimpleElement(new QName(NS1, "resolution"), 1);
        currType.addSimpleElement(new QName(NS1, "errorGroups"), 1);
        currType.addSimpleElement(new QName(NS1, "organization"), 1);
         
        // Type #36 (ExtensionType)
        currType = complexTypes.get(36);
        currType.addSimpleElement(new QName(NS1, "id"), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "contentType"), 1);
        currType.addSimpleElement(new QName(NS1, "value"), 1);
         
        // Type #37 (ErrorParameter)
        currType = complexTypes.get(37);
        currType.addAttribute(new QName(NS1, "name"));
         
        // Type #38 (ErrorMessage)
        currType = complexTypes.get(38);
        currType.addComplexElement(new QName(NS1, "error"), complexTypes.get(35), -1);
    }

    private void addRootElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes, HashMap<QName, FlatSchemaElementDeclImpl> rootElements) {
        rootElements.put(new QName(NS2, "getTopOrdersResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getTopOrdersResponse"), complexTypes.get(1)));
        rootElements.put(new QName(NS2, "getAccountProfileDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountProfileDataRequest"), complexTypes.get(13)));
        rootElements.put(new QName(NS2, "sellEnhancedResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellEnhancedResponse"), complexTypes.get(20)));
        rootElements.put(new QName(NS2, "updateAccountProfileRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateAccountProfileRequest"), complexTypes.get(21)));
        rootElements.put(new QName(NS2, "getOrdersResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOrdersResponse"), complexTypes.get(12)));
        rootElements.put(new QName(NS2, "getHoldingResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingResponse"), complexTypes.get(17)));
        rootElements.put(new QName(NS2, "buyRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "buyRequest"), complexTypes.get(19)));
        rootElements.put(new QName(NS2, "sellEnhancedRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellEnhancedRequest"), complexTypes.get(8)));
        rootElements.put(new QName(NS2, "getHoldingsRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingsRequest"), complexTypes.get(26)));
        rootElements.put(new QName(NS2, "getHoldingRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingRequest"), complexTypes.get(10)));
        rootElements.put(new QName(NS2, "sellResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellResponse"), complexTypes.get(2)));
        rootElements.put(new QName(NS2, "getAccountProfileDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountProfileDataResponse"), complexTypes.get(4)));
        rootElements.put(new QName(NS2, "getClosedOrdersResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getClosedOrdersResponse"), complexTypes.get(15)));
        rootElements.put(new QName(NS2, "getTopOrdersRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getTopOrdersRequest"), complexTypes.get(16)));
        rootElements.put(new QName(NS2, "getAccountDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountDataResponse"), complexTypes.get(25)));
        rootElements.put(new QName(NS2, "getQuoteRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getQuoteRequest"), complexTypes.get(14)));
        rootElements.put(new QName(NS2, "getMarketSummaryResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getMarketSummaryResponse"), complexTypes.get(27)));
        rootElements.put(new QName(NS2, "getHoldingsResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingsResponse"), complexTypes.get(24)));
        rootElements.put(new QName(NS2, "buyResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "buyResponse"), complexTypes.get(3)));
        rootElements.put(new QName(NS2, "updateAccountProfileResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateAccountProfileResponse"), complexTypes.get(7)));
        rootElements.put(new QName(NS2, "sellRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellRequest"), complexTypes.get(18)));
        rootElements.put(new QName(NS2, "getMarketSummaryRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getMarketSummaryRequest"), complexTypes.get(23)));
        rootElements.put(new QName(NS2, "getQuoteResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getQuoteResponse"), complexTypes.get(9)));
        rootElements.put(new QName(NS2, "getOrdersRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOrdersRequest"), complexTypes.get(6)));
        rootElements.put(new QName(NS2, "getClosedOrdersRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getClosedOrdersRequest"), complexTypes.get(22)));
        rootElements.put(new QName(NS2, "getAccountDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountDataRequest"), complexTypes.get(11)));
    }

}
