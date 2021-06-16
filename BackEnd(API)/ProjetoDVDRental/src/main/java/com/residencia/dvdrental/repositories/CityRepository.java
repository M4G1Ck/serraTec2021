package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.residencia.dvdrental.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
