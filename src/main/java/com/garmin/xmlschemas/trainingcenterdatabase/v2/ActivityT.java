//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.10.26 um 08:16:51 PM CET 
//


package com.garmin.xmlschemas.trainingcenterdatabase.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für Activity_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Activity_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Lap" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}ActivityLap_t" maxOccurs="unbounded"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Training_t" minOccurs="0"/>
 *         &lt;element name="Creator" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractSource_t" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Sport" use="required" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Sport_t" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activity_t", propOrder = {
    "id",
    "lap",
    "notes",
    "training",
    "creator",
    "extensions"
})
public class ActivityT {

    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar id;
    @XmlElement(name = "Lap", required = true)
    protected List<ActivityLapT> lap;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Training")
    protected TrainingT training;
    @XmlElement(name = "Creator")
    protected AbstractSourceT creator;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;
    @XmlAttribute(name = "Sport", required = true)
    protected SportT sport;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setId(XMLGregorianCalendar value) {
        this.id = value;
    }

    /**
     * Gets the value of the lap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityLapT }
     * 
     * 
     */
    public List<ActivityLapT> getLap() {
        if (lap == null) {
            lap = new ArrayList<ActivityLapT>();
        }
        return this.lap;
    }

    /**
     * Ruft den Wert der notes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Legt den Wert der notes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Ruft den Wert der training-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainingT }
     *     
     */
    public TrainingT getTraining() {
        return training;
    }

    /**
     * Legt den Wert der training-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingT }
     *     
     */
    public void setTraining(TrainingT value) {
        this.training = value;
    }

    /**
     * Ruft den Wert der creator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSourceT }
     *     
     */
    public AbstractSourceT getCreator() {
        return creator;
    }

    /**
     * Legt den Wert der creator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSourceT }
     *     
     */
    public void setCreator(AbstractSourceT value) {
        this.creator = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsT }
     *     
     */
    public ExtensionsT getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsT }
     *     
     */
    public void setExtensions(ExtensionsT value) {
        this.extensions = value;
    }

    /**
     * Ruft den Wert der sport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SportT }
     *     
     */
    public SportT getSport() {
        return sport;
    }

    /**
     * Legt den Wert der sport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SportT }
     *     
     */
    public void setSport(SportT value) {
        this.sport = value;
    }

}
