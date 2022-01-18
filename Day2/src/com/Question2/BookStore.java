package com.Question2;

import java.util.Scanner;

public class BookStore {
	private  final int size = 10;
	private  int count = 0;
	 Book[] books = new Book[size];

	public  void sell(String ISBN, int numOfCopies) {
		for (int i = 0; i < count; i++) {
			if (books[i].getISBN().equals(ISBN)) {
				if (books[i].getNumOfCopies() >= numOfCopies) {
					books[i].setNumOfCopies(books[i].getNumOfCopies() - numOfCopies);
					System.out.println("Books Sold!");
					return;
				} else {
					System.out.println("Book Quantity is insufficient!");
					return;
				}
			}
		}
		System.out.println("Book not available!");
	}

	public  void order(String bookTitle, int numOfCopies) {
		for (int i = 0; i < count; i++) {
			if (books[i].getBookTitle().equals(bookTitle)) {
				books[i].setNumOfCopies(books[i].getNumOfCopies() + numOfCopies);
				System.out.println("Books added!");
				return;
			}
		}
		if (count < size) {
			System.out.println("this book is not available. Lets add.");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter auther name: ");
			String author = sc.nextLine();
			System.out.print("Enter book ISBN: ");
			String ISBN = sc.nextLine();
			books[count] = new Book(bookTitle, author, ISBN, numOfCopies);
			count++;
			System.out.println("Books Added!");
			
			
		} else {
			System.out.println("Store at Maximum Capacity!");
		}
	}

	public void display() {
		if (count > 0) {
			System.out.println("Title - Author - ISBN - Quantity");
			for (int i=0; i<count; i++) {
				books[i].display();
			}
		}else {
			System.out.println("Store is empty!");
		}

	}
}
