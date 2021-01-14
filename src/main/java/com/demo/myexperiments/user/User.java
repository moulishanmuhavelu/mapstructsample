package com.demo.myexperiments.user;

import lombok.Data;

@Data
public class User {
    private long userId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double salary;
    private String role;

    private String fullName;

    private UserAddress address;

}
