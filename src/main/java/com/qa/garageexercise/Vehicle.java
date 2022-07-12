package com.qa.garageexercise;

public class Vehicle {
	
	//attributes
	
		private int wheels;
		private int year;
		private int mileage;
		private String type;
		
		//constructor
		
		public Vehicle() {}
		
		/**
	     * Constructor for Vehicle object
	     * @param wheels, year, mileage, type
	     * All values that are needed to create a Vehicle object
	     */

		public Vehicle(int wheels, int year, int mileage, String type) {
			this.wheels = wheels;
			this.year = year;
			this.mileage = mileage;
			this.type = type;
		}
		
		//getters and setters

		public int getWheels() {
			return wheels;
		}

		public void setWheels(int wheels) {
			this.wheels = wheels;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getMileage() {
			return mileage;
		}

		public void setMileage(int mileage) {
			this.mileage = mileage;
		}
		
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		//methods
		
		/**
	     * A method that displays that the engine is running and increases the mileage on a Vehicle object
	     * @return
	     * Increases the mileage variable by 1 and returns it
	     */
		
		public int run() {
			
			System.out.println("The engine is running.");
			this.mileage++;
			return mileage;
		}
		
		//toString
		
		/**
	     * toString method
	     * @return
	     * Returns the Vehicle object's information as a String, following the template constructed below
	     */

		@Override
		public String toString() {
			return "Vehicle [wheels=" + wheels + ", year=" + year + ", mileage=" + mileage + ", type=" + type + "]";
		}

}
