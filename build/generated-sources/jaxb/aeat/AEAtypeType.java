//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.5-2 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.12.08 시간 10:04:38 PM KST 
//


package aeat;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AEAtypeType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="AEAtypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="alert"/>
 *     &lt;enumeration value="update"/>
 *     &lt;enumeration value="cancel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AEAtypeType")
@XmlEnum
public enum AEAtypeType {

    @XmlEnumValue("alert")
    ALERT("alert"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("cancel")
    CANCEL("cancel");
    private final String value;

    AEAtypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AEAtypeType fromValue(String v) {
        for (AEAtypeType c: AEAtypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
