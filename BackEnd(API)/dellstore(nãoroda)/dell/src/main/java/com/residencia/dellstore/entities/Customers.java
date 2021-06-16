package com.residencia.dellstore.entities;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerid")
    private Long customerId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "address1")
    private String Addres1;

    @Column(name = "address2")
    private String Addres2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private Integer zip;

    @Column(name = "country")
    private String country;

    @Column(name = "region")
    private Integer region;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "creditcardtype")
    private Integer creditCardType;

    @Column(name = "creditcard")
    private String creditCard;

    @Column(name = "creditcardexpiration")
    private String creditCardExpiration;

    @Column(name = "username", unique = true)
    private String userName;

    @Column(name = "password")
    private String passWord;

    @Column(name = "age")
    private Integer age;

    @Column(name = "income")
    private Integer income;

    @Column(name = "gender")
    private Character gender;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public String getAddres1() {
        return Addres1;
    }

    public void setAddres1(String addres1) {
        Addres1 = addres1;
    }

    public String getAddres2() {
        return Addres2;
    }

    public void setAddres2(String addres2) {
        Addres2 = addres2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(Integer creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditCardExpiration() {
        return creditCardExpiration;
    }

    public void setCreditCardExpiration(String creditCardExpiration) {
        this.creditCardExpiration = creditCardExpiration;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

}
