package com.rest.fpis.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "requestsForSupplies")
public class RequestForSupplyEntity {
    @Id
    @JsonProperty("id")
    private Long id;

    @Column
    private Date dateOfDelivery;

    @Column
    private Date dateOfOrder;

    @ManyToOne
    @JoinColumn (name="employeeId")
    private EmployeeEntity employeeEntity;

    @ManyToOne
    @JoinColumn(name = "supplierEntity")
    private SupplierEntity supplierEntity;

    @OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true, mappedBy = "requestForSupplyEntity")
    private List<ItemOfRequestEntity> items;

    public RequestForSupplyEntity() {
        items = new LinkedList<>();
    }

    public RequestForSupplyEntity(Long id, Date dateOfDelivery, Date dateOfOrder, EmployeeEntity employeeEntity, SupplierEntity supplierEntity, List<ItemOfRequestEntity> itemOfRequestEntities) {
        this.id = id;
        this.dateOfDelivery = dateOfDelivery;
        this.dateOfOrder = dateOfOrder;
        this.employeeEntity = employeeEntity;
        this.supplierEntity = supplierEntity;
        this.items = itemOfRequestEntities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public SupplierEntity getSupplierEntity() {
        return supplierEntity;
    }

    public void setSupplierEntity(SupplierEntity supplierEntity) {
        this.supplierEntity = supplierEntity;
    }

    public List<ItemOfRequestEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemOfRequestEntity> items) {
        this.items = items;
    }
}
