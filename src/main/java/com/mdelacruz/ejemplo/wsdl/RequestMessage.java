//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.06 a las 09:41:28 AM COT 
//


package com.mdelacruz.ejemplo.wsdl;

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
 *         &lt;element name="issuerApplicationHeader" type="{www.issuerapplicationheader.issuer.aci.com}issuerApplicationHeader"/&gt;
 *         &lt;element name="GQ091001" type="{www.gq091001.issuer.aci.com}GQ091001"/&gt;
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
    "issuerApplicationHeader",
    "gq091001"
})
@XmlRootElement(name = "requestMessage", namespace = "www.gq091001.request.issuer.aci.com")
public class RequestMessage {

    @XmlElement(namespace = "www.gq091001.request.issuer.aci.com", required = true)
    protected IssuerApplicationHeader issuerApplicationHeader;
    @XmlElement(name = "GQ091001", namespace = "www.gq091001.request.issuer.aci.com", required = true)
    protected GQ091001 gq091001;

    /**
     * Obtiene el valor de la propiedad issuerApplicationHeader.
     * 
     * @return
     *     possible object is
     *     {@link IssuerApplicationHeader }
     *     
     */
    public IssuerApplicationHeader getIssuerApplicationHeader() {
        return issuerApplicationHeader;
    }

    /**
     * Define el valor de la propiedad issuerApplicationHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerApplicationHeader }
     *     
     */
    public void setIssuerApplicationHeader(IssuerApplicationHeader value) {
        this.issuerApplicationHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad gq091001.
     * 
     * @return
     *     possible object is
     *     {@link GQ091001 }
     *     
     */
    public GQ091001 getGQ091001() {
        return gq091001;
    }

    /**
     * Define el valor de la propiedad gq091001.
     * 
     * @param value
     *     allowed object is
     *     {@link GQ091001 }
     *     
     */
    public void setGQ091001(GQ091001 value) {
        this.gq091001 = value;
    }

}
