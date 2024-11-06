package com.example.shahbazi.securitypractice.services;

import com.example.shahbazi.securitypractice.dto.JWTAuthenticationResponse;
import com.example.shahbazi.securitypractice.dto.RefreshTokenRequest;
import com.example.shahbazi.securitypractice.dto.SignInRequest;
import com.example.shahbazi.securitypractice.dto.SignUpRequest;
import com.example.shahbazi.securitypractice.entities.User;

public interface AuthenticationService {
    User signUp(SignUpRequest signUpRequest);
    JWTAuthenticationResponse signIn(SignInRequest signInpRequest );
    JWTAuthenticationResponse refreshTokn(RefreshTokenRequest refreshTokenRequest);
}
