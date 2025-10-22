package com.example.userservice.service;

import com.example.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService {
    
    private final Map<Long, User> users = new HashMap<>();
    
    public UserService() {
        // Инициализируем тестовые данные
        users.put(1L, new User(1L, "Иван Иванов", "ул. Ленина, д. 1, кв. 1", "+7-999-123-45-67", "ivan@example.com"));
        users.put(2L, new User(2L, "Петр Петров", "ул. Пушкина, д. 10, кв. 5", "+7-999-234-56-78", "petr@example.com"));
        users.put(3L, new User(3L, "Мария Сидорова", "пр. Мира, д. 25, кв. 12", "+7-999-345-67-89", "maria@example.com"));
    }
    
    public Optional<User> getUserById(Long userId) {
        return Optional.ofNullable(users.get(userId));
    }
}
