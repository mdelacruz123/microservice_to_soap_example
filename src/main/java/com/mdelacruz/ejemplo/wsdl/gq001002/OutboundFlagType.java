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
import java.math.BigDecimal;


/**
 * Outbound Flags Definition
 * 
 * <p>Clase Java para outboundFlagType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="outboundFlagType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;fractionDigits value="0"/&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="updateableIndicator"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="displayableIndicator"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
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
@XmlType(name = "outboundFlagType", namespace = "www.outboundflagtype.issuer.aci.com", propOrder = {
    "errorNumber",
    "updateableIndicator",
    "displayableIndicator"
})
public class OutboundFlagType {

    @XmlElement(required = true)
    protected BigDecimal errorNumber;
    protected boolean updateableIndicator;
    protected boolean displayableIndicator;

    /**
     * Obtiene el valor de la propiedad errorNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getErrorNumber() {
        return errorNumber;
    }

    /**
     * Define el valor de la propiedad errorNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setErrorNumber(BigDecimal value) {
        this.errorNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad updateableIndicator.
     * 
     */
    public boolean isUpdateableIndicator() {
        return updateableIndicator;
    }

    /**
     * Define el valor de la propiedad updateableIndicator.
     * 
     */
    public void setUpdateableIndicator(boolean value) {
        this.updateableIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad displayableIndicator.
     * 
     */
    public boolean isDisplayableIndicator() {
        return displayableIndicator;
    }

    /**
     * Define el valor de la propiedad displayableIndicator.
     * 
     */
    public void setDisplayableIndicator(boolean value) {
        this.displayableIndicator = value;
    }

}
