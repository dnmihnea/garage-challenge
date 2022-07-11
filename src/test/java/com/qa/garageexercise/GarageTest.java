package com.qa.garageexercise;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GarageTest {

	Garage garage = new Garage();
	
	@Test
	public void carFixReturn() {
		Car car = new Car(4, 2007, 60, "Car", true);
		garage.addVehicle(car);
		assertEquals(230, garage.fixReturn());
		
		
	}
	
	@Test
	public void bikeFixReturn() {
		Motorbike bike = new Motorbike(2, 2019, 120,"Motorbike", false);
		garage.addVehicle(bike);
		assertEquals(210, garage.fixReturn());
	}
	
	@Test
	public void boatFixReturn() {
		Speedboat boatOne = new Speedboat(0, 2001, 15, "Speedboat", 5);
		garage.addVehicle(boatOne);
		assertEquals(215, garage.fixReturn());
	}
	
	@Test
	public void sumFixReturn() {
		Car carOne = new Car(4, 2007, 60, "Car", true);
		Motorbike bikeOne = new Motorbike(2, 2019, 120,"Motorbike", false);
		Speedboat boatOne = new Speedboat(0, 2001, 15, "Speedboat", 5);
		garage.addVehicle(carOne);
		garage.addVehicle(bikeOne);
		garage.addVehicle(boatOne);
		assertEquals(655, garage.fixReturn());
	}
	
	@Test
	public void removeTest() {
		Car carOne = new Car(4, 2007, 60, "Car", true);
		garage.addVehicle(carOne);
		garage.removeVehicle(carOne);
		assertEquals(0, garage.fixReturn());
	}
	
	@Test
	public void emptyTest() {
		Car carOne = new Car(4, 2007, 60, "Car", true);
		Motorbike bikeOne = new Motorbike(2, 2019, 120,"Motorbike", false);
		Speedboat boatOne = new Speedboat(0, 2001, 15, "Speedboat", 5);
		garage.addVehicle(carOne);
		garage.addVehicle(bikeOne);
		garage.addVehicle(boatOne);
		garage.empty();
		assertEquals(0, garage.fixReturn());
		
	}
	
	
	
}
