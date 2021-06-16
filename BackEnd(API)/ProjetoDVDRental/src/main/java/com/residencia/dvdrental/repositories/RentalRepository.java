package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.residencia.dvdrental.entities.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Integer> {

}
