package com.example.demo.services;

import com.example.demo.models.User;

import java.util.List;

public interface IUserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUserByUsername(String username);
    String login(String username, String password);
}
