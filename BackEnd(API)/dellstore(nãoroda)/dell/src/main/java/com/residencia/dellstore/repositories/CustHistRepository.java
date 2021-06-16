package com.residencia.dellstore.repositories;

import com.residencia.dellstore.entities.CustHist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustHistRepository extends JpaRepository<CustHist, Integer> {
}
