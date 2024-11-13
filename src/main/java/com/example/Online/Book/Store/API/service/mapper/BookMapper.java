/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:24.10.2024
 * TIME:16:47
 */
package com.example.Online.Book.Store.API.service.mapper;

import com.example.Online.Book.Store.API.entity.Book;
import com.example.Online.Book.Store.API.service.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface BookMapper extends EntityMapper<BookDto, Book> {
    @Mapping(source = "userId", target = "user.id")
    Book toEntity(BookDto bookDto);

    @Mapping(source = "user.id", target = "userId")
    BookDto toDto(Book book);
}

