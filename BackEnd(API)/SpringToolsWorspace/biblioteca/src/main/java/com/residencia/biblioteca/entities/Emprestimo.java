package com.residencia.biblioteca.entities;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table(name = "emprestimo")
public class Emprestimo {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoemprestimo")
    private Integer codigoEmprestimo;

    @ManyToOne //Chave estrangeira de Alunos
    @JoinColumn(name = "numeromatriculaaluno", referencedColumnName = "numeromatriculaaluno") //Banco de dados
    private Alunos matriculaAluno; //Java

    @ManyToOne //Chave estrangeira de Livros
    @JoinColumn(name = "codigolivro", referencedColumnName = "codigolivro") //Banco de dados
    private Livros idLivro; //Java

    @Column(name = "dataemprestimo")
    private Calendar dataEmprestimo;

    @Column(name = "dataentrega")
    private Calendar dataEntrega;

    @Column(name = "valoremprestimo")
    private Double valorEmprestimo;

    //Getters & Setters

    public Integer getCodigoEmprestimo() {
        return codigoEmprestimo;
    }

    public void setCodigoEmprestimo(Integer codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }

    public Alunos getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(Alunos matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public Livros getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Livros idLivro) {
        this.idLivro = idLivro;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Calendar getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Calendar dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(Double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }
}
