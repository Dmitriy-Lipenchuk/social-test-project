package com.example.socialkata.webapp.controller;
import com.example.socialkata.dao.abstracts.dto.UserDtoDao;
import com.example.socialkata.model.dto.UserDto;
import com.example.socialkata.service.abstracts.dto.UserDtoService;
import io.swagger.models.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

    @Operation (summary = "Get User by id")
    @ApiResponses(
            value =
                    {
                       @ApiResponse(responseCode = "200", description = "Successful response", content = @Content (schema = @Schema(implementation = UserDtoDao.class))),
                       @ApiResponse(responseCode = "400", description = "Bad Request, User with this id was not found in the database.",
                               content = @Content (schema = @Schema(implementation = UserDtoDao.class)))                    }
    )

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserDto(@PathVariable Long userId ) {
        if(userDtoService.isExist(userId)){
            return ResponseEntity.ok().body(userDtoService.findUserDtoById(userId));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }


}
