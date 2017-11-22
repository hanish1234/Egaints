package Circle;
public class Circle {

	double radius;
	double area;

	void calcArea()
{
	area=3.14*radius*radius;
}
	

void printData()
{
	System.out.println("Area of the circle is " +area);
}
}