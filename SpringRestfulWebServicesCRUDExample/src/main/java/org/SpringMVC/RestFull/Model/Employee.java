package org.SpringMVC.RestFull.Model;

public class Employee{
	
	int id;
	String employeeName;	
	String city;
	
	public Employee() {
		super();
	}
	public Employee(int i, String employeeName,String city) {
		super();
		this.id = i;
		this.employeeName = employeeName;
		this.city=city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String countryName) {
		this.employeeName = countryName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
	
}