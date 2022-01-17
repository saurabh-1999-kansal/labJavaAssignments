package com.Question2;

public class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;
	
	public Book(String bookTitle, String author, String iSBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = iSBN;
		this.numOfCopies = numOfCopies;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	
	@Override
	public String toString() {
		return  bookTitle + " - " + author + " - " + ISBN + " - " + numOfCopies;
	}

	public void display() {
		System.out.println(toString());
		//System.out.println(bookTitle + " - " + author + " - " + ISBN + " - " + numOfCopies);
	}
	
}
