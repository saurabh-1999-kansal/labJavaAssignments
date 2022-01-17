package com.Question4;

import java.util.Scanner;

//Now implement the application class that will have the main method. From main method, you have
//to provide a menu on the console. It will take user input to create the object using one of the 3 constructors. 
//Which constructor you have to use depends on what info user has provided e.g. if user just provide id, 
//you have to call Student(String) and so on. Do similar logic for option 2/display.
//‘1’ – to create a Student object. 
//‘2’ – to display the student info.

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn=new Scanner(System.in);
		
		String nameInput=null;
		String idInput=null;
		int gradeInput=-1;
		
		System.out.println("Enter the following Details");
		System.out.println("Name: ");
		nameInput=scn.nextLine();
		System.out.println("id(String): ");
		idInput=scn.nextLine();
		System.out.println("Grade(integer): ");
		gradeInput=scn.nextInt();
		
		//Student st=new Student(nameInput,idInput,gradeInput);
		Student st2=new Student("Akshay","1123");
		Student st3=new Student("1124");
		//st.display();
		st2.display(1998);
		st3.display();
	}

}
