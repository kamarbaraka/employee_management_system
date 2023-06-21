package com.develhope.employee_management_system;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> getEmployeeByFirstName(String name);
}
