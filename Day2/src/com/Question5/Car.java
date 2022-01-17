package com.Question5;

public class Car extends Vehichle {

	private int noOfDoors;
	
	public int getNoOfDoors() {
		return noOfDoors;
	}
	
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public void display(int model,String make,int doors) {
		System.out.println("make: "+ make);
		System.out.println("Model:" + model);
		System.out.println("Number of Doors: "+ noOfDoors);
	}
}
