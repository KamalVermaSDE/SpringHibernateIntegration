package org.springMVC.restFull.controller;

import java.util.List;

import org.springMVC.restFull.bean.Employee;
import org.springMVCrestFull.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")

public class EmployeeController {

	
	EmployeeService employeeService = new EmployeeService();

	@RequestMapping(value = "/employee", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Employee> getEmployees() {
		List<Employee> listOfEmployee = employeeService.getAllEmployees();
		return listOfEmployee;
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}

	@RequestMapping(path = "/employees", method = RequestMethod.POST, headers = "Accept=application/json")
	public Employee addCountry(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);

	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);

	}	
}
