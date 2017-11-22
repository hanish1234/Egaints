package SavingsAccount;

public class JuniorSavingsAccount extends SavingsAccount{
	
	String guardianName;
	
	//parameterized constructor
	public JuniorSavingsAccount(int accountNo, float balance, String status, int pin, String guardianName) {
		super(accountNo, balance, status, pin);
		this.guardianName = guardianName;
	}
	
}
