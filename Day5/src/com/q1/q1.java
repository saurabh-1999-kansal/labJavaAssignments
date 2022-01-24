package com.q1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

//just for practicing q1 operations

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set=new HashSet<>();
		ArrayList<Student> list=new ArrayList<>();
		Student s1=new Student("Saurabh",21);
		Student s2=new Student("Harshul",23);
		set.add(s1);
		set.add(s2);
		list.add(s1);
		list.add(s2);
		setDisplay(set);
		listDisplay(list);
		set.addAll(list);        
	}
	public static void setDisplay(Set<Student> set) {
		for(Student s:set) {
			System.out.println(s.name+" "+s.age);
		}
	}
	public static void listDisplay(ArrayList<Student> list) {
		ListIterator<Student> it=list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}        
	}   	
	                                   
}
class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
}
