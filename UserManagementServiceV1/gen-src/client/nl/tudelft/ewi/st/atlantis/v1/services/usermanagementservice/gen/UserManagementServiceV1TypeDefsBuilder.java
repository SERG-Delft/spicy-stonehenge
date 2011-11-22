
package nl.tudelft.ewi.st.atlantis.v1.services.usermanagementservice.gen;

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
public class UserManagementServiceV1TypeDefsBuilder
    extends BaseTypeDefsBuilder
{

    private final static String NS1 = "http://www.ebayopensource.org/turmeric/common/v1/types";
    private final static String NS2 = "http://atlantis.st.ewi.tudelft.nl/v1/services";

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
        // Type #1 (RegisterRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "RegisterRequest")));
        // Type #2 (BaseResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS1, "BaseResponse")));
        // Type #3 (LogoutResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LogoutResponse")));
        // Type #4 (GetWalletDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetWalletDataResponse")));
        // Type #5 (GetAccountProfileDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountProfileDataResponse")));
        // Type #6 (LoginRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LoginRequest")));
        // Type #7 (UpdateAccountProfileResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "UpdateAccountProfileResponse")));
        // Type #8 (GetWalletDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetWalletDataRequest")));
        // Type #9 (GetAccountDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountDataRequest")));
        // Type #10 (UpdateAccountProfileRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "UpdateAccountProfileRequest")));
        // Type #11 (GetAccountProfileDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountProfileDataRequest")));
        // Type #12 (GetAccountDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "GetAccountDataResponse")));
        // Type #13 (UpdateWalletDataRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "UpdateWalletDataRequest")));
        // Type #14 (UpdateWalletDataResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "UpdateWalletDataResponse")));
        // Type #15 (RegisterResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "RegisterResponse")));
        // Type #16 (LoginResponse)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LoginResponse")));
        // Type #17 (LogoutRequest)
        complexTypes.add(new FlatSchemaComplexTypeImpl(new QName(NS2, "LogoutRequest")));
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
    }

    private void addComplexTypeElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes) {
        FlatSchemaComplexTypeImpl currType;
         
        // Type #0 (BaseRequest)
        currType = complexTypes.get(0);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #1 (RegisterRequest)
        currType = complexTypes.get(1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #2 (BaseResponse)
        currType = complexTypes.get(2);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #3 (LogoutResponse)
        currType = complexTypes.get(3);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "output"), 1);
         
        // Type #4 (GetWalletDataResponse)
        currType = complexTypes.get(4);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "output"), 1);
         
        // Type #5 (GetAccountProfileDataResponse)
        currType = complexTypes.get(5);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "output"), 1);
         
        // Type #6 (LoginRequest)
        currType = complexTypes.get(6);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #7 (UpdateAccountProfileResponse)
        currType = complexTypes.get(7);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "output"), 1);
         
        // Type #8 (GetWalletDataRequest)
        currType = complexTypes.get(8);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #9 (GetAccountDataRequest)
        currType = complexTypes.get(9);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #10 (UpdateAccountProfileRequest)
        currType = complexTypes.get(10);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #11 (GetAccountProfileDataRequest)
        currType = complexTypes.get(11);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #12 (GetAccountDataResponse)
        currType = complexTypes.get(12);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #13 (UpdateWalletDataRequest)
        currType = complexTypes.get(13);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
        // Type #14 (UpdateWalletDataResponse)
        currType = complexTypes.get(14);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "output"), 1);
         
        // Type #15 (RegisterResponse)
        currType = complexTypes.get(15);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "output"), 1);
         
        // Type #16 (LoginResponse)
        currType = complexTypes.get(16);
        currType.addSimpleElement(new QName(NS1, "ack"), 1);
        currType.addComplexElement(new QName(NS1, "errorMessage"), complexTypes.get(22), 1);
        currType.addSimpleElement(new QName(NS1, "version"), 1);
        currType.addSimpleElement(new QName(NS1, "timestamp"), 1);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
        currType.addSimpleElement(new QName(NS2, "output"), 1);
         
        // Type #17 (LogoutRequest)
        currType = complexTypes.get(17);
        currType.addComplexElement(new QName(NS1, "extension"), complexTypes.get(20), -1);
         
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
    }

    private void addRootElements0(ArrayList<FlatSchemaComplexTypeImpl> complexTypes, HashMap<QName, FlatSchemaElementDeclImpl> rootElements) {
        rootElements.put(new QName(NS2, "logoutResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "logoutResponse"), complexTypes.get(3)));
        rootElements.put(new QName(NS2, "getAccountProfileDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountProfileDataRequest"), complexTypes.get(11)));
        rootElements.put(new QName(NS2, "registerResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "registerResponse"), complexTypes.get(15)));
        rootElements.put(new QName(NS2, "updateAccountProfileRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateAccountProfileRequest"), complexTypes.get(10)));
        rootElements.put(new QName(NS2, "registerRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "registerRequest"), complexTypes.get(1)));
        rootElements.put(new QName(NS2, "getWalletDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getWalletDataRequest"), complexTypes.get(8)));
        rootElements.put(new QName(NS2, "loginRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "loginRequest"), complexTypes.get(6)));
        rootElements.put(new QName(NS2, "updateAccountProfileResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateAccountProfileResponse"), complexTypes.get(7)));
        rootElements.put(new QName(NS2, "logoutRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "logoutRequest"), complexTypes.get(17)));
        rootElements.put(new QName(NS2, "updateWalletDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateWalletDataRequest"), complexTypes.get(13)));
        rootElements.put(new QName(NS2, "getAccountProfileDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountProfileDataResponse"), complexTypes.get(5)));
        rootElements.put(new QName(NS2, "getWalletDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getWalletDataResponse"), complexTypes.get(4)));
        rootElements.put(new QName(NS2, "loginResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "loginResponse"), complexTypes.get(16)));
        rootElements.put(new QName(NS2, "updateWalletDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "updateWalletDataResponse"), complexTypes.get(14)));
        rootElements.put(new QName(NS2, "getAccountDataResponse"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountDataResponse"), complexTypes.get(12)));
        rootElements.put(new QName(NS2, "getAccountDataRequest"), FlatSchemaElementDeclImpl.createRootComplexElement(new QName(NS2, "getAccountDataRequest"), complexTypes.get(9)));
    }

}
