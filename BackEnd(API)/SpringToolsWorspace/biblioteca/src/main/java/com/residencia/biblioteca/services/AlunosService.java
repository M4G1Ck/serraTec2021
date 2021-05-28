package com.residencia.biblioteca.services;

import com.residencia.biblioteca.entities.Alunos;
import com.residencia.biblioteca.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunosService {

    @Autowired
    public AlunosRepository alunosRepository;

    public Alunos findById(Integer id) {
        return alunosRepository.findById(id).get();
    }

    public List<Alunos> findAll() {
        return alunosRepository.findAll();

    }

    public Long count() {
        return alunosRepository.count();
    }

    public Alunos save(Alunos aluno) {
        Alunos novoAluno = alunosRepository.save(aluno);
        if (novoAluno.getNumeroMatriculaAluno() != null) {
            return novoAluno;
        } else {
            return null;
        }
    }

    //Update
    //Versão 1 - Caso a instância recebida tenha nela o ID
    public Alunos update(Alunos aluno) {
        return alunosRepository.save(aluno);
    }

    //Versão 2 - Caso a instância recebida não tenha o ID
    public Alunos update(Alunos aluno, Integer id) {
        aluno.setNumeroMatriculaAluno(id);
        return alunosRepository.save(aluno);
    }



}
