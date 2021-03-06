package com.virtualpairprogrammers.employeemanagement;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.virtualpairprogrammers.employeemanagement.domain.Employee;

@Stateless
public class EmployeeManagementImplementation implements
		EmployeeManagementService {

	@Override
	public void registerEmployee(Employee employee) {

	}

	@Override
	public List<Employee> getAllEmployees() {
		Employee e1 = new Employee("James","Green","Writer",1700);
		Employee e2 = new Employee("Sharon","White","Editor",2100);
		Employee e3 = new Employee("Darren","Blue","Manager",31250);
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		return employees;
	}

	@Override
	public List<Employee> searchBySurname(String surname) {
		return null;
	}

}
