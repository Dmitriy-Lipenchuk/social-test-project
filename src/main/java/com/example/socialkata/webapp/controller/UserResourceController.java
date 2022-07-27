package com.example.socialkata.webapp.controller;

import com.example.socialkata.model.dto.UserDto;
import com.example.socialkata.service.UserDtoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/user")
public class UserResourceController {

    private final UserDtoService userDtoService;

    @GetMapping(value = "/{userId}")
    public UserDto getUserDto(@PathVariable Long userId) {
        return userDtoService.getUserById(userId);
    }

}