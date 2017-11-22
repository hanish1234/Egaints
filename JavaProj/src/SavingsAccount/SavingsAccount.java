package SavingsAccount;

public class SavingsAccount {

	int accountNo;
	float balance;
	String status;
	int pin;
	final static float interstRate = 2.25f;
	
	//default constructor
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingsAccount(int accountNo, float balance, String status, int pin) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.status = status;
		this.pin = pin;
	}

	void printDetails() {
		System.out.println("AccountNo: "+accountNo+ "\nBalance: "+balance+ "\nStatus: "+status);
	}
	
	//withdraw(int)
	void withdraw(int withdrawalAmount) {
		//business logic
		if(this.status == "active") {
			
			if(withdrawalAmount <= this.balance) {
				
				this.balance = this.balance - withdrawalAmount;
			
			}else {
				System.out.println("You have insufficient balance");
			}
				
		}else {
			System.out.println("Account is inactive");
		}
	}
	
	//withdraw(int,int)
	void withdraw(int withdrawalAmount, int pin) {
		
		if(this.pin == pin) {
			if(withdrawalAmount <= 40000) {
				withdraw(withdrawalAmount);
			}else {
				System.err.println("Withdrawal limit exceeded");
			}
		}else {
			System.err.println("Invalid pin");
		}
	}
	
	//deposit(int)
	void deposit(int depositAmount) {
		if(depositAmount > 0) {
			balance = balance + depositAmount;
	}else {
		System.out.println("Invalid deposit amount");
	}
	}
}

