package com.residencia.dellstore.entities;


import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "reorder")//
public class Reorder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Long prodId;

    @Column(name = "date_low")
    private Calendar dateLow;

    @Column(name = "quat_low")
    private Integer quantLow;

    @Column(name = "date_recordered")
    private Calendar dateRecordered;

    @Column(name = "quan_recordered")
    private Integer quantRecordered;

    @Column(name = "date_expected")
    private Calendar dateExpected;

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Calendar getDateLow() {
        return dateLow;
    }

    public void setDateLow(Calendar dateLow) {
        this.dateLow = dateLow;
    }

    public Integer getQuantLow() {
        return quantLow;
    }

    public void setQuantLow(Integer quantLow) {
        this.quantLow = quantLow;
    }

    public Calendar getDateRecordered() {
        return dateRecordered;
    }

    public void setDateRecordered(Calendar dateRecordered) {
        this.dateRecordered = dateRecordered;
    }

    public Integer getQuantRecordered() {
        return quantRecordered;
    }

    public void setQuantRecordered(Integer quantRecordered) {
        this.quantRecordered = quantRecordered;
    }

    public Calendar getDateExpected() {
        return dateExpected;
    }

    public void setDateExpected(Calendar dateExpected) {
        this.dateExpected = dateExpected;
    }
}
