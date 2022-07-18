package com.example.socialkata.service.impl;

import com.example.socialkata.dao.abstracts.GenericDao;
import com.example.socialkata.dao.abstracts.model.RoleDao;
import com.example.socialkata.model.entity.user.Role;
import com.example.socialkata.service.abstracts.model.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends GenericServiceAbstract<Role, Long> implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(GenericDao<Role, Long> dao, RoleDao roleDao) {
        super(dao);
        this.roleDao = roleDao;
    }

    @Override
    public Role getRoleByName(String name) {
        return roleDao.getRoleByName(name);
    }
}
