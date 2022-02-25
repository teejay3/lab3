package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    User get(Integer id);
    List<User> getAll();
    User save(User user);
    void delete(Integer id);
}
