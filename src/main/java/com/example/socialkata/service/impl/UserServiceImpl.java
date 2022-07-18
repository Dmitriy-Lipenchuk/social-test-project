package com.example.socialkata.service.impl;

import com.example.socialkata.dao.abstracts.GenericDao;
import com.example.socialkata.model.entity.user.User;
import com.example.socialkata.service.abstracts.model.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends GenericServiceAbstract<User, Long> implements UserService {

    public UserServiceImpl(GenericDao<User, Long> dao) {
        super(dao);
    }
}
