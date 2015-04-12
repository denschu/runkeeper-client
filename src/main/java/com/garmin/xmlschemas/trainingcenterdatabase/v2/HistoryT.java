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
 * <p>Java-Klasse für History_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="History_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Running" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HistoryFolder_t"/>
 *         &lt;element name="Biking" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HistoryFolder_t"/>
 *         &lt;element name="Other" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HistoryFolder_t"/>
 *         &lt;element name="MultiSport" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}MultiSportFolder_t"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "History_t", propOrder = {
    "running",
    "biking",
    "other",
    "multiSport",
    "extensions"
})
public class HistoryT {

    @XmlElement(name = "Running", required = true)
    protected HistoryFolderT running;
    @XmlElement(name = "Biking", required = true)
    protected HistoryFolderT biking;
    @XmlElement(name = "Other", required = true)
    protected HistoryFolderT other;
    @XmlElement(name = "MultiSport", required = true)
    protected MultiSportFolderT multiSport;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

    /**
     * Ruft den Wert der running-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HistoryFolderT }
     *     
     */
    public HistoryFolderT getRunning() {
        return running;
    }

    /**
     * Legt den Wert der running-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryFolderT }
     *     
     */
    public void setRunning(HistoryFolderT value) {
        this.running = value;
    }

    /**
     * Ruft den Wert der biking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HistoryFolderT }
     *     
     */
    public HistoryFolderT getBiking() {
        return biking;
    }

    /**
     * Legt den Wert der biking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryFolderT }
     *     
     */
    public void setBiking(HistoryFolderT value) {
        this.biking = value;
    }

    /**
     * Ruft den Wert der other-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HistoryFolderT }
     *     
     */
    public HistoryFolderT getOther() {
        return other;
    }

    /**
     * Legt den Wert der other-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryFolderT }
     *     
     */
    public void setOther(HistoryFolderT value) {
        this.other = value;
    }

    /**
     * Ruft den Wert der multiSport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSportFolderT }
     *     
     */
    public MultiSportFolderT getMultiSport() {
        return multiSport;
    }

    /**
     * Legt den Wert der multiSport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSportFolderT }
     *     
     */
    public void setMultiSport(MultiSportFolderT value) {
        this.multiSport = value;
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

}
