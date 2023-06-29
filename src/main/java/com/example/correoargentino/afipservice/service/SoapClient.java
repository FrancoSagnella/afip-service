package com.example.correoargentino.afipservice.service;

import com.example.correoargentino.afipservice.request.AfipRequest;
import com.example.correoargentino.afipservice.response.AfipResponse;
import com.example.correoargentino.afipservice.wsdl.*;
import jakarta.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class SoapClient extends WebServiceGatewaySupport {
    /*Aca se llaman los métodos del servicio soap que consumimos*/

    // Tanto token como string se generan mandandole nuestro certificado al servicio WSAA
    // https://www.afip.gob.ar/ws/WSAA/WSAAmanualDev.pdf
    private String token = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9InllcyI/Pgo8c3NvIHZlcnNpb249IjIuMCI+CiAgICA8aWQgc3JjPSJDTj13c2FhaG9tbywgTz1BRklQLCBDPUFSLCBTRVJJQUxOVU1CRVI9Q1VJVCAzMzY5MzQ1MDIzOSIgdW5pcXVlX2lkPSIyNjY5NDk1MzU3IiBnZW5fdGltZT0iMTY4ODA1NTIwOCIgZXhwX3RpbWU9IjE2ODgwOTg0NjgiLz4KICAgIDxvcGVyYXRpb24gdHlwZT0ibG9naW4iIHZhbHVlPSJncmFudGVkIj4KICAgICAgICA8bG9naW4gZW50aXR5PSIzMzY5MzQ1MDIzOSIgc2VydmljZT0id3Nfc3JfcGFkcm9uX2E0IiB1aWQ9IlNFUklBTE5VTUJFUj1DVUlUIDIwNDQyNTU3NDIwLCBDTj1wcnVlYmEiIGF1dGhtZXRob2Q9ImNtcyIgcmVnbWV0aG9kPSIyMiI+CiAgICAgICAgICAgIDxyZWxhdGlvbnM+CiAgICAgICAgICAgICAgICA8cmVsYXRpb24ga2V5PSIyMDQ0MjU1NzQyMCIgcmVsdHlwZT0iNCIvPgogICAgICAgICAgICA8L3JlbGF0aW9ucz4KICAgICAgICA8L2xvZ2luPgogICAgPC9vcGVyYXRpb24+Cjwvc3NvPgo=";
    private String sign = "jpZPoOjgIepVeqq4IxEPzLCFlcNrmN8qrX6KHG+RBGIGRhfBn0vVbkdHB+sRNUQU69ntOp6kpEQe73sbULKSS7nOzlaJj6Ec/CP9lAd6aBrBs+gDlXu3DtbZq08sD5P3VjpfERnQUz3mefOJkx1FTeN3RNlq4EQ9Rr6snbHtR28=";
    // https://www.afip.gob.ar/ws/ws_sr_padron_a4/manual_ws_sr_padron_a4_v1.3.pdf
    private Long cuitRepresentada = 20442557420L;

    /**
     * Esta clase muestra el estado del servicio
     * @return OK/ERROR
     */
    public DummyReturn getDummyResponse(){
        Dummy dummyRequest = new Dummy();

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://a4.soap.ws.server.puc.sr/dummy");

        ObjectFactory of = new ObjectFactory();
        JAXBElement<Dummy> reqjaxb = of.createDummy(dummyRequest);

        JAXBElement<DummyResponse> dummyResponse = (JAXBElement<DummyResponse>) getWebServiceTemplate()
                .marshalSendAndReceive("https://awshomo.afip.gov.ar/sr-padron/webservices/personaServiceA4",
                        reqjaxb,
                        soapActionCallback);

        DummyReturn dummyReturn = dummyResponse.getValue().getReturn();

        return dummyReturn;
    }

    public AfipResponse getPersona(AfipRequest afipRequest){
        GetPersona personaRequest = new GetPersona();

        personaRequest.setToken(token);
        personaRequest.setSign(sign);
        personaRequest.setCuitRepresentada(cuitRepresentada);
        personaRequest.setIdPersona(afipRequest.getCuit_cuil());

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://a4.soap.ws.server.puc.sr/getPersona");

        ObjectFactory of = new ObjectFactory();
        JAXBElement<GetPersona> reqjaxb = of.createGetPersona(personaRequest);

        JAXBElement<GetPersonaResponse> personaResponse = (JAXBElement<GetPersonaResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(
                        "https://awshomo.afip.gov.ar/sr-padron/webservices/personaServiceA4",
                        reqjaxb,
                        soapActionCallback);
//        GetPersonaResponse personaResponse = (GetPersonaResponse) getWebServiceTemplate()
//                .marshalSendAndReceive(
//                        "https://awshomo.afip.gov.ar/sr-padron/webservices/personaServiceA4",
//                        personaRequest,
//                        soapActionCallback);

        PersonaReturn personaReturn = personaResponse.getValue().getPersonaReturn();
//        PersonaReturn personaReturn = personaResponse.getPersonaReturn();

        // Creo el dto que retorno
        Persona persona = personaReturn.getPersona();
        AfipResponse afipResponse = AfipResponse.builder()
                                        .nombre(persona.getNombre())
                                        .apellido(persona.getApellido())
                                        .dni(persona.getNumeroDocumento())
                                        .cuit(persona.getIdPersona()) // Checkear
                                        .telefono("") // Ver como sacarlo de getTelefono
                                        .provincia("") // Ver como sacarlo de getDomicilio() -> descripcionProvincia
                                        .localidad("") // Ver como sacarlo de getDomicilio() -> descripcionLocalidad
                                        .direccion("") // Ver como sacarlo de getDomicilio() -> direccion
                                        .codigo_postal("") // Ver como sacarlo de getDomicilio() -> codPostal
                                        .rubro("") // Ver como sacarlo de getActividad() -> descripcionActividad
                                        .condicion_impositiva("") // no se que es
                                        .build();

        return afipResponse;
//        return persona;
    }

}
