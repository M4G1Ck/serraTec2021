package com.residencia.dell.repositories;

import com.residencia.dell.entities.Reorder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReorderRepository extends JpaRepository<Reorder, Integer> {
}
