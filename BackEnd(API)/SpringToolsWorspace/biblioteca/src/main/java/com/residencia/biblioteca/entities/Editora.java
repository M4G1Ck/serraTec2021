package com.residencia.biblioteca.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "editora")
public class Editora {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoeditora")
    private Integer codigoEditora;

    @Column(name = "nome")
    private String nomeEditora;

    @OneToOne(mappedBy = "idEditora") //Ligação com a tabela "Livros", que recebeu a chave estrangeira
    private Livros livro; //Relação One to one não tem lista

    //Getters & Setters

    public Integer getCodigoEditora() {
        return codigoEditora;
    }

    public void setCodigoEditora(Integer codigoEditora) {
        this.codigoEditora = codigoEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }
}
