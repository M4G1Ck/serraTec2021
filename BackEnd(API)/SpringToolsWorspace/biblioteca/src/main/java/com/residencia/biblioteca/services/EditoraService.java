package com.residencia.biblioteca.services;

import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditoraService {

    @Autowired
    public EditoraRepository editoraRepository;

    public Editora findById(Integer id) {
        return editoraRepository.findById(id).get();
    }

    public List<Editora> findAll() {
        return editoraRepository.findAll();

    }

    public Long count() {
        return editoraRepository.count();
    }

    public Editora save(Editora editora) {
        Editora novaEditora = editoraRepository.save(editora);
        if (novaEditora.getCodigoEditora() != null) {
            return novaEditora;
        } else {
            return null;
        }

    }

    //Update
    //Versão 1 - Caso a instância recebida tenha nela o ID
    public Editora update(Editora editora) {
        return editoraRepository.save(editora);
    }

    //Versão 2 - Caso a instância recebida não tenha o ID
    public Editora update(Editora editora, Integer id) {
        editora.setCodigoEditora(id);
        return editoraRepository.save(editora);
    }

}
