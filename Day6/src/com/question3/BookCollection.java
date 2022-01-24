package com.question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortTitleAuthor implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		int val = (b1.getTitle().toLowerCase()).compareTo(b2.getTitle().toLowerCase());
		if (val == 0) {
			val = (b1.getAuthor().toLowerCase()).compareTo(b2.getAuthor().toLowerCase());
		}
		return val;
	}

}
public class BookCollection{
	public String owner;
	private ArrayList<Book> books;
	
	public BookCollection(String owner, ArrayList<Book> books) {
		this.owner = owner;
		this.books = books;
	}

	public boolean hasBook(Book b) {
		for(Book book: books) {
			if(book.getTitle().equalsIgnoreCase(b.getTitle()) &&
					book.getAuthor().equalsIgnoreCase(b.getAuthor())) {
				return true;
			}
		}
		return false;
	}
	
	public void sort() {
		Collections.sort(books, new SortTitleAuthor());
		System.out.println("Sorting complete.");
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookCollection [owner=").append(owner).append(",\n books=\n").append(books).append("]");
		return builder.toString();
	}
	
}
