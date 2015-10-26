//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.10.26 um 08:16:51 PM CET 
//


package com.garmin.xmlschemas.trainingcenterdatabase.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BuildType_t.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildType_t">
 *   &lt;restriction base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t">
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="Alpha"/>
 *     &lt;enumeration value="Beta"/>
 *     &lt;enumeration value="Release"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildType_t")
@XmlEnum
public enum BuildTypeT {

    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Alpha")
    ALPHA("Alpha"),
    @XmlEnumValue("Beta")
    BETA("Beta"),
    @XmlEnumValue("Release")
    RELEASE("Release");
    private final String value;

    BuildTypeT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuildTypeT fromValue(String v) {
        for (BuildTypeT c: BuildTypeT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
