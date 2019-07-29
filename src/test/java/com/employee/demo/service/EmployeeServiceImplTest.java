package com.employee.demo.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.employee.demo.model.Employee;
import com.employee.demo.repository.EmployeeRepository;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {
	
	@Mock
	EmployeeRepository employeeRepositoryMock;
	
	@InjectMocks
	EmployeeServiceImpl employeeServiceMock;
	
	Employee emp;
	
	@Before
	public void init()
	{
		emp=new Employee();
		emp.setDept("IT/HR");
		emp.setName("TeamIng");
		
	}

	@Test
	public void testCreateEmployee() {
	when(employeeRepositoryMock.save(Mockito.any())).thenReturn(emp);
	
	Employee emp1=new Employee();
	emp1.setDept("IT/HR");
	emp1.setName("TeamIng");
	Employee emp2=employeeServiceMock.createEmployee(emp1);
	assertEquals(emp2.getDept(), emp.getDept());
	}

	@Test
	public void testDeleteEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateEmployee() {
		fail("Not yet implemented");
	}

}
