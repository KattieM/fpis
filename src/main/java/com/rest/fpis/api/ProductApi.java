package com.rest.fpis.api;


import com.rest.fpis.domain.ProductEntity;
import com.rest.fpis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:9006")
@RestController
@RequestMapping("/product")
public class ProductApi {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/returnAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<ProductEntity> getProducts(){
        return productService.returnAll();
    }
}
