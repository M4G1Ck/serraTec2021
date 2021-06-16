package com.residencia.ecommerce.controllers;

import com.residencia.ecommerce.dto.AtualizaPedido;
import com.residencia.ecommerce.dto.FinalizaPedido;
import com.residencia.ecommerce.dto.PedidoDTO;
import com.residencia.ecommerce.dto.RealizaPedido;
import com.residencia.ecommerce.entities.Pedido;
import com.residencia.ecommerce.responses.ResponseHandlerDelete;
import com.residencia.ecommerce.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    //Cadastro
    @PostMapping("/realizar-pedido")
    public ResponseEntity<Object> pedido (@RequestBody RealizaPedido realizaPedido){
        HttpHeaders headers = new HttpHeaders();
        PedidoDTO novoPedido = pedidoService.pedido(realizaPedido);

        if (null != novoPedido){
            return new ResponseEntity<>(novoPedido, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, headers, HttpStatus.BAD_REQUEST);
        }
    }

    //Finalizar pedido
    @PutMapping("/finalizar-pedido/{id}")
    public ResponseEntity<Object> atualizar(@RequestBody FinalizaPedido finalizaPedido, @PathVariable Integer id){
        Boolean pedidoFinalizado = pedidoService.finalizaPedido(finalizaPedido, id);
        if (pedidoFinalizado) {
            return ResponseHandlerDelete.generateResponse("Pedido finalizado, você receberá um email em alguns instantes com informações sobre seu pedido!", HttpStatus.OK);
        }
        else {
            return ResponseHandlerDelete.generateResponse("Pedido não encontrado!", HttpStatus.BAD_REQUEST);
        }

    }

    //Deletar
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Pedido> delete(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        boolean isRemoved = pedidoService.delete(id);
        if (isRemoved) {
            return new ResponseEntity<>(headers, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    //Atualizar
    @PutMapping("/update/{id}")
    public ResponseEntity<PedidoDTO> update(@Valid @RequestBody AtualizaPedido atualizaPedido, @PathVariable Integer id){
        PedidoDTO pedidoAtualizado = pedidoService.atualizar(atualizaPedido, id);
        HttpHeaders headers = new HttpHeaders();
        if (null != pedidoAtualizado){
            return new ResponseEntity<>(pedidoAtualizado, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, headers, HttpStatus.BAD_REQUEST);
        }
    }

    //Buscar todos
    @GetMapping("/buscar-todos")
    public ResponseEntity<List<PedidoDTO>> buscaTodos(){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(pedidoService.listarTodos(), headers, HttpStatus.OK);
    }





}
