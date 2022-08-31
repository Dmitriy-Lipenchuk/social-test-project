package com.example.socialkata.model.dto;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty
    private Long id;

    @ApiModelProperty
    private String description;

    @ApiModelProperty
    private String url;

    @ApiModelProperty
    private LocalDateTime persistDateTime;
}
