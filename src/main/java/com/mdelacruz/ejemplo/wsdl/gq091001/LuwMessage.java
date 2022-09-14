//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.12 a las 05:24:42 PM COT 
//


package com.mdelacruz.ejemplo.wsdl.gq091001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para luwMessage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="luwMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;fractionDigits value="0"/&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="physicalErrorInformation"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="physicalResultCode"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="tableId"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="5"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="platform"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="furtherErrorInformationGroup"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="furtherErrorInformation" maxOccurs="4" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
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
@XmlType(name = "luwMessage", namespace = "www.luwmessage.issuer.aci.com", propOrder = {
    "errorNumber",
    "physicalErrorInformation",
    "furtherErrorInformationGroup"
})
public class LuwMessage {

    @XmlElement(required = true)
    protected BigDecimal errorNumber;
    @XmlElement(required = true)
    protected PhysicalErrorInformation physicalErrorInformation;
    @XmlElement(required = true)
    protected FurtherErrorInformationGroup furtherErrorInformationGroup;

    /**
     * Obtiene el valor de la propiedad errorNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getErrorNumber() {
        return errorNumber;
    }

    /**
     * Define el valor de la propiedad errorNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setErrorNumber(BigDecimal value) {
        this.errorNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad physicalErrorInformation.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalErrorInformation }
     *     
     */
    public PhysicalErrorInformation getPhysicalErrorInformation() {
        return physicalErrorInformation;
    }

    /**
     * Define el valor de la propiedad physicalErrorInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalErrorInformation }
     *     
     */
    public void setPhysicalErrorInformation(PhysicalErrorInformation value) {
        this.physicalErrorInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad furtherErrorInformationGroup.
     * 
     * @return
     *     possible object is
     *     {@link FurtherErrorInformationGroup }
     *     
     */
    public FurtherErrorInformationGroup getFurtherErrorInformationGroup() {
        return furtherErrorInformationGroup;
    }

    /**
     * Define el valor de la propiedad furtherErrorInformationGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link FurtherErrorInformationGroup }
     *     
     */
    public void setFurtherErrorInformationGroup(FurtherErrorInformationGroup value) {
        this.furtherErrorInformationGroup = value;
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
     *         &lt;element name="furtherErrorInformation" maxOccurs="4" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
        "furtherErrorInformation"
    })
    public static class FurtherErrorInformationGroup {

        @XmlElement(namespace = "www.luwmessage.issuer.aci.com")
        protected List<String> furtherErrorInformation;

        /**
         * Gets the value of the furtherErrorInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the furtherErrorInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFurtherErrorInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFurtherErrorInformation() {
            if (furtherErrorInformation == null) {
                furtherErrorInformation = new ArrayList<String>();
            }
            return this.furtherErrorInformation;
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
     *         &lt;element name="physicalResultCode"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="tableId"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="5"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="platform"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
        "physicalResultCode",
        "tableId",
        "platform"
    })
    public static class PhysicalErrorInformation {

        @XmlElement(namespace = "www.luwmessage.issuer.aci.com", required = true, nillable = true)
        protected String physicalResultCode;
        @XmlElement(namespace = "www.luwmessage.issuer.aci.com", required = true, nillable = true)
        protected String tableId;
        @XmlElement(namespace = "www.luwmessage.issuer.aci.com", required = true, nillable = true)
        protected String platform;

        /**
         * Obtiene el valor de la propiedad physicalResultCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhysicalResultCode() {
            return physicalResultCode;
        }

        /**
         * Define el valor de la propiedad physicalResultCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhysicalResultCode(String value) {
            this.physicalResultCode = value;
        }

        /**
         * Obtiene el valor de la propiedad tableId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableId() {
            return tableId;
        }

        /**
         * Define el valor de la propiedad tableId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableId(String value) {
            this.tableId = value;
        }

        /**
         * Obtiene el valor de la propiedad platform.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatform() {
            return platform;
        }

        /**
         * Define el valor de la propiedad platform.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatform(String value) {
            this.platform = value;
        }

    }

}
