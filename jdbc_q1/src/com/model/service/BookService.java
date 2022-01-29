package com.model.service;

import java.util.List;

import com.model.exceptions.BookNotFoundException;
import com.model.persistence.Book;

public interface BookService {

	public void addBook(Book book);

	public void deleteBook(int id);

	public void updateBook(int id, Book book);

	public List<Book> getAll();

	public Book getById(int id) throws BookNotFoundException;

}