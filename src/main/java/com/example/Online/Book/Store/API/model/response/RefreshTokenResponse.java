/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:29.10.2024
 * TIME:16:05
 */
package com.example.Online.Book.Store.API.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class RefreshTokenResponse {
    private String token;

    private long expiresIn;
}
