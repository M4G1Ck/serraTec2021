package com.residencia.ecommerce.services;

import com.residencia.ecommerce.entities.Categoria;
import com.residencia.ecommerce.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    //Buscar categoria pelo id
    public Categoria buscarPorId(Integer id){
        return categoriaRepository.findById(id).get();
    }

    //Buscar todas as categorias
    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll();
    }

    //Cadastra categoria
    public Categoria cadastro (Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    //Atualizar categoria
    public Boolean update (Integer idCategoria, Categoria categoria){

        Categoria updatedCategoria = categoriaRepository.findById(idCategoria).get();

        updatedCategoria.setIdCategoria(idCategoria);
        updatedCategoria.setNomeCategoria(categoria.getNomeCategoria());
        updatedCategoria.setDescricao(categoria.getDescricao());
        updatedCategoria.setProdutos(categoria.getProdutos());
        categoriaRepository.save(updatedCategoria);

        if(updatedCategoria == categoria)
            return true;
        else
            return false;
    }

    //Deletar categoria
    public boolean deletar (Integer idCategoria){
        if(idCategoria != null) {
            categoriaRepository.deleteById(idCategoria);
            return true;
        }
        else
            return false;

    }
}


