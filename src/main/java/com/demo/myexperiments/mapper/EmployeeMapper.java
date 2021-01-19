package com.demo.myexperiments.mapper;

import com.demo.myexperiments.entity.Employee;
import com.demo.myexperiments.entity.Role;
import com.demo.myexperiments.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface EmployeeMapper {

    @Mapping(target = "userId", source = "id")
    @Mapping(target = "dateOfBirth", dateFormat = "dd.MMM.yyyy")
    @Mapping(target = "fullName", expression = "java(employee.getFirstName() + \" \" + employee.getLastName())")
    User employeeToUser(Employee employee);

    default String roleToString(Role role) {
        return role.getRoleName();
    }
}
