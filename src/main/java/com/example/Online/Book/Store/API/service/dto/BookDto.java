/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:24.10.2024
 * TIME:16:48
 */
package com.example.Online.Book.Store.API.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class BookDto {

    private Long id;

    private String name;

    private BigDecimal count;

    private String author;

    private Long userId;

    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
