package com.residencia.ecommerce.services;

import java.util.ArrayList;
import java.util.List;

import com.residencia.ecommerce.dto.ProdutoDTO;
import com.residencia.ecommerce.entities.Categoria;
import com.residencia.ecommerce.entities.Produto;
import com.residencia.ecommerce.repositories.ProdutoRepository;
import com.residencia.ecommerce.exceptions.ProdutoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    //Buscar produto pelo nome
    public ProdutoDTO buscaProdutoNome(String nome){

        ProdutoDTO produtoDTO = new ProdutoDTO();
        Produto produto = new Produto();
        produto = produtoRepository.findByNomeProduto(nome);

        return converte(produto);
    }

    //Busca todos
    public List<ProdutoDTO> buscaTodos(){
        List<ProdutoDTO> listaProdutosDto = new ArrayList<>();
        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos = produtoRepository.findAll();

        for (Produto produto : listaProdutos){
            listaProdutosDto.add(converte(produto));
        }

        return listaProdutosDto;
    }

    //Cadastrar produto
    public Produto cadastro (Produto produto) {
       return produtoRepository.save(produto);
    }

    //Update
    public ProdutoDTO update (Produto produto, Integer id) {
        produto.setIdProduto(id);
        produtoRepository.save(produto);
        return converte(produto);
    }

    // Delete
    public boolean deletaProduto (Integer id) {
        if (id != null) {
            produtoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    //Converte Produto para ProdutoDTO
    public ProdutoDTO converte (Produto produto){

        ProdutoDTO produtoDTO = new ProdutoDTO();
        Categoria categoria = categoriaService.buscarPorId(produto.getIdCategoria().getIdCategoria());

        produtoDTO.setNomeProduto(produto.getNomeProduto());
        produtoDTO.setDescricaoProduto(produto.getDescricao());
        produtoDTO.setIdProduto(produto.getIdProduto());
        produtoDTO.setDataCadastro(produto.getDataCadastro());
        produtoDTO.setPreco(produto.getPreco());
        produtoDTO.setImagem(produto.getImagem());
        produtoDTO.setQtdEmEstoque(produto.getQuantEmEstoque());
        produtoDTO.setNomeCategoria(categoria.getNomeCategoria());
        produtoDTO.setDescricaoCategoria(categoria.getDescricao());

        return produtoDTO;
    }

}
