package com.rest.fpis.service.impl;

import com.rest.fpis.dao.SupplierRepository;
import com.rest.fpis.domain.SupplierEntity;
import com.rest.fpis.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    @Override
    public Iterable<SupplierEntity> returnAll() {
        return supplierRepository.findAll();
    }
}
