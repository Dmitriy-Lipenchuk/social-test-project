package com.example.socialkata.model.dto;

import com.example.socialkata.model.entity.media.MediaType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MediaGetDto {
    private String fileName;
    private MediaType mediaType;
}
