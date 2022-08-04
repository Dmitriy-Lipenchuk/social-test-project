package com.example.socialkata;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.CoreMatchers.is;

    public class UserControllerIntegrationTest extends AbstractTest{

        @Test
        public void getUserToIdSuccess() throws Exception {

            mvc.perform(MockMvcRequestBuilders.get("/api/user/{userId}", 1))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(jsonPath("$.userId",is(1)))
                    .andExpect(jsonPath("$.firstName").value("Pep"));
        }


    }