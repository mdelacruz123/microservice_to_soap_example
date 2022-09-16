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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GeDmUserGR091001Subset0001 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeDmUserGR091001Subset0001"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="lastSignOnDate" type="{www.datefield.issuer.aci.com}DateField"/&gt;
 *         &lt;element name="lastUpdateNo" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="invalidSignOnAttempts" type="{www.smallintfield.issuer.aci.com}SmallIntField"/&gt;
 *         &lt;element name="lastSignOnTime" type="{www.timefield.issuer.aci.com}TimeField"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeDmUserGR091001Subset0001", propOrder = {

})
public class GeDmUserGR091001Subset0001 {

    @XmlElement(required = true)
    protected DateField lastSignOnDate;
    @XmlElement(required = true)
    protected SmallIntField lastUpdateNo;
    @XmlElement(required = true)
    protected SmallIntField invalidSignOnAttempts;
    @XmlElement(required = true)
    protected TimeField lastSignOnTime;

    /**
     * Obtiene el valor de la propiedad lastSignOnDate.
     * 
     * @return
     *     possible object is
     *     {@link DateField }
     *     
     */
    public DateField getLastSignOnDate() {
        return lastSignOnDate;
    }

    /**
     * Define el valor de la propiedad lastSignOnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateField }
     *     
     */
    public void setLastSignOnDate(DateField value) {
        this.lastSignOnDate = value;
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

    /**
     * Obtiene el valor de la propiedad invalidSignOnAttempts.
     * 
     * @return
     *     possible object is
     *     {@link SmallIntField }
     *     
     */
    public SmallIntField getInvalidSignOnAttempts() {
        return invalidSignOnAttempts;
    }

    /**
     * Define el valor de la propiedad invalidSignOnAttempts.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallIntField }
     *     
     */
    public void setInvalidSignOnAttempts(SmallIntField value) {
        this.invalidSignOnAttempts = value;
    }

    /**
     * Obtiene el valor de la propiedad lastSignOnTime.
     * 
     * @return
     *     possible object is
     *     {@link TimeField }
     *     
     */
    public TimeField getLastSignOnTime() {
        return lastSignOnTime;
    }

    /**
     * Define el valor de la propiedad lastSignOnTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeField }
     *     
     */
    public void setLastSignOnTime(TimeField value) {
        this.lastSignOnTime = value;
    }

}
