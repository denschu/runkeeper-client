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
 * <p>Java-Klasse für Position_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Position_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatitudeDegrees" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}DegreesLatitude_t"/>
 *         &lt;element name="LongitudeDegrees" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}DegreesLongitude_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position_t", propOrder = {
    "latitudeDegrees",
    "longitudeDegrees"
})
public class PositionT {

    @XmlElement(name = "LatitudeDegrees")
    protected double latitudeDegrees;
    @XmlElement(name = "LongitudeDegrees")
    protected double longitudeDegrees;

    /**
     * Ruft den Wert der latitudeDegrees-Eigenschaft ab.
     * 
     */
    public double getLatitudeDegrees() {
        return latitudeDegrees;
    }

    /**
     * Legt den Wert der latitudeDegrees-Eigenschaft fest.
     * 
     */
    public void setLatitudeDegrees(double value) {
        this.latitudeDegrees = value;
    }

    /**
     * Ruft den Wert der longitudeDegrees-Eigenschaft ab.
     * 
     */
    public double getLongitudeDegrees() {
        return longitudeDegrees;
    }

    /**
     * Legt den Wert der longitudeDegrees-Eigenschaft fest.
     * 
     */
    public void setLongitudeDegrees(double value) {
        this.longitudeDegrees = value;
    }

}
