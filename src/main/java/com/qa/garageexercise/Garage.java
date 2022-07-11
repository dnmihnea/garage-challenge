package com.qa.garageexercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List<Vehicle> garage = new ArrayList<>();
	List<Vehicle> postRemove = new ArrayList<>();

	public Garage() {}
	
	public Garage(List<Vehicle> garage) {
		this.garage = garage;
	}
	
	public void addVehicle(Vehicle v) {
		this.garage.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		this.garage.remove(v);
	}
	
	public void empty() {
		this.garage.clear();
	}
	
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

	public void print() {
		for (Vehicle v: garage) {
			System.out.println(v);
		}
	}
	
	

}
