//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.21 um 09:09:40 PM CEST 
//


package com.keitarow.timetracking;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für restrictedSex.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="restrictedSex">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="male"/>
 *     &lt;enumeration value="female"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "restrictedSex")
@XmlEnum
public enum RestrictedSex {

    @XmlEnumValue("male")
    MALE("male"),
    @XmlEnumValue("female")
    FEMALE("female");
    private final String value;

    RestrictedSex(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestrictedSex fromValue(String v) {
        for (RestrictedSex c: RestrictedSex.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
