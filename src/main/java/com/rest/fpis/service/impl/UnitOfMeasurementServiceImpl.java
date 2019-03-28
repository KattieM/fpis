package com.rest.fpis.service.impl;

import com.rest.fpis.dao.UnitOfMeasurementRepository;
import com.rest.fpis.domain.UnitOfMeasurementEntity;
import com.rest.fpis.service.UnitOfMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitOfMeasurementServiceImpl implements UnitOfMeasurementService{

    @Autowired
    UnitOfMeasurementRepository unitOfMeasurementRepository;


    @Override
    public Iterable<UnitOfMeasurementEntity> returnAll() {
        return unitOfMeasurementRepository.findAll();
    }
}
