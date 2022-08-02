package com.example.socialkata.dao.impl.model;

import com.example.socialkata.dao.abstracts.model.UserDao;
import com.example.socialkata.dao.impl.GenericDaoAbstract;
import com.example.socialkata.model.entity.user.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends GenericDaoAbstract<User, Long> implements UserDao {

    @Override
    public User getUserById(Long id) {
        return null;
    }
}
