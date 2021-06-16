package com.residencia.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class ExibeProduto implements Serializable {
    private Integer idProduto;
    private Integer quantidade;
    private String nomeProduto;
    private String descricaoProduto;
    private String categoriaProduto;
    private String descricaoCategoria;
    private BigDecimal precoTotal;
}
