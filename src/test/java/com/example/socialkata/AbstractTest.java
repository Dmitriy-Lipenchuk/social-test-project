package com.example.socialkata;

import java.io.IOException;

import com.example.socialkata.model.entity.user.User;
import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.api.configuration.Orthography;
import com.github.database.rider.junit5.DBUnitExtension;
import com.github.database.rider.junit5.api.DBRider;
import org.flywaydb.test.annotation.FlywayTest;

import org.flywaydb.test.junit5.FlywayTestExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class) //подключаем спринг в тест
@WebAppConfiguration
@AutoConfigureMockMvc//тестируем ВЕБ приложение
@WithMockUser(roles = "ADMIN")
@ExtendWith(DBUnitExtension.class)
//@ExtendWith(FlywayTestExtension.class)
//@FlywayTest
@DBRider
@SpringBootTest(classes = SocialKataApplication.class)
@DBUnit(caseInsensitiveStrategy = Orthography.LOWERCASE)
public abstract class AbstractTest {
    @Autowired
    protected MockMvc mvc;
    @Autowired
    WebApplicationContext webApplicationContext;

    protected void setUp() {
        mvc = MockMvcBuilders
                .webAppContextSetup(webApplicationContext)
                .apply(springSecurity())
                .build(); //выполняем всю начальную настройку,
        // необходимую для интеграции Spring Security
        // с Spring MVC Test.
    }
    protected String mapToJson(Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(obj);
    }//Метод writeValueAsString класса ObjectMapper
    // генерируют JSON из объекта Java и возвращают сгенерированный JSON
    // в виде строки или массива байтов
    protected <T> T mapFromJson(String json, Class<T> clazz)
            throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, clazz);
    }//метод readValue класса ObjectMapper используем для того,
    //чтобы преобразовать строку JSON в объект Java
}
