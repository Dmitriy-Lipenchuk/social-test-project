package com.example.socialkata.dao.abstracts.model;

import com.example.socialkata.dao.abstracts.GenericDao;
import com.example.socialkata.model.entity.user.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserDao extends GenericDao<User, Long> {
    UserDetails getByEmail(String email);
}
