
/**
 * UserManagementServiceV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6-wso2v2  Built on : Oct 25, 2010 (02:27:59 MST)
 */
    package nl.tudelft.ewi.st.atlantis.v1.services.usermanagementservice;
    /**
     *  UserManagementServiceV1 java skeleton interface for the axisService
     */
    public interface UserManagementServiceV1 {
     
         
        /**
         * Auto generated method signature
         * Documentation goes here.
                                    * @param loginRequest
         */

        
                public nl.tudelft.ewi.st.atlantis.v1.services.LoginResponse login
                (
                  nl.tudelft.ewi.st.atlantis.v1.services.LoginRequest loginRequest
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Documentation goes here.
                                    * @param getWalletDataRequest
         */

        
                public nl.tudelft.ewi.st.atlantis.v1.services.GetWalletDataResponse getWalletData
                (
                  nl.tudelft.ewi.st.atlantis.v1.services.GetWalletDataRequest getWalletDataRequest
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Documentation goes here.
                                    * @param logoutRequest
         */

        
                public nl.tudelft.ewi.st.atlantis.v1.services.LogoutResponse logout
                (
                  nl.tudelft.ewi.st.atlantis.v1.services.LogoutRequest logoutRequest
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Documentation goes here.
                                    * @param registerRequest
         */

        
                public nl.tudelft.ewi.st.atlantis.v1.services.RegisterResponse register
                (
                  nl.tudelft.ewi.st.atlantis.v1.services.RegisterRequest registerRequest
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Documentation goes here.
                                    * @param getAccountDataRequest
         */

        
                public nl.tudelft.ewi.st.atlantis.v1.services.GetAccountDataResponse getAccountData
                (
                  nl.tudelft.ewi.st.atlantis.v1.services.GetAccountDataRequest getAccountDataRequest
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Documentation goes here.
                                    * @param updateWalletDataRequest
         */

        
                public nl.tudelft.ewi.st.atlantis.v1.services.UpdateWalletDataResponse updateWalletData
                (
                  nl.tudelft.ewi.st.atlantis.v1.services.UpdateWalletDataRequest updateWalletDataRequest
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Documentation goes here.
                                    * @param updateAccountProfileRequest
         */

        
                public nl.tudelft.ewi.st.atlantis.v1.services.UpdateAccountProfileResponse updateAccountProfile
                (
                  nl.tudelft.ewi.st.atlantis.v1.services.UpdateAccountProfileRequest updateAccountProfileRequest
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * Documentation goes here.
                                    * @param getAccountProfileDataRequest
         */

        
                public nl.tudelft.ewi.st.atlantis.v1.services.GetAccountProfileDataResponse getAccountProfileData
                (
                  nl.tudelft.ewi.st.atlantis.v1.services.GetAccountProfileDataRequest getAccountProfileDataRequest
                 )
            ;
        
         }
    