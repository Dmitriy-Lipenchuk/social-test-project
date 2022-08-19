package com.example.socialkata.service.impl.model;

import com.example.socialkata.dao.abstracts.GenericDao;
import com.example.socialkata.model.entity.media.Image;
import com.example.socialkata.service.abstracts.model.ImageService;
import com.example.socialkata.service.impl.GenericServiceAbstract;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl extends GenericServiceAbstract<Image, Long> implements ImageService {

    public ImageServiceImpl(GenericDao<Image, Long> dao) {
        super(dao);
    }
}
