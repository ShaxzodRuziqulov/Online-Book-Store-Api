/**
 * Author: Shaxzod Ro'ziqulov
 * User:Ruzikulov
 * DATE:24.10.2024
 * TIME:14:45
 */
package com.example.Online.Book.Store.API.service.mapper;

import com.example.Online.Book.Store.API.entity.User;
import com.example.Online.Book.Store.API.service.dto.RegisterUserDto;
import com.example.Online.Book.Store.API.service.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = RoleMapper.class)
public interface UserMapper extends EntityMapper<UserDto, User> {
    @Mapping(source = "role.id", target = "roleId")
        // `role`dan `id` ni `roleId`ga map qilamiz
    UserDto toDto(User user);

    @Mapping(source = "roleId", target = "role.id")
        // `roleId` ni `role`ning `id` maydoniga o'rnatamiz
    User toEntity(UserDto userDto);
    @Mapping(source = "roleId", target = "role.id")
    User toUser(RegisterUserDto registerUserDto);
}

