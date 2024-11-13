/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:29.10.2024
 * TIME:10:36
 */
package com.example.Online.Book.Store.API.service;

import com.example.Online.Book.Store.API.entity.User;
import com.example.Online.Book.Store.API.entity.enumirated.Status;
import com.example.Online.Book.Store.API.repository.RoleRepository;
import com.example.Online.Book.Store.API.repository.UserRepository;
import com.example.Online.Book.Store.API.service.dto.LoginUserDto;
import com.example.Online.Book.Store.API.service.dto.RefreshTokenDto;
import com.example.Online.Book.Store.API.service.dto.RegisterUserDto;
import com.example.Online.Book.Store.API.service.dto.UserDto;
import com.example.Online.Book.Store.API.service.mapper.UserMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    private final AuthenticationManager authenticationManager;

    public AuthenticationService(UserRepository userRepository,
                                 RoleRepository roleRepository,
                                 PasswordEncoder passwordEncoder,
                                 UserMapper userMapper,
                                 AuthenticationManager authenticationManager
    ) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
        this.authenticationManager = authenticationManager;
    }

    public UserDto signup(RegisterUserDto input) {
        User user = userMapper.toUser(input);
        user.setPassword(passwordEncoder.encode(input.getPassword()));
        user.setStatus(Status.ACTIVE);
        if (input.getRoleId() == null) {
            user.setRole(roleRepository.findByName("ROLE_USER"));
        }

        userRepository.save(user);


        return userMapper.toDto(user);
    }

    public User authenticate(LoginUserDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );

        return userRepository.findByEmail(input.getEmail())
                .orElseThrow();
    }

    public User authenticateRefresh(RefreshTokenDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );

        return userRepository.findByEmail(input.getEmail())
                .orElseThrow();
    }
}