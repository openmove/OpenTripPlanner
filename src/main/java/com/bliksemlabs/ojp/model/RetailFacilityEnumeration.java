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
 * <p>Classe Java per RetailFacilityEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="food"/&gt;
 *     &lt;enumeration value="newspaperTobacco"/&gt;
 *     &lt;enumeration value="recreationTravel"/&gt;
 *     &lt;enumeration value="hygieneHealthBeauty"/&gt;
 *     &lt;enumeration value="fashionAccessories"/&gt;
 *     &lt;enumeration value="bankFinanceInsurance"/&gt;
 *     &lt;enumeration value="cashMachine"/&gt;
 *     &lt;enumeration value="currencyExchange"/&gt;
 *     &lt;enumeration value="tourismService"/&gt;
 *     &lt;enumeration value="photoBooth"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailFacilityEnumeration")
@XmlEnum
public enum RetailFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("food")
    FOOD("food"),
    @XmlEnumValue("newspaperTobacco")
    NEWSPAPER_TOBACCO("newspaperTobacco"),
    @XmlEnumValue("recreationTravel")
    RECREATION_TRAVEL("recreationTravel"),
    @XmlEnumValue("hygieneHealthBeauty")
    HYGIENE_HEALTH_BEAUTY("hygieneHealthBeauty"),
    @XmlEnumValue("fashionAccessories")
    FASHION_ACCESSORIES("fashionAccessories"),
    @XmlEnumValue("bankFinanceInsurance")
    BANK_FINANCE_INSURANCE("bankFinanceInsurance"),
    @XmlEnumValue("cashMachine")
    CASH_MACHINE("cashMachine"),
    @XmlEnumValue("currencyExchange")
    CURRENCY_EXCHANGE("currencyExchange"),
    @XmlEnumValue("tourismService")
    TOURISM_SERVICE("tourismService"),
    @XmlEnumValue("photoBooth")
    PHOTO_BOOTH("photoBooth");
    private final String value;

    RetailFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetailFacilityEnumeration fromValue(String v) {
        for (RetailFacilityEnumeration c: RetailFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
