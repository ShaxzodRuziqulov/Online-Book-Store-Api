/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:25.10.2024
 * TIME:2:10
 */
package com.example.Online.Book.Store.API.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RoleDto {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
