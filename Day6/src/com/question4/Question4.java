package com.question4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question4 {
	public static void main(String[] args) {
		File file = new File("data.txt");
		double largest = 0.00;
		try(BufferedReader input = new BufferedReader(new FileReader(file))){
			String line = null;
			while((line = input.readLine())!=null) {
				Double temp = Double.parseDouble(line);
				if(temp.doubleValue()>largest) {
					largest = temp;
				}
			}
			System.out.println("Largest: "+largest);
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
