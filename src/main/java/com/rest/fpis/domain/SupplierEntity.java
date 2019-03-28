package com.rest.fpis.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "suppliers")
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;

    @Column
    private String vatNumber;

    @Column
    private String supplierName;

    @Column
    private String bankName;

    @Column
    private String email;

    @Column
    private String numberOfAccount;

    @Column
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "cityId")
    private CityEntity cityEntity;

    public SupplierEntity() {
    }

    public SupplierEntity(Long id, String vatNumber, String supplierName, String bankName, String email, String numberOfAccount, String phoneNumber, CityEntity cityEntity) {
        this.id = id;
        this.vatNumber = vatNumber;
        this.supplierName = supplierName;
        this.bankName = bankName;
        this.email = email;
        this.numberOfAccount = numberOfAccount;
        this.phoneNumber = phoneNumber;
        this.cityEntity = cityEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(String numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CityEntity getCityEntity() {
        return cityEntity;
    }

    public void setCityEntity(CityEntity cityEntity) {
        this.cityEntity = cityEntity;
    }
}
