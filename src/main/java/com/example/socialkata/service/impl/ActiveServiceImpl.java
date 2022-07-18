package com.example.socialkata.service.impl;

import com.example.socialkata.dao.abstracts.GenericDao;
import com.example.socialkata.model.entity.user.Active;
import org.springframework.stereotype.Service;

@Service
public class ActiveServiceImpl extends GenericServiceAbstract<Active, Long>{

    public ActiveServiceImpl(GenericDao<Active, Long> dao) {
        super(dao);
    }

}
