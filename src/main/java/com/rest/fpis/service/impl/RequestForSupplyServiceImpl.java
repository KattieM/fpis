package com.rest.fpis.service.impl;

import com.rest.fpis.dao.ItemOfRequestRepository;
import com.rest.fpis.dao.RequestForSupplyRepository;
import com.rest.fpis.domain.ItemOfRequestEntity;
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
        for (ItemOfRequestEntity item:items) {
            item.setRequestForSupplyEntity(requestForSupplyEntity);
            itemOfRequestRepository.save(item);
        }
        RequestForSupplyEntity request = requestForSupplyRepository.save(requestForSupplyEntity);
        request.setItems(items);

        return request;
    }

    @Override
    public Boolean deleteRequestForSupply(Long id) {
        //TODO napravi funkciju koja brise po request for supply-u iteme
        requestForSupplyRepository.deleteById(id);
        return !requestForSupplyRepository.findById(id).isPresent();
    }


}
