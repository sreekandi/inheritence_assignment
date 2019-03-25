package com.capgemini.employe.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


import com.capgemini.employe.model.Employee;



public class EmployeeTest {
	public Employee employee;
	
	
	@Before
	public void setUp() {
	 employee = new Employee(101, "vidhya", 50000, 5000);
	}
	
	@Test
	public void testBankAccountObjectisCreatedWithDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);
	}

	@Test
	public void testBankAccountObjectisCreatedWithParameterizedConstructor() {
		Employee employee = new Employee(101, "vidhya", 20000, 500);
		assertNotNull(employee);
		assertEquals(101, employee.getEmployeeId());
		assertEquals("vidhya", employee.getEmployeename());
		assertEquals(20000.0, employee.getBasicSalary(),0.01);
		assertEquals(500.0, employee.getMedical(), 0.01);

	}
	@Test
	public void toCalculateGrossSalary()
	{
		
		
		assertEquals(80000,employee.getEmployeeGrossSalary(),0.01);
	}
	@Test
	public void toCalculateNetSalary()
	{
		
		
		assertEquals(10200,employee.getEmployeeNetSalary(),0.01);
	}

	
}
