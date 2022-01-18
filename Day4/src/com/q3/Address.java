package com.q3;

import java.io.Serializable;

public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int houseNo;
	String city;
	String state;
	String pincode;
	public Address(int houseNo,String city,String state,String pincode) {
	     this.houseNo=houseNo;
	     this.state=state;
	     this.city=city;
	     this.pincode=pincode;
	}
	public String display() {
		return houseNo+" "+city+" "+state+" "+pincode;
	}
}
