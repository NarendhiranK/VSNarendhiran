package Lab5;

public class BankAccount {

	private String Customername;
	private double balance;
	private long Accountnumber;
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public double getBalance() {
		return balance;
	}
	
	public BankAccount(String customername, double balance, long accountnumber) {
		super();
		Customername = customername;
		this.balance = balance;
		Accountnumber = accountnumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [Customername=" + Customername + ", balance=" + balance + ", Accountnumber=" + Accountnumber
				+ "]";
	}
	public long getAccountnumber() {
		return Accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		Accountnumber = accountnumber;
	}
	
}
