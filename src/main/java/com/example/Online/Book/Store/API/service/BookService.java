/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:24.10.2024
 * TIME:16:42
 */
package com.example.Online.Book.Store.API.service;

import com.example.Online.Book.Store.API.entity.Book;
import com.example.Online.Book.Store.API.entity.enumirated.Status;
import com.example.Online.Book.Store.API.repository.BookRepository;
import com.example.Online.Book.Store.API.service.dto.BookDto;
import com.example.Online.Book.Store.API.service.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookService(
            BookRepository bookRepository,
            BookMapper bookMapper
    ) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    public BookDto create(BookDto bookDto) {
        Book book = bookMapper.toEntity(bookDto);
        return bookMapper.toDto(book);
    }

    public BookDto update(BookDto bookDto) {
        Book book = bookMapper.toEntity(bookDto);
        book = bookRepository.save(book);
        return bookMapper.toDto(book);
    }

    public List<BookDto> allBooks() {
        return bookRepository
                .findAll()
                .stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toList());

    }

    public Book findBookById(Long id) {
        return bookRepository
                .findById(id)
                .orElseGet(Book::new);
    }

    public Book deleteBook(Long id) {
        return bookRepository.updateStatus(id, Status.DELETED);
    }
}

