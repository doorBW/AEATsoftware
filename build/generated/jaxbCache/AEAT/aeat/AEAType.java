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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>AEAType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AEAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}headerType" minOccurs="0"/>
 *         &lt;element name="AEAText" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}langType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LiveMedia" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}liveMediaType" minOccurs="0"/>
 *         &lt;element name="Media" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}mediaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="aeaId" use="required" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}aeaIdType" />
 *       &lt;attribute name="issuer" use="required" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}issuerType" />
 *       &lt;attribute name="audience" use="required" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}audienceType" />
 *       &lt;attribute name="aeaType" use="required" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}AEAtypeType" />
 *       &lt;attribute name="refAEAId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="priority" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}priorityType" />
 *       &lt;attribute name="wakeup" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AEAType", propOrder = {
    "header",
    "aeaText",
    "liveMedia",
    "media",
    "any"
})
public class AEAType {

    @XmlElement(name = "Header")
    protected HeaderType header;
    @XmlElement(name = "AEAText")
    protected List<LangType> aeaText;
    @XmlElement(name = "LiveMedia")
    protected LiveMediaType liveMedia;
    @XmlElement(name = "Media")
    protected List<MediaType> media;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "aeaId", required = true)
    protected String aeaId;
    @XmlAttribute(name = "issuer", required = true)
    protected String issuer;
    @XmlAttribute(name = "audience", required = true)
    protected AudienceType audience;
    @XmlAttribute(name = "aeaType", required = true)
    protected AEAtypeType aeaType;
    @XmlAttribute(name = "refAEAId")
    protected String refAEAId;
    @XmlAttribute(name = "priority")
    protected Short priority;
    @XmlAttribute(name = "wakeup")
    protected Boolean wakeup;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * header 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * header 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the aeaText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeaText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAEAText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LangType }
     * 
     * 
     */
    public List<LangType> getAEAText() {
        if (aeaText == null) {
            aeaText = new ArrayList<LangType>();
        }
        return this.aeaText;
    }

    /**
     * liveMedia 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LiveMediaType }
     *     
     */
    public LiveMediaType getLiveMedia() {
        return liveMedia;
    }

    /**
     * liveMedia 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveMediaType }
     *     
     */
    public void setLiveMedia(LiveMediaType value) {
        this.liveMedia = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaType }
     * 
     * 
     */
    public List<MediaType> getMedia() {
        if (media == null) {
            media = new ArrayList<MediaType>();
        }
        return this.media;
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
     * aeaId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeaId() {
        return aeaId;
    }

    /**
     * aeaId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeaId(String value) {
        this.aeaId = value;
    }

    /**
     * issuer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * issuer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * audience 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AudienceType }
     *     
     */
    public AudienceType getAudience() {
        return audience;
    }

    /**
     * audience 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceType }
     *     
     */
    public void setAudience(AudienceType value) {
        this.audience = value;
    }

    /**
     * aeaType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AEAtypeType }
     *     
     */
    public AEAtypeType getAeaType() {
        return aeaType;
    }

    /**
     * aeaType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AEAtypeType }
     *     
     */
    public void setAeaType(AEAtypeType value) {
        this.aeaType = value;
    }

    /**
     * refAEAId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefAEAId() {
        return refAEAId;
    }

    /**
     * refAEAId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefAEAId(String value) {
        this.refAEAId = value;
    }

    /**
     * priority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriority() {
        return priority;
    }

    /**
     * priority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriority(Short value) {
        this.priority = value;
    }

    /**
     * wakeup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWakeup() {
        if (wakeup == null) {
            return false;
        } else {
            return wakeup;
        }
    }

    /**
     * wakeup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWakeup(Boolean value) {
        this.wakeup = value;
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
