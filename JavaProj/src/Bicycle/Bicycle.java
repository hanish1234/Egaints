package Bicycle;

public class Bicycle {

	int gear;
	int speed;
	int cadendce;
	String name;
	
	void changeCadence(int newValue) {
		cadendce = newValue;
		speed = speed+2;
	}
	
	void changeGear(int newValue) {
		gear = newValue;
	}
	
	void applyBrakes(int decrement) {
		speed = speed-decrement;
	}
	
	void printDetails() {
		System.out.println("Name: "+name+ "\nCadence: " +cadendce+ "\nGear: " +gear+ "\nSpeed: " +speed);
	}
}