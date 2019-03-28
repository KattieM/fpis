package com.rest.fpis.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "itemsofrequests")
public class ItemOfRequestEntity{
    @EmbeddedId
    private ItemOfRequestKey id;

    @Column
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductEntity productEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("requestForSupplyEntity")
    @JoinColumn(name = "requestForSupplyEntity")
    private RequestForSupplyEntity requestForSupplyEntity;

    public ItemOfRequestEntity(ItemOfRequestKey id, int quantity, ProductEntity productEntity, RequestForSupplyEntity requestForSupplyEntity) {
        this.id = id;
        this.quantity = quantity;
        this.productEntity = productEntity;
        this.requestForSupplyEntity = requestForSupplyEntity;
    }

    public ItemOfRequestEntity() {
    }

    public ItemOfRequestKey getId() {
        return id;
    }

    public void setId(ItemOfRequestKey id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    @JsonIgnore
    public RequestForSupplyEntity getRequestForSupplyEntity() {
        return requestForSupplyEntity;
    }

    public void setRequestForSupplyEntity(RequestForSupplyEntity requestForSupplyEntity) {
        this.requestForSupplyEntity = requestForSupplyEntity;
    }
}
