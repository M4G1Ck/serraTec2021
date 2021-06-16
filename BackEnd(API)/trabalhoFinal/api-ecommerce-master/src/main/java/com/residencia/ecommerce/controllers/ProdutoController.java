package com.residencia.ecommerce.controllers;

import com.residencia.ecommerce.dto.ProdutoDTO;
import com.residencia.ecommerce.entities.Produto;
import com.residencia.ecommerce.responses.ResponseHandlerDelete;
import com.residencia.ecommerce.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;



    @GetMapping("/buscar-todos")
    public ResponseEntity<List<ProdutoDTO>> buscarTodos(){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(produtoService.buscaTodos(), headers, HttpStatus.OK);
    }

    //Buscar por ID
    @GetMapping("/buscar-id/{nome}")
    public ResponseEntity<ProdutoDTO> retornaUmProduto(@PathVariable String nome){
        ProdutoDTO produto = produtoService.buscaProdutoNome(nome);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(produto, headers, HttpStatus.OK);
    }

    //Cadastrar produto
    @PostMapping("/cadastrar")
    public ResponseEntity<ProdutoDTO> adicionaProduto(@RequestBody Produto produto){
        HttpHeaders headers = new HttpHeaders();
        ProdutoDTO novoProduto = produtoService.cadastro(produto);

        if (null != novoProduto){
            return new ResponseEntity<>(novoProduto, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, headers, HttpStatus.BAD_REQUEST);
        }
    }

    //Atualizar produto
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<ProdutoDTO> atualizar (@PathVariable Integer id, @RequestBody Produto produto){
        HttpHeaders headers = new HttpHeaders();
        ProdutoDTO produtoAtualizado = produtoService.update(produto, id);
        return new ResponseEntity<>(produtoAtualizado, headers, HttpStatus.OK);
    }

    //Deletar produto
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Object> delete(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        boolean deletado = produtoService.deletaProduto(id);
        if (deletado) {
            return ResponseHandlerDelete.generateResponse("Produto deletado com sucesso!", HttpStatus.OK);
        }
        else {
            return ResponseHandlerDelete.generateResponse("Produto não encontrado.", HttpStatus.BAD_REQUEST);
        }
    }
}
