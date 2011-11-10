
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
        addComplexTypeElements1(complexTypes);
         
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
        // Type #5 (GetWalletDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetWalletDataResponse")));
        // Type #6 (GetAccountProfileDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountProfileDataResponse")));
        // Type #7 (BaseRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "BaseRequest")));
        // Type #8 (GetOrdersRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetOrdersRequest")));
        // Type #9 (GetWalletDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetWalletDataRequest")));
        // Type #10 (UpdateAccountProfileResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "UpdateAccountProfileResponse")));
        // Type #11 (SellEnhancedRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellEnhancedRequest")));
        // Type #12 (GetQuoteResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetQuoteResponse")));
        // Type #13 (GetHoldingRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingRequest")));
        // Type #14 (GetAccountDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountDataRequest")));
        // Type #15 (GetOrdersResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetOrdersResponse")));
        // Type #16 (GetAccountProfileDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountProfileDataRequest")));
        // Type #17 (GetQuoteRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetQuoteRequest")));
        // Type #18 (registerRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "registerRequest")));
        // Type #19 (GetClosedOrdersResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetClosedOrdersResponse")));
        // Type #20 (LogoutRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LogoutRequest")));
        // Type #21 (LoginResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LoginResponse")));
        // Type #22 (LoginRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LoginRequest")));
        // Type #23 (GetTopOrdersRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetTopOrdersRequest")));
        // Type #24 (GetHoldingResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingResponse")));
        // Type #25 (SellRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellRequest")));
        // Type #26 (BuyRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "BuyRequest")));
        // Type #27 (SellEnhancedResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "SellEnhancedResponse")));
        // Type #28 (UpdateAccountProfileRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "UpdateAccountProfileRequest")));
        // Type #29 (GetClosedOrdersRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetClosedOrdersRequest")));
        // Type #30 (GetMarketSummaryRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetMarketSummaryRequest")));
        // Type #31 (GetHoldingsResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingsResponse")));
        // Type #32 (GetAccountDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountDataResponse")));
        // Type #33 (GetHoldingsRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetHoldingsRequest")));
        // Type #34 (getAllQuotesRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "getAllQuotesRequest")));
        // Type #35 (GetMarketSummaryResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetMarketSummaryResponse")));
        // Type #36 (AccountData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "AccountData")));
        // Type #37 (MarketSummaryData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "MarketSummaryData")));
        // Type #38 (WalletData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "WalletData")));
        // Type #39 (QuoteData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "QuoteData")));
        // Type #40 (OrderData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "OrderData")));
        // Type #41 (HoldingData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "HoldingData")));
        // Type #42 (AccountProfileData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS3, "AccountProfileData")));
        // Type #43 (ErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorData")));
        // Type #44 (CommonErrorData)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "CommonErrorData")));
        // Type #45 (ExtensionType)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ExtensionType")));
        // Type #46 (ErrorParameter)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorParameter")));
        // Type #47 (ErrorMessage)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "ErrorMessage")));
        // Type #48 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #49 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #50 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #51 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #52 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #53 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #54 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #55 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
        // Type #56 (<Anonymous>)
        complexTypes.add(new FlatSchemaComplexTypeImpl());
    }

    private void addComplexTypeElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes) {
        FlatSchemaComplexTypeImpl currType;
         
        // Type #0 (BaseResponse)
        currType = complexTypes.get(0);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
         
        // Type #1 (GetTopOrdersResponse)
        currType = complexTypes.get(1);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(40), -1);
         
        // Type #2 (LogoutResponse)
        // type has no child elements
         
        // Type #3 (SellResponse)
        currType = complexTypes.get(3);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(40), 1);
         
        // Type #4 (BuyResponse)
        currType = complexTypes.get(4);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(40), 1);
         
        // Type #5 (GetWalletDataResponse)
        currType = complexTypes.get(5);
        currType.addComplexElement(new QName(NS2, "walletData"), complexTypes.get(38), 1);
         
        // Type #6 (GetAccountProfileDataResponse)
        currType = complexTypes.get(6);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "accountProfileData"), complexTypes.get(42), 1);
         
        // Type #7 (BaseRequest)
        currType = complexTypes.get(7);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
         
        // Type #8 (GetOrdersRequest)
        currType = complexTypes.get(8);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #9 (GetWalletDataRequest)
        currType = complexTypes.get(9);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #10 (UpdateAccountProfileResponse)
        currType = complexTypes.get(10);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "accountProfileData"), complexTypes.get(42), 1);
         
        // Type #11 (SellEnhancedRequest)
        currType = complexTypes.get(11);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "holdingID"), 1);
        currType.addSimpleElement(new QName(NS2, "quantity"), 1);
         
        // Type #12 (GetQuoteResponse)
        currType = complexTypes.get(12);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "quoteData"), complexTypes.get(39), 1);
         
        // Type #13 (GetHoldingRequest)
        currType = complexTypes.get(13);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "holdingID"), 1);
         
        // Type #14 (GetAccountDataRequest)
        currType = complexTypes.get(14);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #15 (GetOrdersResponse)
        currType = complexTypes.get(15);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(40), -1);
         
        // Type #16 (GetAccountProfileDataRequest)
        currType = complexTypes.get(16);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #17 (GetQuoteRequest)
        currType = complexTypes.get(17);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "symbol"), 1);
         
        // Type #18 (registerRequest)
        currType = complexTypes.get(18);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "password"), 1);
        currType.addSimpleElement(new QName(NS2, "fullname"), 1);
        currType.addSimpleElement(new QName(NS2, "address"), 1);
        currType.addSimpleElement(new QName(NS2, "email"), 1);
        currType.addSimpleElement(new QName(NS2, "creditcard"), 1);
        currType.addSimpleElement(new QName(NS2, "openBalance"), 1);
        currType.addSimpleElement(new QName(NS2, "currencyType"), 1);
         
        // Type #19 (GetClosedOrdersResponse)
        currType = complexTypes.get(19);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(40), -1);
         
        // Type #20 (LogoutRequest)
        currType = complexTypes.get(20);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #21 (LoginResponse)
        currType = complexTypes.get(21);
        currType.addComplexElement(new QName(NS2, "account"), complexTypes.get(36), 1);
         
        // Type #22 (LoginRequest)
        currType = complexTypes.get(22);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "password"), 1);
         
        // Type #23 (GetTopOrdersRequest)
        currType = complexTypes.get(23);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #24 (GetHoldingResponse)
        currType = complexTypes.get(24);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "holdingData"), complexTypes.get(41), 1);
         
        // Type #25 (SellRequest)
        currType = complexTypes.get(25);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "holdingID"), 1);
        currType.addSimpleElement(new QName(NS2, "orderProcessingMode"), 1);
         
        // Type #26 (BuyRequest)
        currType = complexTypes.get(26);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
        currType.addSimpleElement(new QName(NS2, "symbol"), 1);
        currType.addSimpleElement(new QName(NS2, "quantity"), 1);
        currType.addSimpleElement(new QName(NS2, "orderProcessingMode"), 1);
         
        // Type #27 (SellEnhancedResponse)
        currType = complexTypes.get(27);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "orderData"), complexTypes.get(40), 1);
         
        // Type #28 (UpdateAccountProfileRequest)
        currType = complexTypes.get(28);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "accountProfileData"), complexTypes.get(42), 1);
         
        // Type #29 (GetClosedOrdersRequest)
        currType = complexTypes.get(29);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #30 (GetMarketSummaryRequest)
        currType = complexTypes.get(30);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
         
        // Type #31 (GetHoldingsResponse)
        currType = complexTypes.get(31);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "holdingData"), complexTypes.get(41), -1);
         
        // Type #32 (GetAccountDataResponse)
        currType = complexTypes.get(32);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "accountData"), complexTypes.get(36), 1);
         
        // Type #33 (GetHoldingsRequest)
        currType = complexTypes.get(33);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #34 (getAllQuotesRequest)
        currType = complexTypes.get(34);
        currType.addSimpleElement(new QName(NS2, "start"), 1);
        currType.addSimpleElement(new QName(NS2, "limit"), 1);
         
        // Type #35 (GetMarketSummaryResponse)
        currType = complexTypes.get(35);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(47), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(45), -1);
        currType.addComplexElement(new QName(NS2, "marketSummaryData"), complexTypes.get(37), 1);
         
        // Type #36 (AccountData)
        currType = complexTypes.get(36);
        currType.addSimpleElement(new QName(NS3, "profileID"), 1);
        currType.addSimpleElement(new QName(NS3, "openBalance"), 1);
        currType.addSimpleElement(new QName(NS3, "balance"), 1);
        currType.addSimpleElement(new QName(NS3, "creationDate"), 1);
        currType.addSimpleElement(new QName(NS3, "lastLogin"), 1);
        currType.addSimpleElement(new QName(NS3, "logoutCount"), 1);
        currType.addSimpleElement(new QName(NS3, "loginCount"), 1);
        currType.addSimpleElement(new QName(NS3, "accountID"), 1);
        currType.addSimpleElement(new QName(NS3, "currencyType"), 1);
         
        // Type #37 (MarketSummaryData)
        currType = complexTypes.get(37);
        currType.addSimpleElement(new QName(NS3, "summaryDate"), 1);
        currType.addComplexElement(new QName(NS3, "topLosers"), complexTypes.get(39), -1);
        currType.addComplexElement(new QName(NS3, "topGainers"), complexTypes.get(39), -1);
        currType.addSimpleElement(new QName(NS3, "volume"), 1);
        currType.addSimpleElement(new QName(NS3, "openTSIA"), 1);
        currType.addSimpleElement(new QName(NS3, "TSIA"), 1);
         
        // Type #38 (WalletData)
        currType = complexTypes.get(38);
        currType.addSimpleElement(new QName(NS3, "userID"), 1);
        currType.addSimpleElement(new QName(NS3, "eur"), 1);
        currType.addSimpleElement(new QName(NS3, "usd"), 1);
        currType.addSimpleElement(new QName(NS3, "gbp"), 1);
        currType.addSimpleElement(new QName(NS3, "cny"), 1);
        currType.addSimpleElement(new QName(NS3, "inr"), 1);
         
        // Type #39 (QuoteData)
        currType = complexTypes.get(39);
        currType.addSimpleElement(new QName(NS3, "volume"), 1);
        currType.addSimpleElement(new QName(NS3, "change"), 1);
        currType.addSimpleElement(new QName(NS3, "high"), 1);
        currType.addSimpleElement(new QName(NS3, "low"), 1);
        currType.addSimpleElement(new QName(NS3, "open"), 1);
        currType.addSimpleElement(new QName(NS3, "price"), 1);
        currType.addSimpleElement(new QName(NS3, "companyName"), 1);
        currType.addSimpleElement(new QName(NS3, "symbol"), 1);
         
        // Type #40 (OrderData)
        currType = complexTypes.get(40);
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
         
        // Type #41 (HoldingData)
        currType = complexTypes.get(41);
        currType.addSimpleElement(new QName(NS3, "quoteID"), 1);
        currType.addSimpleElement(new QName(NS3, "purchaseDate"), 1);
        currType.addSimpleElement(new QName(NS3, "purchasePrice"), 1);
        currType.addSimpleElement(new QName(NS3, "quantity"), 1);
        currType.addSimpleElement(new QName(NS3, "holdingID"), 1);
         
        // Type #42 (AccountProfileData)
        currType = complexTypes.get(42);
        currType.addSimpleElement(new QName(NS3, "creditCard"), 1);
        currType.addSimpleElement(new QName(NS3, "email"), 1);
        currType.addSimpleElement(new QName(NS3, "address"), 1);
        currType.addSimpleElement(new QName(NS3, "fullName"), 1);
        currType.addSimpleElement(new QName(NS3, "password"), 1);
        currType.addSimpleElement(new QName(NS3, "userID"), 1);
         
        // Type #43 (ErrorData)
        currType = complexTypes.get(43);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(46), -1);
         
        // Type #44 (CommonErrorData)
        currType = complexTypes.get(44);
        currType.addSimpleElement(new QName(NS1, "errorId"), 1);
        currType.addSimpleElement(new QName(NS1, "domain"), 1);
        currType.addSimpleElement(new QName(NS1, "subdomain"), 1);
        currType.addSimpleElement(new QName(NS1, "severity"), 1);
        currType.addSimpleElement(new QName(NS1, "category"), 1);
        currType.addSimpleElement(new QName(NS1, "message"), 1);
        currType.addSimpleElement(new QName(NS1, "exceptionId"), 1);
        currType.addComplexElement(new QName(NS1, "parameter"), complexTypes.get(46), -1);
        currType.addSimpleElement(new QName(NS1, "errorName"), 1);
        currType.addSimpleElement(new QName(NS1, "cause"), 1);
        currType.addSimpleElement(new QName(NS1, "resolution"), 1);
        currType.addSimpleElement(new QName(NS1, "errorGroups"), 1);
        currType.addSimpleElement(new QName(NS1, "organization"), 1);
    }

    private void addComplexTypeElements1(ArrayList<FlatSchemaComplexTypeImpl> complexTypes) {
        FlatSchemaComplexTypeImpl currType;
         
        // Type #45 (ExtensionType)
        currType = complexTypes.get(45);
        currType.addSimpleElement(new QName(NS1, "id"), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "contentType"), 1);
        currType.addSimpleElement(new QName(NS1, "value"), 1);
         
        // Type #46 (ErrorParameter)
        currType = complexTypes.get(46);
        currType.addAttribute(new QName(NS1, "name"));
         
        // Type #47 (ErrorMessage)
        currType = complexTypes.get(47);
        currType.addComplexElement(new QName(NS1, "error"), complexTypes.get(44), -1);
         
        // Type #48 (<Anonymous>)
        currType = complexTypes.get(48);
        currType.addComplexElement(new QName(NS2, "newWalletData"), complexTypes.get(38), 1);
         
        // Type #49 (<Anonymous>)
        currType = complexTypes.get(49);
        currType.addComplexElement(new QName(NS2, "walletData"), complexTypes.get(38), 1);
         
        // Type #50 (<Anonymous>)
        currType = complexTypes.get(50);
        currType.addSimpleElement(new QName(NS2, "userID"), 1);
         
        // Type #51 (<Anonymous>)
        currType = complexTypes.get(51);
        currType.addSimpleElement(new QName(NS2, "in"), 1);
         
        // Type #52 (<Anonymous>)
        currType = complexTypes.get(52);
        currType.addSimpleElement(new QName(NS2, "out"), 1);
         
        // Type #53 (<Anonymous>)
        currType = complexTypes.get(53);
        currType.addSimpleElement(new QName(NS2, "in"), 1);
         
        // Type #54 (<Anonymous>)
        currType = complexTypes.get(54);
        currType.addSimpleElement(new QName(NS2, "in"), 1);
         
        // Type #55 (<Anonymous>)
        currType = complexTypes.get(55);
        currType.addSimpleElement(new QName(NS2, "in"), 1);
         
        // Type #56 (<Anonymous>)
        currType = complexTypes.get(56);
        currType.addComplexElement(new QName(NS2, "quotes"), complexTypes.get(39), -1);
    }

    private void addRootElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes, HashMap<QName, FlatSchemaElementDeclImpl> rootElements) {
        rootElements.put(new QName(NS2, "registerResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "registerResponse"), complexTypes.get(52)));
        rootElements.put(new QName(NS2, "getTopOrdersResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getTopOrdersResponse"), complexTypes.get(1)));
        rootElements.put(new QName(NS2, "logoutResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "logoutResponse"), complexTypes.get(2)));
        rootElements.put(new QName(NS2, "getAccountProfileDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountProfileDataRequest"), complexTypes.get(16)));
        rootElements.put(new QName(NS2, "getWalletDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getWalletDataRequest"), complexTypes.get(9)));
        rootElements.put(new QName(NS2, "registerRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "registerRequest"), complexTypes.get(18)));
        rootElements.put(new QName(NS2, "login"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "login"), complexTypes.get(51)));
        rootElements.put(new QName(NS2, "sellEnhancedResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellEnhancedResponse"), complexTypes.get(27)));
        rootElements.put(new QName(NS2, "updateAccountProfileRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateAccountProfileRequest"), complexTypes.get(28)));
        rootElements.put(new QName(NS2, "getWallet"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getWallet"), complexTypes.get(50)));
        rootElements.put(new QName(NS2, "getOrdersResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOrdersResponse"), complexTypes.get(15)));
        rootElements.put(new QName(NS2, "loginRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "loginRequest"), complexTypes.get(22)));
        rootElements.put(new QName(NS2, "buyRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "buyRequest"), complexTypes.get(26)));
        rootElements.put(new QName(NS2, "getHoldingResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingResponse"), complexTypes.get(24)));
        rootElements.put(new QName(NS2, "sellEnhancedRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellEnhancedRequest"), complexTypes.get(11)));
        rootElements.put(new QName(NS2, "getHoldingsRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingsRequest"), complexTypes.get(33)));
        rootElements.put(new QName(NS2, "getHoldingRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingRequest"), complexTypes.get(13)));
        rootElements.put(new QName(NS2, "sellResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellResponse"), complexTypes.get(3)));
        rootElements.put(new QName(NS2, "getAccountProfileDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountProfileDataResponse"), complexTypes.get(6)));
        rootElements.put(new QName(NS2, "updateWalletDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateWalletDataRequest"), complexTypes.get(49)));
        rootElements.put(new QName(NS2, "getClosedOrdersResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getClosedOrdersResponse"), complexTypes.get(19)));
        rootElements.put(new QName(NS2, "updateWalletDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateWalletDataResponse"), complexTypes.get(48)));
        rootElements.put(new QName(NS2, "getTopOrdersRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getTopOrdersRequest"), complexTypes.get(23)));
        rootElements.put(new QName(NS2, "getWalletDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getWalletDataResponse"), complexTypes.get(5)));
        rootElements.put(new QName(NS2, "getAccountDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountDataResponse"), complexTypes.get(32)));
        rootElements.put(new QName(NS2, "getAllQuotesRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAllQuotesRequest"), complexTypes.get(34)));
        rootElements.put(new QName(NS2, "getQuoteRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getQuoteRequest"), complexTypes.get(17)));
        rootElements.put(new QName(NS2, "getMarketSummaryResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getMarketSummaryResponse"), complexTypes.get(35)));
        rootElements.put(new QName(NS2, "getAllQuotesResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAllQuotesResponse"), complexTypes.get(56)));
        rootElements.put(new QName(NS2, "getHoldingsResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getHoldingsResponse"), complexTypes.get(31)));
        rootElements.put(new QName(NS2, "register"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "register"), complexTypes.get(54)));
        rootElements.put(new QName(NS2, "updateAccountProfileResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateAccountProfileResponse"), complexTypes.get(10)));
        rootElements.put(new QName(NS2, "buyResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "buyResponse"), complexTypes.get(4)));
        rootElements.put(new QName(NS2, "logout"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "logout"), complexTypes.get(55)));
        rootElements.put(new QName(NS2, "sellRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "sellRequest"), complexTypes.get(25)));
        rootElements.put(new QName(NS2, "logoutRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "logoutRequest"), complexTypes.get(20)));
        rootElements.put(new QName(NS2, "getAllQuotes"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAllQuotes"), complexTypes.get(53)));
        rootElements.put(new QName(NS2, "getQuoteResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getQuoteResponse"), complexTypes.get(12)));
        rootElements.put(new QName(NS2, "getMarketSummaryRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getMarketSummaryRequest"), complexTypes.get(30)));
        rootElements.put(new QName(NS2, "loginResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "loginResponse"), complexTypes.get(21)));
        rootElements.put(new QName(NS2, "getClosedOrdersRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getClosedOrdersRequest"), complexTypes.get(29)));
        rootElements.put(new QName(NS2, "getOrdersRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getOrdersRequest"), complexTypes.get(8)));
        rootElements.put(new QName(NS2, "getAccountDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountDataRequest"), complexTypes.get(14)));
    }

}
