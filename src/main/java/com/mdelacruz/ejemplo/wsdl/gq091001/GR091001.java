//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.15 a las 06:09:42 PM COT 
//


package com.mdelacruz.ejemplo.wsdl.gq091001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GR091001 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GR091001"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeDmSignOnProfile" type="{www.gedmsignonprofile.issuer.aci.com}GeDmSignOnProfile"/&gt;
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
 *                             &lt;element name="GeDmInstitutionGR091001Subset0001" type="{www.gedminstitutiongr091001subset0001.issuer.aci.com}GeDmInstitutionGR091001Subset0001"/&gt;
 *                             &lt;element name="repeatingGroupOut_1_1"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="repeatingGroupInstanceOut_1_1" maxOccurs="9999" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="GeDmCompoundFunction" type="{www.gedmcompoundfunction.issuer.aci.com}GeDmCompoundFunction"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="repeatingGroupOut_2"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="repeatingGroupInstanceOut_2" maxOccurs="9999" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="GeDmGroupGR091001Subset0001" type="{www.gedmgroupgr091001subset0001.issuer.aci.com}GeDmGroupGR091001Subset0001"/&gt;
 *                             &lt;element name="GeDmUserGR091001Subset0001" type="{www.gedmusergr091001subset0001.issuer.aci.com}GeDmUserGR091001Subset0001"/&gt;
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
@XmlType(name = "GR091001", namespace = "www.gr091001.issuer.aci.com", propOrder = {
    "geDmSignOnProfile",
    "repeatingGroupOut1",
    "repeatingGroupOut2"
})
public class GR091001 {

    @XmlElement(name = "GeDmSignOnProfile", required = true)
    protected GeDmSignOnProfile geDmSignOnProfile;
    @XmlElement(name = "repeatingGroupOut_1", required = true)
    protected GR091001 .RepeatingGroupOut1 repeatingGroupOut1;
    @XmlElement(name = "repeatingGroupOut_2", required = true)
    protected GR091001 .RepeatingGroupOut2 repeatingGroupOut2;

    /**
     * Obtiene el valor de la propiedad geDmSignOnProfile.
     * 
     * @return
     *     possible object is
     *     {@link GeDmSignOnProfile }
     *     
     */
    public GeDmSignOnProfile getGeDmSignOnProfile() {
        return geDmSignOnProfile;
    }

    /**
     * Define el valor de la propiedad geDmSignOnProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link GeDmSignOnProfile }
     *     
     */
    public void setGeDmSignOnProfile(GeDmSignOnProfile value) {
        this.geDmSignOnProfile = value;
    }

    /**
     * Obtiene el valor de la propiedad repeatingGroupOut1.
     * 
     * @return
     *     possible object is
     *     {@link GR091001 .RepeatingGroupOut1 }
     *     
     */
    public GR091001 .RepeatingGroupOut1 getRepeatingGroupOut1() {
        return repeatingGroupOut1;
    }

    /**
     * Define el valor de la propiedad repeatingGroupOut1.
     * 
     * @param value
     *     allowed object is
     *     {@link GR091001 .RepeatingGroupOut1 }
     *     
     */
    public void setRepeatingGroupOut1(GR091001 .RepeatingGroupOut1 value) {
        this.repeatingGroupOut1 = value;
    }

    /**
     * Obtiene el valor de la propiedad repeatingGroupOut2.
     * 
     * @return
     *     possible object is
     *     {@link GR091001 .RepeatingGroupOut2 }
     *     
     */
    public GR091001 .RepeatingGroupOut2 getRepeatingGroupOut2() {
        return repeatingGroupOut2;
    }

    /**
     * Define el valor de la propiedad repeatingGroupOut2.
     * 
     * @param value
     *     allowed object is
     *     {@link GR091001 .RepeatingGroupOut2 }
     *     
     */
    public void setRepeatingGroupOut2(GR091001 .RepeatingGroupOut2 value) {
        this.repeatingGroupOut2 = value;
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
     *                   &lt;element name="GeDmInstitutionGR091001Subset0001" type="{www.gedminstitutiongr091001subset0001.issuer.aci.com}GeDmInstitutionGR091001Subset0001"/&gt;
     *                   &lt;element name="repeatingGroupOut_1_1"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="repeatingGroupInstanceOut_1_1" maxOccurs="9999" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="GeDmCompoundFunction" type="{www.gedmcompoundfunction.issuer.aci.com}GeDmCompoundFunction"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
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
    @XmlType(name = "", propOrder = {
        "repeatingGroupInstanceOut1"
    })
    public static class RepeatingGroupOut1 {

        @XmlElement(name = "repeatingGroupInstanceOut_1", namespace = "www.gr091001.issuer.aci.com")
        protected List<GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1> repeatingGroupInstanceOut1;

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
         * {@link GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 }
         * 
         * 
         */
        public List<GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1> getRepeatingGroupInstanceOut1() {
            if (repeatingGroupInstanceOut1 == null) {
                repeatingGroupInstanceOut1 = new ArrayList<GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1>();
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
         *         &lt;element name="GeDmInstitutionGR091001Subset0001" type="{www.gedminstitutiongr091001subset0001.issuer.aci.com}GeDmInstitutionGR091001Subset0001"/&gt;
         *         &lt;element name="repeatingGroupOut_1_1"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="repeatingGroupInstanceOut_1_1" maxOccurs="9999" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="GeDmCompoundFunction" type="{www.gedmcompoundfunction.issuer.aci.com}GeDmCompoundFunction"/&gt;
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
        @XmlType(name = "", propOrder = {
            "geDmInstitutionGR091001Subset0001",
            "repeatingGroupOut11"
        })
        public static class RepeatingGroupInstanceOut1 {

            @XmlElement(name = "GeDmInstitutionGR091001Subset0001", namespace = "www.gr091001.issuer.aci.com", required = true)
            protected GeDmInstitutionGR091001Subset0001 geDmInstitutionGR091001Subset0001;
            @XmlElement(name = "repeatingGroupOut_1_1", namespace = "www.gr091001.issuer.aci.com", required = true)
            protected GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 .RepeatingGroupOut11 repeatingGroupOut11;

            /**
             * Obtiene el valor de la propiedad geDmInstitutionGR091001Subset0001.
             * 
             * @return
             *     possible object is
             *     {@link GeDmInstitutionGR091001Subset0001 }
             *     
             */
            public GeDmInstitutionGR091001Subset0001 getGeDmInstitutionGR091001Subset0001() {
                return geDmInstitutionGR091001Subset0001;
            }

            /**
             * Define el valor de la propiedad geDmInstitutionGR091001Subset0001.
             * 
             * @param value
             *     allowed object is
             *     {@link GeDmInstitutionGR091001Subset0001 }
             *     
             */
            public void setGeDmInstitutionGR091001Subset0001(GeDmInstitutionGR091001Subset0001 value) {
                this.geDmInstitutionGR091001Subset0001 = value;
            }

            /**
             * Obtiene el valor de la propiedad repeatingGroupOut11.
             * 
             * @return
             *     possible object is
             *     {@link GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 .RepeatingGroupOut11 }
             *     
             */
            public GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 .RepeatingGroupOut11 getRepeatingGroupOut11() {
                return repeatingGroupOut11;
            }

            /**
             * Define el valor de la propiedad repeatingGroupOut11.
             * 
             * @param value
             *     allowed object is
             *     {@link GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 .RepeatingGroupOut11 }
             *     
             */
            public void setRepeatingGroupOut11(GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 .RepeatingGroupOut11 value) {
                this.repeatingGroupOut11 = value;
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
             *         &lt;element name="repeatingGroupInstanceOut_1_1" maxOccurs="9999" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="GeDmCompoundFunction" type="{www.gedmcompoundfunction.issuer.aci.com}GeDmCompoundFunction"/&gt;
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
                "repeatingGroupInstanceOut11"
            })
            public static class RepeatingGroupOut11 {

                @XmlElement(name = "repeatingGroupInstanceOut_1_1", namespace = "www.gr091001.issuer.aci.com")
                protected List<GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 .RepeatingGroupOut11 .RepeatingGroupInstanceOut11> repeatingGroupInstanceOut11;

                /**
                 * Gets the value of the repeatingGroupInstanceOut11 property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the repeatingGroupInstanceOut11 property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRepeatingGroupInstanceOut11().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 .RepeatingGroupOut11 .RepeatingGroupInstanceOut11 }
                 * 
                 * 
                 */
                public List<GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 .RepeatingGroupOut11 .RepeatingGroupInstanceOut11> getRepeatingGroupInstanceOut11() {
                    if (repeatingGroupInstanceOut11 == null) {
                        repeatingGroupInstanceOut11 = new ArrayList<GR091001 .RepeatingGroupOut1 .RepeatingGroupInstanceOut1 .RepeatingGroupOut11 .RepeatingGroupInstanceOut11>();
                    }
                    return this.repeatingGroupInstanceOut11;
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
                 *         &lt;element name="GeDmCompoundFunction" type="{www.gedmcompoundfunction.issuer.aci.com}GeDmCompoundFunction"/&gt;
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
                    "geDmCompoundFunction"
                })
                public static class RepeatingGroupInstanceOut11 {

                    @XmlElement(name = "GeDmCompoundFunction", namespace = "www.gr091001.issuer.aci.com", required = true)
                    protected GeDmCompoundFunction geDmCompoundFunction;

                    /**
                     * Obtiene el valor de la propiedad geDmCompoundFunction.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GeDmCompoundFunction }
                     *     
                     */
                    public GeDmCompoundFunction getGeDmCompoundFunction() {
                        return geDmCompoundFunction;
                    }

                    /**
                     * Define el valor de la propiedad geDmCompoundFunction.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GeDmCompoundFunction }
                     *     
                     */
                    public void setGeDmCompoundFunction(GeDmCompoundFunction value) {
                        this.geDmCompoundFunction = value;
                    }

                }

            }

        }

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
     *         &lt;element name="repeatingGroupInstanceOut_2" maxOccurs="9999" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="GeDmGroupGR091001Subset0001" type="{www.gedmgroupgr091001subset0001.issuer.aci.com}GeDmGroupGR091001Subset0001"/&gt;
     *                   &lt;element name="GeDmUserGR091001Subset0001" type="{www.gedmusergr091001subset0001.issuer.aci.com}GeDmUserGR091001Subset0001"/&gt;
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
        "repeatingGroupInstanceOut2"
    })
    public static class RepeatingGroupOut2 {

        @XmlElement(name = "repeatingGroupInstanceOut_2", namespace = "www.gr091001.issuer.aci.com")
        protected List<GR091001 .RepeatingGroupOut2 .RepeatingGroupInstanceOut2> repeatingGroupInstanceOut2;

        /**
         * Gets the value of the repeatingGroupInstanceOut2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the repeatingGroupInstanceOut2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRepeatingGroupInstanceOut2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GR091001 .RepeatingGroupOut2 .RepeatingGroupInstanceOut2 }
         * 
         * 
         */
        public List<GR091001 .RepeatingGroupOut2 .RepeatingGroupInstanceOut2> getRepeatingGroupInstanceOut2() {
            if (repeatingGroupInstanceOut2 == null) {
                repeatingGroupInstanceOut2 = new ArrayList<GR091001 .RepeatingGroupOut2 .RepeatingGroupInstanceOut2>();
            }
            return this.repeatingGroupInstanceOut2;
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
         *         &lt;element name="GeDmGroupGR091001Subset0001" type="{www.gedmgroupgr091001subset0001.issuer.aci.com}GeDmGroupGR091001Subset0001"/&gt;
         *         &lt;element name="GeDmUserGR091001Subset0001" type="{www.gedmusergr091001subset0001.issuer.aci.com}GeDmUserGR091001Subset0001"/&gt;
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
            "geDmGroupGR091001Subset0001",
            "geDmUserGR091001Subset0001"
        })
        public static class RepeatingGroupInstanceOut2 {

            @XmlElement(name = "GeDmGroupGR091001Subset0001", namespace = "www.gr091001.issuer.aci.com", required = true)
            protected GeDmGroupGR091001Subset0001 geDmGroupGR091001Subset0001;
            @XmlElement(name = "GeDmUserGR091001Subset0001", namespace = "www.gr091001.issuer.aci.com", required = true)
            protected GeDmUserGR091001Subset0001 geDmUserGR091001Subset0001;

            /**
             * Obtiene el valor de la propiedad geDmGroupGR091001Subset0001.
             * 
             * @return
             *     possible object is
             *     {@link GeDmGroupGR091001Subset0001 }
             *     
             */
            public GeDmGroupGR091001Subset0001 getGeDmGroupGR091001Subset0001() {
                return geDmGroupGR091001Subset0001;
            }

            /**
             * Define el valor de la propiedad geDmGroupGR091001Subset0001.
             * 
             * @param value
             *     allowed object is
             *     {@link GeDmGroupGR091001Subset0001 }
             *     
             */
            public void setGeDmGroupGR091001Subset0001(GeDmGroupGR091001Subset0001 value) {
                this.geDmGroupGR091001Subset0001 = value;
            }

            /**
             * Obtiene el valor de la propiedad geDmUserGR091001Subset0001.
             * 
             * @return
             *     possible object is
             *     {@link GeDmUserGR091001Subset0001 }
             *     
             */
            public GeDmUserGR091001Subset0001 getGeDmUserGR091001Subset0001() {
                return geDmUserGR091001Subset0001;
            }

            /**
             * Define el valor de la propiedad geDmUserGR091001Subset0001.
             * 
             * @param value
             *     allowed object is
             *     {@link GeDmUserGR091001Subset0001 }
             *     
             */
            public void setGeDmUserGR091001Subset0001(GeDmUserGR091001Subset0001 value) {
                this.geDmUserGR091001Subset0001 = value;
            }

        }

    }

}
