package com.example.socialkata.service.impl.model;

import com.example.socialkata.dao.abstracts.GenericDao;
import com.example.socialkata.model.entity.media.Video;
import com.example.socialkata.service.abstracts.model.VideoService;
import com.example.socialkata.service.impl.GenericServiceAbstract;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl extends GenericServiceAbstract<Video, Long> implements VideoService {

    public VideoServiceImpl(GenericDao<Video, Long> dao) {
        super(dao);
    }
}
