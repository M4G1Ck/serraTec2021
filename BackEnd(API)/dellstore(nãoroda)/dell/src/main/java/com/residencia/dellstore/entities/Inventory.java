package com.residencia.dellstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @Column(name = "prod_id")
    private Long prodId;

    @Column(name = "quant_in_stock")
    private Integer quantInStock;

    @Column(name = "sales")
    private String sales;

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Integer getQuantInStock() {
        return quantInStock;
    }

    public void setQuantInStock(Integer quantInStock) {
        this.quantInStock = quantInStock;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }
}
