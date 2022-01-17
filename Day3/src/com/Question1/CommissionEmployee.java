package com.Question1;

public class CommissionEmployee extends Employee {

	private double percent;
	private double sales;
	
	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public CommissionEmployee(String name,int id,double salary,double rate,double percent,double sales) {
		super(name,id,salary,rate);
		this.percent=percent;
		this.sales=sales;
	}
	
	
	@Override
	public double getPayment() {
		this.setSalary(this.getSales()*this.getPercent()/100);
		return this.getSalary();
	}
	
}
