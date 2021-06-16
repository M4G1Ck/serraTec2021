package com.residencia.dellstore.vo;

import java.math.BigDecimal;

public class ProductVO {

    private Long prodId;
    private Long category;
    private String title;
    private String actor;
    private BigDecimal price;
    private Integer special;
    private Long commonProdId;

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSpecial() {
        return special;
    }

    public void setSpecial(Integer special) {
        this.special = special;
    }

    public Long getCommonProdId() {
        return commonProdId;
    }

    public void setCommonProdId(Long commonProdId) {
        this.commonProdId = commonProdId;
    }
}

