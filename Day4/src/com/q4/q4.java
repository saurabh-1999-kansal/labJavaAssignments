package com.q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		while(true) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				int input=scn.nextInt();
				if(input==-1) {
					break;
				}
				if(input%2==0) {
					System.out.println("You have entered an even number");
				}
				else {
					System.out.println("You have entered an odd number");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("You must enter an integer");
				//otherwise scanner's value will not update and will cause infinite loop
				scn.next();
			}
		}
		scn.close();
	}

}
