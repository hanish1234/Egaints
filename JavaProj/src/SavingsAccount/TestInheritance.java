package SavingsAccount;

public class TestInheritance {
	public static void main(String[] args) {
		
		JuniorSavingsAccount account = new JuniorSavingsAccount(1011,2222,"active",1122,"hani");
		System.out.println("Account No : "+account.accountNo);
		System.out.println("Balance : " +account.balance);
		System.out.println("Guardian Name : " +account.guardianName);
	}
}
