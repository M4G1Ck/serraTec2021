package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.residencia.dvdrental.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
