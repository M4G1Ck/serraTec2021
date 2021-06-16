package com.residencia.dellstore.repositories;

import com.residencia.dellstore.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.net.URLConnection;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
