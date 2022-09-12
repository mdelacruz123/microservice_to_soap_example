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
 * <p>Clase Java para GeDmGroupGR091001Subset0001 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeDmGroupGR091001Subset0001"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="displayLastLoginDetails" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
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
@XmlType(name = "GeDmGroupGR091001Subset0001", namespace = "www.gedmgroupgr091001subset0001.issuer.aci.com", propOrder = {

})
public class GeDmGroupGR091001Subset0001 {

    @XmlElement(required = true)
    protected String4Field displayLastLoginDetails;
    @XmlElement(required = true)
    protected SmallIntField lastUpdateNo;

    /**
     * Obtiene el valor de la propiedad displayLastLoginDetails.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getDisplayLastLoginDetails() {
        return displayLastLoginDetails;
    }

    /**
     * Define el valor de la propiedad displayLastLoginDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setDisplayLastLoginDetails(String4Field value) {
        this.displayLastLoginDetails = value;
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
