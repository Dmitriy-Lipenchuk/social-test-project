package com.example.socialkata.webapp.controller.upload;

import com.example.socialkata.exception.StorageException;
import com.example.socialkata.service.abstracts.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class UploadController {

    private final StorageService storageService;

    @Autowired
    public UploadController(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping("/uploads")
    public ResponseEntity<?> upload(@RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        if (file != null) {
            String fileName = storageService.store(file);

            return ResponseEntity.ok(fileName);
        }

        throw new StorageException("Can't save file");
    }

}

