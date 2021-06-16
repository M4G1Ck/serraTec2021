/*
package com.residencia.ecommerce.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsController {

    @ExceptionHandler(CategoriaNotFoundException.class)
    public ResponseEntity<String> trataCategoriaNotFound(CategoriaNotFoundException e){
        return ResponseEntity
                .notFound()
                .header("error-code", "CATEGORIA_NOT_FOUND")
                .header("error-value", String.valueOf.valueOf(e.getId()))
                .build();
    }

    @ExceptionHandler(ClienteNotFoundException.class)
    public ResponseEntity<String> trataClienteNotFound(ClienteNotFoundException e){
        return ResponseEntity
                .notFound()
                .header("error-code", "CLIENTE_NOT_FOUND")
                .header("error-value", String.valueOf(e.getId()))
                .build();
    }

    @ExceptionHandler(EnderecoNotFoundException.class)
    public ResponseEntity<String> trataEnderecoNotFound(EnderecoNotFoundException e) {
        return ResponseEntity
                .notFound()
                .header("error-code","ENDERECO_NOT_FOUND")
                .header("error-value", String.valueOf(e.getId()))
                .build();
    }

    @ExceptionHandler(PedidoProdutoNotFoundException.class)
    public ResponseEntity<String> trataPedidoNotFound(PedidoNotFoundException e){
        return ResponseEntity
                .notFound()
                .header("error-code", "PEDIDO_NOT_FOUND")
                .header("error-value", String.valueOf(e.getId()))
                .build();
    }

    @ExceptionHandler(ProdutoNotFoundException.class)
    public ResponseEntity<String> trataProdutoNotFound(ProdutoNotFoundException e) {
        return ResponseEntity
                .notFound()
                .header("error-code", "PRODUTO_NOT_FOUND")
                .header("error-value", String.valueOf(e.getId()))
                .build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> trataValidacao(MethodArgumentNotValidException e){
        return ResponseEntity
                .badRequest()
                .header("error-code", "REGISTRO_INVAIDO")
                .header("error-message", e.getMessage())
                .build();
    }
}
*/