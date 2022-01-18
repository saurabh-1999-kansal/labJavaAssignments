package com.q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q2 {
	
	
    //char stream
	
	public static void main(String[] args) {		
		File file = new File("demo.txt");
		
		// Writing in file taking input from user
		//remove true from file writer if you want to delete the existing content and start fresh again
		//we add true so that the new content gets append to the existing content in the file
			try (BufferedWriter writer = new BufferedWriter( new FileWriter(file,true))) {
				Scanner scn=new Scanner(System.in);
				System.out.println("Input the text for the file: ");
				String input=scn.nextLine();
				writer.write(input);
				scn.close();
			
			} 			
			catch (IOException ex) {
				System.out.println("Exception occured");
				ex.printStackTrace();
			}			
			System.out.println("Writing in file completed.");
			System.out.println();
			
			
		// Now Reading from File
			System.out.println("Now reading from the Demo File: ");
			try (BufferedReader input = new BufferedReader(new FileReader(file))) {
				
				String text = null;
				
				while ((text=input.readLine()) != null) {
					System.out.println(text);
				}
				
			} 			
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 			
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}

}
