package com.residencia.dellstore.vo;

import java.util.Calendar;

import java.io.Serializable;

public class OrderlinesVO implements Serializable {

    //Orderlines
    private Integer productId;
    private Integer quantity;
    //Product
    private String title;

    //Getters & Setters
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
