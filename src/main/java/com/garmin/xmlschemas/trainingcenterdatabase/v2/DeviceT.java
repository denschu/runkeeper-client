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
 * Identifies the originating GPS device that tracked a run or
 *                                used to identify the type of device capable of handling
 *                                the data for loading.
 * 
 * <p>Java-Klasse für Device_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Device_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractSource_t">
 *       &lt;sequence>
 *         &lt;element name="UnitId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Version" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Version_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device_t", propOrder = {
    "unitId",
    "productID",
    "version"
})
public class DeviceT
    extends AbstractSourceT
{

    @XmlElement(name = "UnitId")
    @XmlSchemaType(name = "unsignedInt")
    protected long unitId;
    @XmlElement(name = "ProductID")
    @XmlSchemaType(name = "unsignedShort")
    protected int productID;
    @XmlElement(name = "Version", required = true)
    protected VersionT version;

    /**
     * Ruft den Wert der unitId-Eigenschaft ab.
     * 
     */
    public long getUnitId() {
        return unitId;
    }

    /**
     * Legt den Wert der unitId-Eigenschaft fest.
     * 
     */
    public void setUnitId(long value) {
        this.unitId = value;
    }

    /**
     * Ruft den Wert der productID-Eigenschaft ab.
     * 
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Legt den Wert der productID-Eigenschaft fest.
     * 
     */
    public void setProductID(int value) {
        this.productID = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionT }
     *     
     */
    public VersionT getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionT }
     *     
     */
    public void setVersion(VersionT value) {
        this.version = value;
    }

}
