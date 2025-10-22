package com.example.orderservice.model;

import java.util.List;

public class Order {
    private Long id;
    private Long userId;
    private Double amount;
    private String currency;
    private List<OrderItem> items;

    public Order() {}

    public Order(Long id, Long userId, Double amount, String currency, List<OrderItem> items) {
        this.id = id;
        this.userId = userId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}
