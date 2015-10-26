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
 * <p>Java-Klasse für CustomHeartRateZone_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomHeartRateZone_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Zone_t">
 *       &lt;sequence>
 *         &lt;element name="Low" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateValue_t"/>
 *         &lt;element name="High" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateValue_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomHeartRateZone_t", propOrder = {
    "low",
    "high"
})
public class CustomHeartRateZoneT
    extends ZoneT
{

    @XmlElement(name = "Low", required = true)
    protected HeartRateValueT low;
    @XmlElement(name = "High", required = true)
    protected HeartRateValueT high;

    /**
     * Ruft den Wert der low-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateValueT }
     *     
     */
    public HeartRateValueT getLow() {
        return low;
    }

    /**
     * Legt den Wert der low-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateValueT }
     *     
     */
    public void setLow(HeartRateValueT value) {
        this.low = value;
    }

    /**
     * Ruft den Wert der high-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateValueT }
     *     
     */
    public HeartRateValueT getHigh() {
        return high;
    }

    /**
     * Legt den Wert der high-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateValueT }
     *     
     */
    public void setHigh(HeartRateValueT value) {
        this.high = value;
    }

}
