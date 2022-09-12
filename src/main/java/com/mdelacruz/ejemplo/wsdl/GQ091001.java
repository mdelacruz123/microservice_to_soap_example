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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GQ091001 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GQ091001"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeDmArgumentBlockGQ091001Subset0001" type="{www.gedmargumentblockgq091001subset0001.issuer.aci.com}GeDmArgumentBlockGQ091001Subset0001"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GQ091001", namespace = "www.gq091001.issuer.aci.com", propOrder = {
    "geDmArgumentBlockGQ091001Subset0001"
})
public class GQ091001 {

    @XmlElement(name = "GeDmArgumentBlockGQ091001Subset0001", required = true)
    protected GeDmArgumentBlockGQ091001Subset0001 geDmArgumentBlockGQ091001Subset0001;

    /**
     * Obtiene el valor de la propiedad geDmArgumentBlockGQ091001Subset0001.
     * 
     * @return
     *     possible object is
     *     {@link GeDmArgumentBlockGQ091001Subset0001 }
     *     
     */
    public GeDmArgumentBlockGQ091001Subset0001 getGeDmArgumentBlockGQ091001Subset0001() {
        return geDmArgumentBlockGQ091001Subset0001;
    }

    /**
     * Define el valor de la propiedad geDmArgumentBlockGQ091001Subset0001.
     * 
     * @param value
     *     allowed object is
     *     {@link GeDmArgumentBlockGQ091001Subset0001 }
     *     
     */
    public void setGeDmArgumentBlockGQ091001Subset0001(GeDmArgumentBlockGQ091001Subset0001 value) {
        this.geDmArgumentBlockGQ091001Subset0001 = value;
    }

}
