package com.Question1;

public class SalariedEmployee extends Employee {

	

	public SalariedEmployee(String name, int id, double salary,int rate) {
		super(name,id,salary,rate);
//		this.salary=salary;
//		this.rate=rate;
	}
	


	@Override
	public double getPayment() {
		this.setSalary(this.getRate()*5); //5 day week salary
		return this.getSalary();
	}
	
	
}
