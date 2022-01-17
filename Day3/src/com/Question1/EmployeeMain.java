//Merged code of Question1 and Question2

package com.Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
public static void main(String[] args) {
	ArrayList<Employee> employees = new ArrayList<Employee>(); 
	
	Employee emp = new SalariedEmployee("Tanmay",1,55000,1600);
	Employee emp1 = new HourlyEmployee("Harshit",2,18000,450,40);
	Employee emp2 = new CommissionEmployee("Abhinav",3,8000,120,12,190);
	
	employees.add(emp);
	employees.add(emp1);
	employees.add(emp2);
	
	System.out.println("Total Employees in the company: "+employees.size());
	Invoice invoice = new Invoice("212A2","Yamaha Engine Turbo",4,80000);
	
	System.out.println(emp.getName() + " has a salary of: "+emp.getPayment());
	System.out.println(emp1.getName() + " has a salary of: "+emp1.getPayment());
	System.out.println(emp2.getName() + " has a salary of: "+emp2.getPayment());
	System.out.println(invoice + "\n Total Expense: "+invoice.getPayment());
}
}
