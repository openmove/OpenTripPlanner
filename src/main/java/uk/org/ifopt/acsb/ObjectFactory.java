//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.03.02 alle 02:01:35 PM CET 
//


package uk.org.ifopt.acsb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.org.ifopt.acsb package. 
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

    private final static QName _WheelchairAccess_QNAME = new QName("http://www.ifopt.org.uk/acsb", "WheelchairAccess");
    private final static QName _StepFreeAccess_QNAME = new QName("http://www.ifopt.org.uk/acsb", "StepFreeAccess");
    private final static QName _EscalatorFreeAccess_QNAME = new QName("http://www.ifopt.org.uk/acsb", "EscalatorFreeAccess");
    private final static QName _LiftFreeAccess_QNAME = new QName("http://www.ifopt.org.uk/acsb", "LiftFreeAccess");
    private final static QName _AudibleSignalsAvailable_QNAME = new QName("http://www.ifopt.org.uk/acsb", "AudibleSignalsAvailable");
    private final static QName _VisualSignsAvailable_QNAME = new QName("http://www.ifopt.org.uk/acsb", "VisualSignsAvailable");
    private final static QName _GuideDogAccess_QNAME = new QName("http://www.ifopt.org.uk/acsb", "GuideDogAccess");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.org.ifopt.acsb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccessibilityAssessmentStructure }
     * 
     */
    public AccessibilityAssessmentStructure createAccessibilityAssessmentStructure() {
        return new AccessibilityAssessmentStructure();
    }

    /**
     * Create an instance of {@link AccessibilityStructure }
     * 
     */
    public AccessibilityStructure createAccessibilityStructure() {
        return new AccessibilityStructure();
    }

    /**
     * Create an instance of {@link PassengerAccessibilityNeedsStructure }
     * 
     */
    public PassengerAccessibilityNeedsStructure createPassengerAccessibilityNeedsStructure() {
        return new PassengerAccessibilityNeedsStructure();
    }

    /**
     * Create an instance of {@link UserNeedStructure }
     * 
     */
    public UserNeedStructure createUserNeedStructure() {
        return new UserNeedStructure();
    }

    /**
     * Create an instance of {@link SuitabilityStructure }
     * 
     */
    public SuitabilityStructure createSuitabilityStructure() {
        return new SuitabilityStructure();
    }

    /**
     * Create an instance of {@link LimitationRefStructure }
     * 
     */
    public LimitationRefStructure createLimitationRefStructure() {
        return new LimitationRefStructure();
    }

    /**
     * Create an instance of {@link AccessibilityLimitationStructure }
     * 
     */
    public AccessibilityLimitationStructure createAccessibilityLimitationStructure() {
        return new AccessibilityLimitationStructure();
    }

    /**
     * Create an instance of {@link AccessibilityAssessmentStructure.Limitations }
     * 
     */
    public AccessibilityAssessmentStructure.Limitations createAccessibilityAssessmentStructureLimitations() {
        return new AccessibilityAssessmentStructure.Limitations();
    }

    /**
     * Create an instance of {@link AccessibilityAssessmentStructure.Suitabilities }
     * 
     */
    public AccessibilityAssessmentStructure.Suitabilities createAccessibilityAssessmentStructureSuitabilities() {
        return new AccessibilityAssessmentStructure.Suitabilities();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "WheelchairAccess", defaultValue = "false")
    public JAXBElement<AccessibilityStructure> createWheelchairAccess(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_WheelchairAccess_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "StepFreeAccess", defaultValue = "unknown")
    public JAXBElement<AccessibilityStructure> createStepFreeAccess(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_StepFreeAccess_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "EscalatorFreeAccess", defaultValue = "unknown")
    public JAXBElement<AccessibilityStructure> createEscalatorFreeAccess(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_EscalatorFreeAccess_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "LiftFreeAccess", defaultValue = "unknown")
    public JAXBElement<AccessibilityStructure> createLiftFreeAccess(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_LiftFreeAccess_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "AudibleSignalsAvailable", defaultValue = "false")
    public JAXBElement<AccessibilityStructure> createAudibleSignalsAvailable(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_AudibleSignalsAvailable_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "VisualSignsAvailable", defaultValue = "unknown")
    public JAXBElement<AccessibilityStructure> createVisualSignsAvailable(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_VisualSignsAvailable_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "GuideDogAccess", defaultValue = "unknown")
    public JAXBElement<AccessibilityStructure> createGuideDogAccess(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_GuideDogAccess_QNAME, AccessibilityStructure.class, null, value);
    }

}
