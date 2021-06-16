package com.residencia.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;

@Getter
@Setter
@Entity
@Table(name = "cliente")
@JsonSerialize
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "senha")
    private String senha;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf", unique = true)
    private String cpf;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "data_nascimento")
    private Calendar dataNascimento;


    @ManyToOne //Relacionamento com Endereco
    @JsonIgnore
    @JoinColumn(name = "id_endereco")
    private Endereco idEndereco;

}
