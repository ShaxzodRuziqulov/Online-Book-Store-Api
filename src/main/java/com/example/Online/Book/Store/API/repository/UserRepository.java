/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:24.10.2024
 * TIME:14:42
 */
package com.example.Online.Book.Store.API.repository;

import com.example.Online.Book.Store.API.entity.User;
import com.example.Online.Book.Store.API.entity.enumirated.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "select u from users u where u.id=:id and u.status=:status")
    User updateStatus(Long id, Status status);

    Optional<User> findByUserName(String username);

    Optional<User> findByEmail(String email);
}
