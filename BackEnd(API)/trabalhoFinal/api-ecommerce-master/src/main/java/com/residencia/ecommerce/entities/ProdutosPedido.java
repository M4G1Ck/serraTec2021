package com.residencia.ecommerce.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "produtos_pedido")
public class ProdutosPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produtos_pedido")
    private Integer idProdutosPedido;

    @OneToOne //Relacionamento com Produto
    @JoinColumn(name = "produto")
    private Produto produto;

    @ManyToOne //Relacionamento com Pedido
    @JoinColumn(name = "pedido")
    private Pedido pedido;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "preco")
    private BigDecimal preco;
}
