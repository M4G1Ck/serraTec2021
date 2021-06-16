package com.residencia.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class AtualizaPedido implements Serializable {
    private List<ProdutoPedidoDTO> listaProdutos;
}
