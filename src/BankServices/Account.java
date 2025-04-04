package BankServices;

import library.list.MyList;


public class Account {
	private int code;
	private String ownerName;
	private int date;
	private double balance;

	private static int counter = 0;
	{
		counter++;
	}

	public Account(String ownerName, int date, double balance) {
		this.code = counter;
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

	public int getCode() {
		return code;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getDate() {
		return date;
	}

	public double getBalance() {
		return balance;
	}
}
