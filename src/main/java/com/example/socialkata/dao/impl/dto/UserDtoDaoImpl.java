package com.example.socialkata.dao.impl.dto;

import com.example.socialkata.dao.abstracts.dto.UserDtoDao;
import com.example.socialkata.model.dto.UserDto;
import com.example.socialkata.model.entity.user.User;
import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

import java.util.Optional;

@Repository
public class UserDtoDaoImpl implements UserDtoDao {

    @PersistenceContext
    private EntityManager entityManager;

    public UserDto findUserDtoById(Long id) {
        return entityManager.createQuery("select new com.example.socialkata.model.dto.UserDto(" +
                        "userId,firstName,lastName,dateOfBirth,education,aboutMe,avatar,email,password,city,linkSite,profession,role.name,status,active.name" +
                        ") from User where userId = :id", UserDto.class)
                .setParameter("id", id).getSingleResult();
    }

    public Optional<User> findId(Long id) {
        User user = entityManager.createQuery("from User where userId = :id", User.class)
                .setParameter("id", id).getSingleResult();
        return Optional.ofNullable(user);
    }

    public boolean isExist(Long userId) {
        return entityManager.createQuery("select case when (count(*)>0) then true else false end from User u where u.userId = :id", Boolean.class)
                .setParameter("id", userId).getSingleResult();
    }

}


