package com.rest.fpis.service.impl;

import com.rest.fpis.api.RequetForSupplyApi;
import com.rest.fpis.dao.ItemOfRequestRepository;
import com.rest.fpis.dao.RequestForSupplyRepository;
import com.rest.fpis.domain.ItemOfRequestEntity;
import com.rest.fpis.domain.ItemOfRequestKey;
import com.rest.fpis.domain.ProductEntity;
import com.rest.fpis.domain.RequestForSupplyEntity;
import com.rest.fpis.service.EmployeeService;
import com.rest.fpis.service.ItemOfRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemOfRequestServiceImpl implements ItemOfRequestService {

    private static final Logger logger = LoggerFactory.getLogger(ItemOfRequestServiceImpl.class);
    @Autowired
    ItemOfRequestRepository itemOfRequestRepository;

    @Autowired
    RequestForSupplyRepository requestForSupplyRepository;

    @Override
    public Iterable<ItemOfRequestEntity> returnAll() {
        return itemOfRequestRepository.findAll();
    }

    @Override
    public Optional<ItemOfRequestEntity> returnById(ItemOfRequestKey itemOfRequestKey) {
        return itemOfRequestRepository.findById(itemOfRequestKey);
    }

    @Override
    public ItemOfRequestEntity saveItemOfRequestEntity(ItemOfRequestEntity itemOfRequestEntity) {
        Long id = itemOfRequestEntity.getId().getRequestForSupply();
        Optional<RequestForSupplyEntity> request = requestForSupplyRepository.findById(id);
        if(request.isPresent()){
            itemOfRequestEntity.setRequestForSupplyEntity(request.get());
            return itemOfRequestRepository.save(itemOfRequestEntity);
        }
        return null;
    }

    @Override
    public Boolean deleteItemOfRequestEntity(ItemOfRequestEntity itemOfRequestEntity) {
        itemOfRequestRepository.delete(itemOfRequestEntity);
        return !itemOfRequestRepository.findById(itemOfRequestEntity.getId()).isPresent();
    }



}
