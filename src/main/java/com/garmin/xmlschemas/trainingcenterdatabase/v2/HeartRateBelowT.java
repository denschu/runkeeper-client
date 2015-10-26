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
 * <p>Java-Klasse für HeartRateBelow_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeartRateBelow_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Duration_t">
 *       &lt;sequence>
 *         &lt;element name="HeartRate" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateValue_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeartRateBelow_t", propOrder = {
    "heartRate"
})
public class HeartRateBelowT
    extends DurationT
{

    @XmlElement(name = "HeartRate", required = true)
    protected HeartRateValueT heartRate;

    /**
     * Ruft den Wert der heartRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateValueT }
     *     
     */
    public HeartRateValueT getHeartRate() {
        return heartRate;
    }

    /**
     * Legt den Wert der heartRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateValueT }
     *     
     */
    public void setHeartRate(HeartRateValueT value) {
        this.heartRate = value;
    }

}
