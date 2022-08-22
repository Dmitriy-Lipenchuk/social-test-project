package com.example.socialkata.dao.impl.model;

import com.example.socialkata.dao.abstracts.model.VideoDao;
import com.example.socialkata.dao.impl.GenericDaoAbstract;
import com.example.socialkata.model.entity.media.Video;
import org.springframework.stereotype.Repository;

@Repository
public class VideoDaoImpl extends GenericDaoAbstract<Video, Long> implements VideoDao {
}
