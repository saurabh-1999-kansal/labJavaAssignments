package com.Question3;

import java.util.Scanner;

//Create the Account class: 
//1. This will have memberName, accountNumber, and accountBalance instance variables; 
//2. One method name deposit(double).

class Account{
	public String memberName;
	public String accountNumber=10000 + (int)(Math.random()*89999) + "";
	public double accountBalance=100;
	
	
	public Account() {
		
	}
	
	
	public Account(String name) {
		this.memberName=name;
		System.out.println("Account Successfully Created");
	}
}

//This will have two additional instance variables
//1. One is “interest” and initialized to 5.
//2. Another instance variable for maximum withdraw amount limit.
//3. Implement getBalance() method. This method will add the total interest to the accountBalance
//value and return the value but it won’t change the accountBalance value.
//4. Implement withdraw(double) method. This method will allow to withdraw money if the
//withdraw amount is less than the maximum amount limit and doesn’t set the balance less than
//minimum balance after withdraw
class SavingsAccount extends Account{
	public int interest=5;
	public int maxWithdrawLimit=50000;
	
	public void deposit(double amount) {
		accountBalance+=amount;
	}
	
	public void getBalance() {
		double balanceWithInterest= accountBalance+(5*accountBalance)/100;
		System.out.println("Current Balance is: "+balanceWithInterest);
	}
	
	public void withdraw(double amount) {
		if(amount<maxWithdrawLimit && accountBalance-amount>=0) {
			System.out.println("withdrawing "+ amount + " from your account");
			accountBalance-=amount;
		}
		else if(amount>maxWithdrawLimit) {
			System.out.println("you are exceeding the maximum withdrawal limit of "+ maxWithdrawLimit);
		}
		else {
			System.out.println("You do not have enough balance in your account");
		}
	}
}

//Create a CurrentAccount class: 
//1. Should extend the Account class
//2. Add an instance variable tradeLicenseNumber.
//3. Implement getBalance() method. This method will return the accountBalance.
//4. Implement withdraw(double) method. This method will allow to withdraw money if the
//withdraw amount doesn’t exceed the accountBalance value.


class CurrentAccount extends Account{
	private int tradeLicenseNumber;
	public int maxWithdrawLimit=50000;
	
	public void getBalance() {
		double balanceWithInterest= accountBalance+(5*accountBalance)/100;
		System.out.println("Current Balance is: "+balanceWithInterest);
	}
	
	public void getBalance(int accountBalance) {
		double balanceWithInterest= accountBalance+(5*accountBalance)/100;
		System.out.println("Current Balance is: "+balanceWithInterest);
	}
	
	public void withdraw(double amount) {
		if(amount<maxWithdrawLimit && accountBalance-amount>=0) {
			System.out.println("withdrawing "+ amount + " from your account");
			accountBalance-=amount;
		}
		else if(amount>maxWithdrawLimit) {
			System.out.println("you are exceeding the maximum withdrawal limit of "+ maxWithdrawLimit);
		}
		else {
			System.out.println("You do not have enough balance in your account");
		}
	}
	
}

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
