package com.residencia.dellstore.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cust_hist")
public class CustHist {

    @Id
    @Column(name = "customerid")
    private Long customerId;

    @Column(name = "orderid")
    private Long orderId;

    @Column(name = "prod_id")
    private Long prodId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }
}
