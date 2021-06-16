package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.residencia.dvdrental.entities.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

}
