package com.Question2;

import java.util.Scanner;

public class BookStoreApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		while (flag == 1) {
			System.out.println("\n--------------------------------------------");
			System.out.println("Enter “1”, to display the Books.\r\n" + "Enter “2”, to order new books.\r\n"
					+ "Enter “3”, to sell books.\r\n" + "Enter “0”, to exit the system.");
			int ch = sc.nextInt();
			sc.nextLine();
			if (ch == 1) {
				BookStore.display();
				System.out.println();
			} else if (ch == 2) {
				System.out.print("Enter Book Title: ");
				String bookTitle = sc.nextLine();
				System.out.print("Enter number of copies: ");
				int numOfCopies = sc.nextInt();
				BookStore.order(bookTitle, numOfCopies);
			} else if (ch == 3) {
				System.out.print("Enter ISBN: ");
				String ISBN = sc.nextLine();
				System.out.print("Enter number of copies: ");
				int numOfCopies = sc.nextInt();
				BookStore.sell(ISBN, numOfCopies);
			} else {
				flag = 0;
			}
		}
		sc.close();
	}
}





