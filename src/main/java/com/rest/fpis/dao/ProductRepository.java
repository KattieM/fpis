package com.rest.fpis.dao;

import com.rest.fpis.domain.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
