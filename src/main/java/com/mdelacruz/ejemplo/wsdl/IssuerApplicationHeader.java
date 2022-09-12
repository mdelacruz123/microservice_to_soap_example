//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.06 a las 09:41:28 AM COT 
//


package com.mdelacruz.ejemplo.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para issuerApplicationHeader complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="issuerApplicationHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sessionId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;fractionDigits value="0"/&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="endAuthenticationId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="controllingAuthenticationId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="auditIdentifier" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contextFunction"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NDAT- Not Required"/&gt;
 *               &lt;enumeration value="PAN - Primary Account Number"/&gt;
 *               &lt;enumeration value="ARN - Account Reference Number"/&gt;
 *               &lt;enumeration value="IAN - Account System Key"/&gt;
 *               &lt;enumeration value="INST- Institution ID"/&gt;
 *               &lt;enumeration value="AGMT- Agreement System Key"/&gt;
 *               &lt;enumeration value="CUST- Customer System Key"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contextParameter" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "issuerApplicationHeader", namespace = "www.issuerapplicationheader.issuer.aci.com", propOrder = {
    "sessionId",
    "endAuthenticationId",
    "controllingAuthenticationId",
    "auditIdentifier",
    "contextFunction",
    "contextParameter"
})
public class IssuerApplicationHeader {

    @XmlElement(required = true)
    protected BigDecimal sessionId;
    @XmlElementRef(name = "endAuthenticationId", namespace = "www.issuerapplicationheader.issuer.aci.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endAuthenticationId;
    @XmlElementRef(name = "controllingAuthenticationId", namespace = "www.issuerapplicationheader.issuer.aci.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> controllingAuthenticationId;
    @XmlElementRef(name = "auditIdentifier", namespace = "www.issuerapplicationheader.issuer.aci.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auditIdentifier;
    @XmlElement(required = true)
    protected String contextFunction;
    @XmlElementRef(name = "contextParameter", namespace = "www.issuerapplicationheader.issuer.aci.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contextParameter;

    /**
     * Obtiene el valor de la propiedad sessionId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSessionId() {
        return sessionId;
    }

    /**
     * Define el valor de la propiedad sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSessionId(BigDecimal value) {
        this.sessionId = value;
    }

    /**
     * Obtiene el valor de la propiedad endAuthenticationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndAuthenticationId() {
        return endAuthenticationId;
    }

    /**
     * Define el valor de la propiedad endAuthenticationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndAuthenticationId(JAXBElement<String> value) {
        this.endAuthenticationId = value;
    }

    /**
     * Obtiene el valor de la propiedad controllingAuthenticationId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getControllingAuthenticationId() {
        return controllingAuthenticationId;
    }

    /**
     * Define el valor de la propiedad controllingAuthenticationId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setControllingAuthenticationId(JAXBElement<String> value) {
        this.controllingAuthenticationId = value;
    }

    /**
     * Obtiene el valor de la propiedad auditIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuditIdentifier() {
        return auditIdentifier;
    }

    /**
     * Define el valor de la propiedad auditIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuditIdentifier(JAXBElement<String> value) {
        this.auditIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad contextFunction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextFunction() {
        return contextFunction;
    }

    /**
     * Define el valor de la propiedad contextFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextFunction(String value) {
        this.contextFunction = value;
    }

    /**
     * Obtiene el valor de la propiedad contextParameter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContextParameter() {
        return contextParameter;
    }

    /**
     * Define el valor de la propiedad contextParameter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContextParameter(JAXBElement<String> value) {
        this.contextParameter = value;
    }

}
