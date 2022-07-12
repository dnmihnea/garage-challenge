package com.qa.garageexercise;

public class Motorbike extends Vehicle{
	
	private boolean offroad;

	public Motorbike() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
     * Constructor for Motorbike object, extends Vehicle
     * @param wheels, year, mileage, type, offroad
     * All values from Vehicle and a new value that is exclusive to Motorbike 
     */
	
	public Motorbike(int wheels, int year, int mileage, String type, boolean offroad) {
		super(wheels, year, mileage, type);
		this.offroad = offroad;
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Getter for a Motorbike object's offroad variable
     * @return
     * Returns whether or not a Motorbike object's offroad value is true or false
     */

	public boolean isOffroad() {
		return offroad;
	}
	
	/**
     * Setter for a Motorbike object's offroad variable
     * @param offroad
     * The value of the offroad variable - true or false
     */

	public void setOffroad(boolean offroad) {
		this.offroad = offroad;
	}

	/**
     * toString method
     * @return
     * Returns the Motorbike object's information as a String, following the template constructed below
     */
	
	@Override
	public String toString() {
		return "Motorbike: \noffroad: " + offroad + ", wheels: " + getWheels() + ", year: " + getYear()
				+ ", mileage: " + getMileage();
	}
	

	
	
	
	

}
