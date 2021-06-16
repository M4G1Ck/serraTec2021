package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.residencia.dvdrental.entities.Film_Actor;

@Repository
public interface Film_CategoryRepository extends JpaRepository<Film_Actor, Integer> {

}
