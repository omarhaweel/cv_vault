package com.example.cv_vault.dtos;

import lombok.Data;
@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String JobTitle;
    private String phoneNumber;
    private String address;
    private String nationality;
    private String drivingLicense;
    private String role;
}