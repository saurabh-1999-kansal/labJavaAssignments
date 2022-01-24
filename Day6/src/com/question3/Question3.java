package com.question3;

import java.util.ArrayList;

public class Question3 {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		
		Book b1 = new Book("Effective Java","Joshua Bloch");
		books.add(b1);
		Book b2 = new Book("Clean code", "Robert C. martin");
		books.add(b2);
		Book b3 = new Book("Head First Design Patterns","Eric Freeman");
		books.add(b3);
		Book b4 = new Book("Java in Depth","Josh Garg");
		books.add(b4);
		
		BookCollection collection = new BookCollection("Shubham", books);
		if(collection.hasBook(b4)) {
			System.out.println("Book Found!");
		}
		
		collection.sort();
		System.out.println(collection);
	}
}
