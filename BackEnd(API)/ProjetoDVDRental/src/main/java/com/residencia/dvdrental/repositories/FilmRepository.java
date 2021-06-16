package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.residencia.dvdrental.entities.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

}
