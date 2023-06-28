//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.28 a las 04:43:10 PM ART 
//


package com.example.correoargentino.afipservice.wsdl;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para persona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="persona"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actividad" type="{http://a4.soap.ws.server.puc.sr/}actividad" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantidadSociosEmpresaMono" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="categoria" type="{http://a4.soap.ws.server.puc.sr/}categoria" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="claveInactivaAsociada" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dependencia" type="{http://a4.soap.ws.server.puc.sr/}dependencia" minOccurs="0"/&gt;
 *         &lt;element name="domicilio" type="{http://a4.soap.ws.server.puc.sr/}domicilio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://a4.soap.ws.server.puc.sr/}email" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="estadoClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaContratoSocial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaFallecimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaJubilado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimientoMigracion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="formaJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPersona" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="impuesto" type="{http://a4.soap.ws.server.puc.sr/}impuesto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="leyJubilacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="localidadInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mesCierre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organismoInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organismoOriginante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="porcentajeCapitalNacional" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="provinciaInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regimen" type="{http://a4.soap.ws.server.puc.sr/}regimen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relacion" type="{http://a4.soap.ws.server.puc.sr/}relacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://a4.soap.ws.server.puc.sr/}telefono" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tipoClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoOrganismoOriginante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persona", propOrder = {
    "actividad",
    "apellido",
    "cantidadSociosEmpresaMono",
    "categoria",
    "claveInactivaAsociada",
    "dependencia",
    "domicilio",
    "email",
    "estadoClave",
    "fechaContratoSocial",
    "fechaFallecimiento",
    "fechaInscripcion",
    "fechaJubilado",
    "fechaNacimiento",
    "fechaVencimientoMigracion",
    "formaJuridica",
    "idPersona",
    "impuesto",
    "leyJubilacion",
    "localidadInscripcion",
    "mesCierre",
    "nombre",
    "numeroDocumento",
    "numeroInscripcion",
    "organismoInscripcion",
    "organismoOriginante",
    "porcentajeCapitalNacional",
    "provinciaInscripcion",
    "razonSocial",
    "regimen",
    "relacion",
    "sexo",
    "telefono",
    "tipoClave",
    "tipoDocumento",
    "tipoOrganismoOriginante",
    "tipoPersona",
    "tipoResidencia"
})

@ToString
public class Persona {

    @XmlElement(nillable = true)
    protected List<Actividad> actividad;
    protected String apellido;
    protected Integer cantidadSociosEmpresaMono;
    @XmlElement(nillable = true)
    protected List<Categoria> categoria;
    @XmlElement(nillable = true)
    protected List<Long> claveInactivaAsociada;
    protected Dependencia dependencia;
    @XmlElement(nillable = true)
    protected List<Domicilio> domicilio;
    @XmlElement(nillable = true)
    protected List<Email> email;
    protected String estadoClave;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaContratoSocial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFallecimiento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInscripcion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaJubilado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoMigracion;
    protected String formaJuridica;
    protected Long idPersona;
    @XmlElement(nillable = true)
    protected List<Impuesto> impuesto;
    protected Integer leyJubilacion;
    protected String localidadInscripcion;
    protected Integer mesCierre;
    protected String nombre;
    protected String numeroDocumento;
    protected String numeroInscripcion;
    protected String organismoInscripcion;
    protected String organismoOriginante;
    protected Double porcentajeCapitalNacional;
    protected String provinciaInscripcion;
    protected String razonSocial;
    @XmlElement(nillable = true)
    protected List<Regimen> regimen;
    @XmlElement(nillable = true)
    protected List<Relacion> relacion;
    protected String sexo;
    @XmlElement(nillable = true)
    protected List<Telefono> telefono;
    protected String tipoClave;
    protected String tipoDocumento;
    protected String tipoOrganismoOriginante;
    protected String tipoPersona;
    protected String tipoResidencia;

    /**
     * Gets the value of the actividad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actividad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActividad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Actividad }
     * 
     * 
     */
    public List<Actividad> getActividad() {
        if (actividad == null) {
            actividad = new ArrayList<Actividad>();
        }
        return this.actividad;
    }

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadSociosEmpresaMono.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadSociosEmpresaMono() {
        return cantidadSociosEmpresaMono;
    }

    /**
     * Define el valor de la propiedad cantidadSociosEmpresaMono.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadSociosEmpresaMono(Integer value) {
        this.cantidadSociosEmpresaMono = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Categoria }
     * 
     * 
     */
    public List<Categoria> getCategoria() {
        if (categoria == null) {
            categoria = new ArrayList<Categoria>();
        }
        return this.categoria;
    }

    /**
     * Gets the value of the claveInactivaAsociada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claveInactivaAsociada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaveInactivaAsociada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getClaveInactivaAsociada() {
        if (claveInactivaAsociada == null) {
            claveInactivaAsociada = new ArrayList<Long>();
        }
        return this.claveInactivaAsociada;
    }

    /**
     * Obtiene el valor de la propiedad dependencia.
     * 
     * @return
     *     possible object is
     *     {@link Dependencia }
     *     
     */
    public Dependencia getDependencia() {
        return dependencia;
    }

    /**
     * Define el valor de la propiedad dependencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Dependencia }
     *     
     */
    public void setDependencia(Dependencia value) {
        this.dependencia = value;
    }

    /**
     * Gets the value of the domicilio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domicilio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomicilio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Domicilio }
     * 
     * 
     */
    public List<Domicilio> getDomicilio() {
        if (domicilio == null) {
            domicilio = new ArrayList<Domicilio>();
        }
        return this.domicilio;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<Email>();
        }
        return this.email;
    }

    /**
     * Obtiene el valor de la propiedad estadoClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoClave() {
        return estadoClave;
    }

    /**
     * Define el valor de la propiedad estadoClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoClave(String value) {
        this.estadoClave = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaContratoSocial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaContratoSocial() {
        return fechaContratoSocial;
    }

    /**
     * Define el valor de la propiedad fechaContratoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaContratoSocial(XMLGregorianCalendar value) {
        this.fechaContratoSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFallecimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    /**
     * Define el valor de la propiedad fechaFallecimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFallecimiento(XMLGregorianCalendar value) {
        this.fechaFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Define el valor de la propiedad fechaInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInscripcion(XMLGregorianCalendar value) {
        this.fechaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaJubilado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaJubilado() {
        return fechaJubilado;
    }

    /**
     * Define el valor de la propiedad fechaJubilado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaJubilado(XMLGregorianCalendar value) {
        this.fechaJubilado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoMigracion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoMigracion() {
        return fechaVencimientoMigracion;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoMigracion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoMigracion(XMLGregorianCalendar value) {
        this.fechaVencimientoMigracion = value;
    }

    /**
     * Obtiene el valor de la propiedad formaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaJuridica() {
        return formaJuridica;
    }

    /**
     * Define el valor de la propiedad formaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaJuridica(String value) {
        this.formaJuridica = value;
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
     * Gets the value of the impuesto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impuesto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpuesto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Impuesto }
     * 
     * 
     */
    public List<Impuesto> getImpuesto() {
        if (impuesto == null) {
            impuesto = new ArrayList<Impuesto>();
        }
        return this.impuesto;
    }

    /**
     * Obtiene el valor de la propiedad leyJubilacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeyJubilacion() {
        return leyJubilacion;
    }

    /**
     * Define el valor de la propiedad leyJubilacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeyJubilacion(Integer value) {
        this.leyJubilacion = value;
    }

    /**
     * Obtiene el valor de la propiedad localidadInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidadInscripcion() {
        return localidadInscripcion;
    }

    /**
     * Define el valor de la propiedad localidadInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidadInscripcion(String value) {
        this.localidadInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad mesCierre.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMesCierre() {
        return mesCierre;
    }

    /**
     * Define el valor de la propiedad mesCierre.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMesCierre(Integer value) {
        this.mesCierre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    /**
     * Define el valor de la propiedad numeroInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroInscripcion(String value) {
        this.numeroInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad organismoInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganismoInscripcion() {
        return organismoInscripcion;
    }

    /**
     * Define el valor de la propiedad organismoInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganismoInscripcion(String value) {
        this.organismoInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad organismoOriginante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganismoOriginante() {
        return organismoOriginante;
    }

    /**
     * Define el valor de la propiedad organismoOriginante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganismoOriginante(String value) {
        this.organismoOriginante = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeCapitalNacional.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPorcentajeCapitalNacional() {
        return porcentajeCapitalNacional;
    }

    /**
     * Define el valor de la propiedad porcentajeCapitalNacional.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPorcentajeCapitalNacional(Double value) {
        this.porcentajeCapitalNacional = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaInscripcion() {
        return provinciaInscripcion;
    }

    /**
     * Define el valor de la propiedad provinciaInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaInscripcion(String value) {
        this.provinciaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the regimen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regimen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegimen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Regimen }
     * 
     * 
     */
    public List<Regimen> getRegimen() {
        if (regimen == null) {
            regimen = new ArrayList<Regimen>();
        }
        return this.regimen;
    }

    /**
     * Gets the value of the relacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Relacion }
     * 
     * 
     */
    public List<Relacion> getRelacion() {
        if (relacion == null) {
            relacion = new ArrayList<Relacion>();
        }
        return this.relacion;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telefono }
     * 
     * 
     */
    public List<Telefono> getTelefono() {
        if (telefono == null) {
            telefono = new ArrayList<Telefono>();
        }
        return this.telefono;
    }

    /**
     * Obtiene el valor de la propiedad tipoClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoClave() {
        return tipoClave;
    }

    /**
     * Define el valor de la propiedad tipoClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoClave(String value) {
        this.tipoClave = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOrganismoOriginante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOrganismoOriginante() {
        return tipoOrganismoOriginante;
    }

    /**
     * Define el valor de la propiedad tipoOrganismoOriginante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOrganismoOriginante(String value) {
        this.tipoOrganismoOriginante = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoResidencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoResidencia() {
        return tipoResidencia;
    }

    /**
     * Define el valor de la propiedad tipoResidencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoResidencia(String value) {
        this.tipoResidencia = value;
    }

}
