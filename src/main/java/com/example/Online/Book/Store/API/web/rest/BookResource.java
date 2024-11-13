/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:25.10.2024
 * TIME:1:33
 */
package com.example.Online.Book.Store.API.web.rest;

import com.example.Online.Book.Store.API.entity.Book;
import com.example.Online.Book.Store.API.service.BookService;
import com.example.Online.Book.Store.API.service.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookResource {

    private final BookService bookService;

    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }

    // Create a new book
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody BookDto bookDto) throws URISyntaxException {
        BookDto result = bookService.create(bookDto);
        return ResponseEntity.created(new URI("/api/book/create" + result.getId())).body(result);
    }

    // Update an existing book
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody BookDto bookDto, @PathVariable Long id) throws URISyntaxException {
        if (!bookDto.getId().equals(id) && bookDto.getId() != 0) {
            return ResponseEntity.badRequest().body("Invalid book ID");
        }
        BookDto result = bookService.update(bookDto);
        return ResponseEntity.ok().body(result);
    }

    // Find all books
    @GetMapping("/all")
    public ResponseEntity<?> findAllBooks() {
        List<BookDto> result = bookService.allBooks();
        return ResponseEntity.ok(result);
    }

    // Find a book by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Book book = bookService.findBookById(id);
        return ResponseEntity.ok(book);
    }

    // Delete a book
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Book result = bookService.deleteBook(id);
        return ResponseEntity.ok(result);
    }

}

