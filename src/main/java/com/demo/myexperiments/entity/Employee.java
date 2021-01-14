package com.demo.myexperiments.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String title;
    private LocalDate dateOfBirth;
    private String city;
    private BigDecimal salary;
    private Role role;

    private EmployeeAddress address;

}
