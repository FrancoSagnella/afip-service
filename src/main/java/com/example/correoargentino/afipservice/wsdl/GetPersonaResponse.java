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
 * <p>Clase Java para getPersonaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPersonaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personaReturn" type="{http://a4.soap.ws.server.puc.sr/}personaReturn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonaResponse", propOrder = {
    "personaReturn"
})
public class GetPersonaResponse {

    protected PersonaReturn personaReturn;

    /**
     * Obtiene el valor de la propiedad personaReturn.
     * 
     * @return
     *     possible object is
     *     {@link PersonaReturn }
     *     
     */
    public PersonaReturn getPersonaReturn() {
        return personaReturn;
    }

    /**
     * Define el valor de la propiedad personaReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaReturn }
     *     
     */
    public void setPersonaReturn(PersonaReturn value) {
        this.personaReturn = value;
    }

}
