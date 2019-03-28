package com.rest.fpis.dao;

import com.rest.fpis.domain.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long>{

    public EmployeeEntity findByUsername(String username);
}
