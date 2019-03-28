package com.rest.fpis.api;


import com.rest.fpis.domain.SupplierEntity;
import com.rest.fpis.domain.UnitOfMeasurementEntity;
import com.rest.fpis.service.SupplierService;
import com.rest.fpis.service.UnitOfMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:9006")
@RestController
@RequestMapping("/supplier")
public class SupplierApi {

    @Autowired
    SupplierService supplierService;

    @RequestMapping(value = "/returnAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SupplierEntity> getSuppliers(){
        return supplierService.returnAll();
    }
}
