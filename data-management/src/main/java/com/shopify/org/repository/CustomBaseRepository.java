package com.shopify.org.repository;

public interface CustomBaseRepository<T> {

    T refresh(T toRefresh);

}
