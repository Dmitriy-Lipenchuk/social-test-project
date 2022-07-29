package com.example.socialkata.model.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class PageDto<T> {

    private Long itemsCount;

    private List<T> items;

    private int itemsOnPage;

    public PageDto<T> setItemsCount(Long itemsCount) {
        this.itemsCount = itemsCount;
        return this;
    }

    public PageDto<T> setItems(List<T> items) {
        this.items = items;
        return this;
    }

    public PageDto<T> setItemsOnPage(int itemsOnPage) {
        this.itemsOnPage = itemsOnPage;
        return this;
    }
}
