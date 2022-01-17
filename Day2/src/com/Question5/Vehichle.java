package com.Question5;

public class Vehichle {

	private int noOfWheels;
	private int noOfPassengers;
	private int model;
	private String make;
	
	
	
	
	public int getNoOfWheels() {
		return noOfWheels;
	}




	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}




	public int getNoOfPassengers() {
		return noOfPassengers;
	}




	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}




	public int getModel() {
		return model;
	}




	public void setModel(int model) {
		this.model = model;
	}




	public String getMake() {
		return make;
	}




	public void setMake(String make) {
		this.make = make;
	}




	public void display(int wheels,int passengers,int model,String make) {
		System.out.println("number of wheels: "+noOfWheels);
		System.out.println("number of Passengers: "+noOfPassengers);
		System.out.println("Model year of the car: "+model);
		System.out.println("Make of the car: "+make);
	}
	
}
