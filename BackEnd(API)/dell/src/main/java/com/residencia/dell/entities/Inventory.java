package com.residencia.dell.entities;

import javax.persistence.*;


@Entity
@Table(name = "inventory")
public class Inventory {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Integer productId;

    @Column(name = "quan_in_stock")
    private Integer quantityInStock;

    @Column(name = "sales")
    private Integer sales;

    //Getters & Setters
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
}
