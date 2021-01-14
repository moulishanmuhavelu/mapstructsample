package com.demo.myexperiments.user;

import com.demo.myexperiments.entity.Employee;
import com.demo.myexperiments.entity.EmployeeAddress;
import com.demo.myexperiments.entity.Role;
import com.demo.myexperiments.mapper.EmployeeMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@AllArgsConstructor
public class RegistrationController {

    private final EmployeeMapper employeeMapper;

    @GetMapping(path = { "/register" })
    public ResponseEntity<User> getCreditLimits(String propositionProductId) {
        User user = getUser();
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).cacheControl(CacheControl.noCache())
                .body(user);
    }

    private User getUser() {
        Employee employee = createEmployee();
        return employeeMapper.employeeToUser(employee);
    }

    private Employee createEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Mouli");
        employee.setLastName("Shanmuhavelu");
        employee.setId(261711);
        employee.setSalary(BigDecimal.valueOf(1000));
        employee.setDateOfBirth(LocalDate.now());

        employee.setRole(createRole());
        employee.setAddress(createAddress());

        return employee;
    }

    private Role createRole() {
        Role role = new Role();
        role.setRoleName("Vice President");
        return role;
    }

    private EmployeeAddress createAddress() {
        EmployeeAddress employeeAddress = new EmployeeAddress();
        employeeAddress.setDoorNo(11);
        employeeAddress.setStreetName("Amerikalaan");
        employeeAddress.setCity("Almere");
        employeeAddress.setPostCode("3687IP");
        employeeAddress.setCountry("Netherlands");
        return employeeAddress;
    }

}