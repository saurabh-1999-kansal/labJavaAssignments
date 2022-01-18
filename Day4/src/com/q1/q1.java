package com.q1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class q1 {
	public static void main(String args[]) {
		File file=new File("demo.txt");
        //Byte stream write
		try {
			FileOutputStream input=new FileOutputStream(file);
			Scanner scn=new Scanner(System.in);
			System.out.println("Input the text for the file: ");
			String text=scn.nextLine();
			for(int i=0;i<text.length();i++) {
				input.write((byte)text.charAt(i));
			}
			System.out.println("File write successful");
			scn.close();
			input.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		//Byte stream Read
		try {
			FileInputStream input=new FileInputStream(file);
			byte bytes[] = new byte[(int) file.length()];
			input.read(bytes);
			//printing as bytes
			for(byte b:bytes) {
				System.out.print(b);
			}
			//printing as charaters
			System.out.println();
			for(byte b:bytes) {
				System.out.print((char)b);
			}
			input.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not found on computer");
//			e.printStackTrace();
		}
		catch(IOException e){
//			e.printStackTrace();
		}
	}

}
