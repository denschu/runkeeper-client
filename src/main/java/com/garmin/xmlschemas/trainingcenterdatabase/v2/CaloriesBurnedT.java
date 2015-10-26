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
 * <p>Java-Klasse für CaloriesBurned_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CaloriesBurned_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Duration_t">
 *       &lt;sequence>
 *         &lt;element name="Calories" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaloriesBurned_t", propOrder = {
    "calories"
})
public class CaloriesBurnedT
    extends DurationT
{

    @XmlElement(name = "Calories")
    @XmlSchemaType(name = "unsignedShort")
    protected int calories;

    /**
     * Ruft den Wert der calories-Eigenschaft ab.
     * 
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Legt den Wert der calories-Eigenschaft fest.
     * 
     */
    public void setCalories(int value) {
        this.calories = value;
    }

}
