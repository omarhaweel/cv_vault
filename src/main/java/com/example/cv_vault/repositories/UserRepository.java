package com.example.cv_vault.repositories;



import aj.org.objectweb.asm.commons.Remapper;
import com.example.cv_vault.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByEmail(String email);
    Optional<User> getUserById(Long id);
    Optional<User> findByUsername(String username);
}