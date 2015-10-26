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


/**
 * <p>Java-Klasse für QuickWorkout_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QuickWorkout_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalTimeSeconds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DistanceMeters" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickWorkout_t", propOrder = {
    "totalTimeSeconds",
    "distanceMeters"
})
public class QuickWorkoutT {

    @XmlElement(name = "TotalTimeSeconds")
    protected double totalTimeSeconds;
    @XmlElement(name = "DistanceMeters")
    protected double distanceMeters;

    /**
     * Ruft den Wert der totalTimeSeconds-Eigenschaft ab.
     * 
     */
    public double getTotalTimeSeconds() {
        return totalTimeSeconds;
    }

    /**
     * Legt den Wert der totalTimeSeconds-Eigenschaft fest.
     * 
     */
    public void setTotalTimeSeconds(double value) {
        this.totalTimeSeconds = value;
    }

    /**
     * Ruft den Wert der distanceMeters-Eigenschaft ab.
     * 
     */
    public double getDistanceMeters() {
        return distanceMeters;
    }

    /**
     * Legt den Wert der distanceMeters-Eigenschaft fest.
     * 
     */
    public void setDistanceMeters(double value) {
        this.distanceMeters = value;
    }

}
