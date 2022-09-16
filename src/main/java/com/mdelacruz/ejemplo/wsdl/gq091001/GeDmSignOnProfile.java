//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.15 a las 06:09:42 PM COT 
//


package com.mdelacruz.ejemplo.wsdl.gq091001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GeDmSignOnProfile complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeDmSignOnProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="sessionId" type="{www.packedpre5post0field.issuer.aci.com}PackedPre5Post0Field"/&gt;
 *         &lt;element name="groupId" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="signOnId" type="{www.string8field.issuer.aci.com}String8Field"/&gt;
 *         &lt;element name="signOnDate" type="{www.datefield.issuer.aci.com}DateField"/&gt;
 *         &lt;element name="signOnTime" type="{www.timefield.issuer.aci.com}TimeField"/&gt;
 *         &lt;element name="lastActivityDate" type="{www.datefield.issuer.aci.com}DateField"/&gt;
 *         &lt;element name="lastActivityTime" type="{www.timefield.issuer.aci.com}TimeField"/&gt;
 *         &lt;element name="sessionEndDate" type="{www.datefield.issuer.aci.com}DateField"/&gt;
 *         &lt;element name="sessionEndTime" type="{www.timefield.issuer.aci.com}TimeField"/&gt;
 *         &lt;element name="numberOfSystemCycles" type="{www.integerfield.issuer.aci.com}IntegerField"/&gt;
 *         &lt;element name="systemKeyInteger" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="sessionStatus" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="lastSecurityToken" type="{www.integerfield.issuer.aci.com}IntegerField"/&gt;
 *         &lt;element name="sessionType" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="productId" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="languageId" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="clientNetworkAddress" type="{www.string20field.issuer.aci.com}String20Field"/&gt;
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
@XmlType(name = "GeDmSignOnProfile", namespace = "www.gedmsignonprofile.issuer.aci.com", propOrder = {

})
public class GeDmSignOnProfile {

    @XmlElement(required = true)
    protected PackedPre5Post0Field sessionId;
    @XmlElement(required = true)
    protected String4Field groupId;
    @XmlElement(required = true)
    protected String8Field signOnId;
    @XmlElement(required = true)
    protected DateField signOnDate;
    @XmlElement(required = true)
    protected TimeField signOnTime;
    @XmlElement(required = true)
    protected DateField lastActivityDate;
    @XmlElement(required = true)
    protected TimeField lastActivityTime;
    @XmlElement(required = true)
    protected DateField sessionEndDate;
    @XmlElement(required = true)
    protected TimeField sessionEndTime;
    @XmlElement(required = true)
    protected IntegerField numberOfSystemCycles;
    @XmlElement(required = true)
    protected String4Field systemKeyInteger;
    @XmlElement(required = true)
    protected String4Field sessionStatus;
    @XmlElement(required = true)
    protected IntegerField lastSecurityToken;
    @XmlElement(required = true)
    protected String4Field sessionType;
    @XmlElement(required = true)
    protected String4Field productId;
    @XmlElement(required = true)
    protected String4Field languageId;
    @XmlElement(required = true)
    protected String20Field clientNetworkAddress;
    @XmlElement(required = true)
    protected SmallIntField lastUpdateNo;

    /**
     * Obtiene el valor de la propiedad sessionId.
     * 
     * @return
     *     possible object is
     *     {@link PackedPre5Post0Field }
     *     
     */
    public PackedPre5Post0Field getSessionId() {
        return sessionId;
    }

    /**
     * Define el valor de la propiedad sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link PackedPre5Post0Field }
     *     
     */
    public void setSessionId(PackedPre5Post0Field value) {
        this.sessionId = value;
    }

    /**
     * Obtiene el valor de la propiedad groupId.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getGroupId() {
        return groupId;
    }

    /**
     * Define el valor de la propiedad groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setGroupId(String4Field value) {
        this.groupId = value;
    }

    /**
     * Obtiene el valor de la propiedad signOnId.
     * 
     * @return
     *     possible object is
     *     {@link String8Field }
     *     
     */
    public String8Field getSignOnId() {
        return signOnId;
    }

    /**
     * Define el valor de la propiedad signOnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String8Field }
     *     
     */
    public void setSignOnId(String8Field value) {
        this.signOnId = value;
    }

    /**
     * Obtiene el valor de la propiedad signOnDate.
     * 
     * @return
     *     possible object is
     *     {@link DateField }
     *     
     */
    public DateField getSignOnDate() {
        return signOnDate;
    }

    /**
     * Define el valor de la propiedad signOnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateField }
     *     
     */
    public void setSignOnDate(DateField value) {
        this.signOnDate = value;
    }

    /**
     * Obtiene el valor de la propiedad signOnTime.
     * 
     * @return
     *     possible object is
     *     {@link TimeField }
     *     
     */
    public TimeField getSignOnTime() {
        return signOnTime;
    }

    /**
     * Define el valor de la propiedad signOnTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeField }
     *     
     */
    public void setSignOnTime(TimeField value) {
        this.signOnTime = value;
    }

    /**
     * Obtiene el valor de la propiedad lastActivityDate.
     * 
     * @return
     *     possible object is
     *     {@link DateField }
     *     
     */
    public DateField getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Define el valor de la propiedad lastActivityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateField }
     *     
     */
    public void setLastActivityDate(DateField value) {
        this.lastActivityDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lastActivityTime.
     * 
     * @return
     *     possible object is
     *     {@link TimeField }
     *     
     */
    public TimeField getLastActivityTime() {
        return lastActivityTime;
    }

    /**
     * Define el valor de la propiedad lastActivityTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeField }
     *     
     */
    public void setLastActivityTime(TimeField value) {
        this.lastActivityTime = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionEndDate.
     * 
     * @return
     *     possible object is
     *     {@link DateField }
     *     
     */
    public DateField getSessionEndDate() {
        return sessionEndDate;
    }

    /**
     * Define el valor de la propiedad sessionEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateField }
     *     
     */
    public void setSessionEndDate(DateField value) {
        this.sessionEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionEndTime.
     * 
     * @return
     *     possible object is
     *     {@link TimeField }
     *     
     */
    public TimeField getSessionEndTime() {
        return sessionEndTime;
    }

    /**
     * Define el valor de la propiedad sessionEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeField }
     *     
     */
    public void setSessionEndTime(TimeField value) {
        this.sessionEndTime = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfSystemCycles.
     * 
     * @return
     *     possible object is
     *     {@link IntegerField }
     *     
     */
    public IntegerField getNumberOfSystemCycles() {
        return numberOfSystemCycles;
    }

    /**
     * Define el valor de la propiedad numberOfSystemCycles.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerField }
     *     
     */
    public void setNumberOfSystemCycles(IntegerField value) {
        this.numberOfSystemCycles = value;
    }

    /**
     * Obtiene el valor de la propiedad systemKeyInteger.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getSystemKeyInteger() {
        return systemKeyInteger;
    }

    /**
     * Define el valor de la propiedad systemKeyInteger.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setSystemKeyInteger(String4Field value) {
        this.systemKeyInteger = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionStatus.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getSessionStatus() {
        return sessionStatus;
    }

    /**
     * Define el valor de la propiedad sessionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setSessionStatus(String4Field value) {
        this.sessionStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad lastSecurityToken.
     * 
     * @return
     *     possible object is
     *     {@link IntegerField }
     *     
     */
    public IntegerField getLastSecurityToken() {
        return lastSecurityToken;
    }

    /**
     * Define el valor de la propiedad lastSecurityToken.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerField }
     *     
     */
    public void setLastSecurityToken(IntegerField value) {
        this.lastSecurityToken = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionType.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getSessionType() {
        return sessionType;
    }

    /**
     * Define el valor de la propiedad sessionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setSessionType(String4Field value) {
        this.sessionType = value;
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setProductId(String4Field value) {
        this.productId = value;
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
     * Obtiene el valor de la propiedad clientNetworkAddress.
     * 
     * @return
     *     possible object is
     *     {@link String20Field }
     *     
     */
    public String20Field getClientNetworkAddress() {
        return clientNetworkAddress;
    }

    /**
     * Define el valor de la propiedad clientNetworkAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String20Field }
     *     
     */
    public void setClientNetworkAddress(String20Field value) {
        this.clientNetworkAddress = value;
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
