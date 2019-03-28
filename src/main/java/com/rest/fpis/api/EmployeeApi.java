package com.rest.fpis.api;

import com.rest.fpis.domain.EmployeeEntity;
import com.rest.fpis.service.EmployeeService;
import com.rest.fpis.service.impl.SecurityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:9005")
@RestController
@RequestMapping("/employee")
public class EmployeeApi {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    SecurityServiceImpl securityService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) throws Exception {
        return employeeService.saveEmployeeEntity(employeeEntity);
    }

    @RequestMapping(value = "/returnById/{employeeId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<EmployeeEntity> getEmployee(@PathVariable Long employeeId){
        return employeeService.findById(employeeId);
    }
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Boolean getEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.deleteEmployeeEntity(employeeEntity);
    }
//    @RequestMapping(value="/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String login(@RequestBody EmployeeEntity user, HttpServletRequest httpServletRequest) throws JsonProcessingException, Exception{
//        System.out.println("trying to authenticate user");
//        String token = securityService.authenticateUser(user);
//        user = userDao.findByUsername(user.getUsername());
//        return "{\"userId\":\""+user.getId()+"\",\"token\":\""+token+"\"}";
//
//    }
}
