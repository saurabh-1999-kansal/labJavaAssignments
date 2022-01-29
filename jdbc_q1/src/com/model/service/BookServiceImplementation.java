package com.model.service;

import java.util.List;

import com.model.persistence.*;

public class BookServiceImplementation implements BookService {

	private BookDao bookDao;

	public BookServiceImplementation() {
		bookDao = new BookDaoImplementation();
	}

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
	}

	@Override
	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}

	@Override
	public void updateBook(int id, Book book) {
		bookDao.updateBook(id, book);
	}

	@Override
	public List<Book> getAll() {
		return bookDao.getAll();
	}

	@Override
	public Book getById(int id) {
		return bookDao.getById(id);
	}

}