package com.residencia.dell.repositories;

import com.residencia.dell.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.URLConnection;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
