package com.example.socialkata.dao.abstracts.dto;

import com.example.socialkata.model.dto.UserDto;
import com.example.socialkata.model.entity.user.User;

import java.util.Optional;

public interface UserDtoDao {
    UserDto findUserDtoById(Long id);

    Optional<User> findId(Long id);

    boolean isExist(Long userId);
}
