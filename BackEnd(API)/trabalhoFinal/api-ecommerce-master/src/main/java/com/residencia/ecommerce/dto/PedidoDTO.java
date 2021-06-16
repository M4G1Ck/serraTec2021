package com.residencia.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
public class PedidoDTO implements Serializable {
    private Integer idPedido;
    private Integer numeroPedido;
    private BigDecimal valorTotal;
    private Timestamp dataPedido;
    private Boolean pedidoFinalizado;
    private Integer idCliente;
    private String nomeCliente;
    private String emailCliente;
    private String cpfCliente;
    private String telCLiente;
    private List<ExibeProduto> listaProdutos;
}
