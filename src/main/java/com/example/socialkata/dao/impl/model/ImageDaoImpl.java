package com.example.socialkata.dao.impl.model;

import com.example.socialkata.dao.abstracts.model.ImageDao;
import com.example.socialkata.dao.impl.GenericDaoAbstract;
import com.example.socialkata.model.entity.media.Image;
import org.springframework.stereotype.Repository;

@Repository
public class ImageDaoImpl extends GenericDaoAbstract<Image, Long> implements ImageDao {
}
