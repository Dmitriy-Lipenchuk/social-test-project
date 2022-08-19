package com.example.socialkata.service.impl.model;

import com.example.socialkata.dao.abstracts.GenericDao;
import com.example.socialkata.model.entity.media.Audio;
import com.example.socialkata.service.abstracts.model.AudioService;
import com.example.socialkata.service.impl.GenericServiceAbstract;
import org.springframework.stereotype.Service;

@Service
public class AudioServiceImpl extends GenericServiceAbstract<Audio, Long> implements AudioService {

    public AudioServiceImpl(GenericDao<Audio, Long> dao) {
        super(dao);
    }
}
