/*
Author-Akshay Makkar
Version:1.0.0
Purpose: To compare two floating point numbers upto 3 decimal places
*/

import java.util.*;
import java.text.DecimalFormat;		//imported to round off the numbers
class Decimal
{
	public static void main (String []args)
	{
		System.out.println("Enter two decimal numbers:");
		Scanner scan = new Scanner(System.in);
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();
		DecimalFormat df = new DecimalFormat("0.000");	//sets rounding off to 3 places
		String newnum1 = df.format(num1);
		String newnum2 = df.format(num2);

		//comparing the numbers

		int compare = newnum1.compareTo(newnum2);
		if (compare>0)
		{
			System.out.println("Number 1 is greater");
		}
		else if (compare ==0)
			System.out.println("Both are equal");
		else
			System.out.println("Number 2 is greater");
	}
}
