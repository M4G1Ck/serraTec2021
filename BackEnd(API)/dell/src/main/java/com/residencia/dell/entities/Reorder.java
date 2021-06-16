package com.residencia.dell.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Calendar;

@Entity
@Table(name = "reorder")
public class Reorder {

    @Id
    @Column(name = "prod_id")
    private Integer productId;

    @Column(name = "date_low")
    private Calendar dateLow;

    @Column(name = "quan_low")
    private Integer quantityLow;

    @Column(name = "date_reordered")
    private Calendar dateReordered;

    @Column(name = "quan_reordered")
    private Integer quantityReordered;

    @Column(name = "date_expected")
    private Calendar dateExpected;

    //Getters & Setters
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Calendar getDateLow() {
        return dateLow;
    }

    public void setDateLow(Calendar dateLow) {
        this.dateLow = dateLow;
    }

    public Integer getQuantityLow() {
        return quantityLow;
    }

    public void setQuantityLow(Integer quantityLow) {
        this.quantityLow = quantityLow;
    }

    public Calendar getDateReordered() {
        return dateReordered;
    }

    public void setDateReordered(Calendar dateReordered) {
        this.dateReordered = dateReordered;
    }

    public Integer getQuantityReordered() {
        return quantityReordered;
    }

    public void setQuantityReordered(Integer quantityReordered) {
        this.quantityReordered = quantityReordered;
    }

    public Calendar getDateExpected() {
        return dateExpected;
    }

    public void setDateExpected(Calendar dateExpected) {
        this.dateExpected = dateExpected;
    }
}
