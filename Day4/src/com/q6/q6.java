package com.q6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q6 {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Set a limit for the numbers: ");
	    int limit = scn.nextInt();
		while(true) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				int input=scn.nextInt();
				if(input==-1) {
					break;
				}
				if(input>limit) {
					throw new MyException("Number can’t be greater than "+limit);
				}
				if(input>100) {
					throw new IllegalArgumentException();
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
			catch(IllegalArgumentException e){
				System.out.println("Number can’t be greater than 100");
			}
			catch (MyException ex){
                System.out.println(ex);  
            }
		}
		scn.close();

	}

}
class MyException extends Exception{

	public MyException(String message) {
          super(message);		
	}
}
