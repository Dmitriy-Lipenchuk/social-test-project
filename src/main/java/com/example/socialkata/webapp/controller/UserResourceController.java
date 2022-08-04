package com.example.socialkata.webapp.controller;
import com.example.socialkata.dao.abstracts.dto.UserDtoDao;
import com.example.socialkata.service.abstracts.dto.UserDtoService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @ApiResponses(value = {

            @ApiResponse (code = 200, message = "OK", response = UserDtoDao.class),

            @ApiResponse (code = 400, message = "BAD_REQUEST", response =UserDtoDao.class)

    })

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserDto(@PathVariable Long userId ) {
        if(userDtoService.isExist(userId)){
            return ResponseEntity.ok().body(userDtoService.findUserDtoById(userId));
        } else {

             return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User with this id was not found in the database.");
        }
    }


}
