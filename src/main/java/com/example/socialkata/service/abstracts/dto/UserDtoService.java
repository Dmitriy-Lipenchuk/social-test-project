package com.example.socialkata.service.abstracts.dto;

import com.example.socialkata.model.dto.UserDto;
import com.example.socialkata.model.entity.user.User;

import java.util.Optional;

public interface UserDtoService {

 UserDto findUserDtoById(Long id);

 Optional<User> findId(Long id);

 boolean isExist(Long userId);

}
