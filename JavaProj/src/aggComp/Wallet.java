package aggComp;

public class Wallet {
	private String make;
	private String material;
	Money money;
	
	public Wallet() {	
	}
	
	public Wallet(String make, String material) {
		this.make = make;
		this.material = material;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
