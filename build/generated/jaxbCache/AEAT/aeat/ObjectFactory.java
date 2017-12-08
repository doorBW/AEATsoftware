//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.5-2 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.12.08 시간 10:04:38 PM KST 
//


package aeat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aeat package. 
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

    private final static QName _AEAT_QNAME = new QName("tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/", "AEAT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aeat
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AEATType }
     * 
     */
    public AEATType createAEATType() {
        return new AEATType();
    }

    /**
     * Create an instance of {@link TypeType }
     * 
     */
    public TypeType createTypeType() {
        return new TypeType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link MediaType }
     * 
     */
    public MediaType createMediaType() {
        return new MediaType();
    }

    /**
     * Create an instance of {@link LangType }
     * 
     */
    public LangType createLangType() {
        return new LangType();
    }

    /**
     * Create an instance of {@link AEAType }
     * 
     */
    public AEAType createAEAType() {
        return new AEAType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link LiveMediaType }
     * 
     */
    public LiveMediaType createLiveMediaType() {
        return new LiveMediaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AEATType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/", name = "AEAT")
    public JAXBElement<AEATType> createAEAT(AEATType value) {
        return new JAXBElement<AEATType>(_AEAT_QNAME, AEATType.class, null, value);
    }

}
