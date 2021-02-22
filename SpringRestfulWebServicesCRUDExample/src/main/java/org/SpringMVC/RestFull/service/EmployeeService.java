package org.SpringMVC.RestFull.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.SpringMVC.RestFull.Model.Employee;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class EmployeeService {

 static HashMap<Integer,Employee> employeeIdMap=getEmployeeIdMap();


 public EmployeeService() {
  super();

  if(employeeIdMap==null)
  {
	  employeeIdMap=new HashMap<Integer,Employee>();
  // Creating some objects of Country while initializing
   Employee emp1=new Employee(1, "Kamal","Faridabad");
   Employee emp2=new Employee(2, "Gaurav","Rewari");
   Employee emp3=new Employee(3, "Dinesh","Hishar");
   Employee emp4=new Employee(4, "Amit","Narnaul");


   employeeIdMap.put(1,emp1);
   employeeIdMap.put(2,emp2);
   employeeIdMap.put(3,emp3);
   employeeIdMap.put(4,emp4);
  }
 }

 public List<Employee> getAllEmployees()
 {
  List<Employee> employees = new ArrayList<Employee>(employeeIdMap.values());
  return employees;
 }

 public Employee getEmployee(int id)
 {
	 Employee employee= employeeIdMap.get(id);
  return employee;
 }
 public Employee addEmployee(Employee employee)
 {
	 employee.setId(getMaxId()+1);
  employeeIdMap.put(employee.getId(), employee);
  return employee;
 }
 
 public Employee updateEmployee(Employee employee)
 {
  if(employee.getId()<=0)
   return null;
  employeeIdMap.put(employee.getId(), employee);
  return employee;

 }
 public void deleteEmployee(int id)
 {
	 employeeIdMap.remove(id);
 }

 public static HashMap<Integer, Employee> getEmployeeIdMap() {
  return employeeIdMap;
 }
 

 // Utility method to get max id
 public static int getMaxId()
 {   int max=0;
 for (int id:employeeIdMap.keySet()) {  
  if(max<=id)
   max=id;

 }  
 return max;
 }
}

