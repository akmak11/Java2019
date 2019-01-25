import java.util.*;
class CircleDemo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double r = scan.nextDouble();
		ResizableCircle c = new ResizableCircle(r);
		System.out.println("Area: "+c.getArea()+"\nPerimeter: "+c.getPerimeter());
		System.out.println("Enter the resize percentage: ");
		int resize = scan.nextInt();
		c.radius = c.resize(resize);
		System.out.println("New Radius: "+c.radius+"\nArea: "+c.getArea()+"\nPerimeter: "+c.getPerimeter());
	}
}