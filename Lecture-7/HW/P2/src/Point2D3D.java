import java.util.*;
class Point2D3D
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x,y,z coordinates of the point");
		float x,y,z;
		x = scan.nextFloat();
		y = scan.nextFloat();
		z = scan.nextFloat();
		Point3D p = new Point3D();
		p.setXYZ(x,y,z);
		System.out.println(p.toString());
	}
}