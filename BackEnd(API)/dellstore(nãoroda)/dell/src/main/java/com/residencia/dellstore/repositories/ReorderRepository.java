package com.residencia.dellstore.repositories;

import com.residencia.dellstore.entities.Reorder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReorderRepository extends JpaRepository<Reorder, Integer>{

}
