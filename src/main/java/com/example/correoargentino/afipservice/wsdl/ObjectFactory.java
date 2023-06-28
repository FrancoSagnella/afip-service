//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.28 a las 04:43:10 PM ART 
//


package com.example.correoargentino.afipservice.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.correoargentino.afipservice.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Dummy_QNAME = new QName("http://a4.soap.ws.server.puc.sr/", "dummy");
    private final static QName _DummyResponse_QNAME = new QName("http://a4.soap.ws.server.puc.sr/", "dummyResponse");
    private final static QName _GetPersona_QNAME = new QName("http://a4.soap.ws.server.puc.sr/", "getPersona");
    private final static QName _GetPersonaResponse_QNAME = new QName("http://a4.soap.ws.server.puc.sr/", "getPersonaResponse");
    private final static QName _SRValidationException_QNAME = new QName("http://a4.soap.ws.server.puc.sr/", "SRValidationException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.correoargentino.afipservice.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dummy }
     * 
     */
    public Dummy createDummy() {
        return new Dummy();
    }

    /**
     * Create an instance of {@link DummyResponse }
     * 
     */
    public DummyResponse createDummyResponse() {
        return new DummyResponse();
    }

    /**
     * Create an instance of {@link GetPersona }
     * 
     */
    public GetPersona createGetPersona() {
        return new GetPersona();
    }

    /**
     * Create an instance of {@link GetPersonaResponse }
     * 
     */
    public GetPersonaResponse createGetPersonaResponse() {
        return new GetPersonaResponse();
    }

    /**
     * Create an instance of {@link SRValidationException }
     * 
     */
    public SRValidationException createSRValidationException() {
        return new SRValidationException();
    }

    /**
     * Create an instance of {@link DummyReturn }
     * 
     */
    public DummyReturn createDummyReturn() {
        return new DummyReturn();
    }

    /**
     * Create an instance of {@link PersonaReturn }
     * 
     */
    public PersonaReturn createPersonaReturn() {
        return new PersonaReturn();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Actividad }
     * 
     */
    public Actividad createActividad() {
        return new Actividad();
    }

    /**
     * Create an instance of {@link Categoria }
     * 
     */
    public Categoria createCategoria() {
        return new Categoria();
    }

    /**
     * Create an instance of {@link Dependencia }
     * 
     */
    public Dependencia createDependencia() {
        return new Dependencia();
    }

    /**
     * Create an instance of {@link Domicilio }
     * 
     */
    public Domicilio createDomicilio() {
        return new Domicilio();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link Impuesto }
     * 
     */
    public Impuesto createImpuesto() {
        return new Impuesto();
    }

    /**
     * Create an instance of {@link Regimen }
     * 
     */
    public Regimen createRegimen() {
        return new Regimen();
    }

    /**
     * Create an instance of {@link Relacion }
     * 
     */
    public Relacion createRelacion() {
        return new Relacion();
    }

    /**
     * Create an instance of {@link Telefono }
     * 
     */
    public Telefono createTelefono() {
        return new Telefono();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dummy }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Dummy }{@code >}
     */
    @XmlElementDecl(namespace = "http://a4.soap.ws.server.puc.sr/", name = "dummy")
    public JAXBElement<Dummy> createDummy(Dummy value) {
        return new JAXBElement<Dummy>(_Dummy_QNAME, Dummy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DummyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://a4.soap.ws.server.puc.sr/", name = "dummyResponse")
    public JAXBElement<DummyResponse> createDummyResponse(DummyResponse value) {
        return new JAXBElement<DummyResponse>(_DummyResponse_QNAME, DummyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersona }{@code >}
     */
    @XmlElementDecl(namespace = "http://a4.soap.ws.server.puc.sr/", name = "getPersona")
    public JAXBElement<GetPersona> createGetPersona(GetPersona value) {
        return new JAXBElement<GetPersona>(_GetPersona_QNAME, GetPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://a4.soap.ws.server.puc.sr/", name = "getPersonaResponse")
    public JAXBElement<GetPersonaResponse> createGetPersonaResponse(GetPersonaResponse value) {
        return new JAXBElement<GetPersonaResponse>(_GetPersonaResponse_QNAME, GetPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SRValidationException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SRValidationException }{@code >}
     */
    @XmlElementDecl(namespace = "http://a4.soap.ws.server.puc.sr/", name = "SRValidationException")
    public JAXBElement<SRValidationException> createSRValidationException(SRValidationException value) {
        return new JAXBElement<SRValidationException>(_SRValidationException_QNAME, SRValidationException.class, null, value);
    }

}
