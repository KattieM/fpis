package com.rest.fpis.service;


import com.rest.fpis.domain.ProductEntity;

public interface ProductService {
    public Iterable<ProductEntity> returnAll();
}
