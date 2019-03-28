package com.rest.fpis.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ItemOfRequestKey implements Serializable {
    @Column(name = "requestForSupplyEntity")
    private Long requestForSupplyEntity;

    @Column (name = "orderNumber")
    private Long orderNumber;

    public ItemOfRequestKey() {
    }

    public ItemOfRequestKey(Long requestForSupply, Long orderNumber) {
        this.requestForSupplyEntity = requestForSupply;
        this.orderNumber = orderNumber;
    }

    public Long getRequestForSupply() {
        return requestForSupplyEntity;
    }

    public void setRequestForSupply(Long requestForSupply) {
        this.requestForSupplyEntity = requestForSupply;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemOfRequestKey)) return false;
        ItemOfRequestKey that = (ItemOfRequestKey) o;
        return Objects.equals(getRequestForSupply(), that.getRequestForSupply()) &&
                Objects.equals(getOrderNumber(), that.getOrderNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRequestForSupply(), getOrderNumber());
    }
}
