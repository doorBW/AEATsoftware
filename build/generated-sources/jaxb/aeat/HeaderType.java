//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.5-2 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.12.08 시간 10:04:38 PM KST 
//


package aeat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>headerType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="headerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventCode" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}typeType" minOccurs="0"/>
 *         &lt;element name="EventDesc" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}langType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}locationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="effective" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="expires" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "headerType", propOrder = {
    "eventCode",
    "eventDesc",
    "location",
    "any"
})
public class HeaderType {

    @XmlElement(name = "EventCode")
    protected TypeType eventCode;
    @XmlElement(name = "EventDesc")
    protected List<LangType> eventDesc;
    @XmlElement(name = "Location")
    protected List<LocationType> location;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "effective")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effective;
    @XmlAttribute(name = "expires")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expires;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * eventCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getEventCode() {
        return eventCode;
    }

    /**
     * eventCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setEventCode(TypeType value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the eventDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LangType }
     * 
     * 
     */
    public List<LangType> getEventDesc() {
        if (eventDesc == null) {
            eventDesc = new ArrayList<LangType>();
        }
        return this.eventDesc;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationType>();
        }
        return this.location;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * effective 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffective() {
        return effective;
    }

    /**
     * effective 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffective(XMLGregorianCalendar value) {
        this.effective = value;
    }

    /**
     * expires 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpires() {
        return expires;
    }

    /**
     * expires 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpires(XMLGregorianCalendar value) {
        this.expires = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
