package BankServices;

import library.list.MyList;


public class Account {
	private int accountNumber;
	private String ownerName;
	private double balance;
	private int date;

	public Account(String ownerName, int date, double balance) {
		this.ownerName = ownerName;
		this.balance = balance;
		this.date = date;
	}

	public String toString() {
		return null;
	}
		
	public MyList getMovements() {
		return null;
	}
	
	public MyList getDeposits() {
		return null;
	}

	public MyList getWithdrawals() {
		return null;
	}
}
