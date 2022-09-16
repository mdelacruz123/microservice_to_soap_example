//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.15 a las 06:09:43 PM COT 
//


package com.mdelacruz.ejemplo.wsdl.gq001002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GR001002" type="{www.gr001002.issuer.aci.com}GR001002"/&gt;
 *         &lt;element name="luwMessage" type="{www.luwmessage.issuer.aci.com}luwMessage"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gr001002",
    "luwMessage"
})
@XmlRootElement(name = "responseMessage", namespace = "www.gq001002.response.issuer.aci.com")
public class ResponseMessage {

    @XmlElement(name = "GR001002", namespace = "www.gq001002.response.issuer.aci.com", required = true, nillable = true)
    protected GR001002 gr001002;
    @XmlElement(namespace = "www.gq001002.response.issuer.aci.com", required = true)
    protected LuwMessage luwMessage;

    /**
     * Obtiene el valor de la propiedad gr001002.
     * 
     * @return
     *     possible object is
     *     {@link GR001002 }
     *     
     */
    public GR001002 getGR001002() {
        return gr001002;
    }

    /**
     * Define el valor de la propiedad gr001002.
     * 
     * @param value
     *     allowed object is
     *     {@link GR001002 }
     *     
     */
    public void setGR001002(GR001002 value) {
        this.gr001002 = value;
    }

    /**
     * Obtiene el valor de la propiedad luwMessage.
     * 
     * @return
     *     possible object is
     *     {@link LuwMessage }
     *     
     */
    public LuwMessage getLuwMessage() {
        return luwMessage;
    }

    /**
     * Define el valor de la propiedad luwMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link LuwMessage }
     *     
     */
    public void setLuwMessage(LuwMessage value) {
        this.luwMessage = value;
    }

}
