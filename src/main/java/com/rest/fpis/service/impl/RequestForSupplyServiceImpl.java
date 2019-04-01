package com.rest.fpis.service.impl;

import com.rest.fpis.dao.ItemOfRequestRepository;
import com.rest.fpis.dao.RequestForSupplyRepository;
import com.rest.fpis.domain.ItemOfRequestEntity;
import com.rest.fpis.domain.ItemOfRequestKey;
import com.rest.fpis.domain.RequestForSupplyEntity;
import com.rest.fpis.service.RequestForSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class RequestForSupplyServiceImpl implements RequestForSupplyService{

    @Autowired
    RequestForSupplyRepository requestForSupplyRepository;

    @Autowired
    ItemOfRequestRepository itemOfRequestRepository;

    @Override
    public Optional<RequestForSupplyEntity> findById(Long id) {
        //TODO napravi funkciju koja vraca sve po Request-u za iteme
        return requestForSupplyRepository.findById(id);
    }

    @Override
    public RequestForSupplyEntity saveRequestForSupply(RequestForSupplyEntity requestForSupplyEntity) {
        List<ItemOfRequestEntity> items = requestForSupplyEntity.getItems();
        Iterable<ItemOfRequestEntity> allItems = itemOfRequestRepository.findAll();
        RequestForSupplyEntity request = null;
        if(requestForSupplyRepository.findById(requestForSupplyEntity.getId()).isPresent()){
            for(ItemOfRequestEntity item: allItems){
                if(item.getId().getRequestForSupply()==requestForSupplyEntity.getId()){
                    ItemOfRequestKey key = new ItemOfRequestKey(requestForSupplyEntity.getId(), item.getId().getOrderNumber());
                    itemOfRequestRepository.deleteById(key);
                }
            }
            for (ItemOfRequestEntity item:items) {
                item.setRequestForSupplyEntity(requestForSupplyEntity);
                itemOfRequestRepository.save(item);
            }

            request = requestForSupplyRepository.save(requestForSupplyEntity);
        } else{
            List<ItemOfRequestEntity> list = requestForSupplyEntity.getItems();
            requestForSupplyEntity.setItems(null);
            request = requestForSupplyRepository.save(requestForSupplyEntity);
            for (ItemOfRequestEntity item:list) {
                item.setRequestForSupplyEntity(request);
                itemOfRequestRepository.save(item);
            }
        }

        return request;
    }

    @Override
    public Boolean deleteRequestForSupply(Long id) {
        //TODO napravi funkciju koja brise po request for supply-u iteme
        requestForSupplyRepository.deleteById(id);
        return !requestForSupplyRepository.findById(id).isPresent();
    }


}
