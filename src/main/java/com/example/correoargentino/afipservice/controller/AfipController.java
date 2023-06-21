package com.example.correoargentino.afipservice.controller;

import com.example.correoargentino.afipservice.AfipServiceApplication;
import com.example.correoargentino.afipservice.request.AfipRequest;
import com.example.correoargentino.afipservice.response.AfipResponse;
import com.example.correoargentino.afipservice.service.AfipService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping(value = "v1/afip", produces = MediaType.APPLICATION_JSON_VALUE)
public class AfipController {

    private final AfipService afipService;

    @PostMapping("")
    public ResponseEntity<AfipResponse> payment(@RequestBody AfipRequest request){
        log.info("executing afip post");
        var response = afipService.getData(request.getCuit_cuil());
        return ResponseEntity.ok(response);
    }
}
