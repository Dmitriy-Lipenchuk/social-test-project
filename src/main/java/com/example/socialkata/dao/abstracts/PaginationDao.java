package com.example.socialkata.dao.abstracts;

import java.util.List;
import java.util.Map;

public interface PaginationDao<T> {

    List<T> getItems(Map<String, Object> parameters);

    int getItemsCount(Map<String, Object> param);
}
