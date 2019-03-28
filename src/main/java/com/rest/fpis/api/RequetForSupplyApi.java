package com.rest.fpis.api;

import com.rest.fpis.dao.ItemOfRequestRepository;
import com.rest.fpis.dao.RequestForSupplyRepository;
import com.rest.fpis.domain.ItemOfRequestEntity;
import com.rest.fpis.domain.RequestForSupplyEntity;
import com.rest.fpis.filters.SecurityFilter;
import com.rest.fpis.service.RequestForSupplyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:9005")
@RestController
@RequestMapping("/request")
public class RequetForSupplyApi {

    private static final Logger logger = LoggerFactory.getLogger(RequetForSupplyApi.class);
    @Autowired
    RequestForSupplyService requestForSupplyService;

    @Autowired
    ItemOfRequestRepository itemOfRequestRepository;

    @Autowired
    RequestForSupplyRepository requestForSupplyRepository;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    RequestForSupplyEntity saveRequest(@RequestBody RequestForSupplyEntity requestForSupplyEntity) throws Exception {
        return requestForSupplyService.saveRequestForSupply(requestForSupplyEntity);
    }

    @RequestMapping(value = "/returnById/{requestId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<RequestForSupplyEntity> getRequest(@PathVariable Long requestId){
        return requestForSupplyService.findById(requestId);
    }
    @RequestMapping(value = "/delete/{requestID}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Boolean deleteRequest(@PathVariable Long requestID){
        return requestForSupplyService.deleteRequestForSupply(requestID);
    }
}
