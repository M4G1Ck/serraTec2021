package com.residencia.dellstore.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class OrdersVO implements Serializable {

    private Integer orderId;
    private Calendar orderDate;
    private BigDecimal netAmount;
    private BigDecimal tax;
    private BigDecimal totalAmount;
    private List<com.residencia.dellstore.vo.OrderlinesVO> listOrderlinesVO;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Calendar getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
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

    public List<com.residencia.dellstore.vo.OrderlinesVO> getListOrderLinesVO() {
        return listOrderlinesVO;
    }

    public void setListOrderLinesVO(List<com.residencia.dellstore.vo.OrderlinesVO> listOrderlinesVO) {
        this.listOrderlinesVO = listOrderlinesVO;
    }

}