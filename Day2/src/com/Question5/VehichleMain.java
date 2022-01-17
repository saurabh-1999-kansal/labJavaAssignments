package com.Question5;

import java.util.Scanner;

public class VehichleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Which type of object do you want to create?");
		System.out.println("1. Vehichle Object 2. Car Object 3. Convertible Object 4. SportsCar Object");
		Scanner scn=new Scanner(System.in);
		int choice=scn.nextInt();
		
		int wheels;
		int noOfPassengers;
		int model;
		String make;
		int noOfDoors;
		
		
		//for the sake of simplicity we will take all the inputs here only
		System.out.println("Enter number of wheels");
		wheels=scn.nextInt();
		System.out.println("Enter Number of Passengers");
		noOfPassengers=scn.nextInt();
		System.out.println("Enter Model Year");
		model=scn.nextInt();
		System.out.println("Enter Make");
		make=scn.next();
		System.out.println("Enter Number of Doors");
		noOfDoors=scn.nextInt();
		
		if(choice==1)
		{
			Vehichle veh=new Vehichle();
			veh.setNoOfWheels(wheels);
			veh.setMake(make);
			veh.setModel(model);
			veh.setNoOfPassengers(noOfPassengers);
			veh.display(wheels,noOfPassengers,model,make);
			
		}
		else if(choice==2)
		{
			Car ca=new Car();
			ca.setNoOfDoors(noOfDoors);
			ca.display(model,make,noOfDoors);
			
		}
		else if(choice==3)
		{
			Convertible convert =new Convertible();
			convert.display(model,make,noOfDoors);
			
		}
		else {
			SportsCar sc = new SportsCar();
			sc.display(model, make);
		}
	}

}
