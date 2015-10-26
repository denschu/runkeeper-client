//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.10.26 um 08:16:51 PM CET 
//


package com.garmin.xmlschemas.trainingcenterdatabase.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Version_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Version_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VersionMajor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="VersionMinor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="BuildMajor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="BuildMinor" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Version_t", propOrder = {
    "versionMajor",
    "versionMinor",
    "buildMajor",
    "buildMinor"
})
public class VersionT {

    @XmlElement(name = "VersionMajor")
    @XmlSchemaType(name = "unsignedShort")
    protected int versionMajor;
    @XmlElement(name = "VersionMinor")
    @XmlSchemaType(name = "unsignedShort")
    protected int versionMinor;
    @XmlElement(name = "BuildMajor")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer buildMajor;
    @XmlElement(name = "BuildMinor")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer buildMinor;

    /**
     * Ruft den Wert der versionMajor-Eigenschaft ab.
     * 
     */
    public int getVersionMajor() {
        return versionMajor;
    }

    /**
     * Legt den Wert der versionMajor-Eigenschaft fest.
     * 
     */
    public void setVersionMajor(int value) {
        this.versionMajor = value;
    }

    /**
     * Ruft den Wert der versionMinor-Eigenschaft ab.
     * 
     */
    public int getVersionMinor() {
        return versionMinor;
    }

    /**
     * Legt den Wert der versionMinor-Eigenschaft fest.
     * 
     */
    public void setVersionMinor(int value) {
        this.versionMinor = value;
    }

    /**
     * Ruft den Wert der buildMajor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuildMajor() {
        return buildMajor;
    }

    /**
     * Legt den Wert der buildMajor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuildMajor(Integer value) {
        this.buildMajor = value;
    }

    /**
     * Ruft den Wert der buildMinor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuildMinor() {
        return buildMinor;
    }

    /**
     * Legt den Wert der buildMinor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuildMinor(Integer value) {
        this.buildMinor = value;
    }

}
