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
 *         &lt;element name="GR091001" type="{www.gr091001.issuer.aci.com}GR091001"/&gt;
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
    "gr091001",
    "luwMessage"
})
@XmlRootElement(name = "responseMessage", namespace = "www.gq091001.response.issuer.aci.com")
public class ResponseMessage {

    @XmlElement(name = "GR091001", namespace = "www.gq091001.response.issuer.aci.com", required = true, nillable = true)
    protected GR091001 gr091001;
    @XmlElement(namespace = "www.gq091001.response.issuer.aci.com", required = true)
    protected LuwMessage luwMessage;

    /**
     * Obtiene el valor de la propiedad gr091001.
     * 
     * @return
     *     possible object is
     *     {@link GR091001 }
     *     
     */
    public GR091001 getGR091001() {
        return gr091001;
    }

    /**
     * Define el valor de la propiedad gr091001.
     * 
     * @param value
     *     allowed object is
     *     {@link GR091001 }
     *     
     */
    public void setGR091001(GR091001 value) {
        this.gr091001 = value;
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
