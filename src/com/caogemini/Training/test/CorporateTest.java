package com.caogemini.Training.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.caogemini.Training.model.CorporateTraining;

public class CorporateTest {

	@Test
	public void testToCheckObjectIsCreatedWithDefaultConstructor() {
		CorporateTraining corporateTraining = new CorporateTraining();
		assertNotNull(corporateTraining);
	}
	@Test
	public void testToCheckObjectIsCreatedWithDParameterizedConstructor() {
		CorporateTraining corporateTraining = new CorporateTraining(174798,"Big Data",35000,4);
		assertEquals(174798, corporateTraining.getTrainingId());
		assertEquals("Big Data", corporateTraining.getTrainingsubject());
		assertEquals(35000, corporateTraining.getTrainingfee(),0.01);
		assertEquals(4,corporateTraining.getDays());
	}
	
	@Test
	public void testToCheckOrderValue() {
		CorporateTraining corporateTraining = new CorporateTraining(174798,"Big Data",35000,4);
		assertEquals(140000, corporateTraining.getOrderValue(),0.01);
	}


}
