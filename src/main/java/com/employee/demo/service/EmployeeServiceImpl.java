package com.employee.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.model.Employee;
import com.employee.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee emp) {

		return employeeRepository.save(emp);
	}

	@Override
	public void deleteEmployee(Long id) {

		Optional<Employee> employeeRepo = employeeRepository.findById(id);
		employeeRepository.deleteById(id);

	}

	@Override
	public Employee updateEmployee(Long id, Employee emp) {

		Employee employeeRepo = employeeRepository.findById(id).get();
		employeeRepo.setName(emp.getName());
		employeeRepo.setDept(emp.getDept());
		employeeRepository.save(employeeRepo);
		return employeeRepo;
	}

}
