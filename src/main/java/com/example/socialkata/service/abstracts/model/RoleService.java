package com.example.socialkata.service.abstracts.model;

import com.example.socialkata.model.entity.user.Role;
import com.example.socialkata.service.abstracts.GenericService;

public interface RoleService extends GenericService<Role, Long> {
    Role getRoleByName(String name);
}
