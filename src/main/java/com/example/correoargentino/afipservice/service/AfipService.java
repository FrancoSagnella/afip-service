package com.example.correoargentino.afipservice.service;

import com.example.correoargentino.afipservice.response.AfipResponse;
import org.springframework.stereotype.Service;

@Service
public class AfipService {

    //Este servicio deberia comunicarse con el servicio de AFIP por SOAP
    public AfipResponse getData (String cuit_cuil){
        AfipResponse afipResponse = new AfipResponse();
        return afipResponse;
    }
}
