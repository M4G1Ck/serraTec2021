package com.residencia.ecommerce.responses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> generateResponse(String mensagem, HttpStatus status, Object responseObj) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Mensagem", mensagem);
        map.put("Status", status.value());
        map.put("Dados", responseObj);

        return new ResponseEntity<Object>(map,status);
    }
}
