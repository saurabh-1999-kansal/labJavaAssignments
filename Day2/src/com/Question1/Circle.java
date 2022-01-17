package com.Question1;

public class Circle {
	private double radius;
	private String color;
	public Circle() {
		radius=1.0;
		color="red";
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
