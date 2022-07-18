package com.example.socialkata.dao.abstracts.model;

import com.example.socialkata.dao.abstracts.GenericDao;
import com.example.socialkata.model.entity.user.Role;

public interface RoleDao extends GenericDao<Role, Long> {
    Role getRoleByName(String name);

}
