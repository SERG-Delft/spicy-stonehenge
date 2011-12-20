
package org.ebayopensource.turmeric.common.v1.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ebayopensource.turmeric.common.v1.types package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ebayopensource.turmeric.common.v1.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link ErrorMessage }
     * 
     */
    public ErrorMessage createErrorMessage() {
        return new ErrorMessage();
    }

    /**
     * Create an instance of {@link ErrorData }
     * 
     */
    public ErrorData createErrorData() {
        return new ErrorData();
    }

    /**
     * Create an instance of {@link ErrorParameter }
     * 
     */
    public ErrorParameter createErrorParameter() {
        return new ErrorParameter();
    }

    /**
     * Create an instance of {@link CommonErrorData }
     * 
     */
    public CommonErrorData createCommonErrorData() {
        return new CommonErrorData();
    }

}
