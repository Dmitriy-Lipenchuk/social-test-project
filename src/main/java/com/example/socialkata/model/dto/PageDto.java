package com.example.socialkata.model.dto;

import java.util.List;

public class PageDto<T> {

    private int itemsCount;
    private List<T> items;
    private int itemsOnPage;

}
