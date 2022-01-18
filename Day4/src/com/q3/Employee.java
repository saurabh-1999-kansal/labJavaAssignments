package com.q3;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String id;
	Address address;
	transient double salary;
	Employee(String name,String id,Address address,double salary){
		this.name=name;
		this.id=id;
		this.address=address;
		this.salary=salary;
	}
	public void display() {
		System.out.println("Employee Name: "+name+" Employee ID: "+id+" Employee address: "+address.display());
	}

}

