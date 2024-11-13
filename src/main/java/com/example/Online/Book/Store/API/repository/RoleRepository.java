/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:25.10.2024
 * TIME:2:08
 */
package com.example.Online.Book.Store.API.repository;

import com.example.Online.Book.Store.API.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String roleUser);
}
