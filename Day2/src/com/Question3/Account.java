package com.Question3;

import java.util.Random;

public class Account {

	private String memberName;
	private String accountNumber;
	private double accountBalance;

	protected double getAccountBalance() {
		return accountBalance;
	}

	protected void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	protected Account(double initialBalance, String memberName) {
		Random rand = new Random();
		String num = 10000 + rand.nextInt(89999) + "";
		accountNumber = num;
		this.accountBalance = initialBalance;
		this.memberName = memberName;
	}

	public void deposit(double amt) {
		this.accountBalance += amt;
	}

}
