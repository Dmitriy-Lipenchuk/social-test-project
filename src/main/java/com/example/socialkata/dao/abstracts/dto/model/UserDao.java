package com.example.socialkata.dao.abstracts.dto.model;

import com.example.socialkata.dao.abstracts.GenericDao;
import com.example.socialkata.model.entity.user.User;

public interface UserDao extends GenericDao<User, Long> {

    User getUserById(Long id);
}
