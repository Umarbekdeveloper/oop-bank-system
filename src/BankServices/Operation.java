package BankServices;

public class Operation extends Account{
	private int date;
	private double amount;

	public Operation(String ownerName, int date, double balance) {
		super(ownerName, date, balance);
	}


	@Override
	public String toString() {
		return super.toString();
	}
}
