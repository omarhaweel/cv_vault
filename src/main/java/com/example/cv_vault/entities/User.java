package com.example.cv_vault.entities;


import jakarta.persistence.*;
import lombok.Data;

import javax.naming.Name;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Column(unique = true)
    private String username;
    private String password;
    private String jobTitle;
    private String phoneNumber;
    private String address;
    private String nationality;
    private String drivingLicense;
    private String role;

}
