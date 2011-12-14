
package nl.tudelft.ewi.st.atlantis.tudelft.v1.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.tudelft.ewi.st.atlantis.tudelft.v1.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.tudelft.ewi.st.atlantis.tudelft.v1.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountData }
     * 
     */
    public AccountData createAccountData() {
        return new AccountData();
    }

    /**
     * Create an instance of {@link AccountProfileData }
     * 
     */
    public AccountProfileData createAccountProfileData() {
        return new AccountProfileData();
    }

    /**
     * Create an instance of {@link HoldingData }
     * 
     */
    public HoldingData createHoldingData() {
        return new HoldingData();
    }

    /**
     * Create an instance of {@link MarketSummaryData }
     * 
     */
    public MarketSummaryData createMarketSummaryData() {
        return new MarketSummaryData();
    }

    /**
     * Create an instance of {@link OrderData }
     * 
     */
    public OrderData createOrderData() {
        return new OrderData();
    }

    /**
     * Create an instance of {@link QuoteData }
     * 
     */
    public QuoteData createQuoteData() {
        return new QuoteData();
    }

    /**
     * Create an instance of {@link WalletData }
     * 
     */
    public WalletData createWalletData() {
        return new WalletData();
    }

}
