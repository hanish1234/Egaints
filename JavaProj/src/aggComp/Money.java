package aggComp;

public class Money {
	private int notes;
	private int coins;
	
	public Money() {
	}
	
	public Money(int notes, int coins) {
		this.notes = notes;
		this.coins = coins;
	}

	public int getNotes() {
		return notes;
	}
	public void setNotes(int notes) {
		this.notes = notes;
	}
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}

}
