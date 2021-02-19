package com.websystique.spring;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.model.Employee;
import com.websystique.spring.service.EmployeeService;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeService service = (EmployeeService) context.getBean("employeeService");

		/*
		 * Create Employee1
		 */
		Employee employee1 = new Employee();
		employee1.setName("Kamal");
		employee1.setJoiningDate(new LocalDate(2010, 10, 10));
		employee1.setSalary(new BigDecimal(10000));
		employee1.setEmployeeCode(101);

		/*
		 * Create Employee2
		 */
		Employee employee2 = new Employee();
		employee2.setName("Gaurav");
		employee2.setJoiningDate(new LocalDate(2012, 11, 11));
		employee2.setSalary(new BigDecimal(20000));
		employee2.setEmployeeCode(102);
		/*
		 * Create Employee3
		 */
		Employee employee3 = new Employee();
		employee3.setName("Dinesh");
		employee3.setJoiningDate(new LocalDate(2012, 11, 11));
		employee3.setSalary(new BigDecimal(20000));
		employee3.setEmployeeCode(103);
		
		/*
		 * Create Employee4
		 */
		Employee employee4 = new Employee();
		employee4.setName("Amit");
		employee4.setJoiningDate(new LocalDate(2012, 11, 11));
		employee4.setSalary(new BigDecimal(20000));
		employee4.setEmployeeCode(104);

		
		/*
		 * Create Employee5
		 */
		Employee employee5 = new Employee();
		employee5.setName("Kaushal Sir");
		employee5.setJoiningDate(new LocalDate(2012, 11, 11));
		employee5.setSalary(new BigDecimal(20000));
		employee5.setEmployeeCode(105);


		/*
		 * Create Employee6
		 */
		Employee employee6 = new Employee();
		employee6.setName("Abhi Sir");
		employee6.setJoiningDate(new LocalDate(2012, 11, 11));
		employee6.setSalary(new BigDecimal(20000));
		employee6.setEmployeeCode(106);
		/*
		 * Persist both Employees
		 */
		service.saveEmployee(employee1);
		service.saveEmployee(employee2);
		service.saveEmployee(employee3);
		service.saveEmployee(employee4);
		service.saveEmployee(employee5);
		service.saveEmployee(employee6);

		/*
		 * Get all employees list from database
		 */
		List<Employee> employees = service.findAllEmployees();
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		/*
		 * delete an employee
		 */
		service.deleteEmployeeByEmployeeCode(102);

		/*
		 * update an employee
		 */

		Employee employee = service.findByEmployeeCode(101);
		employee.setSalary(new BigDecimal(50000));
		service.updateEmployee(employee);

		/*
		 * Get all employees list from database
		 */
		List<Employee> employeeList = service.findAllEmployees();
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

		context.close();
	}
}
