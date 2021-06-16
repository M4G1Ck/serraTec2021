package com.residencia.ecommerce.controllers;

import com.residencia.ecommerce.dto.ArquivosDTO;
import com.residencia.ecommerce.entities.Produto;
import com.residencia.ecommerce.repositories.ProdutoRepository;
import com.residencia.ecommerce.services.ArquivosService;
import com.residencia.ecommerce.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping("/arquivos")
public class ArquivosController {

    @Autowired
    ArquivosService arquivosService;

    @Autowired
    ProdutoService produtoService;

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/uploadFile/{idProduto}")
    public ArquivosDTO uploadFile(@RequestParam("file") MultipartFile file, @PathVariable Integer idProduto) {
        String fileName = arquivosService.salvarImagem(file);
        Produto produto = produtoRepository.getById(idProduto);
        produto.setImagem(file.getOriginalFilename());
        produtoService.update(produto,idProduto);



        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/arquivos/downloadFile/")
                .path(fileName)
                .toUriString();

        return new ArquivosDTO(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }

    @PostMapping("/deleteFile")
    public boolean deleteFile(@RequestParam("file") String file) {
        return arquivosService.deleteFile(file);
    }
}