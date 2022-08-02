package com.example.socialkata.service.impl;

import com.example.socialkata.dao.abstracts.PaginationDao;
import com.example.socialkata.model.dto.PageDto;
import com.example.socialkata.service.abstracts.PaginationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PaginationServiceImpl<T> implements PaginationService<T> {

    private final Map<String, PaginationDao<T>> paginationsDao;

    @Autowired(required = false)
    public PaginationServiceImpl(Map<String, PaginationDao<T>> paginationsDao) {
        this.paginationsDao = paginationsDao;
    }

    @Override
    public PageDto<T> getPage(String methodName, Map<String, Object> parameters) {
        PaginationDao<T> paginationDao = paginationsDao.get(methodName);

        List<T> items = paginationDao.getItems(parameters);
        int itemsOnPage = items.size();
        int itemsCount = paginationDao.getItemsCount(parameters);

        return new PageDto<T>()
                .setItemsCount(itemsCount)
                .setItems(items)
                .setItemsOnPage(itemsOnPage);
    }
}
