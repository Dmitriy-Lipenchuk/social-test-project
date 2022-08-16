package com.example.socialkata.service.impl;

import com.example.socialkata.exception.FileNotFoundException;
import com.example.socialkata.exception.StorageException;
import com.example.socialkata.model.entity.media.MediaType;
import com.example.socialkata.service.abstracts.StorageService;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

@Service
public class StorageServiceImpl implements StorageService {

    private final String IMG_FOLDER = "src/main/resources/uploads/img/";
    private final String VIDEO_FOLDER = "src/main/resources/uploads/video/";
    private final String AUDIO_FOLDER = "src/main/resources/uploads/audio/";

    @Override
    public String store(MultipartFile file) throws IOException {
        checkDirectory();

        MediaType type = parseFileType(file);
        String fileName = UUID.randomUUID() + "." + file.getOriginalFilename();

        switch (type) {
            case IMAGE -> file.transferTo(Path.of(IMG_FOLDER + fileName));
            case VIDEO -> file.transferTo(Path.of(VIDEO_FOLDER + fileName));
            case AUDIO -> file.transferTo(Path.of(AUDIO_FOLDER + fileName));
            default -> throw new StorageException("Could not store file: " + fileName);
        }

        return fileName;
    }

    @Override
    public byte[] getData(String fileName, MediaType type) throws IOException {
        checkDirectory();

        Path path;
        InputStream fileStream;

        try {
            switch (type) {
                case IMAGE:
                    path = Path.of(IMG_FOLDER, fileName);

                    if (Files.exists(path)) {
                        fileStream = Files.newInputStream(path);
                    } else {
                        fileStream = new FileInputStream(IMG_FOLDER + "default.jpg");
                    }

                    return IOUtils.toByteArray(fileStream);

                case VIDEO:
                    path = Path.of(VIDEO_FOLDER, fileName);
                    fileStream = Files.newInputStream(path);

                    return IOUtils.toByteArray(fileStream);

                case AUDIO:
                    return null;

                default:
                    throw new FileNotFoundException("Could not read path: " + fileName);
            }
        } catch (IOException e) {
            throw new FileNotFoundException("Could not read path: " + fileName, e);
        }
    }

    @Override
    public Resource getResource(String fileName, MediaType type) throws IOException {

        return new ByteArrayResource(getData(fileName, type));
    }

    private void checkDirectory() throws IOException {
        Files.createDirectories(Path.of(IMG_FOLDER));
        Files.createDirectories(Path.of(VIDEO_FOLDER));
        Files.createDirectories(Path.of(AUDIO_FOLDER));
    }

    private MediaType parseFileType(MultipartFile file) {
        String mimeType = file.getContentType();
        String fileType = "";

        if (mimeType != null) {
            fileType = mimeType.split("/")[0].toUpperCase();
        }

        try {
            return MediaType.valueOf(fileType);
        } catch (IllegalArgumentException e) {
            throw new StorageException("Invalid format of file:  " + file.getOriginalFilename(), e);
        }
    }
}
