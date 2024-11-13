/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:24.10.2024
 * TIME:14:28
 */
package com.example.Online.Book.Store.API.entity;

import com.example.Online.Book.Store.API.entity.enumirated.Status;
import com.example.Online.Book.Store.API.entity.teamplate.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "book")
public class Book extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal count;

    private String author;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User User;

    @Enumerated(EnumType.STRING)
    private Status status;
}
