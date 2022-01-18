package com.q7;

import java.io.IOException;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		try {
			throwException(n);
		} catch (InputException e) {
			// TODO Auto-generated catch block
			System.out.println("Input Exception Occurred");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException  Occurred");
			e.printStackTrace();
		}

	}
	public static void throwException(int number) throws IOException,InputException{
		if(number==1) {
			throw new IOException();
		}
		throw new InputException();
	}
}


class InputException extends Exception {
	
	public InputException() {
		super("Input Exception occured");
	}

}
