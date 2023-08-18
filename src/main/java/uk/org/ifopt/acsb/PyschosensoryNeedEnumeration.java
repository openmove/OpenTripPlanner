//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.acsb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PyschosensoryNeedEnumeration.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PyschosensoryNeedEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="visualImpairment"/&gt;
 *     &lt;enumeration value="auditoryImpairment"/&gt;
 *     &lt;enumeration value="cognitiveInputImpairment"/&gt;
 *     &lt;enumeration value="averseToLifts"/&gt;
 *     &lt;enumeration value="averseToEscalators"/&gt;
 *     &lt;enumeration value="averseToConfinedSpaces"/&gt;
 *     &lt;enumeration value="averseToCrowds"/&gt;
 *     &lt;enumeration value="otherPsychosensoryNeed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PyschosensoryNeedEnumeration")
@XmlEnum
public enum PyschosensoryNeedEnumeration {

    @XmlEnumValue("visualImpairment")
    VISUAL_IMPAIRMENT("visualImpairment"),
    @XmlEnumValue("auditoryImpairment")
    AUDITORY_IMPAIRMENT("auditoryImpairment"),
    @XmlEnumValue("cognitiveInputImpairment")
    COGNITIVE_INPUT_IMPAIRMENT("cognitiveInputImpairment"),
    @XmlEnumValue("averseToLifts")
    AVERSE_TO_LIFTS("averseToLifts"),
    @XmlEnumValue("averseToEscalators")
    AVERSE_TO_ESCALATORS("averseToEscalators"),
    @XmlEnumValue("averseToConfinedSpaces")
    AVERSE_TO_CONFINED_SPACES("averseToConfinedSpaces"),
    @XmlEnumValue("averseToCrowds")
    AVERSE_TO_CROWDS("averseToCrowds"),
    @XmlEnumValue("otherPsychosensoryNeed")
    OTHER_PSYCHOSENSORY_NEED("otherPsychosensoryNeed");
    private final String value;

    PyschosensoryNeedEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PyschosensoryNeedEnumeration fromValue(String v) {
        for (PyschosensoryNeedEnumeration c: PyschosensoryNeedEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
