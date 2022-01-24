package com.question3;

class Book{
	final String title;
	final String author;
	
	public Book(String name, String author) {
		this.title = name;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [title=").append(title).append(", author=").append(author).append("]\n");
		return builder.toString();
	}
	
	
}