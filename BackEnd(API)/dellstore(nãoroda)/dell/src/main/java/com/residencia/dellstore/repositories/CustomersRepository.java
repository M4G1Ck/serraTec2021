package com.residencia.dellstore.repositories;

import com.residencia.dellstore.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {

}
