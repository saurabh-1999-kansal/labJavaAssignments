package com.lab.java8.case_study;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class Lab {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		System.out.println("\n------------Question1------------\n");
		// 1. Find books with more then 400 pages
//		List<Book> lengthyBooks = allBooks.stream().filter(BookUtil::isLengthyBook).collect(Collectors.toList());
//		System.out.println(lengthyBooks);
		allBooks.stream().filter(BookUtil::isLengthyBook).forEach(b-> System.out.println(b));
		
		
		System.out.println("\n------------Question2------------\n");
		// 2. Find all books that are java books and more then 400 pages
		Predicate<Book> lengthy = book-> book.getPages()>=400;
		Predicate<Book> type = book-> book.getSubject()==Subject.JAVA;
		allBooks.stream().filter(lengthy.and(type)).forEach(b-> System.out.println(b));
		
		
		System.out.println("\n------------Question3------------\n");
		// 3. We need the top three longest books
		allBooks.stream()
		.sorted(Comparator.comparingInt(Book::getPages).reversed())
		.limit(3)
		.forEach(b-> System.out.println(b));
		
		System.out.println("\n");
		
		allBooks.stream()
		.sorted((b1,b2)-> b2.getPages() - b1.getPages() ).limit(3).forEach(b-> System.out.println(b));
		 
		
		System.out.println("\n------------Question4------------\n");
		// 4. We need from the fourth to the last longest books
		allBooks.stream()
		.sorted(Comparator.comparingInt(Book::getPages).reversed())
		.skip(3)
		.forEach(b-> System.out.println(b));
		
		System.out.println("\n------------Question5------------\n");
		// 5. We need to get all the publishing years
		allBooks.stream()
		.map(Book::getYear)
		.distinct()
		.forEach(y-> System.out.println(y));
		
		System.out.println("\n------------Question6------------\n");
		// 6. We need all the authors names who have written a book	
		allBooks.stream()
		.flatMap(b-> b.getAuthors().stream())
		.map(a-> a.getName()+" "+a.getLastname())
		.distinct()
		.forEach(y-> System.out.println(y));
		
		System.out.println("\n------------Question7------------\n");
		// We want to know if all the books are written by more than one author? boolean
		boolean ans = allBooks.stream()
		.allMatch(b-> b.getAuthors().size()>1);	
		
		System.out.println(ans);
		
		
		int array[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("\n------------Question8------------\n");
		//is all the elements of array are odd?
		System.out.println(Arrays.stream(array).allMatch(n-> n%2==1));
		
		System.out.println("\n------------Question9------------\n");
		// We want one of the books written by more than one author.? (findAny)
		String name = allBooks.stream()
				.filter(b-> b.getAuthors().size()>1)
				.map(b-> b.getTitle()).findAny().orElse("NotFound");
		System.out.println(name);
		
		System.out.println("\n------------Question10------------\n");
		// We want to know how many pages the longest book has.
		int maxPages = allBooks.stream()
		.max(Comparator.comparing(Book::getPages))
		.map(b-> b.getPages())
		.orElse(-1);
		
		System.out.println(maxPages);
	
		System.out.println("\n------------Question11------------\n");
		// We want to know the authors of the longest book in lexicographical name order.
		
//		List<Author> collect = allBooks.stream()
//		.sorted(Comparator.comparing(Book::getPages).reversed())
//		.limit(1)
//		.flatMap(b-> b.getAuthors().stream())
//		.sorted(Comparator.comparing(Author::getName))
//		.limit(1)
//		.collect(Collectors.toList());
		
		
		String collect = allBooks.stream()
				.sorted(Comparator.comparing(Book::getPages).reversed())
				.limit(1)
				.flatMap(b-> b.getAuthors().stream())
				.min(Comparator.comparing(Author::getName))
				.map(Author::getName)
				.orElse("not found");
		System.out.println(collect);
		
		
		System.out.println("\n------------Question12------------\n");
		// We want the average number of pages of the books
		double avg = allBooks.stream()
		.collect(Collectors.averagingInt(Book::getPages));
		
		double avg2 = allBooks.stream()
		.mapToInt(Book::getPages)
		.summaryStatistics().getAverage();
		
		System.out.println(avg2);
		
		
		System.out.println("\n------------Question13------------\n");
		// We want all the titles of the books
		allBooks.stream()
		.map(Book::getTitle)
		.forEach(t-> System.out.println(t));
		
	
		
		System.out.println("\n------------Question14------------\n");
		// We want the book with the higher number of authors?
		Book orElse = allBooks.stream()
		.max((b1,b2)-> b1.getAuthors().size() - b2.getAuthors().size()).orElse(null);
		
		System.out.println(orElse);
	
		
		System.out.println("\n------------Question15------------\n");
		// We want a Map of book per year.		
		System.out.println(allBooks.stream()
				.collect(Collectors.groupingBy(Book::getYear)));
		
		
		
		System.out.println("\n------------Question16------------\n");
		// We want a Map of book per year and then by subject
		Map<Integer, Map<Subject, List<Book>>> collect2 = allBooks.stream()
				.collect(Collectors.groupingBy(Book::getYear,Collectors.groupingBy(Book::getSubject)));
		

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(
				new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in")
				);

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 1000, Subject.JAVA, 2021, "1213"));
		books.add(new Book("adv java", authors1, 450, Subject.JAVA, 2021, "1213"));
		
		books.add(new Book("adv C#", authors2, 700, Subject.DOT_NET, 2022, "1218"));
		books.add(new Book("C# basics", authors3, 600, Subject.DOT_NET, 2019, "1293"));

		return books;
	}

}
