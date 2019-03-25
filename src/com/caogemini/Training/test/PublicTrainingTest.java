package com.caogemini.Training.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.caogemini.Training.model.PublicTraining;

public class PublicTrainingTest {


	@Test
	public void testTheDefaultValues()
	{
		PublicTraining ptraining=new PublicTraining();
				assertNotNull(ptraining);
	}
	@Test
	public void testToCheckObjectIsCreatedWithDParameterizedConstructor() {
		PublicTraining publicTraining = new PublicTraining(174798,"JEE",5000,50);
		assertEquals(174798, publicTraining.getTrainingId());
		assertEquals("JEE", publicTraining.getTrainingsubject());
		assertEquals(5000, publicTraining.getTrainingfee(),0.01);
		assertEquals(50,publicTraining.getParticipants());
	}
	
	@Test
	public void testToCheckOrderValue() {
		PublicTraining publicTraining = new PublicTraining(174798,"JEE",5000,50);
		assertEquals(250000, publicTraining.getOrderValue(),0.01);
	}
}
