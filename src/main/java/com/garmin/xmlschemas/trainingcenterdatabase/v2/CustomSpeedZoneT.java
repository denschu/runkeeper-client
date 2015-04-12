//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.04.11 um 03:32:00 PM CEST 
//


package com.garmin.xmlschemas.trainingcenterdatabase.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CustomSpeedZone_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomSpeedZone_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Zone_t">
 *       &lt;sequence>
 *         &lt;element name="ViewAs" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}SpeedType_t"/>
 *         &lt;element name="LowInMetersPerSecond" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}SpeedInMetersPerSecond_t"/>
 *         &lt;element name="HighInMetersPerSecond" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}SpeedInMetersPerSecond_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSpeedZone_t", propOrder = {
    "viewAs",
    "lowInMetersPerSecond",
    "highInMetersPerSecond"
})
public class CustomSpeedZoneT
    extends ZoneT
{

    @XmlElement(name = "ViewAs", required = true)
    protected SpeedTypeT viewAs;
    @XmlElement(name = "LowInMetersPerSecond")
    protected double lowInMetersPerSecond;
    @XmlElement(name = "HighInMetersPerSecond")
    protected double highInMetersPerSecond;

    /**
     * Ruft den Wert der viewAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpeedTypeT }
     *     
     */
    public SpeedTypeT getViewAs() {
        return viewAs;
    }

    /**
     * Legt den Wert der viewAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedTypeT }
     *     
     */
    public void setViewAs(SpeedTypeT value) {
        this.viewAs = value;
    }

    /**
     * Ruft den Wert der lowInMetersPerSecond-Eigenschaft ab.
     * 
     */
    public double getLowInMetersPerSecond() {
        return lowInMetersPerSecond;
    }

    /**
     * Legt den Wert der lowInMetersPerSecond-Eigenschaft fest.
     * 
     */
    public void setLowInMetersPerSecond(double value) {
        this.lowInMetersPerSecond = value;
    }

    /**
     * Ruft den Wert der highInMetersPerSecond-Eigenschaft ab.
     * 
     */
    public double getHighInMetersPerSecond() {
        return highInMetersPerSecond;
    }

    /**
     * Legt den Wert der highInMetersPerSecond-Eigenschaft fest.
     * 
     */
    public void setHighInMetersPerSecond(double value) {
        this.highInMetersPerSecond = value;
    }

}
