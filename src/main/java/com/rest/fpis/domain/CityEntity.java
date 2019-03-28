package com.rest.fpis.domain;

import javax.persistence.*;

@Entity
@Table(name="cities")
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String postCode;

    @Column(name="name")
    private String cityName;

    public CityEntity(String postCode, String cityName) {
        this.postCode = postCode;
        this.cityName = cityName;
    }

    public CityEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
