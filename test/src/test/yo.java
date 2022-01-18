package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class yo {
	class Employee1 implements Comparable<Employee1> {
		private int id;
		private String name;
		private String city;
		private double salary;

		public Employee1(int id, String name, String city, double salary) {
			this.id = id;
			this.name = name;
			this.city = city;       
			this.salary = salary;
		}
  
		public Employee1() {
		}
                                            
		public int getId() {
			return id;
		}
		           
		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}
                               
		public void setName(String name) {
			this.name = name;
		}
		    
		public String getCity() {      
			return city;
		}
               
		public void setCity(String city) {  
			this.city = city;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Employee [id=").append(id).append(", name=").append(name).append(", city=").append(city)
					.append(", salary=").append(salary).append("]");
			return builder.toString();
		}

		@Override
		public int compareTo(Employee1 o) {

			return this.id - o.id;
		}

	}
	public static void main(String[] args) {
		
	}

}
