package com.residencia.dell.repositories;

import com.residencia.dell.entities.CustHist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustHistRepository extends JpaRepository<CustHist, Integer> {
}
