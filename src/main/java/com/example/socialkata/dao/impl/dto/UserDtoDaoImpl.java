package com.example.socialkata.dao.impl.dto;

import com.example.socialkata.dao.abstracts.dto.UserDtoDao;
import com.example.socialkata.model.dto.UserDto;
import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

@Repository
public class UserDtoDaoImpl implements UserDtoDao {

    @PersistenceContext
    private EntityManager entityManager;
    public UserDto findUserDtoById(Long id) {
        return entityManager.createQuery("select new com.example.socialkata.model.dto.UserDto(" +
                        "userId," +
                        "firstName," +
                        "lastName," +
                        "dateOfBirth," +
                        "education," +
                        "aboutMe," +
                        "avatar," +
                        "email," +
                        "password," +
                        "city," +
                        "linkSite," +
                        "profession," +
                        "role.name," +
                        "status," +
                        "active.name" +
                        ") from User where userId = :id", UserDto.class)
                .setParameter("id", id).getSingleResult();
    }
    public boolean isExist(Long userId) {
        return entityManager.createQuery("select (count(id)) > 0 from User u where u.userId = :id", Boolean.class)
                .setParameter("id", userId).getSingleResult();
    }

}


