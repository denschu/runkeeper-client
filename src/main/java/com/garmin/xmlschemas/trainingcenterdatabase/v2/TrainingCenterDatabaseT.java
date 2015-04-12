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
 * <p>Java-Klasse für TrainingCenterDatabase_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrainingCenterDatabase_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Folders" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Folders_t" minOccurs="0"/>
 *         &lt;element name="Activities" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}ActivityList_t" minOccurs="0"/>
 *         &lt;element name="Workouts" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}WorkoutList_t" minOccurs="0"/>
 *         &lt;element name="Courses" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CourseList_t" minOccurs="0"/>
 *         &lt;element name="Author" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractSource_t" minOccurs="0"/>
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
@XmlType(name = "TrainingCenterDatabase_t", propOrder = {
    "folders",
    "activities",
    "workouts",
    "courses",
    "author",
    "extensions"
})
public class TrainingCenterDatabaseT {

    @XmlElement(name = "Folders")
    protected FoldersT folders;
    @XmlElement(name = "Activities")
    protected ActivityListT activities;
    @XmlElement(name = "Workouts")
    protected WorkoutListT workouts;
    @XmlElement(name = "Courses")
    protected CourseListT courses;
    @XmlElement(name = "Author")
    protected AbstractSourceT author;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

    /**
     * Ruft den Wert der folders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FoldersT }
     *     
     */
    public FoldersT getFolders() {
        return folders;
    }

    /**
     * Legt den Wert der folders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FoldersT }
     *     
     */
    public void setFolders(FoldersT value) {
        this.folders = value;
    }

    /**
     * Ruft den Wert der activities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivityListT }
     *     
     */
    public ActivityListT getActivities() {
        return activities;
    }

    /**
     * Legt den Wert der activities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityListT }
     *     
     */
    public void setActivities(ActivityListT value) {
        this.activities = value;
    }

    /**
     * Ruft den Wert der workouts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkoutListT }
     *     
     */
    public WorkoutListT getWorkouts() {
        return workouts;
    }

    /**
     * Legt den Wert der workouts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkoutListT }
     *     
     */
    public void setWorkouts(WorkoutListT value) {
        this.workouts = value;
    }

    /**
     * Ruft den Wert der courses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CourseListT }
     *     
     */
    public CourseListT getCourses() {
        return courses;
    }

    /**
     * Legt den Wert der courses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseListT }
     *     
     */
    public void setCourses(CourseListT value) {
        this.courses = value;
    }

    /**
     * Ruft den Wert der author-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSourceT }
     *     
     */
    public AbstractSourceT getAuthor() {
        return author;
    }

    /**
     * Legt den Wert der author-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSourceT }
     *     
     */
    public void setAuthor(AbstractSourceT value) {
        this.author = value;
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
