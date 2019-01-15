import java.util.*;
class Circle
{
	
	double radius;
	Circle()
	{
		this.radius=1;
	}
	Circle(double r)
	{
		this.radius = r;
	}
	double area()
	{
		return (3.14*radius*radius);
	}
	double circumference()
	{
		return (2*3.14*radius);
	}
	void display(double area, double circum)
	{
		System.out.println("Area is: "+area);
		System.out.println("Circumference is: "+circum);
	}
}

public class CircleTest
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Circle c1 = new Circle();
		double area = c1.area();
		double circum = c1.circumference();
		c1.display(area,circum);
		Circle c2;
		System.out.println("Enter the value of radius:");
		double r=scan.nextInt();
		c2 = new Circle(r);
		area = c2.area();
		circum = c2.circumference();
		c2.display(area,circum);
	}
}