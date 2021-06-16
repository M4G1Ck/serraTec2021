package com.residencia.ecommerce.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "endereco")
@JsonSerialize
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Integer id_Endereco;

    @Column(name = "cep")
    private String cep;

    @Column(name = "rua")
    private String rua;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "numero")
    private String numero;

    @Column(name = "complemento")
    private String complemento;

    @OneToMany(mappedBy = "idEndereco") //Relacionamento com Cliente
    private List<Cliente> clientes;

}
