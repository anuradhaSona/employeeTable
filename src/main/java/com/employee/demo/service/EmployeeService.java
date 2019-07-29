package com.employee.demo.service;

import com.employee.demo.model.Employee;

public interface EmployeeService {
	public Employee createEmployee(Employee emp);
	
	public Employee updateEmployee(Long id, Employee emp);

	public void deleteEmployee(Long id);

}
