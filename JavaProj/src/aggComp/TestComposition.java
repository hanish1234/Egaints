package aggComp;

public class TestComposition {

	public static void main(String[] args) {
		
		Battery bat = new Battery("Lithium Ion", 1000);
		Mobile mobile = new Mobile("Nokia","1100", bat );
		mobile.battery = bat;
		
		System.out.println("Make: "+mobile.getMake()+"\nModel: "+mobile.getModel()+"\nType: "+bat.getType()+"\nmAh: "+bat.getmAh());
		
		
	}
}
