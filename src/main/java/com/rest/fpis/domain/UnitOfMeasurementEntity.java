package com.rest.fpis.domain;

import javax.persistence.*;

@Entity
@Table(name="unitsOfMeasurements")
public class UnitOfMeasurementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUM;

    @Column
    private String nameUM;

    public UnitOfMeasurementEntity() {
    }

    public UnitOfMeasurementEntity(String nameUM) {
        this.nameUM = nameUM;
    }

    public Long getIdUM() {
        return idUM;
    }

    public void setIdUM(Long idUM) {
        this.idUM = idUM;
    }

    public String getNameUM() {
        return nameUM;
    }

    public void setNameUM(String nameUM) {
        this.nameUM = nameUM;
    }
}
