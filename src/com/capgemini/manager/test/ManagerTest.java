package com.capgemini.manager.test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employe.model.Employee;
import com.capgemini.manager.model.Manager;

public class ManagerTest {
	Manager manager;
	
	@Before
	public void setUp()
	{
		manager=new Manager(102,"sree",25000,500);
	}
	
	
	@Test
	public void toCheckTheObjectsWithDefaultConstructor()
	{
		Manager manager=new Manager();
		assertNotNull(manager);
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
	public void toCheckTotalGrossSalary()
	{
		assertEquals(44000,manager.getEmployeeGrossSalary(),0.01);
		
	}
	@Test
	public void toCheckTotalNetSalary()
	{
		assertEquals(5200,manager.getEmployeeNetSalary(),0.01);
		
	}

}
