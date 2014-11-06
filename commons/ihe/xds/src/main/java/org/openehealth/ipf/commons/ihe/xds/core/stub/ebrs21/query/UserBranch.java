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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}UserFilter" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}PostalAddressFilter" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}TelephoneNumberFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}EmailAddressFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}OrganizationQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userFilter",
    "postalAddressFilter",
    "telephoneNumberFilter",
    "emailAddressFilter",
    "organizationQuery"
})
@XmlRootElement(name = "UserBranch")
public class UserBranch {

    @XmlElement(name = "UserFilter")
    protected FilterType userFilter;
    @XmlElement(name = "PostalAddressFilter")
    protected FilterType postalAddressFilter;
    @XmlElement(name = "TelephoneNumberFilter")
    protected List<FilterType> telephoneNumberFilter;
    @XmlElement(name = "EmailAddressFilter")
    protected List<FilterType> emailAddressFilter;
    @XmlElement(name = "OrganizationQuery")
    protected OrganizationQueryType organizationQuery;

    /**
     * Gets the value of the userFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getUserFilter() {
        return userFilter;
    }

    /**
     * Sets the value of the userFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setUserFilter(FilterType value) {
        this.userFilter = value;
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
     * Gets the value of the emailAddressFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddressFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddressFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getEmailAddressFilter() {
        if (emailAddressFilter == null) {
            emailAddressFilter = new ArrayList<>();
        }
        return this.emailAddressFilter;
    }

    /**
     * Gets the value of the organizationQuery property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationQueryType }
     *     
     */
    public OrganizationQueryType getOrganizationQuery() {
        return organizationQuery;
    }

    /**
     * Sets the value of the organizationQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationQueryType }
     *     
     */
    public void setOrganizationQuery(OrganizationQueryType value) {
        this.organizationQuery = value;
    }

}
