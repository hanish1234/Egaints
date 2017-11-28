package aggComp;

public class Mobile {

	private String make;
	private String model;
	Battery battery;
	
	public Mobile() {
	}
	
	public Mobile(String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
