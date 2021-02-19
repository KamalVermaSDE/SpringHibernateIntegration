package com.websystique.spring.dao;

import java.util.List;

import com.websystique.spring.model.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	void deleteEmployeeByEmployeeCode(int employeeCode);
	
	Employee findByEmployeeCode(int employeeCode);
	
	void updateEmployee(Employee employee);
}
