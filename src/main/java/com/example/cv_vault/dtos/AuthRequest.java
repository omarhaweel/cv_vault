package com.example.cv_vault.dtos;


import lombok.Data;


@Data
public class AuthRequest {
    private String username;
    private String email;
    private String password;
}

