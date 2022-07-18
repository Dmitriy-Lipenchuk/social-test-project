package com.example.socialkata.dao.abstracts.model;

import com.example.socialkata.model.entity.user.Role;

public interface RoleDao {
    Role getRoleByName(String name);

}
