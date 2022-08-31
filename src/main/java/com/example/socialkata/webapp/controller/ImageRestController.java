package com.example.socialkata.webapp.controller;

import com.example.socialkata.dao.abstracts.dto.validation.groups.OnCreate;
import com.example.socialkata.model.dto.ImageCreateDto;
import com.example.socialkata.model.dto.ImageDto;
import com.example.socialkata.model.entity.media.Image;
import com.example.socialkata.service.abstracts.model.ImageService;
import com.example.socialkata.webapp.converter.ImageMapper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/images")
@Validated(OnCreate.class)
public class ImageRestController {

    private final ImageMapper imageMapper;

    private final ImageService imageService;

    @Autowired
    public ImageRestController(ImageMapper imageMapper, ImageService imageService) {
        this.imageMapper = imageMapper;
        this.imageService = imageService;
    }


    @PostMapping
    @ApiOperation(value = "image create API")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Image created", response = ImageDto.class),
            @ApiResponse(code = 400, message = "Bad request properties")
    })
    public ResponseEntity<?> createImage(@Valid @ApiParam @RequestBody ImageCreateDto imageCreateDto) {
        Image image = imageMapper.imageCreateDtoToImage(imageCreateDto);

        imageService.create(image);

        return ResponseEntity.ok(imageMapper.imageToImageDto(image));
    }

}
