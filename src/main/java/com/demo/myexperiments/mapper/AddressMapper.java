package com.demo.myexperiments.mapper;

import com.demo.myexperiments.entity.Employee;
import com.demo.myexperiments.entity.EmployeeAddress;
import com.demo.myexperiments.entity.Role;
import com.demo.myexperiments.user.User;
import com.demo.myexperiments.user.UserAddress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    UserAddress employeeAddressToUserAddress(EmployeeAddress employeeAddress);
}


