package com.qa.garageexercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	 /**
     * Create an empty private list that will hold different Vehicle objects
     * Also create another similar list that will hold all the Vehicle objects we want to be removed
     * with the removeType() method
     */
	
	private List<Vehicle> garage = new ArrayList<>();
	private List<Vehicle> postRemove = new ArrayList<>();

	public Garage() {}
	
	/**
     * Constructor for Garage object
     * @param garage
     * The name of the arraylist we want to make
     */
	
	public Garage(List<Vehicle> garage) {
		this.garage = garage;
	}
	
	/**
     * Adding a new Vehicle object to our list
     * @param v
     * The name of the object we want to add
     */
	
	public void addVehicle(Vehicle v) {
		this.garage.add(v);
	}
	
	/**
     * Removing a Vehicle object to our list
     * @param v
     * The name of the object we want to remove
     */
	
	public void removeVehicle(Vehicle v) {
		this.garage.remove(v);
	}
	
	/**
     * Removes everything from out list
     */
	
	public void empty() {
		this.garage.clear();
	}
	
	/**
     * A method that will calculate a bill for every single object in a list and display it to the screen
     * Every single class has a different way of having its bill calculated
     * The method checks what type of object each object is and then uses the appropriate way to generate the bill
     * The name and attributes of each object will be displayed first, followed by the total bill
     */
	
	public void fix() {
		for (Vehicle v: garage) {
			int bill = 0;
			if (v.getType() == "Car") {
				bill = (4 - v.getWheels())*10 + (2021 - v.getYear())*5 + v.getMileage();
				if (((Car) v).isAutomatic()) {
					bill = bill + 100;
				}
				} else if (v.getType() == "Motorbike") {
					bill =(2 - v.getWheels())*10 + (2021 - v.getYear())*5 + v.getMileage();
					if(((Motorbike) v).isOffroad() == false) {
						bill = bill + 80;
					}
				} else {
					bill = v.getWheels()*10 + (2021 - v.getYear())*5 + v.getMileage() 
					+ ((Speedboat) v).getHoles() * 20;
				}
			
			System.out.println(v);
			System.out.println("Total bill: " + bill);
			}
	}
	
	/**
     * A method that will calculate an overall bill for all the objects in our list and return the total
     * @return
     * Returns the overall bill for every single object in out list
     */
	
	public int fixReturn() {
		int bill = 0;
		for (Vehicle v: garage) {
			if (v.getType() == "Car") {
				bill = bill + (4 - v.getWheels())*10 + (2021 - v.getYear())*5 + v.getMileage();
				if (((Car) v).isAutomatic()) {
					bill = bill + 100;
				}
				} else if (v.getType() == "Motorbike") {
					bill = bill + (2 - v.getWheels())*10 + (2021 - v.getYear())*5 + v.getMileage();
					if(((Motorbike) v).isOffroad() == false) {
						bill = bill + 80;
					}
				} else {
					bill = v.getWheels()*10 + (2021 - v.getYear())*5 + v.getMileage() 
					+ ((Speedboat) v).getHoles() * 20;
				}
			
			}
		return bill;
	}
	
	/**
     * A method that removes every single object of a certain type from our list
     * @param x
     * The type of object that we want removed
     * Every single object of this type is copied to a new, initially empty list
     * Afterwards all the items from the new list are removed from the original list
     * Lastly the list that contains the objects we want removed is cleared, so it can be reused
     */
	
	public void removeType(String x) {
		for (Vehicle v: garage) {
			String type = v.getType();
			if ((type.toLowerCase()).equals(x.toLowerCase())) {
				postRemove.add(v);
			}
		}
		garage.removeAll(postRemove);
		
		postRemove.clear();
	}
	
	/**
     * Prints out the information of every single object in the list, one by one
     */

	public void print() {
		for (Vehicle v: garage) {
			System.out.println(v);
		}
	}
	
	

}
