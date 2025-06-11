package com.example.cv_vault.controllers;

import com.example.cv_vault.ServiceImpl.UserServiceImpl;
import com.example.cv_vault.dtos.AuthRequest;
import com.example.cv_vault.dtos.AuthResponse;
import com.example.cv_vault.dtos.UserDto;
import com.example.cv_vault.repositories.UserRepository;
import com.example.cv_vault.security.JwtUtil;
import com.example.cv_vault.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasRole;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDto userDto) {
        if (userRepository.findByUsername(userDto.getUsername()).isPresent()) {
            return ResponseEntity.badRequest().body("User already exists");
        }
        if (userRepository.findUserByEmail(userDto.getEmail()).isPresent()) {
            return ResponseEntity.badRequest().body("Email already registered");
        }

        userServiceImpl.createUser(userDto);
        return ResponseEntity.ok("User registered");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
            );

            UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
            String userRole = userServiceImpl.getUserByUsername(request.getUsername()).getRole();

            String token = jwtUtil.generateToken(userDetails, userRole);
            return ResponseEntity.ok(new AuthResponse(token));
        } catch (AuthenticationException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }


    @PreAuthorize("hasRole('USER')") // toggle between ADMIN and USER roles as needed to test
    @GetMapping("/test")
    public ResponseEntity<String> testAuthentication() {
        return ResponseEntity.ok("User is authenticated");
    }
}