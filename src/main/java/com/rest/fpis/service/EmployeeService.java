package com.rest.fpis.service;

import com.rest.fpis.domain.EmployeeEntity;

import java.util.Optional;

public interface EmployeeService {
    public Optional<EmployeeEntity> findById(Long employeeId);
    public EmployeeEntity saveEmployeeEntity(EmployeeEntity employeeEntity);
    public Boolean deleteEmployeeEntity(EmployeeEntity employeeEntity);
}
