package com.example.socialkata.service.impl;
import com.example.socialkata.mapper.UserMapper;
import com.example.socialkata.model.dto.UserDto;
import com.example.socialkata.model.entity.user.User;
import com.example.socialkata.repository.UserRepository;
import com.example.socialkata.service.UserDtoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDtoServiceImpl implements UserDtoService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;
    @Override
    public UserDto getUserById(Long id){
        Optional<User> user = userRepository.findById(id);
        return userMapper.entityToDto(user.get());

    }

}
