package com.caogemini.Training.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.caogemini.Training.model.Training;

public class TrainingTest {

	@Test
	public void testTheDefaultValues()
	{
		Training training=new Training();
		assertNotNull(training);
	}
	@Test
	public void testThewithValues()
	{
		Training training=new Training(174798,"vidhya",5000.0);
		assertEquals(174798,training.getTrainingId());
		assertEquals("vidhya",training.getTrainingsubject());
		assertEquals(5000.0,training.getTrainingfee(),0.01);
		
	}

	
}
