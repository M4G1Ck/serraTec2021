package com.residencia.dell.entities;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category", unique=true)
    private Integer categoryId;

    @Column(name = "categoryname")
    private String categoryName;

    //Getters & Setters
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
