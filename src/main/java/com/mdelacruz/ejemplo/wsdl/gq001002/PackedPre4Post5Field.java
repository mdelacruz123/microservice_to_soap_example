//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.12 a las 05:24:43 PM COT 
//


package com.mdelacruz.ejemplo.wsdl.gq001002;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Clase Java para PackedPre4Post5Field complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PackedPre4Post5Field"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;pattern value="(\+|\-){0,1}\d{1,4}(\.\d{1,5}){0,1}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="outboundFlags" type="{www.outboundflagtype.issuer.aci.com}outboundFlagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackedPre4Post5Field", namespace = "www.packedpre4post5field.issuer.aci.com", propOrder = {
    "value",
    "outboundFlags"
})
public class PackedPre4Post5Field {

    @XmlElement(required = true, nillable = true)
    protected BigDecimal value;
    @XmlElementRef(name = "outboundFlags", namespace = "www.packedpre4post5field.issuer.aci.com", type = JAXBElement.class, required = false)
    protected JAXBElement<OutboundFlagType> outboundFlags;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad outboundFlags.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OutboundFlagType }{@code >}
     *     
     */
    public JAXBElement<OutboundFlagType> getOutboundFlags() {
        return outboundFlags;
    }

    /**
     * Define el valor de la propiedad outboundFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OutboundFlagType }{@code >}
     *     
     */
    public void setOutboundFlags(JAXBElement<OutboundFlagType> value) {
        this.outboundFlags = value;
    }

}
