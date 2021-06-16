package com.residencia.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Calendar;

@Getter
@Setter
public class CadastroCliente implements Serializable {

    //Cliente
    private Integer idCliente;
    private String nome;
    private String username;
    private String cpf;
    private String email;
    private String senha;
    private String telefone;
    private Calendar dataNascimento;
    private Integer idEndereco;
    //Endereco
    private String cep;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
}
