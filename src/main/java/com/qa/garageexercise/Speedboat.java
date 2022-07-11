package com.qa.garageexercise;

public class Speedboat extends Vehicle{
	
	private int holes;

	public Speedboat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Speedboat(int wheels, int year, int mileage, String type, int holes) {
		super(wheels, year, mileage, type);
		this.holes = holes;
		// TODO Auto-generated constructor stub
	}



	public int getHoles() {
		return holes;
	}

	public void setHoles(int holes) {
		this.holes = holes;
	}

	@Override
	public String toString() {
		return "Speedboat \nholes: " + holes + ", wheels: " + getWheels() + ", year: " + getYear()
				+ ", mileage: " + getMileage();
	}
	


	
	
	
	

}
