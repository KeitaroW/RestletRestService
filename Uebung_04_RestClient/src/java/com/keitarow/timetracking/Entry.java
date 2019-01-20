//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.21 um 09:09:40 PM CEST 
//


package com.keitarow.timetracking;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse f�r entry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="entry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="employeeID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="projectID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "entry")
@XmlType(name = "entry", propOrder = {
    "description",
    "employeeID",
    "projectID",
    "start",
    "end"
})
public class Entry {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected BigInteger employeeID;
    @XmlElement(required = true)
    protected BigInteger projectID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date start;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date end;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der employeeID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeeID() {
        return employeeID;
    }

    /**
     * Legt den Wert der employeeID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeeID(BigInteger value) {
        this.employeeID = value;
    }

    /**
     * Ruft den Wert der projectID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectID() {
        return projectID;
    }

    /**
     * Legt den Wert der projectID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectID(BigInteger value) {
        this.projectID = value;
    }

    /**
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getStart() {
        return start;
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(Date value) {
        this.start = value;
    }

    /**
     * Ruft den Wert der end-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getEnd() {
        return end;
    }

    /**
     * Legt den Wert der end-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(Date value) {
        this.end = value;
    }

}
