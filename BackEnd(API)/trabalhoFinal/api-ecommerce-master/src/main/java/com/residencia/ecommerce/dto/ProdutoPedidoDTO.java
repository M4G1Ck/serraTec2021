package com.residencia.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProdutoPedidoDTO implements Serializable {
    private Integer idProduto;
    private Integer quantidade;
}
