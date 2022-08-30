package com.example.socialkata.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImageDto {
    private Long id;
    private String description;
    private String url;
    private LocalDateTime persistDateTime;
}
