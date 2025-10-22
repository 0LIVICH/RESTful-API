package com.example.bffservice.service;

import com.example.bffservice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserProfileService {
    
    @Autowired
    private ExternalServiceClient externalServiceClient;
    
    public UserProfile getUserProfile(Long userId) {
        // Получаем данные пользователя
        User user = externalServiceClient.getUserById(userId);
        if (user == null) {
            return null;
        }
        
        // Получаем заказы пользователя
        List<Order> orders = externalServiceClient.getOrdersByUserId(userId);
        
        // Преобразуем заказы в OrderSummary
        List<OrderSummary> orderSummaries = orders.stream()
                .map(this::convertToOrderSummary)
                .collect(Collectors.toList());
        
        // Создаем профиль пользователя
        return new UserProfile(
                user.getId(),
                user.getFullName(),
                user.getDeliveryAddress(),
                user.getPhoneNumber(),
                user.getEmail(),
                orderSummaries
        );
    }
    
    private OrderSummary convertToOrderSummary(Order order) {
        List<OrderItemSummary> itemSummaries = order.getItems().stream()
                .map(item -> new OrderItemSummary(
                        item.getProductName(),
                        item.getQuantity(),
                        item.getPrice()
                ))
                .collect(Collectors.toList());
        
        return new OrderSummary(
                order.getId(),
                order.getAmount(),
                order.getCurrency(),
                itemSummaries
        );
    }
}
