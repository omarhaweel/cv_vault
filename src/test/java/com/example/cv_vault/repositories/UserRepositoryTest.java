package com.example.cv_vault.repositories;

import com.example.cv_vault.entities.User;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ActiveProfiles("test")
@Transactional
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindUserByEmail() {
        // SETUP
        User user = new User();
        user.setEmail("alfa@delta.com");
        user.setUsername("alfa");
        user.setPassword("password123");
        userRepository.save(user);

        // EXECUTE
        var foundUser = userRepository.findUserByEmail("alfa@delta.com");

        // VERIFY
        assertTrue(foundUser.isPresent());
    }

    @Test
    void testGetUserById() {
        // SETUP
        User user = new User();
        user.setEmail("charlie@delta.com");
        user.setPassword("password123");
        user = userRepository.save(user);

        // EXECUTE
        var foundUser = userRepository.getUserById(user.getId());

        // VERIFY
        assertTrue(foundUser.isPresent());
    }

    @Test
    void testFindByUsername() {
        // SETUP
        User user = new User();
        user.setEmail("Ringo@delta.com");
        user.setPassword("password123");
        user.setUsername("Ringo");
        userRepository.save(user);

        // EXECUTE
        var foundUser = userRepository.findByUsername("Ringo");

        // VERIFY
        assertTrue(foundUser.isPresent());
        assertEquals("Ringo", foundUser.get().getUsername());
    }
}