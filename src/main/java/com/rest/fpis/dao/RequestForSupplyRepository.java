package com.rest.fpis.dao;

import com.rest.fpis.domain.ItemOfRequestEntity;
import com.rest.fpis.domain.ProductEntity;
import com.rest.fpis.domain.RequestForSupplyEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface RequestForSupplyRepository extends CrudRepository<RequestForSupplyEntity, Long> {

}
