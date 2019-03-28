package com.rest.fpis.service.impl;

import com.rest.fpis.dao.ProductRepository;
import com.rest.fpis.domain.ProductEntity;
import com.rest.fpis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Iterable<ProductEntity> returnAll() {
        return productRepository.findAll();
    }
}
