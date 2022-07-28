package com.restaurant.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.controller.request.LoginRequest;
import com.restaurant.entity.User;
import com.restaurant.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional (readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long join(User user) {
        userRepository.save(user);
        return user.getId();
    }

    public void checkUser(LoginRequest loginRequest) {
        User user = userRepository.ckeckUser(loginRequest);
        System.out.println();
    }
    
}
