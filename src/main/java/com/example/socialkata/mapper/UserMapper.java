package com.example.socialkata.mapper;

import com.example.socialkata.model.dto.UserDto;
import com.example.socialkata.model.entity.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class UserMapper {
    @Mapping(source = "userId",target = "userId")
    public abstract UserDto entityToDto(User user) ;

}
