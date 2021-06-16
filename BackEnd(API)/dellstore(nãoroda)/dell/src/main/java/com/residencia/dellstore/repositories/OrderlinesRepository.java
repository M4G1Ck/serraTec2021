package com.residencia.dellstore.repositories;

import com.residencia.dellstore.entities.Orderlines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.function.Supplier;

@Repository
public interface OrderlinesRepository extends JpaRepository<Orderlines, Integer> {
}
