public class Circle
{
	double radius;
	double area;
	double findArea()
	{
		return (3.14*radius*radius);
	}
	void displayArea()
	{
		System.out.println("Area of circle is: "+findArea());
	}
}