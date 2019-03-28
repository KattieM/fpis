package com.rest.fpis.service;

import com.rest.fpis.domain.ItemOfRequestEntity;
import com.rest.fpis.domain.ItemOfRequestKey;

import java.util.Optional;

public interface ItemOfRequestService {
    public Iterable<ItemOfRequestEntity> returnAll();
    public Optional<ItemOfRequestEntity> returnById(ItemOfRequestKey itemOfRequestKey);
    public ItemOfRequestEntity saveItemOfRequestEntity(ItemOfRequestEntity itemOfRequestEntity);
    public Boolean deleteItemOfRequestEntity(ItemOfRequestEntity itemOfRequestEntity);
}
