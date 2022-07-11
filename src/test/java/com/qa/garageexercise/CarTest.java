package com.qa.garageexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {
	
	@Test
	public void carAuto() {
		Car car = new Car(4, 2007, 60, "Car", true);
		assertEquals(true, car.isAutomatic());
	}

}
