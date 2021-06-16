package com.residencia.dell.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cust_hist")
public class CustHist {

    @Id
    @Column(name = "customerid", nullable = false)
    private Integer customerId;

    @Column(name = "orderid")
    private Integer orderId;

    @Column(name = "prod_id")
    private Integer prodId;

    //Getters & Setters
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }
}
