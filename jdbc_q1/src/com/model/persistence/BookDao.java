package com.model.persistence;

import java.util.List;
import com.model.exceptions.BookNotFoundException;

public interface BookDao {

	public void addBook(Book book);
    public void deleteBook(int id);
    public void updateBook(int id , Book book);
    public List<Book> getAll();
    public Book getById(int id) throws BookNotFoundException;
	
}
