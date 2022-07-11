package com.qa.garageexercise;

public class Motorbike extends Vehicle{
	
	private boolean offroad;

	public Motorbike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorbike(int wheels, int year, int mileage, String type, boolean offroad) {
		super(wheels, year, mileage, type);
		this.offroad = offroad;
		// TODO Auto-generated constructor stub
	}

	public boolean isOffroad() {
		return offroad;
	}

	public void setOffroad(boolean offroad) {
		this.offroad = offroad;
	}

	@Override
	public String toString() {
		return "Motorbike: \noffroad: " + offroad + ", wheels: " + getWheels() + ", year: " + getYear()
				+ ", mileage: " + getMileage();
	}
	

	
	
	
	

}
