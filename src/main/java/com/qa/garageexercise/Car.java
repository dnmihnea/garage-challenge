package com.qa.garageexercise;

public class Car extends Vehicle {
	
	private boolean automatic;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Constructor for Car object, extends Vehicle
     * @param wheels, year, mileage, type, automatic
     * All values from Vehicle and a new value that is exclusive to Car 
     */

	public Car(int wheels, int year, int mileage, String type, boolean automatic) {
		super(wheels, year, mileage, type);
		this.automatic = automatic;
		// TODO Auto-generated constructor stub
	}


	/**
     * Getter for a Car object's automatic variable
     * @return
     * Returns whether or not a Car object's automatic value is true or false
     */

	public boolean isAutomatic() {
		return automatic;
	}
	
	/**
     * Setter for a Car object's automatic variable
     * @param automatic
     * The value of the automatic variable - true or false
     */

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	
	/**
     * toString method
     * @return
     * Returns the Car object's information as a String, following the template constructed below
     */

	@Override
	public String toString() {
		return "Car: \nautomatic: " + automatic + ", wheels: " + getWheels() + ", year: " + getYear()
				+ ", mileage: " + getMileage();
	}

	

	
	
	
	
	

}
