package com.rest.fpis.dao;

import com.rest.fpis.domain.ItemOfRequestEntity;
import com.rest.fpis.domain.ItemOfRequestKey;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ItemOfRequestRepository extends CrudRepository<ItemOfRequestEntity, ItemOfRequestKey> {
}
