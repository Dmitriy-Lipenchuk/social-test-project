package com.example.socialkata.webapp.converter;

import com.example.socialkata.exception.StorageException;
import com.example.socialkata.model.dto.ImageCreateDto;
import com.example.socialkata.model.dto.ImageDto;
import com.example.socialkata.model.entity.media.Image;
import com.example.socialkata.model.entity.user.User;
import com.example.socialkata.service.abstracts.model.UserService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class ImageMapper {

    @Autowired
    private UserService userService;

    @Mapping(target = "media.mediaType", expression = "java(com.example.socialkata.model.entity.media.MediaType.IMAGE)")
    @Mapping(target = "media.user", source = "userId", qualifiedByName = "getUser")
    @Mapping(target = "media.url", source = "url")
    @Mapping(target = "description", source = "description")
    public abstract Image imageCreateDtoToImage(ImageCreateDto imageCreateDto);

    @Mapping(source = "image.media.url", target = "url")
    @Mapping(source = "image.media.persistDateTime", target = "persistDateTime")
    public abstract ImageDto imageToImageDto(Image image);

    @Named("getUser")
    protected User getUser(Long userId) {
        return userService.getById(userId).orElseThrow(() -> new StorageException("No user with ID: " + userId + " was found"));
    }
}
