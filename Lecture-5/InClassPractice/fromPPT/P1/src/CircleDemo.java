import java.util.*;
public class CircleDemo
{
	public static void main (String[]args)
	{
		
		Scanner scan = new Scanner (System.in);
		Circle c = new Circle();
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c.radius = 2;
		c.displayArea();
		c1.radius = 5;
		c1.displayArea();
		System.out.println("Enter the radius");
		c2.radius = scan.nextInt();
		c2.displayArea();
	}
}