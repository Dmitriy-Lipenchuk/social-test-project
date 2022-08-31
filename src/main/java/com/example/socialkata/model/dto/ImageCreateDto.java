package com.example.socialkata.model.dto;

import com.example.socialkata.dao.abstracts.dto.validation.groups.OnCreate;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImageCreateDto {
    @ApiModelProperty
    @NotBlank(message = "url can't be empty", groups = OnCreate.class)
    private String url;

    @ApiModelProperty
    @NotNull(message = "description can't be null", groups = OnCreate.class)
    private String description;

    @ApiModelProperty
    @NotNull(message = "userId can't be null", groups = OnCreate.class)
    private Long userId;
}
