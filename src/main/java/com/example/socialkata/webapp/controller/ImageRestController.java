package com.example.socialkata.webapp.controller;

import com.example.socialkata.model.dto.ImageCreateDto;
import com.example.socialkata.model.entity.media.Image;
import com.example.socialkata.service.abstracts.model.ImageService;
import com.example.socialkata.webapp.converter.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ImageRestController {

    private final ImageMapper imageMapper;

    private final ImageService imageService;

    @Autowired
    public ImageRestController(ImageMapper imageMapper, ImageService imageService) {
        this.imageMapper = imageMapper;
        this.imageService = imageService;
    }


    @PostMapping("/images")
    public ResponseEntity<?> createImage(@RequestBody ImageCreateDto imageCreateDto) {
        Image image = imageMapper.imageCreateDtoToImage(imageCreateDto);

        imageService.create(image);

        return ResponseEntity.ok(imageMapper.imageToImageDto(image));
    }

}
