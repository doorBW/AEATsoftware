//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.5-2 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.12.08 시간 10:04:38 PM KST 
//


package aeat;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>mediaType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="mediaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *       &lt;attribute name="mediaDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mediaType" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}mediaTypeType" />
 *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="alternateUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="contentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contentLength" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="mediaAssoc" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mediaType", propOrder = {
    "any"
})
public class MediaType {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "mediaDesc")
    protected String mediaDesc;
    @XmlAttribute(name = "mediaType")
    protected MediaTypeType mediaType;
    @XmlAttribute(name = "url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "alternateUrl")
    @XmlSchemaType(name = "anyURI")
    protected String alternateUrl;
    @XmlAttribute(name = "contentType")
    protected String contentType;
    @XmlAttribute(name = "contentLength")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger contentLength;
    @XmlAttribute(name = "mediaAssoc")
    @XmlSchemaType(name = "anyURI")
    protected String mediaAssoc;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * lang 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * lang 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * mediaDesc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaDesc() {
        return mediaDesc;
    }

    /**
     * mediaDesc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaDesc(String value) {
        this.mediaDesc = value;
    }

    /**
     * mediaType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MediaTypeType }
     *     
     */
    public MediaTypeType getMediaType() {
        return mediaType;
    }

    /**
     * mediaType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTypeType }
     *     
     */
    public void setMediaType(MediaTypeType value) {
        this.mediaType = value;
    }

    /**
     * url 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * url 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * alternateUrl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateUrl() {
        return alternateUrl;
    }

    /**
     * alternateUrl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateUrl(String value) {
        this.alternateUrl = value;
    }

    /**
     * contentType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * contentType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * contentLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentLength() {
        return contentLength;
    }

    /**
     * contentLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentLength(BigInteger value) {
        this.contentLength = value;
    }

    /**
     * mediaAssoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaAssoc() {
        return mediaAssoc;
    }

    /**
     * mediaAssoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaAssoc(String value) {
        this.mediaAssoc = value;
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
