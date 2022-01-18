package com.q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class App {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String filePath="demoSer.txt";
		FileOutputStream file=new FileOutputStream(filePath);
        Serialize(file);
        FileInputStream input=new FileInputStream(filePath);
        DeSerialize(input);
	}
	public static void Serialize(FileOutputStream file) {
		//serialize
		try {
		ObjectOutputStream os=new ObjectOutputStream(file);
		Employee E=new Employee("Pawan", "YM324", new Address(244, "east delhi", "delhi", "110085"), 50000);
		os.writeObject(E);
		System.out.println("Serialized Successfully");
		os.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void DeSerialize(FileInputStream file) throws ClassNotFoundException {
		//DeSerialize
		try {
		ObjectInputStream is=new ObjectInputStream(file);
		Employee E= (Employee)is.readObject();
		System.out.println("DeSerialized Successfully");
		System.out.println(E.name+" - "+E.id+" - "+E.address.display()+" - "+E.salary);
		is.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
