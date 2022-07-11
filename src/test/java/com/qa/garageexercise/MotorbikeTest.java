package com.qa.garageexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MotorbikeTest {
	
	@Test
	public void offroadTest() {
		Motorbike bike = new Motorbike (2, 2004, 80, "Motorbike", true);
		assertEquals(true, bike.isOffroad());
	}

}
