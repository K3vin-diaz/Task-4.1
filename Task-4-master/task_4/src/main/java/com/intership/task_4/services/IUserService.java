package com.intership.task_4.services;

import com.intership.task_4.model.UserModel;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface IUserService extends UserDetailsService {
    UserModel registerUser(UserModel user);
    Optional<UserModel> findByEmail(String email);
    List<UserModel> getAllUsers();
    void blockUser(Long id);
    void unblockUser(Long id);
    void deleteUser(Long id);
}