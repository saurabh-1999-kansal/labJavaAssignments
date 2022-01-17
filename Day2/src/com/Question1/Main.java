package com.Question1;

public class Main {
	public static void main(String[] args) {
		Circle circle=new Circle();
		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());
		Circle circle2=new Circle(52.3);
		System.out.println(circle2.getRadius());
		System.out.println(circle2.getArea());
	}
}
