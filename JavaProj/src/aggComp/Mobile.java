package aggComp;

public class Mobile {

	private String make;
	private String model;
	Battery battery;
	
	public Mobile() {
	}
	
	public Mobile(String make, String model, Battery battery) {
		this.make = make;
		this.model = model;
		this.battery = battery;
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
