package com.example.questapp.services;

import org.springframework.stereotype.Service;

import com.example.questapp.entities.User;
import com.example.questapp.repos.UserRepository;
import com.example.questapp.requests.UserLoginRequest;

@Service
public class AuthService {
    
    private UserRepository userRepository;
    
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User authenticate(UserLoginRequest loginRequest) {
        User user = userRepository.findByUserName(loginRequest.getUserName());
        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            return user;
        }
        return null;
    }
    
    public User register(User newUser) {
        // Kullanıcı adının benzersiz olduğundan emin olun
        if (userRepository.findByUserName(newUser.getUserName()) == null) {
            return userRepository.save(newUser);
        }
        return null;
    }
} 