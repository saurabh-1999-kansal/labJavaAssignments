package com.Question3;

public class CurrentAccount extends Account {
	String tradeLicenceNumber;

	CurrentAccount(double initialBalance, String memName, String tln) {
		super(initialBalance, memName);
		this.tradeLicenceNumber = tln;
	}

	public double getBalance() {
		return this.getAccountBalance();
	}

	public void withDraw(double amt) {
		System.out.println("amt: " + amt + " balance:" + this.getAccountBalance());
		if (amt > this.getAccountBalance()) {
			System.out.println("amt " + amt + " has been withdrawn");
			this.setAccountBalance(this.getAccountBalance() - amt);
		} else {
			System.out.println("you can't withdraw grater than your account balance");
		}
	}

}
