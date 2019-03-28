package com.rest.fpis.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long productId;

    @Column
    private String productName;

    @Column
    private int supplyLevel;

    @ManyToOne
    @JoinColumn(name = "idum")
    private UnitOfMeasurementEntity unitOfMeasurementEntity;

    public ProductEntity(String productName, int supplyLevel, UnitOfMeasurementEntity unitOfMeasurementEntity) {
        this.productName = productName;
        this.supplyLevel = supplyLevel;
        this.unitOfMeasurementEntity = unitOfMeasurementEntity;
    }

    public ProductEntity() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSupplyLevel() {
        return supplyLevel;
    }

    public void setSupplyLevel(int supplyLevel) {
        this.supplyLevel = supplyLevel;
    }

    public UnitOfMeasurementEntity getUnitOfMeasurementEntity() {
        return unitOfMeasurementEntity;
    }

    public void setUnitOfMeasurementEntity(UnitOfMeasurementEntity unitOfMeasurementEntity) {
        this.unitOfMeasurementEntity = unitOfMeasurementEntity;
    }
}
