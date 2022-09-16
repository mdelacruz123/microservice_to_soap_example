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
 * <p>Clase Java para GeDmCompoundFunction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeDmCompoundFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="functionId" type="{www.string6field.issuer.aci.com}String6Field"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeDmCompoundFunction", namespace = "www.gedmcompoundfunction.issuer.aci.com", propOrder = {

})
public class GeDmCompoundFunction {

    @XmlElement(required = true)
    protected String6Field functionId;

    /**
     * Obtiene el valor de la propiedad functionId.
     * 
     * @return
     *     possible object is
     *     {@link String6Field }
     *     
     */
    public String6Field getFunctionId() {
        return functionId;
    }

    /**
     * Define el valor de la propiedad functionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String6Field }
     *     
     */
    public void setFunctionId(String6Field value) {
        this.functionId = value;
    }

}
