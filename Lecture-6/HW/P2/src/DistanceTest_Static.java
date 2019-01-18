import java.util.*;
class DistanceTest_Static
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the two distances in feet,inch\nDistance1:");
		float feet1 = scan.nextFloat();
		float inch1 = scan.nextFloat();
		System.out.println("Distance2:");
		float feet2 = scan.nextFloat();
		float inch2 = scan.nextFloat();
		Distance d1 = new Distance (feet1,inch1);
		Distance d2 = new Distance();
		d2.setFeet(feet2);
		d2.setInch(inch2);
		Distance sum = new Distance();
		sum = Distance.sum(d1,d2);
		sum.display();
	}
}