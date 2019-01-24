import java.util.*;
class ShapeTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		Shape s = new Shape();
		
		System.out.println("Enter dimensions of Rectangle");
		float rl,rw;
		rl = scan.nextFloat();
		rw = scan.nextFloat();
		Rectangle r = new Rectangle(rl,rw);
		
		System.out.println("Enter dimensions of Square");
		float ss;
		ss = scan.nextFloat();		
		Square sq=  new Square(ss);

		System.out.println("Enter dimensions of Circle");
		float rc;
		rc = scan.nextFloat();		
		Circle c=  new Circle(rc);

		System.out.println("Shape: "+"\t"+"\t"+s.toString());
		System.out.println("Rectangle: "+"\t"+r.toString());
		System.out.println("Circle: "+"\t"+c.toString());
		System.out.println("Square: "+"\t"+sq.toString());
	}
}