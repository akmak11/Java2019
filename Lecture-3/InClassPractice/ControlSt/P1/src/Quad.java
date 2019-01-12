/*
Author-Akshay Makkar
Version:1.0.0
Purpose: To find and print solutions of a quadratic equation
*/

import java.util.*;
class Quad
{
	public static void main (String [] args)
	{
		System.out.println("Enter the values of coefficients of the quadratic equation - a,b,c");
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();	// coefficients input
		int b = scan.nextInt();
		int c = scan.nextInt();
		double determinant = b*b - (4.0*a*c);	// calculates determinant of given coefficients
		
		//comparing determinant with 0 for solutions
		
		if (determinant>0.0)
		{
			double r1 = (-b + Math.pow(determinant,0.5))/(2.0*a);
			double r2 = (-b - Math.pow(determinant,0.5))/(2.0*a);
			System.out.println("The roots are "+r1+" and "+r2);
		}
		else if (determinant == 0.0)
		{
			double r1 = -b/(2.0*a);
			double r2 = -b/(2.0*a);
			System.out.println("The roots are "+r1+" and "+r2);
		}
		else if (determinant < 0.0)
		System.out.println("The roots don't exist.");
	}
}