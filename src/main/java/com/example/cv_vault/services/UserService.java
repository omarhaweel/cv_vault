package com.example.cv_vault.services;


import com.example.cv_vault.dtos.UserDto;

import java.util.List;

public interface UserService {
    UserDto getUserById(Long id);

    UserDto getUserByUsername(String username);

    UserDto getUserByEmail(String email);
    List<UserDto> getAllUsers();
    UserDto createUser(UserDto userDto);
    void deleteUser(Long id);
    UserDto updateUser(Long id, UserDto userDto);
}