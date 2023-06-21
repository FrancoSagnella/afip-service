//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.21 a las 06:53:37 PM ART 
//


package com.example.correoargentino.afipservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actividad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actividad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcionActividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idActividad" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nomenclador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actividad", propOrder = {
    "descripcionActividad",
    "idActividad",
    "nomenclador",
    "orden",
    "periodo"
})
public class Actividad {

    protected String descripcionActividad;
    protected Long idActividad;
    protected Integer nomenclador;
    protected Integer orden;
    protected Integer periodo;

    /**
     * Obtiene el valor de la propiedad descripcionActividad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    /**
     * Define el valor de la propiedad descripcionActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionActividad(String value) {
        this.descripcionActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad idActividad.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdActividad() {
        return idActividad;
    }

    /**
     * Define el valor de la propiedad idActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdActividad(Long value) {
        this.idActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad nomenclador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNomenclador() {
        return nomenclador;
    }

    /**
     * Define el valor de la propiedad nomenclador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNomenclador(Integer value) {
        this.nomenclador = value;
    }

    /**
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrden(Integer value) {
        this.orden = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodo(Integer value) {
        this.periodo = value;
    }

}
