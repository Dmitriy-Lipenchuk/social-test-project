package com.example.socialkata;

import com.example.socialkata.webapp.controller.UserTestController;
import com.github.database.rider.core.api.connection.ConnectionHolder;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.core.api.dataset.SeedStrategy;
import com.github.database.rider.junit5.util.EntityManagerProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class UserControllerTest extends AbstractTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserTestController userTestController;

    private ConnectionHolder connectionHolder = () ->
            EntityManagerProvider.instance("junit5-pu").clear().connection();

    @BeforeEach
    @DataSet(value = "users.xml",  strategy = SeedStrategy.CLEAN_INSERT)
    public void setUpUsers() {
    }

    @Test
    @DataSet(value = "users.xml", cleanAfter = true)
    public void getByIdTest() throws Exception {

        long id = 5;

        mockMvc.perform(
                get("/users/{id}", id))
//                .andExpect(status().isOk())
                .andExpect(jsonPath("$.userId").value(id))
                .andExpect(jsonPath("$.email").value("d4444@gmail.com"));

    }
}