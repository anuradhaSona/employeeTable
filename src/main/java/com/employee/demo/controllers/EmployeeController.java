package com.employee.demo.controllers;

import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.model.Employee;
import com.employee.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;

	@PostMapping("/createEmployee")
	public Employee createEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);

	}
	
	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, Employee employee){
		
		Employee empUpdate = service.updateEmployee(id, employee);
		return new ResponseEntity<Employee>(empUpdate, HttpStatus.OK);
		
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable("id") Long id) {
		service.deleteEmployee(id);
		return new ResponseEntity( HttpStatus.OK);
	}
}