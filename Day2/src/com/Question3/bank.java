package com.Question3;

import java.util.Random;
import java.util.Scanner;


public class bank {

	public static void main(String[] args) {

		System.out.println("Press 1 if you wan't to form an account else press any other number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if (n == 1) {

			System.out.println("press 1 for saving account and 2 for the current account");
			int choice = scn.nextInt();
			Account a = null;
			System.out.println("give your name");
			String memName = scn.next();
			System.out.println("give your initial balance");
			double initialBalance = scn.nextDouble();
			if (choice == 1) {
				double maxWithdrawLimit = 500;
				a = new SavingsAccount(initialBalance, memName, maxWithdrawLimit);

			} else if (choice == 2) {
				System.out.println("give your trade license number");
				String tln = scn.next();
				a = new CurrentAccount(initialBalance, memName, tln);
			}

			System.out.println("Now you can check your details");
			int ch = -1;
			do {
				ch = scn.nextInt();
				if (ch == 1) {

					System.out.println("give the amount of money you wan't to deposit");
					double dep = scn.nextDouble();
					a.setAccountBalance(a.getAccountBalance() + dep);
					System.out.println("press 1 to know the account balance and any other number to skip");
					int chh = scn.nextInt();
					if (chh == 1) {
						System.out.println("Account balance before depositing is " + (a.getAccountBalance() - dep));
						System.out.println("Account balance after depositing is " + a.getAccountBalance());
					}
				} else if (ch == 2) {

					System.out.println("Enter the amount of money you wan't to withdraw");
					double moneyToBeWithdrawn = scn.nextDouble();
					if (choice == 1) {
						SavingsAccount b = (SavingsAccount) a;
						b.withDraw(moneyToBeWithdrawn);
					} else {
						CurrentAccount b = (CurrentAccount) a;
						b.withDraw(moneyToBeWithdrawn);
					}

					System.out.println("press 1 to know the account balance and any other number to skip");
					int chh = scn.nextInt();
					if (chh == 1) {
						System.out.println("Account balance before withdrawing is "
								+ (a.getAccountBalance() + moneyToBeWithdrawn));
						System.out.println("Account balance after depositing is " + a.getAccountBalance());
					}

				} else if (ch == 3) {
					System.out.println("Your Account balance is " + a.getAccountBalance());

				} else if (ch != 0) {
					System.out.println("sorry you have pressed a wrong input ");
				}
			} while (ch != 0);
		}
	}

}
