package com.employee.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	private String name;

	private String dept;

	public String getDept() {
		return dept;
	}

	public String getName() {
		return name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", dept=" + dept + "]";
	}

}
