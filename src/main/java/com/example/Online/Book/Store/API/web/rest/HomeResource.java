/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:29.10.2024
 * TIME:16:50
 */
package com.example.Online.Book.Store.API.web.rest;

import com.example.Online.Book.Store.API.service.JwtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeResource {
    private final JwtService jwtTokenProvider;

    public HomeResource(JwtService jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @GetMapping("me")
    public ResponseEntity<?> getMe(@RequestParam("token") String tokenHeader) {
        if (tokenHeader != null) {
            if (jwtTokenProvider.isTokenValid(tokenHeader)) {
                String email = jwtTokenProvider.getUsernameFromToken(tokenHeader);
                return ResponseEntity.ok(Map.of("email", email));
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Token");

    }
}