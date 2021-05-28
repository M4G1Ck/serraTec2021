package com.residencia.biblioteca.repositories;

import com.residencia.biblioteca.entities.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Integer> {

}
