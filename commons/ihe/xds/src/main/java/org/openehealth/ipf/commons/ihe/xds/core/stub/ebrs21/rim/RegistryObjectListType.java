//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.rim;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistryObjectListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryObjectListType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}LeafRegistryObjectListType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}RegistryEntry"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}RegistryObject"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryObjectListType", propOrder = {
    "registryEntryOrRegistryObject"
})
public class RegistryObjectListType
    extends LeafRegistryObjectListType
{

    @XmlElements({
        @XmlElement(name = "RegistryObject"),
        @XmlElement(name = "RegistryEntry", type = RegistryEntryType.class)
    })
    protected List<RegistryObjectType> registryEntryOrRegistryObject;

    /**
     * Gets the value of the registryEntryOrRegistryObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registryEntryOrRegistryObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistryEntryOrRegistryObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistryObjectType }
     * {@link RegistryEntryType }
     * 
     * 
     */
    public List<RegistryObjectType> getRegistryEntryOrRegistryObject() {
        if (registryEntryOrRegistryObject == null) {
            registryEntryOrRegistryObject = new ArrayList<>();
        }
        return this.registryEntryOrRegistryObject;
    }

}
