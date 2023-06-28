//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.28 a las 04:43:10 PM ART 
//


package com.example.correoargentino.afipservice.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para telefono complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="telefono"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tipoLinea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telefono", propOrder = {
    "numero",
    "tipoLinea",
    "tipoTelefono"
})
public class Telefono {

    protected Long numero;
    protected String tipoLinea;
    protected String tipoTelefono;

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumero(Long value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoLinea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLinea() {
        return tipoLinea;
    }

    /**
     * Define el valor de la propiedad tipoLinea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLinea(String value) {
        this.tipoLinea = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTelefono() {
        return tipoTelefono;
    }

    /**
     * Define el valor de la propiedad tipoTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTelefono(String value) {
        this.tipoTelefono = value;
    }

}
