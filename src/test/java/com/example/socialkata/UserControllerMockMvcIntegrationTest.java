package com.example.socialkata;
import com.example.socialkata.mapper.UserMapper;
import com.example.socialkata.model.entity.user.User;
import com.example.socialkata.repository.UserRepository;
import com.example.socialkata.service.UserDtoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.CoreMatchers.is;

    @SpringBootTest
    @AutoConfigureMockMvc
    public class UserControllerMockMvcIntegrationTest {

        @Autowired
        private UserMapper userMapper;
        @Autowired
        private UserRepository userRepository;

        @Autowired
        private UserDtoService userDtoService;
        @Autowired
        MockMvc mockMvc;

        @BeforeEach
        public void  createUser() {
            user.setUserId(1L);
            user.setFirstName(userDtoService.getUserById(1L).getFirstName());

        }
        private User user = new User();
        private ObjectMapper objectMapper = new ObjectMapper();
        @AfterEach
        public void resetDb() {
           userRepository.deleteAll();
        }

        //Get User - 200 Success
        @Test
        public void getUserToIdSuccess() throws Exception {

            mockMvc.perform(MockMvcRequestBuilders.get("/api/user/{userId}", 1))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(jsonPath("$.userId",is(1)))
                    .andExpect(jsonPath("$.firstName").value(userDtoService.getUserById(1L).getFirstName()));
        }


    }
