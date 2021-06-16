package com.residencia.ecommerce.controllers;

import com.residencia.ecommerce.dto.CadastroCliente;
import com.residencia.ecommerce.dto.LoginCliente;
import com.residencia.ecommerce.entities.Cliente;
import com.residencia.ecommerce.responses.ResponseHandler;
import com.residencia.ecommerce.responses.ResponseHandlerDelete;
import com.residencia.ecommerce.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    //Cadastro
    @PostMapping("/cadastrar")
    public ResponseEntity<Object> cadastrar(@RequestBody CadastroCliente cadastroCliente){
        HttpHeaders headers = new HttpHeaders();
        CadastroCliente novoCliente = clienteService.cadastro(cadastroCliente);

        if (null != novoCliente){
            return new ResponseEntity<>(novoCliente, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, headers, HttpStatus.BAD_REQUEST);
        }
    }

    //Update
    @PutMapping("/atualizar/{id}")
    public Cliente update(@RequestBody CadastroCliente cadastro, @PathVariable Integer id){
        return clienteService.update(cadastro, id);
    }

    //Deletar conta
    @DeleteMapping("/deletar/{id}")
    public  ResponseEntity<Object> delete (@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        boolean deletada = clienteService.delete(id);
        if (deletada) {
            return ResponseHandlerDelete.generateResponse("Conta deletada com sucesso!", HttpStatus.OK);
        }
        else {
            return ResponseHandlerDelete.generateResponse("Conta não encontrada.", HttpStatus.BAD_REQUEST);
        }
    }
    
    //Login 
    @PostMapping("/login")
    public ResponseEntity<Object> login (@RequestBody LoginCliente login){

        HttpHeaders headers = new HttpHeaders();
        Cliente cliente = clienteService.checaEmail(login);

        if (cliente == null){
            return ResponseHandler.generateResponse("Email não encontrado!", HttpStatus.BAD_REQUEST, null);
        } else {
            if (cliente.getSenha().equals(login.getSenha())){
                return ResponseHandler.generateResponse("Login realizado com sucesso!", HttpStatus.OK, cliente);
            } else  {
                return ResponseHandler.generateResponse("Senha incorreta!", HttpStatus.BAD_REQUEST, null);
            }
        }
    }
}
