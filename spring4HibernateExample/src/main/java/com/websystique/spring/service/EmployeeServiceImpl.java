package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.EmployeeDao;
import com.websystique.spring.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}

	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	public void deleteEmployeeByEmployeeCode(int employeeCode) {
		dao.deleteEmployeeByEmployeeCode(employeeCode);
	}

	public Employee findByEmployeeCode(int employeeCode) {
		return dao.findByEmployeeCode(employeeCode);
	}

	public void updateEmployee(Employee employee){
		dao.updateEmployee(employee);
	}
}
