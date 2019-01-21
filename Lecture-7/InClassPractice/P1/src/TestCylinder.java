import java.util.*;
class TestCylinder
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		Cylinder c1 = new Cylinder();
		System.out.println(c1.getColor()+"\t"+c1.getRadius()+"\t"+c1.getHeight()+"\t"+c1.getArea()+"\t"+c1.getVolume());
		Cylinder c2 = new Cylinder(2,7,"Black");
		System.out.println(c2.getColor()+"\t"+c2.getRadius()+"\t"+c2.getHeight()+"\t"+c2.getArea()+"\t"+c2.getVolume());
		System.out.println("Enter the Color, Radius, Height of the cylinder");
		String c = scan.nextLine();
		double r = scan.nextDouble();
		double h = scan.nextDouble();
		Cylinder c3 = new Cylinder(r,h,c);
		System.out.println(c3.getColor()+"\t"+c3.getRadius()+"\t"+c3.getHeight()+"\t"+c3.getArea()+"\t"+c3.getVolume());
	}
}