package com.example.socialkata.webapp.controller;

import com.example.socialkata.AbstractTest;
import com.example.socialkata.model.dto.ImageCreateDto;
import com.example.socialkata.model.entity.media.Image;
import com.example.socialkata.model.entity.media.Media;
import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestImageController extends AbstractTest {

    @Test
    @DataSet(value = {"users.xml", "active.xml", "role.xml"}, cleanAfter = true)
    void createImage() throws Exception {
        ImageCreateDto imageCreateDto = new ImageCreateDto("test_url", "test_description", 2L);

        mvc.perform(MockMvcRequestBuilders.post("/api/images")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(imageCreateDto)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.url").value("test_url"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.description").value("test_description"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value("1"));

        Media media = entityManager.createQuery("SELECT m FROM Media m where m.url = :url and m.user.userId = : userId", Media.class)
                .setParameter("url", "test_url")
                .setParameter("userId", 2L)
                .getSingleResult();
        Image image = entityManager.createQuery("SELECT i FROM Image i where i.media.id = :mediaId", Image.class)
                .setParameter("mediaId", media.getId())
                .getSingleResult();

        assertEquals(media.getMediaType(), com.example.socialkata.model.entity.media.MediaType.IMAGE);
        assertEquals(media.getUrl(), "test_url");
        assertEquals(media.getUser().getUserId(), 2L);
        assertEquals(image.getDescription(), "test_description");
    }

    @Test
    @DataSet(value = {"users.xml", "active.xml", "role.xml"}, cleanAfter = true)
    void createImage_bad_input() throws Exception {
        ImageCreateDto imageCreateDtoNullUrl = new ImageCreateDto(null, "test_description", 2L);
        mvc.perform(MockMvcRequestBuilders.post("/api/images")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(imageCreateDtoNullUrl)))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());

        ImageCreateDto imageCreateDtoNullUser = new ImageCreateDto("test_url", "test_description", null);
        mvc.perform(MockMvcRequestBuilders.post("/api/images")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(imageCreateDtoNullUser)))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());

        ImageCreateDto imageCreateDtoNullDescription = new ImageCreateDto("test_url", null, 2L);
        mvc.perform(MockMvcRequestBuilders.post("/api/images")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(imageCreateDtoNullDescription)))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
