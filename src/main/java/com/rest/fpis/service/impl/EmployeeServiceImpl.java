package com.rest.fpis.service.impl;

import com.rest.fpis.dao.EmployeeRepository;
import com.rest.fpis.domain.EmployeeEntity;
import com.rest.fpis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Optional<EmployeeEntity> findById(Long employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    public EmployeeEntity saveEmployeeEntity(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public Boolean deleteEmployeeEntity(EmployeeEntity employeeEntity) {
         employeeRepository.delete(employeeEntity);
         if(!employeeRepository.existsById(employeeEntity.getId()))
             return true;
         return false;
    }

    public EmployeeEntity findByUsername(String username){
        return null;
    }
}
