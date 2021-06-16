package com.residencia.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "categoria")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idCategoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "nome_categoria", unique = true)
    private String nomeCategoria;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "idCategoria") //Relacionamento com Produto
    private List<Produto> produtos;

}
