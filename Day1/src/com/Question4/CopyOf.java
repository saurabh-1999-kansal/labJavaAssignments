package com.Question4;

/*
 	Write a boolean method called copyOf(), which an int Array and returns a copy of the given 
array. The method's signature is as follows:
public static int[] copyOf(int[] array)
 */

public class CopyOf {
	
	public static int[] copyOf(int[] array) {
		int b[]= new int[array.length];
		for(int i=0;i<array.length;i++) {
			b[i]=array[i];
		}
		return b;
	}
	
	public static void main(String[] args) {
		int array[]= { 2,6,8,5,3,1,6};
		
		for(int temp:array) {
			System.out.print(temp + " ");
		}
		System.out.println();
		int copyArray[]= copyOf(array);
		
		for(int temp:copyArray) {
			System.out.print(temp + " ");
		}
	}
}
