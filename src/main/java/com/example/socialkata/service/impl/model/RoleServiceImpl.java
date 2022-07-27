package com.example.socialkata.service.impl.model;

import com.example.socialkata.dao.abstracts.dto.model.RoleDao;
import com.example.socialkata.model.entity.user.Role;
import com.example.socialkata.service.abstracts.model.RoleService;
import com.example.socialkata.service.impl.GenericServiceAbstract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends GenericServiceAbstract<Role, Long> implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        super(roleDao);
        this.roleDao = roleDao;
    }

    @Override
    public Role getRoleByName(String name) {
        return roleDao.getRoleByName(name);
    }
}
