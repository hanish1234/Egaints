package SavingsAccount;

public class LoanProcessor {
	
	public void processLoan(SavingsAccount account) {
		System.out.println("Account No: " +account.accountNo);
		
		System.out.println("Loan processed successfully...");
		
		account.withdraw(100);
		
		System.out.println("Processing fee deducted. Account balance : "+account.balance);
		account.deposit(20000);
		System.out.println("final balance:" +account.balance);
	}
}
