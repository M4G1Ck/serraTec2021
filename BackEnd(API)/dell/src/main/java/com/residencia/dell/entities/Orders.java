package com.residencia.dell.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "orders")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "orderId")
public class Orders {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderid", updatable = false)
    private Integer orderId;

    @CreationTimestamp
    @Column(name="orderdate")
    private Timestamp orderDate;

    @ManyToOne //Relacionamento com Customers
    @JoinColumn(name = "customerid", nullable = false)
    private Customers customerId;

    @Column(name = "netamount")
    private BigDecimal netAmount;

    @Column(name = "tax")
    private BigDecimal tax;

    @Column(name = "totalamount")
    private BigDecimal totalAmount;

    @OneToMany(mappedBy = "orderId") //Relacionamento com Orderlines
    private List<Orderlines> orderlines;

    //Getters & Setters
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Orderlines> getOrderlines() {
        return orderlines;
    }

    public void setOrderlines(List<Orderlines> orderlines) {
        this.orderlines = orderlines;
    }
}
