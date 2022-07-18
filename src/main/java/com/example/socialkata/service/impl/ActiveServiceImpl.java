package com.example.socialkata.service.impl;

import com.example.socialkata.dao.abstracts.model.ActiveDao;
import com.example.socialkata.model.entity.user.Active;
import com.example.socialkata.service.abstracts.model.ActiveService;
import org.springframework.stereotype.Service;

@Service
public class ActiveServiceImpl extends GenericServiceAbstract<Active, Long> implements ActiveService {

    public ActiveServiceImpl(ActiveDao activeDao) {
        super(activeDao);
    }
}
