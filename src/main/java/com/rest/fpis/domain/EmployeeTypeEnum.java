package com.rest.fpis.domain;

import java.util.Arrays;

public enum EmployeeTypeEnum {
    RADNIKUNABAVCI("radnikunabavci"),
    RADNIKUMAGACINU("radnikumagacinu"),
    RADNIKUSERVISU("radnikuservisu");


    private String value;

    EmployeeTypeEnum(String value) {
        this.value = value;
    }

    public static EmployeeTypeEnum fromValue(String value) {
        for (EmployeeTypeEnum employeeTypeEnum : values()) {
            if (employeeTypeEnum.value.equalsIgnoreCase(value)) {
                return employeeTypeEnum;
            }
        }
        throw new IllegalArgumentException(
                "Nepoznat tip radnika " + value + ", dozvoljene vrednosi su : " + Arrays.toString(values()));
    }
}
