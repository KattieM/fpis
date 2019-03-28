package com.rest.fpis.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity(name = "Employee")
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @JsonProperty("id")
    private Long id;

    @Column
    private String nameSurname;

    @Column
    private EmployeeTypeEnum typeOfEmployee;

    @Column
    private String username;

    @Column
    private String password;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Long id, String nameSurname, EmployeeTypeEnum typeOfEmployee) {
        this.id = id;
        this.nameSurname = nameSurname;
        this.typeOfEmployee = typeOfEmployee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public EmployeeTypeEnum getTypeOfEmployee() {
        return typeOfEmployee;
    }

    public void setTypeOfEmployee(EmployeeTypeEnum typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
