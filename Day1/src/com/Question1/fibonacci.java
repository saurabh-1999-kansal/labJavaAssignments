package com.Question1;

/*
Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5

*/

public class fibonacci {
	public static void main(String[] args) {

		int f1=1;
		int f2=1;
		
		System.out.print(f1+ " ");
		System.out.print(f2+ " ");
		
		int sum=f1+f2;
		for(int i=3;i<=20;i++) {
			int f3=f1+f2;
			sum+=f3;
			System.out.print(f3+ " ");
			f1=f2;
			f2=f3;	
		}
		System.out.println();
		double average=sum/20;
		System.out.println(average);
	}
}
