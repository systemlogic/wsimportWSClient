
package com.systemlogic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.systemlogic package. 
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

    private final static QName _Sum_QNAME = new QName("http://webservice.com/", "sum");
    private final static QName _Hi_QNAME = new QName("http://webservice.com/", "hi");
    private final static QName _HiResponse_QNAME = new QName("http://webservice.com/", "hiResponse");
    private final static QName _SumResponse_QNAME = new QName("http://webservice.com/", "sumResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.systemlogic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SumResponse }
     * 
     */
    public SumResponse createSumResponse() {
        return new SumResponse();
    }

    /**
     * Create an instance of {@link HiResponse }
     * 
     */
    public HiResponse createHiResponse() {
        return new HiResponse();
    }

    /**
     * Create an instance of {@link Sum }
     * 
     */
    public Sum createSum() {
        return new Sum();
    }

    /**
     * Create an instance of {@link Hi }
     * 
     */
    public Hi createHi() {
        return new Hi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "sum")
    public JAXBElement<Sum> createSum(Sum value) {
        return new JAXBElement<Sum>(_Sum_QNAME, Sum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "hi")
    public JAXBElement<Hi> createHi(Hi value) {
        return new JAXBElement<Hi>(_Hi_QNAME, Hi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "hiResponse")
    public JAXBElement<HiResponse> createHiResponse(HiResponse value) {
        return new JAXBElement<HiResponse>(_HiResponse_QNAME, HiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "sumResponse")
    public JAXBElement<SumResponse> createSumResponse(SumResponse value) {
        return new JAXBElement<SumResponse>(_SumResponse_QNAME, SumResponse.class, null, value);
    }

}
