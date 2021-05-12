package com.ojas.mar23;

public class InSufficientFundsException extends Exception{
	
	double amount;
	
	public double getAmount() {
		return amount;
	}

	public InSufficientFundsException(String message) {
		super(message);
	}
	
	
}
