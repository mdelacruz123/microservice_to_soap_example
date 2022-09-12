//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.06 a las 09:41:28 AM COT 
//


package com.mdelacruz.ejemplo.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para String30Field complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="String30Field"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
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
@XmlType(name = "String30Field", namespace = "www.string30field.issuer.aci.com", propOrder = {
    "value",
    "outboundFlags"
})
public class String30Field {

    @XmlElement(required = true, nillable = true)
    protected String value;
    @XmlElementRef(name = "outboundFlags", namespace = "www.string30field.issuer.aci.com", type = JAXBElement.class, required = false)
    protected JAXBElement<OutboundFlagType> outboundFlags;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
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
