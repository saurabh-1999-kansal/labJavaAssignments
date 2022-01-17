package com.Question1;

public class Invoice implements Payable {

	private String partNum;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNum, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	// using toString() method
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice \n partNum: ").append(partNum).append("\n part Description: ").append(partDescription)
				.append("\n quantity=").append(quantity).append("\n pricePerItem=").append(pricePerItem);
		return builder.toString();
	}

//	public void printInvoiceDetails() {
//		System.out.println("partNum "+ partNum);
//		System.out.println("partDescription "+ partDescription);
//		System.out.println("Quantity"+quantity);
//		System.out.println("Description "+ partDescription);
//		System.out.println("Price per Item "+ pricePerItem);
//	}

	// implementing the same Payable interface for Invoice as well
	// Invoice and Employee was not relatred at all,but one thing was common
	// ie the getPayment method.So we created Payable interface

	@Override
	public double getPayment() {
		return pricePerItem * quantity;
	}
}
