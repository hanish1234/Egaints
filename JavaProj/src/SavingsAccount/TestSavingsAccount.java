package SavingsAccount;

public class TestSavingsAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount account = new SavingsAccount(111,1000,"active",1234);
		System.out.println("Interest Rate:" +SavingsAccount.interstRate);
		
		account.withdraw(150, 1234);
	//	account.accountNo = 111;
	//	account.balance = 1000;
	//	account.pin = 1234;
	//	account.status = "active";
		
		account.printDetails();
		System.out.println();
		
		SavingsAccount account2 = new SavingsAccount(100,15000,"active",123);
		
	//	account2.accountNo = 100;
	//	account2.balance = 15000;
	//	account2.pin = 123;
	//	account2.status = "active";
		
		account2.printDetails();
	}
		
}
