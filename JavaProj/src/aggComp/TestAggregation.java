package aggComp;

public class TestAggregation {

	public static void main(String[] args) {
		Wallet wallet = new Wallet("Levis","Leather");
		Money mo = new Money(25,10);
		wallet.money = mo;
		
		System.out.println("Make: " +wallet.getMake()+"\nMaterial: " +wallet.getMaterial()+"\nNotes: "+mo.getNotes()+"\nCoins: "+mo.getCoins());
		
	}
}
