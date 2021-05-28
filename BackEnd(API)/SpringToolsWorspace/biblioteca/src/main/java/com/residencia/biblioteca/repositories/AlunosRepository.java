package com.residencia.biblioteca.repositories;

import com.residencia.biblioteca.entities.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Integer> {

}
