package com.demo.myexperiments.user;

import lombok.Data;

@Data
public class UserAddress {
    private String streetName;
    private String country;
    private String city;
    private String postCode;
}
