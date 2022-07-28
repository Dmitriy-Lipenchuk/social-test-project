package com.example.socialkata;

import com.github.database.rider.core.api.connection.ConnectionHolder;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.util.EntityManagerProvider;
import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

class UserControllerTest extends AbstractTest {

    private ConnectionHolder connectionHolder = () ->
            EntityManagerProvider.instance("junit5-pu").clear().connection();

    @Test
    @DataSet(value = "users.xml, role.xml, active.xml", cleanAfter = true)
    void getByIdTest() throws Exception {

        long id = 5;

        mvc.perform(
                get("/users/{id}", id))
//                .andExpect(status().isOk())
                .andExpect(jsonPath("$.userId").value(id))
                .andExpect(jsonPath("$.email").value("d4444@gmail.com"));

    }
}