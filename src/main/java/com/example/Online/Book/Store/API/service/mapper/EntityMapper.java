/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:25.10.2024
 * TIME:2:13
 */
package com.example.Online.Book.Store.API.service.mapper;

import java.util.List;

public interface EntityMapper<D, E> {
    E toEntity(D dto);

    D toDto(E entity);

    List<D> toDto(List<E> entityList);

    List<E> toEntity(List<D> dtoList);
}
