/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:29.10.2024
 * TIME:16:06
 */
package com.example.Online.Book.Store.API.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RefreshTokenDto {
    private String email;
    private String password;
}