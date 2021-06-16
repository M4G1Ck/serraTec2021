package com.residencia.ecommerce.responses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandlerDelete {
    public static ResponseEntity<Object> generateResponse(String mensagem, HttpStatus status) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Mensagem", mensagem);
        map.put("Status", status.value());
        return new ResponseEntity<Object>(map,status);
    }

}

