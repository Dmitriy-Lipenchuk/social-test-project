package com.example.socialkata;

import com.example.socialkata.model.entity.user.User;
import com.example.socialkata.webapp.controller.UserTestController;
import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.api.configuration.Orthography;
import com.github.database.rider.core.api.connection.ConnectionHolder;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.core.api.dataset.ExpectedDataSet;
import com.github.database.rider.core.api.dataset.SeedStrategy;
import com.github.database.rider.junit5.DBUnitExtension;
import com.github.database.rider.junit5.api.DBRider;
import com.github.database.rider.junit5.util.EntityManagerProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * comments
 */
public class UserControllerTest extends AbstractTest {

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
    public void shouldListUsers() {
        assertThat(userTestController.getAllUsers()).isNotNull();
        assertThat(userTestController.getAllUsers().size()).isEqualTo(10);
    }

//    @Test
//    @ExpectedDataSet("empty.xml")
//    public void shouldDeleteUser() {
//        assertThat(userTestController).isNotNull();
//        assertThat(userTestController.getAllUsers().size()).isEqualTo(0);
//        userTestController.getById(2L).ifPresent(userTestController::delete);
//        //assertThat(userRepository.count()).isEqualTo(2); //assertion is made by @ExpectedDataset
//    }
//
//    @Test
//    @DataSet(cleanBefore = true)//as we didn't declared a dataset DBUnit wont clear the table
//    @ExpectedDataSet("expected-users.xml")
//    public void shouldInsertUser() {
//        assertThat(userTestController).isNotNull();
//        assertThat(userTestController.getAllUsers().size()).isEqualTo(0);
//        userTestController.create(new User());
//        //assertThat(userRepository.count()).isEqualTo(1); //assertion is made by @ExpectedDataset
//    }
}