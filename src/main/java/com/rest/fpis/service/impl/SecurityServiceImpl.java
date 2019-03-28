package com.rest.fpis.service.impl;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rest.fpis.dao.EmployeeRepository;
import com.rest.fpis.domain.EmployeeEntity;
import com.rest.fpis.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Service
public class SecurityServiceImpl implements SecurityService{
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
    @Autowired
    private TokenProcessingService tokenProcessingService;
//
//    public String authenticateUser(EmployeeEntity employeeEntity) throws JsonProcessingException, Exception {
//        EmployeeEntity userDb = employeeRepository.findByUsername(employeeEntity.getUsername());
//
//        if(userDb == null){
//            throw new IllegalArgumentException("NO_SUCH_USER");
//        }
//        //User localUser = users.get(0);
//
//        if(!employeeEntity.getPassword().equals(userDb.getPassword())){
//            throw new Exception();
//        }
//
//        return tokenProcessingService.createToken(userDb);
//    }
//
    public EmployeeEntity authenticateHttpRequest(HttpServletRequest httpServletRequest) throws JsonParseException, JsonMappingException, IOException{
        return tokenProcessingService.authenticateRequest(httpServletRequest);
    }

}
