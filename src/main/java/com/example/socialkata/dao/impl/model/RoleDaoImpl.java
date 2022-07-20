package com.example.socialkata.dao.impl.model;

import com.example.socialkata.dao.abstracts.model.RoleDao;
import com.example.socialkata.dao.impl.GenericDaoAbstract;
import com.example.socialkata.model.entity.user.Role;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends GenericDaoAbstract<Role, Long> implements RoleDao {

    @Override
    public Role getRoleByName(String name) {
        return entityManager.createQuery("SELECT r FROM Role r WHERE r.name = :name", Role.class)
                .setParameter("name", name).getSingleResult();
    }
}
