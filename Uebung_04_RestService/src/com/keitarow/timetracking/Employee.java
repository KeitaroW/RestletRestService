//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.21 um 09:09:40 PM CEST 
//


package com.keitarow.timetracking;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für employee complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{}personname"/>
 *         &lt;element name="address" type="{}address"/>
 *         &lt;element name="sex" type="{}restrictedSex"/>
 *         &lt;element name="account" type="{}logininfo"/>
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dept" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {
    "name",
    "address",
    "sex",
    "account",
    "birthdate"
})
public class Employee {

    @XmlElement(required = true)
    protected Personname name;
    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RestrictedSex sex;
    @XmlElement(required = true)
    protected Logininfo account;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "dept", required = true)
    protected String dept;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Personname }
     *     
     */
    public Personname getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Personname }
     *     
     */
    public void setName(Personname value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der sex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedSex }
     *     
     */
    public RestrictedSex getSex() {
        return sex;
    }

    /**
     * Legt den Wert der sex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedSex }
     *     
     */
    public void setSex(RestrictedSex value) {
        this.sex = value;
    }

    /**
     * Ruft den Wert der account-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Logininfo }
     *     
     */
    public Logininfo getAccount() {
        return account;
    }

    /**
     * Legt den Wert der account-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Logininfo }
     *     
     */
    public void setAccount(Logininfo value) {
        this.account = value;
    }

    /**
     * Ruft den Wert der birthdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Legt den Wert der birthdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der dept-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Legt den Wert der dept-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

}
