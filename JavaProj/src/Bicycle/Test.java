package Bicycle;
public class Test {
	
	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle() ;
			bicycle.printDetails();
			System.out.println();
			
			bicycle.changeGear(4);
			bicycle.changeCadence(10);
			bicycle.name="Spice";
			bicycle.printDetails();
			System.out.println();
			
		Bicycle bicycle2 = new Bicycle();
			bicycle2.changeGear(7);
			bicycle2.changeCadence(15);
			bicycle2.name="Bird";
			bicycle2.printDetails();
		}
		
}


