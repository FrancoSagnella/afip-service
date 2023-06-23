package com.example.correoargentino.afipservice.controller;

import com.example.correoargentino.afipservice.AfipServiceApplication;
import com.example.correoargentino.afipservice.request.AfipRequest;
import com.example.correoargentino.afipservice.response.AfipResponse;
import com.example.correoargentino.afipservice.service.AfipService;
import com.example.correoargentino.afipservice.service.SoapClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping(value = "v1/afip", produces = MediaType.APPLICATION_JSON_VALUE)
public class AfipController {

    //private final AfipService afipService;
    private final SoapClient soapClient;

    // Para realizar pruebas: https://www.afip.gob.ar/ws/ws_sr_padron_a4/datos-prueba-padron-a4.txt
    @PostMapping("")
    public ResponseEntity<?> getPersona(@RequestBody AfipRequest request){
        log.info("executing afip post");
        var response = soapClient.getPersona(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/serverStatus")
    public ResponseEntity<?> getWsStatus(){
        var response = soapClient.getDummyResponse().getAppserver();
        return ResponseEntity.ok(response);
    }
}
