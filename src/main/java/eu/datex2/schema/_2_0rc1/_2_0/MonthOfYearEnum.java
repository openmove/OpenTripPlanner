//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MonthOfYearEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MonthOfYearEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="january"/&gt;
 *     &lt;enumeration value="february"/&gt;
 *     &lt;enumeration value="march"/&gt;
 *     &lt;enumeration value="april"/&gt;
 *     &lt;enumeration value="may"/&gt;
 *     &lt;enumeration value="june"/&gt;
 *     &lt;enumeration value="july"/&gt;
 *     &lt;enumeration value="august"/&gt;
 *     &lt;enumeration value="september"/&gt;
 *     &lt;enumeration value="october"/&gt;
 *     &lt;enumeration value="november"/&gt;
 *     &lt;enumeration value="december"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MonthOfYearEnum")
@XmlEnum
public enum MonthOfYearEnum {

    @XmlEnumValue("january")
    JANUARY("january"),
    @XmlEnumValue("february")
    FEBRUARY("february"),
    @XmlEnumValue("march")
    MARCH("march"),
    @XmlEnumValue("april")
    APRIL("april"),
    @XmlEnumValue("may")
    MAY("may"),
    @XmlEnumValue("june")
    JUNE("june"),
    @XmlEnumValue("july")
    JULY("july"),
    @XmlEnumValue("august")
    AUGUST("august"),
    @XmlEnumValue("september")
    SEPTEMBER("september"),
    @XmlEnumValue("october")
    OCTOBER("october"),
    @XmlEnumValue("november")
    NOVEMBER("november"),
    @XmlEnumValue("december")
    DECEMBER("december");
    private final String value;

    MonthOfYearEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthOfYearEnum fromValue(String v) {
        for (MonthOfYearEnum c: MonthOfYearEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
