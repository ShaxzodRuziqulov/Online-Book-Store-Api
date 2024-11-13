/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:24.10.2024
 * TIME:16:41
 */
package com.example.Online.Book.Store.API.repository;

import com.example.Online.Book.Store.API.entity.Book;
import com.example.Online.Book.Store.API.entity.enumirated.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query(value = "select b from book b where b.id=:id and b.status=:status")
    Book updateStatus(Long id, Status status);
}
