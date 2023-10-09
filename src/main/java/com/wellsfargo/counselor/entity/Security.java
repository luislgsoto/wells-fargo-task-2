package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

public class Security {
    @Id
    @GeneratedValue()
    private long security_ID;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String purchaseDate;
    @Column(nullable = false)
    private String purchasePrice;
    @Column(nullable = false)
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "portfolioID",nullable = false)
    private Portfolio portfolio;

    protected Security(){}
    public Security(String name, String category, String purchaseDate, String purchasePrice, int quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    // Getter and Setter Methods
    public long getSecurity_ID() {
        return security_ID;
    }

    public void setSecurity_ID(long security_ID) {
        this.security_ID = security_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

}
