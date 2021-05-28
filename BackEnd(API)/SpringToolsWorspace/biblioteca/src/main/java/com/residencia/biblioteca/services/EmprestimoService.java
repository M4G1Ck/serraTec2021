package com.residencia.biblioteca.services;

import com.residencia.biblioteca.entities.Emprestimo;
import com.residencia.biblioteca.repositories.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    @Autowired
    public EmprestimoRepository emprestimoRepository;

    public Emprestimo findById(Integer id) {
        return emprestimoRepository.findById(id).get();
    }

    public List<Emprestimo> findAll() {
        return emprestimoRepository.findAll();

    }

    public Long count() {
        return emprestimoRepository.count();
    }

    public Emprestimo save(Emprestimo emprestimo) {
        Emprestimo novoEmprestimo = emprestimoRepository.save(emprestimo);
        if (novoEmprestimo.getCodigoEmprestimo() != null) {
            return novoEmprestimo;
        } else {
            return null;
        }

    }

    //Update
    //Versão 1 - Caso a instância recebida tenha nela o ID da entidade
    public Emprestimo update(Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    //Versão 2 - Caso a instância recebida não tenha o ID
    public Emprestimo update(Emprestimo emprestimo, Integer id) {
        emprestimo.setCodigoEmprestimo(id);
        return emprestimoRepository.save(emprestimo);
    }
}
