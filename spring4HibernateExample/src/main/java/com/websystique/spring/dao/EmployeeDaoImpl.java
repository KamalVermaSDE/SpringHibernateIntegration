package com.websystique.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao{

	public void saveEmployee(Employee employee) {
		persist(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployees() {
		Criteria criteria = getSession().createCriteria(Employee.class);
		return (List<Employee>) criteria.list();
	}

	public void deleteEmployeeByEmployeeCode(int employeeCode) {
		Query query = getSession().createSQLQuery("delete from Employee where EMPLOYEE_Code = :employeeCode");
		query.setInteger("employeeCode", employeeCode);
		query.executeUpdate();
	}

	
	public Employee findByEmployeeCode(int employeeCode){
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("employeeCode",employeeCode));
		return (Employee) criteria.uniqueResult();
	}
	
	public void updateEmployee(Employee employee){
		getSession().update(employee);
	}
	
}
