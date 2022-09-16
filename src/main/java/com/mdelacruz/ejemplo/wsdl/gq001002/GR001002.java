//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.15 a las 06:09:43 PM COT 
//


package com.mdelacruz.ejemplo.wsdl.gq001002;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GR001002 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GR001002"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="repeatingGroupOut_1"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="repeatingGroupInstanceOut_1" maxOccurs="9999" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="GeDmInstitution" type="{www.gedminstitution.issuer.aci.com}GeDmInstitution"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "GR001002", namespace = "www.gr001002.issuer.aci.com", propOrder = {
    "repeatingGroupOut1"
})
public class GR001002 {

    @XmlElement(name = "repeatingGroupOut_1", required = true)
    protected GR001002 .RepeatingGroupOut1 repeatingGroupOut1;

    /**
     * Obtiene el valor de la propiedad repeatingGroupOut1.
     * 
     * @return
     *     possible object is
     *     {@link GR001002 .RepeatingGroupOut1 }
     *     
     */
    public GR001002 .RepeatingGroupOut1 getRepeatingGroupOut1() {
        return repeatingGroupOut1;
    }

    /**
     * Define el valor de la propiedad repeatingGroupOut1.
     * 
     * @param value
     *     allowed object is
     *     {@link GR001002 .RepeatingGroupOut1 }
     *     
     */
    public void setRepeatingGroupOut1(GR001002 .RepeatingGroupOut1 value) {
        this.repeatingGroupOut1 = value;
    }


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
     *         &lt;element name="repeatingGroupInstanceOut_1" maxOccurs="9999" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="GeDmInstitution" type="{www.gedminstitution.issuer.aci.com}GeDmInstitution"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "repeatingGroupInstanceOut1"
    })
    public static class RepeatingGroupOut1 {

        @XmlElement(name = "repeatingGroupInstanceOut_1", namespace = "www.gr001002.issuer.aci.com")
        protected List<GR001002 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1> repeatingGroupInstanceOut1;

        /**
         * Gets the value of the repeatingGroupInstanceOut1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the repeatingGroupInstanceOut1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRepeatingGroupInstanceOut1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GR001002 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 }
         * 
         * 
         */
        public List<GR001002 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1> getRepeatingGroupInstanceOut1() {
            if (repeatingGroupInstanceOut1 == null) {
                repeatingGroupInstanceOut1 = new ArrayList<GR001002 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1>();
            }
            return this.repeatingGroupInstanceOut1;
        }


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
         *         &lt;element name="GeDmInstitution" type="{www.gedminstitution.issuer.aci.com}GeDmInstitution"/&gt;
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
            "geDmInstitution"
        })
        public static class RepeatingGroupInstanceOut1 {

            @XmlElement(name = "GeDmInstitution", namespace = "www.gr001002.issuer.aci.com", required = true)
            protected GeDmInstitution geDmInstitution;

            /**
             * Obtiene el valor de la propiedad geDmInstitution.
             * 
             * @return
             *     possible object is
             *     {@link GeDmInstitution }
             *     
             */
            public GeDmInstitution getGeDmInstitution() {
                return geDmInstitution;
            }

            /**
             * Define el valor de la propiedad geDmInstitution.
             * 
             * @param value
             *     allowed object is
             *     {@link GeDmInstitution }
             *     
             */
            public void setGeDmInstitution(GeDmInstitution value) {
                this.geDmInstitution = value;
            }

        }

    }

}
