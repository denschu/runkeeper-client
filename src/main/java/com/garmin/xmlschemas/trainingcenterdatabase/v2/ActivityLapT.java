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
 * <p>Java-Klasse für ActivityLap_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActivityLap_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalTimeSeconds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DistanceMeters" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MaximumSpeed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Calories" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="AverageHeartRateBpm" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateInBeatsPerMinute_t" minOccurs="0"/>
 *         &lt;element name="MaximumHeartRateBpm" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateInBeatsPerMinute_t" minOccurs="0"/>
 *         &lt;element name="Intensity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Intensity_t"/>
 *         &lt;element name="Cadence" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CadenceValue_t" minOccurs="0"/>
 *         &lt;element name="TriggerMethod" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}TriggerMethod_t"/>
 *         &lt;element name="Track" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Track_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StartTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityLap_t", propOrder = {
    "totalTimeSeconds",
    "distanceMeters",
    "maximumSpeed",
    "calories",
    "averageHeartRateBpm",
    "maximumHeartRateBpm",
    "intensity",
    "cadence",
    "triggerMethod",
    "track",
    "notes",
    "extensions"
})
public class ActivityLapT {

    @XmlElement(name = "TotalTimeSeconds")
    protected double totalTimeSeconds;
    @XmlElement(name = "DistanceMeters")
    protected double distanceMeters;
    @XmlElement(name = "MaximumSpeed")
    protected Double maximumSpeed;
    @XmlElement(name = "Calories")
    @XmlSchemaType(name = "unsignedShort")
    protected int calories;
    @XmlElement(name = "AverageHeartRateBpm")
    protected HeartRateInBeatsPerMinuteT averageHeartRateBpm;
    @XmlElement(name = "MaximumHeartRateBpm")
    protected HeartRateInBeatsPerMinuteT maximumHeartRateBpm;
    @XmlElement(name = "Intensity", required = true)
    protected IntensityT intensity;
    @XmlElement(name = "Cadence")
    protected Short cadence;
    @XmlElement(name = "TriggerMethod", required = true)
    protected TriggerMethodT triggerMethod;
    @XmlElement(name = "Track")
    protected List<TrackT> track;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;
    @XmlAttribute(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;

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

    /**
     * Ruft den Wert der maximumSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * Legt den Wert der maximumSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumSpeed(Double value) {
        this.maximumSpeed = value;
    }

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

    /**
     * Ruft den Wert der averageHeartRateBpm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public HeartRateInBeatsPerMinuteT getAverageHeartRateBpm() {
        return averageHeartRateBpm;
    }

    /**
     * Legt den Wert der averageHeartRateBpm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public void setAverageHeartRateBpm(HeartRateInBeatsPerMinuteT value) {
        this.averageHeartRateBpm = value;
    }

    /**
     * Ruft den Wert der maximumHeartRateBpm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public HeartRateInBeatsPerMinuteT getMaximumHeartRateBpm() {
        return maximumHeartRateBpm;
    }

    /**
     * Legt den Wert der maximumHeartRateBpm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public void setMaximumHeartRateBpm(HeartRateInBeatsPerMinuteT value) {
        this.maximumHeartRateBpm = value;
    }

    /**
     * Ruft den Wert der intensity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntensityT }
     *     
     */
    public IntensityT getIntensity() {
        return intensity;
    }

    /**
     * Legt den Wert der intensity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntensityT }
     *     
     */
    public void setIntensity(IntensityT value) {
        this.intensity = value;
    }

    /**
     * Ruft den Wert der cadence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCadence() {
        return cadence;
    }

    /**
     * Legt den Wert der cadence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCadence(Short value) {
        this.cadence = value;
    }

    /**
     * Ruft den Wert der triggerMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TriggerMethodT }
     *     
     */
    public TriggerMethodT getTriggerMethod() {
        return triggerMethod;
    }

    /**
     * Legt den Wert der triggerMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerMethodT }
     *     
     */
    public void setTriggerMethod(TriggerMethodT value) {
        this.triggerMethod = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the track property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackT }
     * 
     * 
     */
    public List<TrackT> getTrack() {
        if (track == null) {
            track = new ArrayList<TrackT>();
        }
        return this.track;
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
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

}
