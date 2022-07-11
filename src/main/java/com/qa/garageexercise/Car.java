package com.qa.garageexercise;

public class Car extends Vehicle {
	
	private boolean automatic;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int wheels, int year, int mileage, String type, boolean automatic) {
		super(wheels, year, mileage, type);
		this.automatic = automatic;
		// TODO Auto-generated constructor stub
	}



	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	@Override
	public String toString() {
		return "Car: \nautomatic: " + automatic + ", wheels: " + getWheels() + ", year: " + getYear()
				+ ", mileage: " + getMileage();
	}

	

	
	
	
	
	

}
