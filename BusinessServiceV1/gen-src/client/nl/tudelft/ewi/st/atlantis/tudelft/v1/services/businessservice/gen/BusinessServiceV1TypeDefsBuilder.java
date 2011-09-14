
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
        // Type #2 (LogoutResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LogoutResponse")));
        // Type #3 (SellResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellResponse")));
        // Type #4 (BuyResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "BuyResponse")));
        // Type #5 (GetAccountProfileDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountProfileDataResponse")));
        // Type #6 (BaseRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "BaseRequest")));
        // Type #7 (GetOrdersRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetOrdersRequest")));
        // Type #8 (UpdateAccountProfileResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "UpdateAccountProfileResponse")));
        // Type #9 (SellEnhancedRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellEnhancedRequest")));
        // Type #10 (GetQuoteResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetQuoteResponse")));
        // Type #11 (GetHoldingRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingRequest")));
        // Type #12 (GetAccountDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountDataRequest")));
        // Type #13 (GetOrdersResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetOrdersResponse")));
        // Type #14 (GetAccountProfileDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountProfileDataRequest")));
        // Type #15 (GetQuoteRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetQuoteRequest")));
        // Type #16 (GetClosedOrdersResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetClosedOrdersResponse")));
        // Type #17 (LogoutRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LogoutRequest")));
        // Type #18 (LoginResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LoginResponse")));
        // Type #19 (LoginRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LoginRequest")));
        // Type #20 (GetTopOrdersRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetTopOrdersRequest")));
        // Type #21 (GetHoldingResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingResponse")));
        // Type #22 (SellRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellRequest")));
        // Type #23 (BuyRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "BuyRequest")));
        // Type #24 (SellEnhancedResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellEnhancedResponse")));
        // Type #25 (UpdateAccountProfileRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "UpdateAccountProfileRequest")));
        // Type #26 (GetClosedOrdersRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetClosedOrdersRequest")));
        // Type #27 (GetMarketSummaryRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetMarketSummaryRequest")));
        // Type #28 (GetHoldingsResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingsResponse")));
        // Type #29 (GetAccountDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountDataResponse")));
        // Type #30 (GetHoldingsRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingsRequest")));
        // Type #31 (getAllQuotesRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "getAllQuotesRequest")));
        // Type #32 (GetMarketSummaryResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetMarketSummaryResponse")));
        // Type #33 (AccountData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "AccountData")));
        // Type #34 (MarketSummaryData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "MarketSummaryData")));
        // Type #35 (QuoteData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "QuoteData")));
        // Type #36 (OrderData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "OrderData")));
        // Type #37 (HoldingData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "HoldingData")));
        // Type #38 (AccountProfileData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "AccountProfileData")));
        // Type #39 (ErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorData")));
        // Type #40 (CommonErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "CommonErrorData")));
        // Type #41 (ExtensionType)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ExtensionType")));
        // Type #42 (ErrorParameter)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorParameter")));
        // Type #43 (ErrorMessage)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorMessage")));
        // Type #44 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #45 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #46 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #47 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
    }

    private void addComplexTypeElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes) {
        FlatSchemaComplexTypeImpl currType;
         
        // Type #0 (BaseResponse)
        currType = complexTypes.get(0);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
         
        // Type #1 (GetTopOrdersResponse)
        currType = complexTypes.get(1);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(36), -1);
         
        // Type #2 (LogoutResponse)
        // type has no child elements
         
        // Type #3 (SellResponse)
        currType = complexTypes.get(3);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(36), 1);
         
        // Type #4 (BuyResponse)
        currType = complexTypes.get(4);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(36), 1);
         
        // Type #5 (GetAccountProfileDataResponse)
        currType = complexTypes.get(5);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "accountProfileData"), complexTypes.get(38), 1);
         
        // Type #6 (BaseRequest)
        currType = complexTypes.get(6);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
         
        // Type #7 (GetOrdersRequest)
        currType = complexTypes.get(7);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #8 (UpdateAccountProfileResponse)
        currType = complexTypes.get(8);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "accountProfileData"), complexTypes.get(38), 1);
         
        // Type #9 (SellEnhancedRequest)
        currType = complexTypes.get(9);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "holdingID"), 1);
        currType.addSimpleElement(new QName(NS2, "quantity"), 1);
         
        // Type #10 (GetQuoteResponse)
        currType = complexTypes.get(10);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "quoteData"), complexTypes.get(35), 1);
         
        // Type #11 (GetHoldingRequest)
        currType = complexTypes.get(11);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "holdingID"), 1);
         
        // Type #12 (GetAccountDataRequest)
        currType = complexTypes.get(12);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #13 (GetOrdersResponse)
        currType = complexTypes.get(13);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(36), -1);
         
        // Type #14 (GetAccountProfileDataRequest)
        currType = complexTypes.get(14);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #15 (GetQuoteRequest)
        currType = complexTypes.get(15);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "symbol"), 1);
         
        // Type #16 (GetClosedOrdersResponse)
        currType = complexTypes.get(16);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(36), -1);
         
        // Type #17 (LogoutRequest)
        currType = complexTypes.get(17);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #18 (LoginResponse)
        currType = complexTypes.get(18);
        currType.addComplexElement(new QName(NS2, "account"), complexTypes.get(33), 1);
         
        // Type #19 (LoginRequest)
        currType = complexTypes.get(19);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "password"), 1);
         
        // Type #20 (GetTopOrdersRequest)
        currType = complexTypes.get(20);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #21 (GetHoldingResponse)
        currType = complexTypes.get(21);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "holdingData"), complexTypes.get(37), 1);
         
        // Type #22 (SellRequest)
        currType = complexTypes.get(22);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "holdingID"), 1);
        currType.addSimpleElement(new QName(NS2, "orderProcessingMode"), 1);
         
        // Type #23 (BuyRequest)
        currType = complexTypes.get(23);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "symbol"), 1);
        currType.addSimpleElement(new QName(NS2, "quantity"), 1);
        currType.addSimpleElement(new QName(NS2, "orderProcessingMode"), 1);
         
        // Type #24 (SellEnhancedResponse)
        currType = complexTypes.get(24);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(36), 1);
         
        // Type #25 (UpdateAccountProfileRequest)
        currType = complexTypes.get(25);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "accountProfileData"), complexTypes.get(38), 1);
         
        // Type #26 (GetClosedOrdersRequest)
        currType = complexTypes.get(26);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #27 (GetMarketSummaryRequest)
        currType = complexTypes.get(27);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
         
        // Type #28 (GetHoldingsResponse)
        currType = complexTypes.get(28);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "holdingData"), complexTypes.get(37), -1);
         
        // Type #29 (GetAccountDataResponse)
        currType = complexTypes.get(29);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "accountData"), complexTypes.get(33), 1);
         
        // Type #30 (GetHoldingsRequest)
        currType = complexTypes.get(30);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #31 (getAllQuotesRequest)
        currType = complexTypes.get(31);
        currType.addSimpleElement(new QName(NS2, "start"), 1);
        currType.addSimpleElement(new QName(NS2, "limit"), 1);
         
        // Type #32 (GetMarketSummaryResponse)
        currType = complexTypes.get(32);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(43), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(41), -1);
        currType.addComplexElement(new QName(NS2, "marketSummaryData"), complexTypes.get(34), 1);
         
        // Type #33 (AccountData)
        currType = complexTypes.get(33);
        currType.addSimpleElement(new QName(NS3, "profileID"), 1);
        currType.addSimpleElement(new QName(NS3, "openBalance"), 1);
        currType.addSimpleElement(new QName(NS3, "balance"), 1);
        currType.addSimpleElement(new QName(NS3, "creationDate"), 1);
        currType.addSimpleElement(new QName(NS3, "lastLogin"), 1);
        currType.addSimpleElement(new QName(NS3, "logoutCount"), 1);
        currType.addSimpleElement(new QName(NS3, "loginCount"), 1);
        currType.addSimpleElement(new QName(NS3, "accountID"), 1);
         
        // Type #34 (MarketSummaryData)
        currType = complexTypes.get(34);
        currType.addSimpleElement(new QName(NS3, "summaryDate"), 1);
        currType.addComplexElement(new QName(NS3, "topLosers"), complexTypes.get(35), -1);
        currType.addComplexElement(new QName(NS3, "topGainers"), complexTypes.get(35), -1);
        currType.addSimpleElement(new QName(NS3, "volume"), 1);
        currType.addSimpleElement(new QName(NS3, "openTSIA"), 1);
        currType.addSimpleElement(new QName(NS3, "TSIA"), 1);
         
        // Type #35 (QuoteData)
        currType = complexTypes.get(35);
        currType.addSimpleElement(new QName(NS3, "volume"), 1);
        currType.addSimpleElement(new QName(NS3, "change"), 1);
        currType.addSimpleElement(new QName(NS3, "high"), 1);
        currType.addSimpleElement(new QName(NS3, "low"), 1);
        currType.addSimpleElement(new QName(NS3, "open"), 1);
        currType.addSimpleElement(new QName(NS3, "price"), 1);
        currType.addSimpleElement(new QName(NS3, "companyName"), 1);
        currType.addSimpleElement(new QName(NS3, "symbol"), 1);
         
        // Type #36 (OrderData)
        currType = complexTypes.get(36);
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
         
        // Type #37 (HoldingData)
        currType = complexTypes.get(37);
        currType.addSimpleElement(new QName(NS3, "quoteID"), 1);
        currType.addSimpleElement(new QName(NS3, "purchaseDate"), 1);
        currType.addSimpleElement(new QName(NS3, "purchasePrice"), 1);
        currType.addSimpleElement(new QName(NS3, "quantity"), 1);
        currType.addSimpleElement(new QName(NS3, "holdingID"), 1);
         
        // Type #38 (AccountProfileData)
        currType = complexTypes.get(38);
        currType.addSimpleElement(new QName(NS3, "creditCard"), 1);
        currType.addSimpleElement(new QName(NS3, "email"), 1);
        currType.addSimpleElement(new QName(NS3, "address"), 1);
        currType.addSimpleElement(new QName(NS3, "fullName"), 1);
        currType.addSimpleElement(new QName(NS3, "password"), 1);
        currType.addSimpleElement(new QName(NS3, "userID"), 1);
         
        // Type #39 (ErrorData)
        currType = complexTypes.get(39);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(42), -1);
         
        // Type #40 (CommonErrorData)
        currType = complexTypes.get(40);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(42), -1);
        currType.addSimpleElement(new QName(NS1, "errorName"), 1);
        currType.addSimpleElement(new QName(NS1, "cause"), 1);
        currType.addSimpleElement(new QName(NS1, "resolution"), 1);
        currType.addSimpleElement(new QName(NS1, "errorGroups"), 1);
        currType.addSimpleElement(new QName(NS1, "organization"), 1);
         
        // Type #41 (ExtensionType)
        currType = complexTypes.get(41);
        currType.addSimpleElement(new QName(NS1, "id"), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "contentType"), 1);
        currType.addSimpleElement(new QName(NS1, "value"), 1);
         
        // Type #42 (ErrorParameter)
        currType = complexTypes.get(42);
        currType.addAttribute(new QName(NS1, "name"));
         
        // Type #43 (ErrorMessage)
        currType = complexTypes.get(43);
        currType.addComplexElement(new QName(NS1, "error"), complexTypes.get(40), -1);
         
        // Type #44 (<Anonymous>)
        currType = complexTypes.get(44);
        currType.addSimpleElement(new QName(NS2, "in"), 1);
         
        // Type #45 (<Anonymous>)
        currType = complexTypes.get(45);
        currType.addSimpleElement(new QName(NS2, "in"), 1);
         
        // Type #46 (<Anonymous>)
        currType = complexTypes.get(46);
        currType.addSimpleElement(new QName(NS2, "in"), 1);
         
        // Type #47 (<Anonymous>)
        currType = complexTypes.get(47);
        currType.addComplexElement(new QName(NS2, "quotes"), complexTypes.get(35), -1);
    }

    private void addRootElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes, HashMap<QName, FlatSchemaElementDeclImpl> rootElements) {
        rootElements.put(new QName(NS2, "getTopOrdersResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getTopOrdersResponse"), complexTypes.get(1)));
        rootElements.put(new QName(NS2, "logoutResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "logoutResponse"), complexTypes.get(2)));
        rootElements.put(new QName(NS2, "getAccountProfileDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountProfileDataRequest"), complexTypes.get(14)));
        rootElements.put(new QName(NS2, "login"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "login"), complexTypes.get(44)));
        rootElements.put(new QName(NS2, "sellEnhancedResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellEnhancedResponse"), complexTypes.get(24)));
        rootElements.put(new QName(NS2, "updateAccountProfileRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateAccountProfileRequest"), complexTypes.get(25)));
        rootElements.put(new QName(NS2, "getOrdersResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOrdersResponse"), complexTypes.get(13)));
        rootElements.put(new QName(NS2, "getHoldingResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingResponse"), complexTypes.get(21)));
        rootElements.put(new QName(NS2, "buyRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "buyRequest"), complexTypes.get(23)));
        rootElements.put(new QName(NS2, "loginRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "loginRequest"), complexTypes.get(19)));
        rootElements.put(new QName(NS2, "sellEnhancedRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellEnhancedRequest"), complexTypes.get(9)));
        rootElements.put(new QName(NS2, "getHoldingsRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingsRequest"), complexTypes.get(30)));
        rootElements.put(new QName(NS2, "getHoldingRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingRequest"), complexTypes.get(11)));
        rootElements.put(new QName(NS2, "sellResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellResponse"), complexTypes.get(3)));
        rootElements.put(new QName(NS2, "getAccountProfileDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountProfileDataResponse"), complexTypes.get(5)));
        rootElements.put(new QName(NS2, "getClosedOrdersResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getClosedOrdersResponse"), complexTypes.get(16)));
        rootElements.put(new QName(NS2, "getTopOrdersRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getTopOrdersRequest"), complexTypes.get(20)));
        rootElements.put(new QName(NS2, "getAccountDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountDataResponse"), complexTypes.get(29)));
        rootElements.put(new QName(NS2, "getAllQuotesRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAllQuotesRequest"), complexTypes.get(31)));
        rootElements.put(new QName(NS2, "getQuoteRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getQuoteRequest"), complexTypes.get(15)));
        rootElements.put(new QName(NS2, "getMarketSummaryResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getMarketSummaryResponse"), complexTypes.get(32)));
        rootElements.put(new QName(NS2, "getAllQuotesResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAllQuotesResponse"), complexTypes.get(47)));
        rootElements.put(new QName(NS2, "getHoldingsResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingsResponse"), complexTypes.get(28)));
        rootElements.put(new QName(NS2, "updateAccountProfileResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateAccountProfileResponse"), complexTypes.get(8)));
        rootElements.put(new QName(NS2, "buyResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "buyResponse"), complexTypes.get(4)));
        rootElements.put(new QName(NS2, "logout"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "logout"), complexTypes.get(46)));
        rootElements.put(new QName(NS2, "sellRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellRequest"), complexTypes.get(22)));
        rootElements.put(new QName(NS2, "logoutRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "logoutRequest"), complexTypes.get(17)));
        rootElements.put(new QName(NS2, "getAllQuotes"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAllQuotes"), complexTypes.get(45)));
        rootElements.put(new QName(NS2, "getMarketSummaryRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getMarketSummaryRequest"), complexTypes.get(27)));
        rootElements.put(new QName(NS2, "getQuoteResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getQuoteResponse"), complexTypes.get(10)));
        rootElements.put(new QName(NS2, "loginResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "loginResponse"), complexTypes.get(18)));
        rootElements.put(new QName(NS2, "getOrdersRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOrdersRequest"), complexTypes.get(7)));
        rootElements.put(new QName(NS2, "getClosedOrdersRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getClosedOrdersRequest"), complexTypes.get(26)));
        rootElements.put(new QName(NS2, "getAccountDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountDataRequest"), complexTypes.get(12)));
    }

}
