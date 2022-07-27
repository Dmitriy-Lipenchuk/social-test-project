package com.example.socialkata.mapper;

import com.example.socialkata.model.dto.UserDto;
import com.example.socialkata.model.entity.user.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto entityToDto(User user);

}
