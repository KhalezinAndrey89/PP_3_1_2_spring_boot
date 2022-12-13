package com.example.PP_3_1_2_spring_boot.dao;

import com.example.PP_3_1_2_spring_boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    User getUser(long id);
}
