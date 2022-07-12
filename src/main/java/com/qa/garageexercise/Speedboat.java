package com.qa.garageexercise;

public class Speedboat extends Vehicle{
	
	private int holes;

	public Speedboat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Constructor for Speedboat object, extends Vehicle
     * @param wheels, year, mileage, type, holes
     * All values from Vehicle and a new value that is exclusive to Speedboat 
     */

	public Speedboat(int wheels, int year, int mileage, String type, int holes) {
		super(wheels, year, mileage, type);
		this.holes = holes;
		// TODO Auto-generated constructor stub
	}

	/**
     * Getter for a Speedboat object's holes variable
     * @return
     * Returns the value of that object's holes variable
     */

	public int getHoles() {
		return holes;
	}
	
	/**
     * Setter for a Speedboat object's holes variable
     * @param holes
     * The value of the holes variable, which will be an int number
     */

	public void setHoles(int holes) {
		this.holes = holes;
	}

	/**
     * toString method
     * @return
     * Returns the Speedboat object's information as a String, following the template constructed below
     */
	
	@Override
	public String toString() {
		return "Speedboat \nholes: " + holes + ", wheels: " + getWheels() + ", year: " + getYear()
				+ ", mileage: " + getMileage();
	}
	


	
	
	
	

}
