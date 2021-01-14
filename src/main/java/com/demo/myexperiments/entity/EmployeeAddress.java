package com.demo.myexperiments.entity;

import lombok.Data;

@Data
public class EmployeeAddress {
    private int doorNo;
    private String streetName;
    private String city;
    private String postCode;
    private String country;
}
