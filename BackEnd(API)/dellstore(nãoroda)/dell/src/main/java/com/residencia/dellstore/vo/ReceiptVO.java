package com.residencia.dellstore.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public class ReceiptVO implements Serializable {

    //Orders
    private Integer orderId;
    private BigDecimal netAmount;
    private BigDecimal totalAmount;
    private Timestamp orderDate;
    //Customer
    private String firstName;
    private String lastName;
    //Orderlines
    private List<OrderlinesVO> orderlinesVOList;


    //Getters & Setters
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<OrderlinesVO> getOrderlinesVOList() {
        return orderlinesVOList;
    }

    public void setOrderlinesVOList(List<OrderlinesVO> orderlinesDTOList) {
        this.orderlinesVOList = orderlinesDTOList;
    }
}
