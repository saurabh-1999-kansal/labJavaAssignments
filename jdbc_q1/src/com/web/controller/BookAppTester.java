package com.web.controller;

import java.util.*;

import com.model.persistence.*;
import com.model.service.*;

public class BookAppTester {

	public static void main(String[] args) {
		//BookService BookService=new BookServiceImpl();
		BookService bookService=new BookServiceImplementation(); 
		
//		System.out.println("printing all records...");
//		printAllBooks(bookService);
		
		System.out.println("add new Book");
		Book book=new Book(2,"12ab3", "The Great Gatsby", "F. Scott Fitzgerald", 599.00);
		bookService.addBook(book);
//		
//		System.out.println("printing all emp after add one more emp");
//		printAllEmps(BookService);
		
		//Book book=bookService.getById(1);
//		System.out.println("get by id");
//		System.out.println(book);
		
		
//		book.setPrice(book.getPrice()+400.00);
//		bookService.updateBook(1, book);
//		System.out.println(book);
		
		//bookService.deleteBook(6);

	}

	@SuppressWarnings("unused")
	private static void printAllBooks(BookService bookService) {
		List<Book> Books=bookService.getAll();
		for(Book book: Books) {
			System.out.println(book);
		}
	}

	
}