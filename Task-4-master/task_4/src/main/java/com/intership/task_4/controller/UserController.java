package com.intership.task_4.controller;

import com.intership.task_4.model.UserModel;
import com.intership.task_4.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(@Lazy UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserModel registerUser(@RequestBody UserModel user) {
        return userService.registerUser(user);
    }

    @GetMapping
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/block/{id}")
    public void blockUser(@PathVariable Long id) {
        userService.blockUser(id);
    }

    @PostMapping("/unblock/{id}")
    public void unblockUser(@PathVariable Long id) {
        userService.unblockUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}