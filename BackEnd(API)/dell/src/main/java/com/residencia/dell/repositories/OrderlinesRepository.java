package com.residencia.dell.repositories;

import com.residencia.dell.entities.Orderlines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderlinesRepository extends JpaRepository<Orderlines, Integer> {
}
