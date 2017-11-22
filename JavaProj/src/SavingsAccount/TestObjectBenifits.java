package SavingsAccount;

public class TestObjectBenifits {
	
	public static void main(String[] args) {
	
		SavingsAccount account = new SavingsAccount(111,1000,"active",1234);
		LoanProcessor loanProcessor = new LoanProcessor();
		
		loanProcessor.processLoan(account);
}
}
