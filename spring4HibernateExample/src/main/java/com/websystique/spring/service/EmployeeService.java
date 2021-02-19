package com.websystique.spring.service;

import java.util.List;

import com.websystique.spring.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);

	List<Employee> findAllEmployees();

	void deleteEmployeeByEmployeeCode(int employeeCode);

	Employee findByEmployeeCode(int employeeCode);

	void updateEmployee(Employee employee);
}
