//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.12 a las 05:24:43 PM COT 
//


package com.mdelacruz.ejemplo.wsdl.gq001002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GeDmInstitution complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeDmInstitution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="parentInstitutionId" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="name" type="{www.string70field.issuer.aci.com}String70Field"/&gt;
 *         &lt;element name="addressLine1" type="{www.string30field.issuer.aci.com}String30Field"/&gt;
 *         &lt;element name="addressLine2" type="{www.string30field.issuer.aci.com}String30Field"/&gt;
 *         &lt;element name="addressLine3" type="{www.string30field.issuer.aci.com}String30Field"/&gt;
 *         &lt;element name="city" type="{www.string30field.issuer.aci.com}String30Field"/&gt;
 *         &lt;element name="county" type="{www.string25field.issuer.aci.com}String25Field"/&gt;
 *         &lt;element name="country" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="postcode" type="{www.string10field.issuer.aci.com}String10Field"/&gt;
 *         &lt;element name="primaryCurrencyCode" type="{www.string3field.issuer.aci.com}String3Field"/&gt;
 *         &lt;element name="languageId" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="fiscalYearEndDate" type="{www.datefield.issuer.aci.com}DateField"/&gt;
 *         &lt;element name="currentProcessingDate" type="{www.datefield.issuer.aci.com}DateField"/&gt;
 *         &lt;element name="cycleThroughCode" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="externalCollectionsSystemStatus" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="memoRetention" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="referralMessagesActivation" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="referralMessage" type="{www.string40field.issuer.aci.com}String40Field"/&gt;
 *         &lt;element name="referralMessagesStartTime" type="{www.timefield.issuer.aci.com}TimeField"/&gt;
 *         &lt;element name="referralMessagesEndTime" type="{www.timefield.issuer.aci.com}TimeField"/&gt;
 *         &lt;element name="referralMessagesResponse" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="dateFormat" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="dateSeparator1" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="dateSeparator2" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="activeFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="autoMemoRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="batchId" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="postRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="deleteRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="performHsmChecksFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="declineMOTOTransaction" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="postIssuanceUpdateRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="institutionAlias" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="referralLimitAmount" type="{www.packedpre17post0field.issuer.aci.com}PackedPre17Post0Field"/&gt;
 *         &lt;element name="prepaidBulkIssueRequestRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="prepaidLoadTransactionCode" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="base24CardDataRefreshForNewCardIssueFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24CardDataRefreshForCardReplacementFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24CardDataRefreshForCardReissueFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24CardDataRefreshForCardStatusChangeFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24CardDataRefreshForVelocityDataChangeFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24CardDataRefreshForExternalAccountDataChangeFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24AccountDataRefreshForAccountSetupFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24AccountDataRefreshForAccountStatusChangeFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24AccountDataRefreshForPaymentDueDataChangeFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24AccountDataRefreshForCreditDataChangeFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24AccountDataRefreshForVelocityDataChangeFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24FileUpdatesSupportedFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24InstitutionId" type="{www.string20field.issuer.aci.com}String20Field"/&gt;
 *         &lt;element name="printPinMailersExternallyFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="prmFileUpdatesSupportedFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="hsmMaximumPinLength" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="externalChipCardPersonalisationFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="maximumPenaltyInterestRate" type="{www.packedpre4post5field.issuer.aci.com}PackedPre4Post5Field"/&gt;
 *         &lt;element name="masterCardAbuFileSupportedFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="vauFileSupportedFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="approvedAuthorisationRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="declinedAuthorisationRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="reversedAuthorisationRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="base24CardDataRefreshForCSMBufferTemplateFieldChangeFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="base24AccountDataRefreshForCSMBufferTemplateFieldChangeFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="tokenisationAuthorisationRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="transactionApprovalRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="transactionApprovedRetentionFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="creditLimitApprovedRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="creditLimitApprovedRetentionFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="velocityLimitApprovedRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="velocityLimitApprovedRetentionFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="otherActionsApprovedRetentionDays" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="otherActionsApprovedRetentionFlag" type="{www.string1field.issuer.aci.com}String1Field"/&gt;
 *         &lt;element name="lastUpdateNo" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeDmInstitution", namespace = "www.gedminstitution.issuer.aci.com", propOrder = {

})
public class GeDmInstitution {

    @XmlElement(required = true)
    protected String4Field id;
    @XmlElement(required = true)
    protected String4Field parentInstitutionId;
    @XmlElement(required = true)
    protected String70Field name;
    @XmlElement(required = true)
    protected String30Field addressLine1;
    @XmlElement(required = true)
    protected String30Field addressLine2;
    @XmlElement(required = true)
    protected String30Field addressLine3;
    @XmlElement(required = true)
    protected String30Field city;
    @XmlElement(required = true)
    protected String25Field county;
    @XmlElement(required = true)
    protected String4Field country;
    @XmlElement(required = true)
    protected String10Field postcode;
    @XmlElement(required = true)
    protected String3Field primaryCurrencyCode;
    @XmlElement(required = true)
    protected String4Field languageId;
    @XmlElement(required = true)
    protected DateField fiscalYearEndDate;
    @XmlElement(required = true)
    protected DateField currentProcessingDate;
    @XmlElement(required = true)
    protected String4Field cycleThroughCode;
    @XmlElement(required = true)
    protected String1Field externalCollectionsSystemStatus;
    @XmlElement(required = true)
    protected SmallIntField memoRetention;
    @XmlElement(required = true)
    protected String1Field referralMessagesActivation;
    @XmlElement(required = true)
    protected String40Field referralMessage;
    @XmlElement(required = true)
    protected TimeField referralMessagesStartTime;
    @XmlElement(required = true)
    protected TimeField referralMessagesEndTime;
    @XmlElement(required = true)
    protected String4Field referralMessagesResponse;
    @XmlElement(required = true)
    protected String4Field dateFormat;
    @XmlElement(required = true)
    protected String1Field dateSeparator1;
    @XmlElement(required = true)
    protected String1Field dateSeparator2;
    @XmlElement(required = true)
    protected String1Field activeFlag;
    @XmlElement(required = true)
    protected SmallIntField autoMemoRetentionDays;
    @XmlElement(required = true)
    protected SmallIntField batchId;
    @XmlElement(required = true)
    protected SmallIntField postRetentionDays;
    @XmlElement(required = true)
    protected SmallIntField deleteRetentionDays;
    @XmlElement(required = true)
    protected String1Field performHsmChecksFlag;
    @XmlElement(required = true)
    protected String1Field declineMOTOTransaction;
    @XmlElement(required = true)
    protected SmallIntField postIssuanceUpdateRetentionDays;
    @XmlElement(required = true)
    protected SmallIntField institutionAlias;
    @XmlElement(required = true)
    protected PackedPre17Post0Field referralLimitAmount;
    @XmlElement(required = true)
    protected SmallIntField prepaidBulkIssueRequestRetentionDays;
    @XmlElement(required = true)
    protected String4Field prepaidLoadTransactionCode;
    @XmlElement(required = true)
    protected String1Field base24CardDataRefreshForNewCardIssueFlag;
    @XmlElement(required = true)
    protected String1Field base24CardDataRefreshForCardReplacementFlag;
    @XmlElement(required = true)
    protected String1Field base24CardDataRefreshForCardReissueFlag;
    @XmlElement(required = true)
    protected String1Field base24CardDataRefreshForCardStatusChangeFlag;
    @XmlElement(required = true)
    protected String1Field base24CardDataRefreshForVelocityDataChangeFlag;
    @XmlElement(required = true)
    protected String1Field base24CardDataRefreshForExternalAccountDataChangeFlag;
    @XmlElement(required = true)
    protected String1Field base24AccountDataRefreshForAccountSetupFlag;
    @XmlElement(required = true)
    protected String1Field base24AccountDataRefreshForAccountStatusChangeFlag;
    @XmlElement(required = true)
    protected String1Field base24AccountDataRefreshForPaymentDueDataChangeFlag;
    @XmlElement(required = true)
    protected String1Field base24AccountDataRefreshForCreditDataChangeFlag;
    @XmlElement(required = true)
    protected String1Field base24AccountDataRefreshForVelocityDataChangeFlag;
    @XmlElement(required = true)
    protected String1Field base24FileUpdatesSupportedFlag;
    @XmlElement(required = true)
    protected String20Field base24InstitutionId;
    @XmlElement(required = true)
    protected String1Field printPinMailersExternallyFlag;
    @XmlElement(required = true)
    protected String1Field prmFileUpdatesSupportedFlag;
    @XmlElement(required = true)
    protected SmallIntField hsmMaximumPinLength;
    @XmlElement(required = true)
    protected String1Field externalChipCardPersonalisationFlag;
    @XmlElement(required = true)
    protected PackedPre4Post5Field maximumPenaltyInterestRate;
    @XmlElement(required = true)
    protected String1Field masterCardAbuFileSupportedFlag;
    @XmlElement(required = true)
    protected String1Field vauFileSupportedFlag;
    @XmlElement(required = true)
    protected SmallIntField approvedAuthorisationRetentionDays;
    @XmlElement(required = true)
    protected SmallIntField declinedAuthorisationRetentionDays;
    @XmlElement(required = true)
    protected SmallIntField reversedAuthorisationRetentionDays;
    @XmlElement(required = true)
    protected String1Field base24CardDataRefreshForCSMBufferTemplateFieldChangeFlag;
    @XmlElement(required = true)
    protected String1Field base24AccountDataRefreshForCSMBufferTemplateFieldChangeFlag;
    @XmlElement(required = true)
    protected SmallIntField tokenisationAuthorisationRetentionDays;
    @XmlElement(required = true)
    protected SmallIntField transactionApprovalRetentionDays;
    @XmlElement(required = true)
    protected String1Field transactionApprovedRetentionFlag;
    @XmlElement(required = true)
    protected SmallIntField creditLimitApprovedRetentionDays;
    @XmlElement(required = true)
    protected String1Field creditLimitApprovedRetentionFlag;
    @XmlElement(required = true)
    protected SmallIntField velocityLimitApprovedRetentionDays;
    @XmlElement(required = true)
    protected String1Field velocityLimitApprovedRetentionFlag;
    @XmlElement(required = true)
    protected SmallIntField otherActionsApprovedRetentionDays;
    @XmlElement(required = true)
    protected String1Field otherActionsApprovedRetentionFlag;
    @XmlElement(required = true)
    protected SmallIntField lastUpdateNo;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setId(String4Field value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad parentInstitutionId.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getParentInstitutionId() {
        return parentInstitutionId;
    }

    /**
     * Define el valor de la propiedad parentInstitutionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setParentInstitutionId(String4Field value) {
        this.parentInstitutionId = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String70Field }
     *     
     */
    public String70Field getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String70Field }
     *     
     */
    public void setName(String70Field value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad addressLine1.
     * 
     * @return
     *     possible object is
     *     {@link String30Field }
     *     
     */
    public String30Field getAddressLine1() {
        return addressLine1;
    }

    /**
     * Define el valor de la propiedad addressLine1.
     * 
     * @param value
     *     allowed object is
     *     {@link String30Field }
     *     
     */
    public void setAddressLine1(String30Field value) {
        this.addressLine1 = value;
    }

    /**
     * Obtiene el valor de la propiedad addressLine2.
     * 
     * @return
     *     possible object is
     *     {@link String30Field }
     *     
     */
    public String30Field getAddressLine2() {
        return addressLine2;
    }

    /**
     * Define el valor de la propiedad addressLine2.
     * 
     * @param value
     *     allowed object is
     *     {@link String30Field }
     *     
     */
    public void setAddressLine2(String30Field value) {
        this.addressLine2 = value;
    }

    /**
     * Obtiene el valor de la propiedad addressLine3.
     * 
     * @return
     *     possible object is
     *     {@link String30Field }
     *     
     */
    public String30Field getAddressLine3() {
        return addressLine3;
    }

    /**
     * Define el valor de la propiedad addressLine3.
     * 
     * @param value
     *     allowed object is
     *     {@link String30Field }
     *     
     */
    public void setAddressLine3(String30Field value) {
        this.addressLine3 = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String30Field }
     *     
     */
    public String30Field getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String30Field }
     *     
     */
    public void setCity(String30Field value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad county.
     * 
     * @return
     *     possible object is
     *     {@link String25Field }
     *     
     */
    public String25Field getCounty() {
        return county;
    }

    /**
     * Define el valor de la propiedad county.
     * 
     * @param value
     *     allowed object is
     *     {@link String25Field }
     *     
     */
    public void setCounty(String25Field value) {
        this.county = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setCountry(String4Field value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad postcode.
     * 
     * @return
     *     possible object is
     *     {@link String10Field }
     *     
     */
    public String10Field getPostcode() {
        return postcode;
    }

    /**
     * Define el valor de la propiedad postcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String10Field }
     *     
     */
    public void setPostcode(String10Field value) {
        this.postcode = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String3Field }
     *     
     */
    public String3Field getPrimaryCurrencyCode() {
        return primaryCurrencyCode;
    }

    /**
     * Define el valor de la propiedad primaryCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String3Field }
     *     
     */
    public void setPrimaryCurrencyCode(String3Field value) {
        this.primaryCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad languageId.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getLanguageId() {
        return languageId;
    }

    /**
     * Define el valor de la propiedad languageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setLanguageId(String4Field value) {
        this.languageId = value;
    }

    /**
     * Obtiene el valor de la propiedad fiscalYearEndDate.
     * 
     * @return
     *     possible object is
     *     {@link DateField }
     *     
     */
    public DateField getFiscalYearEndDate() {
        return fiscalYearEndDate;
    }

    /**
     * Define el valor de la propiedad fiscalYearEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateField }
     *     
     */
    public void setFiscalYearEndDate(DateField value) {
        this.fiscalYearEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad currentProcessingDate.
     * 
     * @return
     *     possible object is
     *     {@link DateField }
     *     
     */
    public DateField getCurrentProcessingDate() {
        return currentProcessingDate;
    }

    /**
     * Define el valor de la propiedad currentProcessingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateField }
     *     
     */
    public void setCurrentProcessingDate(DateField value) {
        this.currentProcessingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad cycleThroughCode.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getCycleThroughCode() {
        return cycleThroughCode;
    }

    /**
     * Define el valor de la propiedad cycleThroughCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setCycleThroughCode(String4Field value) {
        this.cycleThroughCode = value;
    }

    /**
     * Obtiene el valor de la propiedad externalCollectionsSystemStatus.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getExternalCollectionsSystemStatus() {
        return externalCollectionsSystemStatus;
    }

    /**
     * Define el valor de la propiedad externalCollectionsSystemStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setExternalCollectionsSystemStatus(String1Field value) {
        this.externalCollectionsSystemStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad memoRetention.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getMemoRetention() {
        return memoRetention;
    }

    /**
     * Define el valor de la propiedad memoRetention.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setMemoRetention(SmallIntField value) {
        this.memoRetention = value;
    }

    /**
     * Obtiene el valor de la propiedad referralMessagesActivation.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getReferralMessagesActivation() {
        return referralMessagesActivation;
    }

    /**
     * Define el valor de la propiedad referralMessagesActivation.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setReferralMessagesActivation(String1Field value) {
        this.referralMessagesActivation = value;
    }

    /**
     * Obtiene el valor de la propiedad referralMessage.
     * 
     * @return
     *     possible object is
     *     {@link String40Field }
     *     
     */
    public String40Field getReferralMessage() {
        return referralMessage;
    }

    /**
     * Define el valor de la propiedad referralMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String40Field }
     *     
     */
    public void setReferralMessage(String40Field value) {
        this.referralMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad referralMessagesStartTime.
     * 
     * @return
     *     possible object is
     *     {@link TimeField }
     *     
     */
    public TimeField getReferralMessagesStartTime() {
        return referralMessagesStartTime;
    }

    /**
     * Define el valor de la propiedad referralMessagesStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeField }
     *     
     */
    public void setReferralMessagesStartTime(TimeField value) {
        this.referralMessagesStartTime = value;
    }

    /**
     * Obtiene el valor de la propiedad referralMessagesEndTime.
     * 
     * @return
     *     possible object is
     *     {@link TimeField }
     *     
     */
    public TimeField getReferralMessagesEndTime() {
        return referralMessagesEndTime;
    }

    /**
     * Define el valor de la propiedad referralMessagesEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeField }
     *     
     */
    public void setReferralMessagesEndTime(TimeField value) {
        this.referralMessagesEndTime = value;
    }

    /**
     * Obtiene el valor de la propiedad referralMessagesResponse.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getReferralMessagesResponse() {
        return referralMessagesResponse;
    }

    /**
     * Define el valor de la propiedad referralMessagesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setReferralMessagesResponse(String4Field value) {
        this.referralMessagesResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad dateFormat.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getDateFormat() {
        return dateFormat;
    }

    /**
     * Define el valor de la propiedad dateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setDateFormat(String4Field value) {
        this.dateFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad dateSeparator1.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getDateSeparator1() {
        return dateSeparator1;
    }

    /**
     * Define el valor de la propiedad dateSeparator1.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setDateSeparator1(String1Field value) {
        this.dateSeparator1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dateSeparator2.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getDateSeparator2() {
        return dateSeparator2;
    }

    /**
     * Define el valor de la propiedad dateSeparator2.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setDateSeparator2(String1Field value) {
        this.dateSeparator2 = value;
    }

    /**
     * Obtiene el valor de la propiedad activeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getActiveFlag() {
        return activeFlag;
    }

    /**
     * Define el valor de la propiedad activeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setActiveFlag(String1Field value) {
        this.activeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad autoMemoRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getAutoMemoRetentionDays() {
        return autoMemoRetentionDays;
    }

    /**
     * Define el valor de la propiedad autoMemoRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setAutoMemoRetentionDays(SmallIntField value) {
        this.autoMemoRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad batchId.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getBatchId() {
        return batchId;
    }

    /**
     * Define el valor de la propiedad batchId.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setBatchId(SmallIntField value) {
        this.batchId = value;
    }

    /**
     * Obtiene el valor de la propiedad postRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getPostRetentionDays() {
        return postRetentionDays;
    }

    /**
     * Define el valor de la propiedad postRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setPostRetentionDays(SmallIntField value) {
        this.postRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad deleteRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getDeleteRetentionDays() {
        return deleteRetentionDays;
    }

    /**
     * Define el valor de la propiedad deleteRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setDeleteRetentionDays(SmallIntField value) {
        this.deleteRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad performHsmChecksFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getPerformHsmChecksFlag() {
        return performHsmChecksFlag;
    }

    /**
     * Define el valor de la propiedad performHsmChecksFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setPerformHsmChecksFlag(String1Field value) {
        this.performHsmChecksFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad declineMOTOTransaction.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getDeclineMOTOTransaction() {
        return declineMOTOTransaction;
    }

    /**
     * Define el valor de la propiedad declineMOTOTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setDeclineMOTOTransaction(String1Field value) {
        this.declineMOTOTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad postIssuanceUpdateRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getPostIssuanceUpdateRetentionDays() {
        return postIssuanceUpdateRetentionDays;
    }

    /**
     * Define el valor de la propiedad postIssuanceUpdateRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setPostIssuanceUpdateRetentionDays(SmallIntField value) {
        this.postIssuanceUpdateRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad institutionAlias.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getInstitutionAlias() {
        return institutionAlias;
    }

    /**
     * Define el valor de la propiedad institutionAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setInstitutionAlias(SmallIntField value) {
        this.institutionAlias = value;
    }

    /**
     * Obtiene el valor de la propiedad referralLimitAmount.
     * 
     * @return
     *     possible object is
     *     {@link PackedPre17Post0Field }
     *     
     */
    public PackedPre17Post0Field getReferralLimitAmount() {
        return referralLimitAmount;
    }

    /**
     * Define el valor de la propiedad referralLimitAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PackedPre17Post0Field }
     *     
     */
    public void setReferralLimitAmount(PackedPre17Post0Field value) {
        this.referralLimitAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad prepaidBulkIssueRequestRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getPrepaidBulkIssueRequestRetentionDays() {
        return prepaidBulkIssueRequestRetentionDays;
    }

    /**
     * Define el valor de la propiedad prepaidBulkIssueRequestRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setPrepaidBulkIssueRequestRetentionDays(SmallIntField value) {
        this.prepaidBulkIssueRequestRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad prepaidLoadTransactionCode.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getPrepaidLoadTransactionCode() {
        return prepaidLoadTransactionCode;
    }

    /**
     * Define el valor de la propiedad prepaidLoadTransactionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setPrepaidLoadTransactionCode(String4Field value) {
        this.prepaidLoadTransactionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad base24CardDataRefreshForNewCardIssueFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24CardDataRefreshForNewCardIssueFlag() {
        return base24CardDataRefreshForNewCardIssueFlag;
    }

    /**
     * Define el valor de la propiedad base24CardDataRefreshForNewCardIssueFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24CardDataRefreshForNewCardIssueFlag(String1Field value) {
        this.base24CardDataRefreshForNewCardIssueFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24CardDataRefreshForCardReplacementFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24CardDataRefreshForCardReplacementFlag() {
        return base24CardDataRefreshForCardReplacementFlag;
    }

    /**
     * Define el valor de la propiedad base24CardDataRefreshForCardReplacementFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24CardDataRefreshForCardReplacementFlag(String1Field value) {
        this.base24CardDataRefreshForCardReplacementFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24CardDataRefreshForCardReissueFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24CardDataRefreshForCardReissueFlag() {
        return base24CardDataRefreshForCardReissueFlag;
    }

    /**
     * Define el valor de la propiedad base24CardDataRefreshForCardReissueFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24CardDataRefreshForCardReissueFlag(String1Field value) {
        this.base24CardDataRefreshForCardReissueFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24CardDataRefreshForCardStatusChangeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24CardDataRefreshForCardStatusChangeFlag() {
        return base24CardDataRefreshForCardStatusChangeFlag;
    }

    /**
     * Define el valor de la propiedad base24CardDataRefreshForCardStatusChangeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24CardDataRefreshForCardStatusChangeFlag(String1Field value) {
        this.base24CardDataRefreshForCardStatusChangeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24CardDataRefreshForVelocityDataChangeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24CardDataRefreshForVelocityDataChangeFlag() {
        return base24CardDataRefreshForVelocityDataChangeFlag;
    }

    /**
     * Define el valor de la propiedad base24CardDataRefreshForVelocityDataChangeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24CardDataRefreshForVelocityDataChangeFlag(String1Field value) {
        this.base24CardDataRefreshForVelocityDataChangeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24CardDataRefreshForExternalAccountDataChangeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24CardDataRefreshForExternalAccountDataChangeFlag() {
        return base24CardDataRefreshForExternalAccountDataChangeFlag;
    }

    /**
     * Define el valor de la propiedad base24CardDataRefreshForExternalAccountDataChangeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24CardDataRefreshForExternalAccountDataChangeFlag(String1Field value) {
        this.base24CardDataRefreshForExternalAccountDataChangeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24AccountDataRefreshForAccountSetupFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24AccountDataRefreshForAccountSetupFlag() {
        return base24AccountDataRefreshForAccountSetupFlag;
    }

    /**
     * Define el valor de la propiedad base24AccountDataRefreshForAccountSetupFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24AccountDataRefreshForAccountSetupFlag(String1Field value) {
        this.base24AccountDataRefreshForAccountSetupFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24AccountDataRefreshForAccountStatusChangeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24AccountDataRefreshForAccountStatusChangeFlag() {
        return base24AccountDataRefreshForAccountStatusChangeFlag;
    }

    /**
     * Define el valor de la propiedad base24AccountDataRefreshForAccountStatusChangeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24AccountDataRefreshForAccountStatusChangeFlag(String1Field value) {
        this.base24AccountDataRefreshForAccountStatusChangeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24AccountDataRefreshForPaymentDueDataChangeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24AccountDataRefreshForPaymentDueDataChangeFlag() {
        return base24AccountDataRefreshForPaymentDueDataChangeFlag;
    }

    /**
     * Define el valor de la propiedad base24AccountDataRefreshForPaymentDueDataChangeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24AccountDataRefreshForPaymentDueDataChangeFlag(String1Field value) {
        this.base24AccountDataRefreshForPaymentDueDataChangeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24AccountDataRefreshForCreditDataChangeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24AccountDataRefreshForCreditDataChangeFlag() {
        return base24AccountDataRefreshForCreditDataChangeFlag;
    }

    /**
     * Define el valor de la propiedad base24AccountDataRefreshForCreditDataChangeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24AccountDataRefreshForCreditDataChangeFlag(String1Field value) {
        this.base24AccountDataRefreshForCreditDataChangeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24AccountDataRefreshForVelocityDataChangeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24AccountDataRefreshForVelocityDataChangeFlag() {
        return base24AccountDataRefreshForVelocityDataChangeFlag;
    }

    /**
     * Define el valor de la propiedad base24AccountDataRefreshForVelocityDataChangeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24AccountDataRefreshForVelocityDataChangeFlag(String1Field value) {
        this.base24AccountDataRefreshForVelocityDataChangeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24FileUpdatesSupportedFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24FileUpdatesSupportedFlag() {
        return base24FileUpdatesSupportedFlag;
    }

    /**
     * Define el valor de la propiedad base24FileUpdatesSupportedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24FileUpdatesSupportedFlag(String1Field value) {
        this.base24FileUpdatesSupportedFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24InstitutionId.
     * 
     * @return
     *     possible object is
     *     {@link String20Field }
     *     
     */
    public String20Field getBase24InstitutionId() {
        return base24InstitutionId;
    }

    /**
     * Define el valor de la propiedad base24InstitutionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String20Field }
     *     
     */
    public void setBase24InstitutionId(String20Field value) {
        this.base24InstitutionId = value;
    }

    /**
     * Obtiene el valor de la propiedad printPinMailersExternallyFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getPrintPinMailersExternallyFlag() {
        return printPinMailersExternallyFlag;
    }

    /**
     * Define el valor de la propiedad printPinMailersExternallyFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setPrintPinMailersExternallyFlag(String1Field value) {
        this.printPinMailersExternallyFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad prmFileUpdatesSupportedFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getPrmFileUpdatesSupportedFlag() {
        return prmFileUpdatesSupportedFlag;
    }

    /**
     * Define el valor de la propiedad prmFileUpdatesSupportedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setPrmFileUpdatesSupportedFlag(String1Field value) {
        this.prmFileUpdatesSupportedFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad hsmMaximumPinLength.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getHsmMaximumPinLength() {
        return hsmMaximumPinLength;
    }

    /**
     * Define el valor de la propiedad hsmMaximumPinLength.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setHsmMaximumPinLength(SmallIntField value) {
        this.hsmMaximumPinLength = value;
    }

    /**
     * Obtiene el valor de la propiedad externalChipCardPersonalisationFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getExternalChipCardPersonalisationFlag() {
        return externalChipCardPersonalisationFlag;
    }

    /**
     * Define el valor de la propiedad externalChipCardPersonalisationFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setExternalChipCardPersonalisationFlag(String1Field value) {
        this.externalChipCardPersonalisationFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumPenaltyInterestRate.
     * 
     * @return
     *     possible object is
     *     {@link PackedPre4Post5Field }
     *     
     */
    public PackedPre4Post5Field getMaximumPenaltyInterestRate() {
        return maximumPenaltyInterestRate;
    }

    /**
     * Define el valor de la propiedad maximumPenaltyInterestRate.
     * 
     * @param value
     *     allowed object is
     *     {@link PackedPre4Post5Field }
     *     
     */
    public void setMaximumPenaltyInterestRate(PackedPre4Post5Field value) {
        this.maximumPenaltyInterestRate = value;
    }

    /**
     * Obtiene el valor de la propiedad masterCardAbuFileSupportedFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getMasterCardAbuFileSupportedFlag() {
        return masterCardAbuFileSupportedFlag;
    }

    /**
     * Define el valor de la propiedad masterCardAbuFileSupportedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setMasterCardAbuFileSupportedFlag(String1Field value) {
        this.masterCardAbuFileSupportedFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad vauFileSupportedFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getVauFileSupportedFlag() {
        return vauFileSupportedFlag;
    }

    /**
     * Define el valor de la propiedad vauFileSupportedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setVauFileSupportedFlag(String1Field value) {
        this.vauFileSupportedFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad approvedAuthorisationRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getApprovedAuthorisationRetentionDays() {
        return approvedAuthorisationRetentionDays;
    }

    /**
     * Define el valor de la propiedad approvedAuthorisationRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setApprovedAuthorisationRetentionDays(SmallIntField value) {
        this.approvedAuthorisationRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad declinedAuthorisationRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getDeclinedAuthorisationRetentionDays() {
        return declinedAuthorisationRetentionDays;
    }

    /**
     * Define el valor de la propiedad declinedAuthorisationRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setDeclinedAuthorisationRetentionDays(SmallIntField value) {
        this.declinedAuthorisationRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad reversedAuthorisationRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getReversedAuthorisationRetentionDays() {
        return reversedAuthorisationRetentionDays;
    }

    /**
     * Define el valor de la propiedad reversedAuthorisationRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setReversedAuthorisationRetentionDays(SmallIntField value) {
        this.reversedAuthorisationRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad base24CardDataRefreshForCSMBufferTemplateFieldChangeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24CardDataRefreshForCSMBufferTemplateFieldChangeFlag() {
        return base24CardDataRefreshForCSMBufferTemplateFieldChangeFlag;
    }

    /**
     * Define el valor de la propiedad base24CardDataRefreshForCSMBufferTemplateFieldChangeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24CardDataRefreshForCSMBufferTemplateFieldChangeFlag(String1Field value) {
        this.base24CardDataRefreshForCSMBufferTemplateFieldChangeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad base24AccountDataRefreshForCSMBufferTemplateFieldChangeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getBase24AccountDataRefreshForCSMBufferTemplateFieldChangeFlag() {
        return base24AccountDataRefreshForCSMBufferTemplateFieldChangeFlag;
    }

    /**
     * Define el valor de la propiedad base24AccountDataRefreshForCSMBufferTemplateFieldChangeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setBase24AccountDataRefreshForCSMBufferTemplateFieldChangeFlag(String1Field value) {
        this.base24AccountDataRefreshForCSMBufferTemplateFieldChangeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenisationAuthorisationRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getTokenisationAuthorisationRetentionDays() {
        return tokenisationAuthorisationRetentionDays;
    }

    /**
     * Define el valor de la propiedad tokenisationAuthorisationRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setTokenisationAuthorisationRetentionDays(SmallIntField value) {
        this.tokenisationAuthorisationRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionApprovalRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getTransactionApprovalRetentionDays() {
        return transactionApprovalRetentionDays;
    }

    /**
     * Define el valor de la propiedad transactionApprovalRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setTransactionApprovalRetentionDays(SmallIntField value) {
        this.transactionApprovalRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionApprovedRetentionFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getTransactionApprovedRetentionFlag() {
        return transactionApprovedRetentionFlag;
    }

    /**
     * Define el valor de la propiedad transactionApprovedRetentionFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setTransactionApprovedRetentionFlag(String1Field value) {
        this.transactionApprovedRetentionFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad creditLimitApprovedRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getCreditLimitApprovedRetentionDays() {
        return creditLimitApprovedRetentionDays;
    }

    /**
     * Define el valor de la propiedad creditLimitApprovedRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setCreditLimitApprovedRetentionDays(SmallIntField value) {
        this.creditLimitApprovedRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad creditLimitApprovedRetentionFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getCreditLimitApprovedRetentionFlag() {
        return creditLimitApprovedRetentionFlag;
    }

    /**
     * Define el valor de la propiedad creditLimitApprovedRetentionFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setCreditLimitApprovedRetentionFlag(String1Field value) {
        this.creditLimitApprovedRetentionFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad velocityLimitApprovedRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getVelocityLimitApprovedRetentionDays() {
        return velocityLimitApprovedRetentionDays;
    }

    /**
     * Define el valor de la propiedad velocityLimitApprovedRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setVelocityLimitApprovedRetentionDays(SmallIntField value) {
        this.velocityLimitApprovedRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad velocityLimitApprovedRetentionFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getVelocityLimitApprovedRetentionFlag() {
        return velocityLimitApprovedRetentionFlag;
    }

    /**
     * Define el valor de la propiedad velocityLimitApprovedRetentionFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setVelocityLimitApprovedRetentionFlag(String1Field value) {
        this.velocityLimitApprovedRetentionFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad otherActionsApprovedRetentionDays.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getOtherActionsApprovedRetentionDays() {
        return otherActionsApprovedRetentionDays;
    }

    /**
     * Define el valor de la propiedad otherActionsApprovedRetentionDays.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setOtherActionsApprovedRetentionDays(SmallIntField value) {
        this.otherActionsApprovedRetentionDays = value;
    }

    /**
     * Obtiene el valor de la propiedad otherActionsApprovedRetentionFlag.
     * 
     * @return
     *     possible object is
     *     {@link String1Field }
     *     
     */
    public String1Field getOtherActionsApprovedRetentionFlag() {
        return otherActionsApprovedRetentionFlag;
    }

    /**
     * Define el valor de la propiedad otherActionsApprovedRetentionFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String1Field }
     *     
     */
    public void setOtherActionsApprovedRetentionFlag(String1Field value) {
        this.otherActionsApprovedRetentionFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad lastUpdateNo.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getLastUpdateNo() {
        return lastUpdateNo;
    }

    /**
     * Define el valor de la propiedad lastUpdateNo.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setLastUpdateNo(SmallIntField value) {
        this.lastUpdateNo = value;
    }

}
