package com.residencia.dellstore.repositories;

import com.residencia.dellstore.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository <Categories, Integer> {

}
