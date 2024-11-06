package com.example.shahbazi.securitypractice.controller;

import com.example.shahbazi.securitypractice.dto.JWTAuthenticationResponse;
import com.example.shahbazi.securitypractice.dto.RefreshTokenRequest;
import com.example.shahbazi.securitypractice.dto.SignInRequest;
import com.example.shahbazi.securitypractice.dto.SignUpRequest;
import com.example.shahbazi.securitypractice.entities.User;
import com.example.shahbazi.securitypractice.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signUp(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JWTAuthenticationResponse> signIn(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signIn(signInRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JWTAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshTokn(refreshTokenRequest));
    }
}
