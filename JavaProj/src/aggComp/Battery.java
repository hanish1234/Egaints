package aggComp;

public class Battery {
	private String type;
	private int mAh;
	
	public Battery() {	
	}

	public Battery(String type, int mAh) {
		this.type = type;
		this.mAh = mAh;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getmAh() {
		return mAh;
	}
	public void setmAh(int mAh) {
		this.mAh = mAh;
	}
	
}
