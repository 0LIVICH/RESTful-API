package com.example.orderservice.service;

import com.example.orderservice.model.Order;
import com.example.orderservice.model.OrderItem;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class OrderService {
    
    private final Map<Long, List<Order>> userOrders;
    
    public OrderService() {
        // Инициализируем тестовые данные
        this.userOrders = Map.of(
            1L, Arrays.asList(
                new Order(1L, 1L, 1500.0, "RUB", Arrays.asList(
                    new OrderItem("Ноутбук", 1, 1200.0),
                    new OrderItem("Мышь", 1, 300.0)
                )),
                new Order(2L, 1L, 500.0, "RUB", Arrays.asList(
                    new OrderItem("Клавиатура", 1, 500.0)
                ))
            ),
            2L, Arrays.asList(
                new Order(3L, 2L, 2000.0, "RUB", Arrays.asList(
                    new OrderItem("Смартфон", 1, 2000.0)
                ))
            ),
            3L, Arrays.asList(
                new Order(4L, 3L, 800.0, "RUB", Arrays.asList(
                    new OrderItem("Наушники", 1, 800.0)
                )),
                new Order(5L, 3L, 1200.0, "RUB", Arrays.asList(
                    new OrderItem("Планшет", 1, 1200.0)
                ))
            )
        );
    }
    
    public List<Order> getOrdersByUserId(Long userId) {
        return userOrders.getOrDefault(userId, Arrays.asList());
    }
}
