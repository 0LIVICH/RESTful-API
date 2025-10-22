package com.example.bffservice.service;

import com.example.bffservice.model.Order;
import com.example.bffservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class ExternalServiceClient {
    
    private final WebClient userServiceClient;
    private final WebClient orderServiceClient;
    
    @Autowired
    public ExternalServiceClient() {
        this.userServiceClient = WebClient.builder()
                .baseUrl("http://localhost:8081")
                .build();
        
        this.orderServiceClient = WebClient.builder()
                .baseUrl("http://localhost:8082")
                .build();
    }
    
    public User getUserById(Long userId) {
        return userServiceClient
                .get()
                .uri("/api/users/{userId}", userId)
                .retrieve()
                .bodyToMono(User.class)
                .block();
    }
    
    public List<Order> getOrdersByUserId(Long userId) {
        return orderServiceClient
                .get()
                .uri("/api/orders/by-user/{userId}", userId)
                .retrieve()
                .bodyToFlux(Order.class)
                .collectList()
                .block();
    }
}
