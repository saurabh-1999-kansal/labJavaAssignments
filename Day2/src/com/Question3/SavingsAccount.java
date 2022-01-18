package com.Question3;

public class SavingsAccount extends Account {
	double minimumBalance = 500.0;
	int interest;
	double maxWithdrawLimit;

	SavingsAccount(double initialBalance, String memName, double maxWithdrawLimit) {
		super(initialBalance, memName);
		interest = 5;
		this.maxWithdrawLimit = maxWithdrawLimit;
	}

	@Override
	protected double getAccountBalance() {
		double totalBalance = (super.getAccountBalance() + (interest * super.getAccountBalance() / 100.0));

		return totalBalance;
	}

	public void withDraw(double amt) {
		if (amt < this.maxWithdrawLimit && ((this.getAccountBalance() - amt) >= 500)) {
			this.setAccountBalance(this.getAccountBalance() - amt);
			System.out.println("amt " + amt + " has been withdrawn");
		} else {
			System.out.println("you can't withdraw from grater than your limit");
		}
	}
}
