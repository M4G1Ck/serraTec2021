package com.residencia.biblioteca.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "alunos")
public class Alunos {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeromatriculaaluno")
    private Integer numeroMatriculaAluno;

    @Column(name = "nome")
    private String nomeAluno;

    @Column(name = "datanascimento")
    private Calendar dataNascimento;

    @Column(name = "cpf")
    private String cpfAluno;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numerologradouro")
    private Integer numeroLogradouro;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @OneToMany(mappedBy = "matriculaAluno") //Ligação com a tabela "emprestimo", que recebeu a chave estrangeira
    private List<Emprestimo> listaEmprestimosAluno;

    //Getters & Setters

    public Integer getNumeroMatriculaAluno() {
        return numeroMatriculaAluno;
    }

    public void setNumeroMatriculaAluno(Integer numeroMatriculaAluno) {
        this.numeroMatriculaAluno = numeroMatriculaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(Integer numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<Emprestimo> getListaEmprestimosAluno() {
        return listaEmprestimosAluno;
    }

    public void setListaEmprestimosAluno(List<Emprestimo> listaEmprestimosAluno) {
        this.listaEmprestimosAluno = listaEmprestimosAluno;
    }
}
