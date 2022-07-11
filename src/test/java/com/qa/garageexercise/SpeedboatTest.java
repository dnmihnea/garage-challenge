package com.qa.garageexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpeedboatTest {
	
	@Test
	public void holesTest() {
		Speedboat boat = new Speedboat(0, 2020, 40, "Speedboat", 2);
		assertEquals(2, boat.getHoles());
	}

}
