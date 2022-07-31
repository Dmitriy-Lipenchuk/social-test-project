package com.example.socialkata.webapp.controller;

import com.example.socialkata.model.dto.UserDto;
import com.example.socialkata.service.abstracts.dto.UserDtoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/user")
public class UserResourceController {

    private final UserDtoService userDtoService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserDto(@PathVariable Long userId ) {
        if(userDtoService.isExist(userId)){
            return new ResponseEntity<>(userDtoService.findUserDtoById(userId),HttpStatus.OK);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}