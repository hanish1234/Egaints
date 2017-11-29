package cylinder;

public class CalculateArea implements InterfaceCylinder {
	
	final static float pi = 3.14f;
	double radius;
	double height;
	double circleArea, rectangleArea, cylinderArea;
	double peremeter;
	
	public CalculateArea() {
	}
	
	public CalculateArea(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public void circleArea() {
		circleArea =  pi * radius * radius ;
	}
	
	public void rectangleArea() {
		rectangleArea =  2 * radius * height ;
	}
	
	public void calculatePeremeter() {
		peremeter =  2 * pi * radius;
	}
	
	public void cylinderArea() {
			cylinderArea = 2 * circleArea + rectangleArea;
	}
	
	public void printDetails() {
		
		System.out.println("Area of the Circle is :"+circleArea+"\nPeremeter of the circle is : "+peremeter+"\nArea of the Rectangle is :"+rectangleArea+"\nArea of Cylinder is :"+cylinderArea);
		
		
	}

}