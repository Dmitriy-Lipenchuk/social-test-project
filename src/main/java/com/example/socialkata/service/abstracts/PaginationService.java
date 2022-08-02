package com.example.socialkata.service.abstracts;

import com.example.socialkata.model.dto.PageDto;

import java.util.Map;

public interface PaginationService<T> {
    PageDto<T> getPage(String methodName, Map<String, Object> parameters);
}
