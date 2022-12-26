package com.example.PP_3_1_2_spring_boot.service;

import com.example.PP_3_1_2_spring_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void deleteUser(long id);
}
