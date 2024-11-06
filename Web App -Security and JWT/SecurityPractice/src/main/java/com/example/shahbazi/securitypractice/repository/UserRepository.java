package com.example.shahbazi.securitypractice.repository;

import com.example.shahbazi.securitypractice.entities.Role;
import com.example.shahbazi.securitypractice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    User findByRole(Role role);
}
