package com.residencia.ecommerce.controllers;

import com.residencia.ecommerce.entities.Categoria;
import com.residencia.ecommerce.responses.ResponseHandler;
import com.residencia.ecommerce.responses.ResponseHandlerDelete;
import com.residencia.ecommerce.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    //Buscar por id
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Categoria> buscarPorNome(@PathVariable Integer id) throws CategoriaNotFoundException {
        HttpHeaders headers = new HttpHeaders();
        Categoria novaCategoria = categoriaService.buscarPorId(id);
        if(novaCategoria != null)
            return new ResponseEntity<>(novaCategoria, headers, HttpStatus.OK);
        else
            throw new CategoriaNotFoundException(id);
    }

    //Buscar todos
    @GetMapping("/buscar-todos")
    public ResponseEntity<List<Categoria>> buscarTodos(){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(categoriaService.buscarTodos(), headers, HttpStatus.OK);
    }

    //Cadastrar
   @PostMapping("/cadastrar")
    public ResponseEntity<Categoria> salvar(@RequestBody Categoria categoria) {
        HttpHeaders headers = new HttpHeaders();
        Categoria novaCategoria = categoriaService.cadastro(categoria);
        if(novaCategoria != null)
            return new ResponseEntity<>(novaCategoria, headers, HttpStatus.OK);
        else
            return new ResponseEntity<>(novaCategoria, headers, HttpStatus.BAD_REQUEST);

    }

    //Atualizar
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Categoria> atualizar(@PathVariable Integer id, @RequestBody Categoria categoria){
        HttpHeaders headers = new HttpHeaders();
        if(categoriaService.update(id, categoria))
            return new ResponseEntity<>(categoriaService.buscarPorId(id), headers, HttpStatus.OK);
        else
            return new ResponseEntity<>(categoriaService.buscarPorId(id), headers, HttpStatus.BAD_REQUEST);
    }

    //Deletar
    @DeleteMapping("/deletar/{id}")
    public  ResponseEntity<Object> delete (@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        boolean deletada = categoriaService.deletar(id);
        if (deletada) {
            return ResponseHandlerDelete.generateResponse("Categoria deletada com sucesso!", HttpStatus.OK);
        }
        else {
            return ResponseHandlerDelete.generateResponse("Categoria não encontrada.", HttpStatus.BAD_REQUEST);
        }
    }

}
