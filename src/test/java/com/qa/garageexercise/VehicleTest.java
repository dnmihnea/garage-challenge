package com.qa.garageexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VehicleTest {
	
	Vehicle vehicle = new Vehicle(4, 2004, 50, "Car");
	
	@Test
	public void runTest() {
		assertEquals(51, vehicle.run());
	}
	
	@Test
	public void getWheelsTest() {
		assertEquals(4, vehicle.getWheels());
	}
	
	@Test
	public void getYearTest() {
		assertEquals(2004, vehicle.getYear());
	}
	
	@Test
	public void getMileageTest() {
		assertEquals(50, vehicle.getMileage());
	}
	
	@Test
	public void getTypeTest() {
		assertEquals("Car", vehicle.getType());
	}

}
