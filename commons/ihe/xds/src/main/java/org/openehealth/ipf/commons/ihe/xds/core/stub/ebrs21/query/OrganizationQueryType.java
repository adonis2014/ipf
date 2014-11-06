//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.commons.ihe.xds.core.stub.ebrs21.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}OrganizationFilter" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}PostalAddressFilter" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}TelephoneNumberFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}UserBranch" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}OrganizationParentBranch" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}OrganizationChildrenBranch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationQueryType", propOrder = {
    "organizationFilter",
    "postalAddressFilter",
    "telephoneNumberFilter",
    "userBranch",
    "organizationParentBranch",
    "organizationChildrenBranch"
})
public class OrganizationQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "OrganizationFilter")
    protected FilterType organizationFilter;
    @XmlElement(name = "PostalAddressFilter")
    protected FilterType postalAddressFilter;
    @XmlElement(name = "TelephoneNumberFilter")
    protected List<FilterType> telephoneNumberFilter;
    @XmlElement(name = "UserBranch")
    protected UserBranch userBranch;
    @XmlElement(name = "OrganizationParentBranch")
    protected OrganizationQueryType organizationParentBranch;
    @XmlElement(name = "OrganizationChildrenBranch")
    protected List<OrganizationQueryType> organizationChildrenBranch;

    /**
     * Gets the value of the organizationFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getOrganizationFilter() {
        return organizationFilter;
    }

    /**
     * Sets the value of the organizationFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setOrganizationFilter(FilterType value) {
        this.organizationFilter = value;
    }

    /**
     * Gets the value of the postalAddressFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getPostalAddressFilter() {
        return postalAddressFilter;
    }

    /**
     * Sets the value of the postalAddressFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setPostalAddressFilter(FilterType value) {
        this.postalAddressFilter = value;
    }

    /**
     * Gets the value of the telephoneNumberFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumberFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumberFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getTelephoneNumberFilter() {
        if (telephoneNumberFilter == null) {
            telephoneNumberFilter = new ArrayList<>();
        }
        return this.telephoneNumberFilter;
    }

    /**
     * Gets the value of the userBranch property.
     * 
     * @return
     *     possible object is
     *     {@link UserBranch }
     *     
     */
    public UserBranch getUserBranch() {
        return userBranch;
    }

    /**
     * Sets the value of the userBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserBranch }
     *     
     */
    public void setUserBranch(UserBranch value) {
        this.userBranch = value;
    }

    /**
     * Gets the value of the organizationParentBranch property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationQueryType }
     *     
     */
    public OrganizationQueryType getOrganizationParentBranch() {
        return organizationParentBranch;
    }

    /**
     * Sets the value of the organizationParentBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationQueryType }
     *     
     */
    public void setOrganizationParentBranch(OrganizationQueryType value) {
        this.organizationParentBranch = value;
    }

    /**
     * Gets the value of the organizationChildrenBranch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationChildrenBranch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationChildrenBranch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationQueryType }
     * 
     * 
     */
    public List<OrganizationQueryType> getOrganizationChildrenBranch() {
        if (organizationChildrenBranch == null) {
            organizationChildrenBranch = new ArrayList<>();
        }
        return this.organizationChildrenBranch;
    }

}
