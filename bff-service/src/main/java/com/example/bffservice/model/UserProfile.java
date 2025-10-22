package com.example.bffservice.model;

import java.util.List;

public class UserProfile {
    private Long id;
    private String fullName;
    private String deliveryAddress;
    private String phoneNumber;
    private String email;
    private List<OrderSummary> orders;

    public UserProfile() {}

    public UserProfile(Long id, String fullName, String deliveryAddress, String phoneNumber, String email, List<OrderSummary> orders) {
        this.id = id;
        this.fullName = fullName;
        this.deliveryAddress = deliveryAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.orders = orders;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrderSummary> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderSummary> orders) {
        this.orders = orders;
    }
}
