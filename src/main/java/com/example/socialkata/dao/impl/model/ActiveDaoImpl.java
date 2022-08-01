package com.example.socialkata.dao.impl.model;

import com.example.socialkata.dao.abstracts.model.ActiveDao;
import com.example.socialkata.dao.impl.GenericDaoAbstract;
import com.example.socialkata.model.entity.user.Active;
import org.springframework.stereotype.Repository;

@Repository
public class ActiveDaoImpl extends GenericDaoAbstract<Active, Long> implements ActiveDao {

}
