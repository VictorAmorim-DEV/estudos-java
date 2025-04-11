package entites;

public class BankAccount {
	
	private int numAccount;
	private String holderAccount;
	private double valueDeposit;


	public BankAccount(int numAccount, String holderAccount, double valueDeposit) {
		this.numAccount = numAccount;
		this.holderAccount = holderAccount;
		this.valueDeposit = valueDeposit;
	}

	//
	public double getNumAccount() {
		return numAccount;
	}

	//
	public String getHolderAccount() {
		return holderAccount;
	}

	public void setHolderAccount(String holderAccount) {
		this.holderAccount = holderAccount;
	}
	
	//
	public double getValueDeposit() {
		return valueDeposit;
	}
	
	public void depositValue (double deposit) {
		valueDeposit += deposit;
	}
	
	public void withdrawValue (double withdraw) {
		valueDeposit -= (withdraw + 5);
	}
	//
	public String toString() {
		return "Account " + numAccount + ", Holder: " + holderAccount + ", Balance: $" + String.format("%.2f", valueDeposit);
	}
	
}
	
	

	
	

