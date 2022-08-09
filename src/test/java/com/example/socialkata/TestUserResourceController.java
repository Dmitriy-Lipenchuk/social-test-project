package com.example.socialkata;
import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.CoreMatchers.is;

    public class TestUserResourceController extends AbstractTest{

        @Test
        @DataSet(value = "users.xml", cleanAfter = true)
        public void getUserToIdSuccess() throws Exception {

            mvc.perform(MockMvcRequestBuilders.get("/api/user/{userId}", 1))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(jsonPath("$.userId",is(1)))
                    .andExpect(jsonPath("$.firstName").value("Pep"))
                    .andExpect  (jsonPath("$.lastName").value("Flow"))
                    .andExpect  (jsonPath("$.dateOfBirth").value("1901-07-28"))
                    .andExpect  (jsonPath("$.education").value("Master degree"))
                    .andExpect  (jsonPath("$.aboutMe").value("Pep Flow, Москва"))
                    .andExpect  (jsonPath("$.avatar").value("Pep ☺"))
                    .andExpect  (jsonPath("$.email").value("admin@gmail.com"))
                    .andExpect  (jsonPath("$.password").value("$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW"))
                    .andExpect  (jsonPath("$.city").value("Москва"))
                    .andExpect  (jsonPath("$.linkSite").value("admin@gmail.com"))
                    .andExpect  (jsonPath("$.profession").value("Lirik"))
                    .andExpect  (jsonPath("$.roleName").value("ROLE_ADMIN"))
                    .andExpect  (jsonPath("$.status").value("Chill"))
                    .andExpect  (jsonPath("$.activeName").value("active"));

        }


    }


