/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:24.10.2024
 * TIME:14:43
 */
package com.example.Online.Book.Store.API.service.dto;

import com.example.Online.Book.Store.API.entity.enumirated.Status;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private Long roleId;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
