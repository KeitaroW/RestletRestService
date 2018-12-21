//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.21 um 09:09:40 PM CEST 
//


package com.keitarow.timetracking;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r company complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="company">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="towns" type="{}towns"/>
 *         &lt;element name="roles" type="{}roles"/>
 *         &lt;element name="employees" type="{}employees"/>
 *         &lt;element name="departments" type="{}departments"/>
 *         &lt;element name="projects" type="{}projects"/>
 *         &lt;element name="entries" type="{}entries"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="town" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="postcode" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="street" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseno" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "company")
@XmlType(name = "company", propOrder = {
    "towns",
    "roles",
    "employees",
    "departments",
    "projects",
    "entries"
})
public class Company {

    @XmlElement(required = true)
    protected Towns towns;
    @XmlElement(required = true)
    protected Roles roles;
    @XmlElement(required = true)
    protected Employees employees;
    @XmlElement(required = true)
    protected Departments departments;
    @XmlElement(required = true)
    protected Projects projects;
    @XmlElement(required = true)
    protected Entries entries;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "town", required = true)
    protected String town;
    @XmlAttribute(name = "postcode", required = true)
    protected BigInteger postcode;
    @XmlAttribute(name = "street", required = true)
    protected String street;
    @XmlAttribute(name = "houseno", required = true)
    protected String houseno;

    /**
     * Ruft den Wert der towns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Towns }
     *     
     */
    public Towns getTowns() {
        return towns;
    }

    /**
     * Legt den Wert der towns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Towns }
     *     
     */
    public void setTowns(Towns value) {
        this.towns = value;
    }

    /**
     * Ruft den Wert der roles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Roles }
     *     
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Legt den Wert der roles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Roles }
     *     
     */
    public void setRoles(Roles value) {
        this.roles = value;
    }

    /**
     * Ruft den Wert der employees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Employees }
     *     
     */
    public Employees getEmployees() {
        return employees;
    }

    /**
     * Legt den Wert der employees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Employees }
     *     
     */
    public void setEmployees(Employees value) {
        this.employees = value;
    }

    /**
     * Ruft den Wert der departments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Departments }
     *     
     */
    public Departments getDepartments() {
        return departments;
    }

    /**
     * Legt den Wert der departments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Departments }
     *     
     */
    public void setDepartments(Departments value) {
        this.departments = value;
    }

    /**
     * Ruft den Wert der projects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Projects }
     *     
     */
    public Projects getProjects() {
        return projects;
    }

    /**
     * Legt den Wert der projects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Projects }
     *     
     */
    public void setProjects(Projects value) {
        this.projects = value;
    }

    /**
     * Ruft den Wert der entries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Entries }
     *     
     */
    public Entries getEntries() {
        return entries;
    }

    /**
     * Legt den Wert der entries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Entries }
     *     
     */
    public void setEntries(Entries value) {
        this.entries = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der town-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Legt den Wert der town-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Ruft den Wert der postcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPostcode() {
        return postcode;
    }

    /**
     * Legt den Wert der postcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPostcode(BigInteger value) {
        this.postcode = value;
    }

    /**
     * Ruft den Wert der street-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Legt den Wert der street-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Ruft den Wert der houseno-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseno() {
        return houseno;
    }

    /**
     * Legt den Wert der houseno-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseno(String value) {
        this.houseno = value;
    }

}
