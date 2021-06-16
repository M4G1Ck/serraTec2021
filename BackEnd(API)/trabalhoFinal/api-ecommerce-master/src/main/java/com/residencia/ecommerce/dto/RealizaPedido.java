package com.residencia.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class RealizaPedido implements Serializable {
    private Integer idCliente;
    private List<ProdutoPedidoDTO> listaProdutos;
}
