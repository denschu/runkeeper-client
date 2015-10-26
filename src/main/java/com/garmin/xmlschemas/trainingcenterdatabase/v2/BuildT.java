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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für Build_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Build_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Version_t"/>
 *         &lt;element name="Type" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}BuildType_t" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t" minOccurs="0"/>
 *         &lt;element name="Builder" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Build_t", propOrder = {
    "version",
    "type",
    "time",
    "builder"
})
public class BuildT {

    @XmlElement(name = "Version", required = true)
    protected VersionT version;
    @XmlElement(name = "Type")
    protected BuildTypeT type;
    @XmlElement(name = "Time")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String time;
    @XmlElement(name = "Builder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String builder;

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionT }
     *     
     */
    public VersionT getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionT }
     *     
     */
    public void setVersion(VersionT value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypeT }
     *     
     */
    public BuildTypeT getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypeT }
     *     
     */
    public void setType(BuildTypeT value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der builder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilder() {
        return builder;
    }

    /**
     * Legt den Wert der builder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilder(String value) {
        this.builder = value;
    }

}
