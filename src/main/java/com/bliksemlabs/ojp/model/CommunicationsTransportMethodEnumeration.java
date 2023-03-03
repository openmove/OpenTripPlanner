//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package com.bliksemlabs.ojp.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CommunicationsTransportMethodEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationsTransportMethodEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="httpPost"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="wsdlSoap"/&gt;
 *     &lt;enumeration value="wsdlSoapDocumentLiteral"/&gt;
 *     &lt;enumeration value="httpUrlJSON"/&gt;
 *     &lt;enumeration value="httpUrlProtoBuffers"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommunicationsTransportMethodEnumeration")
@XmlEnum
public enum CommunicationsTransportMethodEnumeration {

    @XmlEnumValue("httpPost")
    HTTP_POST("httpPost"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("wsdlSoap")
    WSDL_SOAP("wsdlSoap"),
    @XmlEnumValue("wsdlSoapDocumentLiteral")
    WSDL_SOAP_DOCUMENT_LITERAL("wsdlSoapDocumentLiteral"),
    @XmlEnumValue("httpUrlJSON")
    HTTP_URL_JSON("httpUrlJSON"),
    @XmlEnumValue("httpUrlProtoBuffers")
    HTTP_URL_PROTO_BUFFERS("httpUrlProtoBuffers");
    private final String value;

    CommunicationsTransportMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationsTransportMethodEnumeration fromValue(String v) {
        for (CommunicationsTransportMethodEnumeration c: CommunicationsTransportMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
