package com.example.socialkata.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String education;
    private String aboutMe;
    private String avatar;
    private String email;
    private String password;
    private String city;
    private String linkSite;
    private String profession;
    private String roleName;
    private String status;
    private String activeName;

}
