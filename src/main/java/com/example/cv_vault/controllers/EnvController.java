package com.example.cv_vault.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/env")
public class EnvController {
    @Value("${env.name}")
    private String envName;

    @GetMapping
    public String getEnvName() {

        return envName;
    }
}
