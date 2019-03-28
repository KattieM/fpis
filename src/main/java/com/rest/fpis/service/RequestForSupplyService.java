package com.rest.fpis.service;

import com.rest.fpis.domain.EmployeeEntity;
import com.rest.fpis.domain.RequestForSupplyEntity;

import java.util.Optional;

public interface RequestForSupplyService {
    public Optional<RequestForSupplyEntity> findById(Long id);
    public RequestForSupplyEntity saveRequestForSupply(RequestForSupplyEntity requestForSupplyEntity);
    public Boolean deleteRequestForSupply(Long id);
}
