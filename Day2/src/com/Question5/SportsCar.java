package com.Question5;

public class SportsCar extends Car {

	int doors=2;
	@Override
	public void setNoOfDoors(int noOfDoors) {
		// TODO Auto-generated method stub
		super.setNoOfDoors(2);
	}
	
	
	public void display(int model,String make) {
		System.out.println("make: "+ make);
		System.out.println("Model:" + model);
		System.out.println("Number of Doors: "+ this.doors);
		
	}
}
