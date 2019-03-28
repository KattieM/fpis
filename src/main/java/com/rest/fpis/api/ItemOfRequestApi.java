package com.rest.fpis.api;

import com.rest.fpis.domain.ItemOfRequestEntity;
import com.rest.fpis.domain.ProductEntity;
import com.rest.fpis.domain.RequestForSupplyEntity;
import com.rest.fpis.service.ItemOfRequestService;
import com.rest.fpis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:9006")
@RestController
@RequestMapping("/item")
public class ItemOfRequestApi {
    @Autowired
    ItemOfRequestService itemOfRequestService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<ItemOfRequestEntity> getItems(){
        return itemOfRequestService.returnAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ItemOfRequestEntity saveRequest(@RequestBody ItemOfRequestEntity itemOfRequestEntity) throws Exception {
        return itemOfRequestService.saveItemOfRequestEntity(itemOfRequestEntity);
    }

}
