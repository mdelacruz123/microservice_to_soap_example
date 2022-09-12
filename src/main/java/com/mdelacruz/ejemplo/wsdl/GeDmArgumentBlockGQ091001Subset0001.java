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
 * <p>Clase Java para GeDmArgumentBlockGQ091001Subset0001 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeDmArgumentBlockGQ091001Subset0001"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="key1" type="{www.string256field.issuer.aci.com}String256Field"/&gt;
 *         &lt;element name="code1" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *         &lt;element name="text1" type="{www.string80field.issuer.aci.com}String80Field"/&gt;
 *         &lt;element name="text2" type="{www.string80field.issuer.aci.com}String80Field"/&gt;
 *         &lt;element name="code2" type="{www.string4field.issuer.aci.com}String4Field"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeDmArgumentBlockGQ091001Subset0001", namespace = "www.gedmargumentblockgq091001subset0001.issuer.aci.com", propOrder = {

})
public class GeDmArgumentBlockGQ091001Subset0001 {

    @XmlElement(required = true)
    protected String256Field key1;
    @XmlElement(required = true)
    protected String4Field code1;
    @XmlElement(required = true)
    protected String80Field text1;
    @XmlElement(required = true)
    protected String80Field text2;
    @XmlElement(required = true)
    protected String4Field code2;

    /**
     * Obtiene el valor de la propiedad key1.
     * 
     * @return
     *     possible object is
     *     {@link String256Field }
     *     
     */
    public String256Field getKey1() {
        return key1;
    }

    /**
     * Define el valor de la propiedad key1.
     * 
     * @param value
     *     allowed object is
     *     {@link String256Field }
     *     
     */
    public void setKey1(String256Field value) {
        this.key1 = value;
    }

    /**
     * Obtiene el valor de la propiedad code1.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getCode1() {
        return code1;
    }

    /**
     * Define el valor de la propiedad code1.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setCode1(String4Field value) {
        this.code1 = value;
    }

    /**
     * Obtiene el valor de la propiedad text1.
     * 
     * @return
     *     possible object is
     *     {@link String80Field }
     *     
     */
    public String80Field getText1() {
        return text1;
    }

    /**
     * Define el valor de la propiedad text1.
     * 
     * @param value
     *     allowed object is
     *     {@link String80Field }
     *     
     */
    public void setText1(String80Field value) {
        this.text1 = value;
    }

    /**
     * Obtiene el valor de la propiedad text2.
     * 
     * @return
     *     possible object is
     *     {@link String80Field }
     *     
     */
    public String80Field getText2() {
        return text2;
    }

    /**
     * Define el valor de la propiedad text2.
     * 
     * @param value
     *     allowed object is
     *     {@link String80Field }
     *     
     */
    public void setText2(String80Field value) {
        this.text2 = value;
    }

    /**
     * Obtiene el valor de la propiedad code2.
     * 
     * @return
     *     possible object is
     *     {@link String4Field }
     *     
     */
    public String4Field getCode2() {
        return code2;
    }

    /**
     * Define el valor de la propiedad code2.
     * 
     * @param value
     *     allowed object is
     *     {@link String4Field }
     *     
     */
    public void setCode2(String4Field value) {
        this.code2 = value;
    }

}
