package com.residencia.biblioteca.repositories;

import com.residencia.biblioteca.entities.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<Livros, Integer> {

}
