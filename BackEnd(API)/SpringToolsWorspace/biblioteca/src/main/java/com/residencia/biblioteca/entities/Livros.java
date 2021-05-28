package com.residencia.biblioteca.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "livros")
public class Livros {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigolivro")
    private Integer codigoLivro;

    @Column(name = "nomelivro")
    private String nomeLivro;

    @Column(name = "nomeautor")
    private String nomeAutor;

    @Column(name = "datalancamento")
    private Calendar dataLancamento;

    @Column(name = "codigoisbn")
    private Integer codigoIsbn;

    @OneToOne //Chave estrangeira de Editora
    @JoinColumn(name = "codigoeditora", referencedColumnName = "codigoeditora") //Banco de dados
    private Editora idEditora; //Java

    @OneToMany(mappedBy = "idLivro") //Ligação com a tabela "emprestimo", que recebeu a chave estrangeira
    private List<Emprestimo> listaEmprestimosLivros;

    //Getters & Setters

    public Integer getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(Integer codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Calendar getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Calendar dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getCodigoIsbn() {
        return codigoIsbn;
    }

    public void setCodigoIsbn(Integer codigoIsbn) {
        this.codigoIsbn = codigoIsbn;
    }

    public Editora getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(Editora idEditora) {
        this.idEditora = idEditora;
    }

    public List<Emprestimo> getListaEmprestimosLivros() {
        return listaEmprestimosLivros;
    }

    public void setListaEmprestimosLivros(List<Emprestimo> listaEmprestimosLivros) {
        this.listaEmprestimosLivros = listaEmprestimosLivros;
    }
}
