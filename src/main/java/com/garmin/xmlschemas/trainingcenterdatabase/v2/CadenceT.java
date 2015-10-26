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
 * <p>Java-Klasse für Cadence_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Cadence_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Target_t">
 *       &lt;sequence>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cadence_t", propOrder = {
    "low",
    "high"
})
public class CadenceT
    extends TargetT
{

    @XmlElement(name = "Low")
    protected double low;
    @XmlElement(name = "High")
    protected double high;

    /**
     * Ruft den Wert der low-Eigenschaft ab.
     * 
     */
    public double getLow() {
        return low;
    }

    /**
     * Legt den Wert der low-Eigenschaft fest.
     * 
     */
    public void setLow(double value) {
        this.low = value;
    }

    /**
     * Ruft den Wert der high-Eigenschaft ab.
     * 
     */
    public double getHigh() {
        return high;
    }

    /**
     * Legt den Wert der high-Eigenschaft fest.
     * 
     */
    public void setHigh(double value) {
        this.high = value;
    }

}
