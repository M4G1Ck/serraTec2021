package com.residencia.ecommerce.repositories;

import com.residencia.ecommerce.entities.Pedido;
import com.residencia.ecommerce.entities.Produto;
import com.residencia.ecommerce.entities.ProdutosPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosPedidoRepository extends JpaRepository<ProdutosPedido, Integer> {
}
