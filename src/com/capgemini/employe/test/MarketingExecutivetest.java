package com.capgemini.employe.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


import com.capgemini.employe.model.MarketingExecutive;

public class MarketingExecutivetest {
	MarketingExecutive  marketingexecutiver;
	
	@Before
	public void setUp()
	{
		   marketingexecutiver=new  MarketingExecutive(103, "sreevidhya", 20000, 500,50);
	}
	
	@Test
	public void toCheckTheObjectsWithDefaultConstructor()
	{
		 MarketingExecutive  marketingexecutiver=new  MarketingExecutive();
		assertNotNull(marketingexecutiver);
	}
	@Test
	public void testBankAccountObjectisCreatedWithParameterizedConstructor() {
		
		
		assertEquals(103, marketingexecutiver.getEmployeeId());
		assertEquals("sreevidhya", marketingexecutiver.getEmployeename());
		assertEquals(20000.0, marketingexecutiver.getBasicSalary(),0.01);
		assertEquals(500.0, marketingexecutiver.getMedical(), 0.01);
		assertEquals(50.0, marketingexecutiver.getEmployeeTravelledKilometers(), 0.01);
	}
	
	@Test
	public void testCheckGrossSalary()
	{
		assertEquals(32250.0, marketingexecutiver.getEmployeeGrossSalary(), 0.01);
	}
	@Test
	public void testCheckNetSalary()
	{
		assertEquals(28050.0, marketingexecutiver. getEmployeeNetSalary(), 0.01);
	}
	
	
	
	
	
	
	

}
