package com.example.socialkata.webapp.controller.resource;

import com.example.socialkata.model.dto.MediaGetDto;
import com.example.socialkata.service.abstracts.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

@Controller
public class ResourceController {
    private final StorageService storageService;

    @Autowired
    public ResourceController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping(value = "/uploads")
    public ResponseEntity<?> getMedia(@RequestBody MediaGetDto getDto) throws IOException {

        return ResponseEntity.ok(storageService.getResource(getDto.getFileName(), getDto.getMediaType()));
    }
}
