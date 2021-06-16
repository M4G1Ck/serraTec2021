package com.residencia.ecommerce.dto;

import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


@Getter
public class ProdutoDTO implements Serializable {

    //Produto
    private Integer idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private BigDecimal preco;
    private Integer qtdEmEstoque;
    private Timestamp dataCadastro;
    private String imagem;
    //Categoria
    private String nomeCategoria;
    private String descricaoCategoria;

    //Setters
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setQtdEmEstoque(Integer qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public void setDataCadastro(Timestamp dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }
}
