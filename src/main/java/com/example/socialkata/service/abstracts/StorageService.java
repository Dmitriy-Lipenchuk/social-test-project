package com.example.socialkata.service.abstracts;

import com.example.socialkata.model.entity.media.MediaType;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public interface StorageService {
    String store(MultipartFile file) throws IOException;

    byte[] getData(String fileName, MediaType type) throws IOException;

    Resource getResource(String fileName, MediaType type) throws IOException;
}
