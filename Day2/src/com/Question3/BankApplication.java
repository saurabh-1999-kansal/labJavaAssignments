package com.Question3;

import com.Question3.*;
import java.util.Scanner;

//Create the application class “Bank” which will have the main method. 
//First the application will require the user to create an account. So, you have to ask for user name, what type
//of account he wants to open and what would be the initial balance. The system will create the account
//(SavingsAccount or CurrentAccount object) with a randomly generated 5 digit account number.
//After creating the account, you have to provide a menu on the console. It will take user input to decide what
//action to take.
//Input ‘1’ means deposit money. For this input, you have to ask user for the amount of money he wants to
//deposit. Also you need to prompt if he needs to know the balance. If yes, you need to display the
//balance before the deposit and after the deposit.
//Input ‘2’ means withdraw money. So, you have to ask user for the amount of money he wants to withdraw.
//Also you need to prompt if he needs to know the balance. If yes, you need to display the balance
//before the withdrawal and after the withdrawal.
//Input ‘3’ means display the balance of the account. In that case you have to display the balance.
//Input ‘0’ means exit the system.


public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to HDFC Bank. Let's Create your Account first");
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scn.nextLine();
		
		//memberName=name;
		Account acc=new Account(name);
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		
		System.out.println("What type of Account do you want to open? 1. Savings  2.Current");
		int accountChoice=scn.nextInt();
		String accountType;
		if(accountChoice==1) {
			accountType="Savings";
		}
		else {
			accountType="Current";
		}
		
		System.out.println("Account created Successfully with following Dertails");
		System.out.println("Holder Name: "+ name +"\n" + "Account Type: "+accountChoice+"\n" + "Account Number: "+acc.accountNumber +"\n"+"Current Balance: "+acc.accountBalance);
		
		int choice=1;
		while(choice!=0) {
			
		System.out.println("Select operation that you want to perform");
		System.out.println("1. Deposit Money  2. Withdraw Money 3. Display Balance 0.exit");
		choice=scn.nextInt();
		
		
			if(choice==1) {
				System.out.println("Enter the amount that you want to deposit ");
				double amount=scn.nextDouble();
				sa.deposit(amount);
			}
			else if(choice==2) {
				System.out.println("Enter the amount that you want to withdraw");
				double amount=scn.nextInt();
				sa.withdraw(amount);
			}
			else if(choice==3) {
				sa.getBalance();
			}
			else if(choice<0 && choice>3) {
				System.out.println("You have entered wrong choice,try again");
			}
		}
		scn.close();

	}

}
