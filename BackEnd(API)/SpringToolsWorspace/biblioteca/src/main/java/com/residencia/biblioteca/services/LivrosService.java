package com.residencia.biblioteca.services;

import com.residencia.biblioteca.entities.Livros;
import com.residencia.biblioteca.repositories.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrosService {

    @Autowired
    public LivrosRepository livrosRepository;

    public Livros findById(Integer id) {
        return livrosRepository.findById(id).get();
    }

    public List<Livros> findAll() {
        return livrosRepository.findAll();

    }

    public Long count() {
        return livrosRepository.count();
    }

    public Livros save(Livros livro) {
        Livros novoLivro = livrosRepository.save(livro);
        if (novoLivro.getCodigoLivro() != null) {
            return novoLivro;
        } else {
            return null;
        }

    }

    //Update
    //Versão 1 - Caso a instância recebida tenha nela o ID
    public Livros update(Livros livro) {
        return livrosRepository.save(livro);
    }

    //Versão 2 - Caso a instância recebida não tenha o ID
    public Livros update(Livros livro, Integer id) {
        livro.setCodigoLivro(id);
        return livrosRepository.save(livro);
    }
}
