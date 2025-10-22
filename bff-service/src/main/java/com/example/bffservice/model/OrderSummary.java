package com.example.bffservice.model;

import java.util.List;

public class OrderSummary {
    private Long id;
    private Double amount;
    private String currency;
    private List<OrderItemSummary> items;

    public OrderSummary() {}

    public OrderSummary(Long id, Double amount, String currency, List<OrderItemSummary> items) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.items = items;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<OrderItemSummary> getItems() {
        return items;
    }

    public void setItems(List<OrderItemSummary> items) {
        this.items = items;
    }
}
