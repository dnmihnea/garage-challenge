package com.qa.garageexercise;

public class Vehicle {
	
	//attributes
	
		private int wheels;
		private int year;
		private int mileage;
		private String type;
		
		//constructor
		
		public Vehicle() {}

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
		
		public int run() {
			
			System.out.println("The engine is running.");
			this.mileage++;
			return mileage;
		}
		
		//toString

		@Override
		public String toString() {
			return "Vehicle [wheels=" + wheels + ", year=" + year + ", mileage=" + mileage + ", type=" + type + "]";
		}

}
