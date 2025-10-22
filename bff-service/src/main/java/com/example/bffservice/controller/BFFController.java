package com.example.bffservice.controller;

import com.example.bffservice.model.UserProfile;
import com.example.bffservice.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/site-bff")
public class BFFController {
    
    @Autowired
    private UserProfileService userProfileService;
    
    @GetMapping("/user/{userId}")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable Long userId) {
        UserProfile userProfile = userProfileService.getUserProfile(userId);
        return userProfile != null 
                ? ResponseEntity.ok(userProfile)
                : ResponseEntity.notFound().build();
    }
}
