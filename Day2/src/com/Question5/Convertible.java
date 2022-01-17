package com.Question5;

public class Convertible extends Car {
	
	public String hood="Open";
	
	public boolean isHoodOpen(int choice) {
		if(choice==0) {
			this.hood="Close";
			return false;
		}
		return true;
	}
	
	public void display(int model,String make,int doors) {
		System.out.println("make: "+ make);
		System.out.println("Model:" + model);
		System.out.println("Number of Doors: "+ doors);
		System.out.println("Hood of convertible is: "+ hood);
	}
}
