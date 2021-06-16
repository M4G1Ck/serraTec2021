package com.residencia.dell.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Products {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id", updatable = false)
    private Integer productId;

    @Column(name = "category")
    private Integer category;

    @Column(name = "title")
    private String title;

    @Column(name = "actor")
    private String actor;

    @Column(name = "price")
    private Double price;

    @Column(name = "special")
    private Integer special;

    @Column(name = "common_prod_id")
    private Integer commonProductId;

    @OneToMany(mappedBy = "prodId") //Relacionamento com Orderlines
    private List<Orderlines> orderlines;

    //Getters & Setters
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSpecial() {
        return special;
    }

    public void setSpecial(Integer special) {
        this.special = special;
    }

    public Integer getCommonProductId() {
        return commonProductId;
    }

    public void setCommonProductId(Integer commonProductId) {
        this.commonProductId = commonProductId;
    }
}
