package com.example.socialkata.webapp.controller.resource;

import com.example.socialkata.AbstractTest;
import com.example.socialkata.model.dto.MediaGetDto;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

class ResourceControllerTest extends AbstractTest {

    @Test
    void getImage() throws Exception {
        MediaGetDto imageMediaGetDto = new MediaGetDto("kata.jpg", com.example.socialkata.model.entity.media.MediaType.IMAGE);
        mvc.perform(MockMvcRequestBuilders.get("/uploads")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(imageMediaGetDto)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$", notNullValue()));
    }

    @Test
    void getVideo() throws Exception {
        MediaGetDto videoMediaGetDto = new MediaGetDto("SampleVideo_1280x720_5mb.mp4", com.example.socialkata.model.entity.media.MediaType.VIDEO);
        mvc.perform(MockMvcRequestBuilders.get("/uploads")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(videoMediaGetDto)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$", notNullValue()));
    }

    @Test
    void getAudio() throws Exception {
        MediaGetDto audioMediaGetDto = new MediaGetDto("file_example_MP3_1MG.mp3", com.example.socialkata.model.entity.media.MediaType.AUDIO);
        mvc.perform(MockMvcRequestBuilders.get("/uploads")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(audioMediaGetDto)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$", notNullValue()));
    }

    @Test
    void badInput() throws Exception {
        MediaGetDto mediaGetDtoNullName = new MediaGetDto(null, com.example.socialkata.model.entity.media.MediaType.AUDIO);
        mvc.perform(MockMvcRequestBuilders.get("/uploads")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(mediaGetDtoNullName)))
                .andExpect(MockMvcResultMatchers.status().isNotFound());

        MediaGetDto mediaGetDtoNullType = new MediaGetDto("kata.jpg", null);
        mvc.perform(MockMvcRequestBuilders.get("/uploads")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(mediaGetDtoNullType)))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    void wrongFileName() throws Exception {
        MediaGetDto notExistImage = new MediaGetDto("not_exist.not_exist", com.example.socialkata.model.entity.media.MediaType.IMAGE);
        mvc.perform(MockMvcRequestBuilders.get("/uploads")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(notExistImage)))
                .andExpect(MockMvcResultMatchers.status().isNotFound());

        MediaGetDto notExistVideo = new MediaGetDto("not_exist.not_exist", com.example.socialkata.model.entity.media.MediaType.VIDEO);
        mvc.perform(MockMvcRequestBuilders.get("/uploads")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(notExistVideo)))
                .andExpect(MockMvcResultMatchers.status().isNotFound());

        MediaGetDto notExistAudio = new MediaGetDto("not_exist.not_exist", com.example.socialkata.model.entity.media.MediaType.AUDIO);
        mvc.perform(MockMvcRequestBuilders.get("/uploads")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(notExistAudio)))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

}