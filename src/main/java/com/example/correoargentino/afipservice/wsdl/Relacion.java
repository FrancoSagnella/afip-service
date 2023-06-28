//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.28 a las 04:43:10 PM ART 
//


package com.example.correoargentino.afipservice.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para relacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="relacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ffRelacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ffVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idPersona" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idPersonaAsociada" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="subtipoRelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoRelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relacion", propOrder = {
    "ffRelacion",
    "ffVencimiento",
    "idPersona",
    "idPersonaAsociada",
    "subtipoRelacion",
    "tipoRelacion"
})
public class Relacion {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ffRelacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ffVencimiento;
    protected Long idPersona;
    protected Long idPersonaAsociada;
    protected String subtipoRelacion;
    protected String tipoRelacion;

    /**
     * Obtiene el valor de la propiedad ffRelacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFfRelacion() {
        return ffRelacion;
    }

    /**
     * Define el valor de la propiedad ffRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFfRelacion(XMLGregorianCalendar value) {
        this.ffRelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ffVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFfVencimiento() {
        return ffVencimiento;
    }

    /**
     * Define el valor de la propiedad ffVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFfVencimiento(XMLGregorianCalendar value) {
        this.ffVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersona.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPersona() {
        return idPersona;
    }

    /**
     * Define el valor de la propiedad idPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPersona(Long value) {
        this.idPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersonaAsociada.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPersonaAsociada() {
        return idPersonaAsociada;
    }

    /**
     * Define el valor de la propiedad idPersonaAsociada.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPersonaAsociada(Long value) {
        this.idPersonaAsociada = value;
    }

    /**
     * Obtiene el valor de la propiedad subtipoRelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtipoRelacion() {
        return subtipoRelacion;
    }

    /**
     * Define el valor de la propiedad subtipoRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtipoRelacion(String value) {
        this.subtipoRelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRelacion() {
        return tipoRelacion;
    }

    /**
     * Define el valor de la propiedad tipoRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRelacion(String value) {
        this.tipoRelacion = value;
    }

}
