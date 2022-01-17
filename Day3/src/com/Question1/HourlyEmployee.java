package com.Question1;

public class HourlyEmployee extends Employee {

	private int hoursWorked;
	private double hourlyRate;
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public HourlyEmployee(String name,int id,double salary,double rate,int hoursWorked) {
		super(name,id,salary,rate);
		this.hoursWorked=hoursWorked;
		
	}
	@Override
	public double getPayment() {
		this.setSalary(this.getRate()*this.hoursWorked);
		return this.getSalary();
	}	
	
	
}
