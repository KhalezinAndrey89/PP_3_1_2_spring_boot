package com.example.PP_3_1_2_spring_boot.service;

import com.example.PP_3_1_2_spring_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
