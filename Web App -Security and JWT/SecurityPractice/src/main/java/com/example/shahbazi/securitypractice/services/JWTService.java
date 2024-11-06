package com.example.shahbazi.securitypractice.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Map;

//@Service
public interface JWTService {
    String generateToken(UserDetails userDetails);
    String extarctUserName(String username);
    boolean isTokenValid(String token, UserDetails userDetails);
    String generateRefreshToken(Map<String,Object> extraClaims, UserDetails userDetails);
}
