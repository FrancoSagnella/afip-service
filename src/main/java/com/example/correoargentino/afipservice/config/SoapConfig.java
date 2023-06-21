package com.example.correoargentino.afipservice.config;

import com.example.correoargentino.afipservice.service.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {
    /*Esta configuración es necesaria para transformar el XML a objetos java y viceversa*/
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.correoargentino.afipservice.wsdl");
        return marshaller;
    }
    @Bean
    public SoapClient getSoapClient(Jaxb2Marshaller marshaller) {
        SoapClient soapClient = new SoapClient();
        soapClient.setDefaultUri("https://awshomo.afip.gov.ar/sr-padron/webservices/personaServiceA4");
        soapClient.setMarshaller(marshaller);
        soapClient.setUnmarshaller(marshaller);
        return soapClient;
    }

}
