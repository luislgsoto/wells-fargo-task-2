package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioID;

    @ManyToOne
    @JoinColumn(name="clientId" , nullable = false)
    private Client client;

    @Column(nullable = false)
    private String dateOfCreation;


    protected Portfolio(){}

    public Portfolio(Client client, String dateOfCreation)
    {
        this.client=client;
        this.dateOfCreation=dateOfCreation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }
}
