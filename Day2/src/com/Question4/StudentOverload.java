package com.Question4;

class Student{
	
	
	private String name;
	private String id;
	private int grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
	public Student(String name,String id,int grade) {
		this.name=name;
		this.id=id;
		this.grade=grade;
		
		
	}
	
	public Student(String name,String id) {
		this.name=name;
		this.id=id;
	}
	
	public Student(String id) {
		this.id=id;
	}
	
	
	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(grade);
		
		
	}
	
	public void display(int year) {
		System.out.println(name);
		System.out.println(id);
		System.out.println(grade);
		System.out.println(year);
		
	}
	
	
}

public class StudentOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
