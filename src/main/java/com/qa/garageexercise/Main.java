package com.qa.garageexercise;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Garage gar = new Garage();
		
		Car carOne = new Car(4, 2007, 60, "Car", true);
		Car carTwo = new Car(3, 2012, 80, "Car", false);
		Car carThree = new Car(4, 2009, 66, "Car", false);
		Motorbike bikeOne = new Motorbike(2, 2019, 120,"Motorbike", false);
		Motorbike bikeTwo = new Motorbike(2, 2004, 80, "Motorbike", true);
		Speedboat boatOne = new Speedboat(0, 2001, 15, "Speedboat", 5);
		Speedboat boatTwo = new Speedboat(0, 2020, 40, "Speedboat", 2);
		
		gar.addVehicle(carOne);
		gar.addVehicle(carTwo);
		gar.addVehicle(carThree);
		gar.addVehicle(bikeOne);
		gar.addVehicle(bikeTwo);
		gar.addVehicle(boatOne);
		gar.addVehicle(boatTwo);
		
		//System.out.println(gar.fixReturn());
		
		//gar.fix();
		
		//gar.removeType("Car");
		
		
		

	}

}
