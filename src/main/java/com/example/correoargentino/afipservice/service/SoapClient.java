package com.example.correoargentino.afipservice.service;

import com.example.correoargentino.afipservice.wsdl.*;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {
    /*Aca se llaman los métodos del servicio soap que consumimos*/

    // Tanto token como string se generan mandandole nuestro certificado al servicio WSAA
    // https://www.afip.gob.ar/ws/WSAA/WSAAmanualDev.pdf
    private String token = "";
    private String sign = "";
    // https://www.afip.gob.ar/ws/ws_sr_padron_a4/manual_ws_sr_padron_a4_v1.3.pdf
    private Long cuitRepresentada;

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

    // Esta clase no se probo el funcionamiiiento, falta conseguir el token y el sign para ello
    public Persona getPersona(long idPersona){
        GetPersona personaRequest = new GetPersona();

        personaRequest.setToken(token);
        personaRequest.setSign(sign);
        personaRequest.setCuitRepresentada(cuitRepresentada);
        personaRequest.setIdPersona(idPersona);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://a4.soap.ws.server.puc.sr/getPersona");

        ObjectFactory of = new ObjectFactory();
        JAXBElement<GetPersona> reqjaxb = of.createGetPersona(personaRequest);

        JAXBElement<GetPersonaResponse> personaResponse = (JAXBElement<GetPersonaResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(
                        "https://awshomo.afip.gov.ar/sr-padron/webservices/personaServiceA4",
                        reqjaxb,
                        soapActionCallback);

        PersonaReturn personaReturn = personaResponse.getValue().getPersonaReturn();

        return personaReturn.getPersona();
    }
}
