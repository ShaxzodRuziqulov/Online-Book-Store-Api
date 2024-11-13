/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:24.10.2024
 * TIME:14:53
 */
package com.example.Online.Book.Store.API.service.mapper;

import com.example.Online.Book.Store.API.entity.Role;
import com.example.Online.Book.Store.API.service.dto.RoleDto;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper extends EntityMapper<RoleDto, Role> {
    RoleDto toDto(Role role);

    Role toEntity(RoleDto roleDto);

    default Role fromId(Long id) {
        if (id == 0) {
            return null;
        }
        Role role = new Role();
        role.setId(id);
        return role;
    }
}
