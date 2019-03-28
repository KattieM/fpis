package com.rest.fpis.service;

import com.rest.fpis.domain.ProductEntity;
import com.rest.fpis.domain.UnitOfMeasurementEntity;

public interface UnitOfMeasurementService {
    public Iterable<UnitOfMeasurementEntity> returnAll();
}
