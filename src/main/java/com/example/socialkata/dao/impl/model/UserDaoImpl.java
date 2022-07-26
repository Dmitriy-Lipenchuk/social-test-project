package com.example.socialkata.dao.impl.model;

import com.example.socialkata.dao.abstracts.model.UserDao;
import com.example.socialkata.dao.impl.GenericDaoAbstract;
import com.example.socialkata.model.entity.user.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends GenericDaoAbstract<User, Long> implements UserDao {
    public UserDetails getByEmail(String username){
       return (UserDetails) entityManager.createQuery("select a from User as a WHERE a.email=:emailParam")
                .setParameter("emailParam",username)
                .getSingleResult();
    }
}
