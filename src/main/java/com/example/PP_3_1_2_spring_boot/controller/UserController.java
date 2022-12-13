package com.example.PP_3_1_2_spring_boot.controller;

import com.example.PP_3_1_2_spring_boot.model.User;
import com.example.PP_3_1_2_spring_boot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/add")
    public String showNewUser(Model model) {
        model.addAttribute("user", new User());
        return "add";
    }

    @PostMapping("/addSave")
    public String addNewUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "update";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}