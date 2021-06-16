package com.residencia.dellstore.vo;

import com.residencia.dellstore.entities.Customers;
import com.residencia.dellstore.entities.Orderlines;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalVO {

    private Long orderId;
    private Calendar orderDate;
    private String customerFirstName;
    private String customerLastName;
    private BigDecimal netAmount;
    private BigDecimal totalAmount;
    private List<Orderlines> listOrderline;
    private Integer quantity;
    private String title;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Calendar getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastname() {
        return customerLastName;
    }

    public void setCustomerLastname(String customerLastname) {
        this.customerLastName = customerLastname;
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
    public List<Orderlines> getListOrderline() {
        return listOrderline;
    }

    public void setListOrderline(List<Orderlines> listOrderline) {
        this.listOrderline = listOrderline;
    }
}