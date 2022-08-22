package com.example.socialkata.dao.impl.model;

import com.example.socialkata.dao.abstracts.model.AudioDao;
import com.example.socialkata.dao.impl.GenericDaoAbstract;
import com.example.socialkata.model.entity.media.Audio;
import org.springframework.stereotype.Repository;

@Repository
public class AudioDaoImpl extends GenericDaoAbstract<Audio, Long> implements AudioDao {
}
