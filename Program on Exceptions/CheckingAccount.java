package com.ojas.mar23;

public class CheckingAccount {

	int accountNo;
	double balance;

	boolean checkAccount(int accountNo) {
		if (accountNo > 0) {
			return true;
		}
		return false;
	}

	void despoit(double amount) {
		balance += amount;
	}

	double withdraw(double amount) {
		try {
			if (balance < amount) {
				throw new InSufficientFundsException("insuffient balance");
			} else {
				System.out.println("amount withdraw sucessfully");
				balance -= amount;
				System.out.println("Reamining balnce =" + balance);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return balance;

	}

}
