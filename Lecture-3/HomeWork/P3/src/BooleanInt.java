/*
Author-Akshay Makkar
Version:1.0.0
Purpose: To observe the effect of using relational and logical operators on integers and boolean values
*/

import java.util.*;
class BooleanInt
{
	public static void main (String[]args)
	{
		System.out.println("\n Enter two integer values \n");
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();	//inputs number 1
		int num2 = scan.nextInt(); // inputs number 2
		System.out.println ("\n 'Equal to' operation: "+ (num1==num2));
		System.out.println ("'Not Equal to' operation: "+ (num1!=num2));
		System.out.println ("'Greater than' operation: "+ (num1>num2));
		System.out.println ("'Smaller than' operation: "+ (num1<num2));
		System.out.println ("'Greater than or Equal to' operation: "+ (num1>=num2));
		System.out.println ("'Smaller than or Equal to' operation: "+ (num1<=num2));
		System.out.println ("'Conditional OR' operation: "+ ((num1>num2)||(num1==num2)));
		System.out.println ("'Conditional AND' operation: "+ ((num2!=num1)&&(num1<=num2)));

		System.out.println("\n Enter two Boolean values (use 'T' or 'F') \n ");
		char boo1 = scan.next().charAt(0);
		boolean bool1;
		boolean bool2;
		if (boo1=='T')
			bool1=true; //converts character to boolean
		else
			bool1=false; //converts character to boolean
		char boo2 = scan.next().charAt(0);
		if (boo2=='T')
			bool2=true;
		else
			bool2=false;
		System.out.println ("\n 'Equal to' operation: "+ (bool1==bool2));
		System.out.println ("'Not Equal to' operation: "+ (bool1!=bool2));
		System.out.println ("'Conditional OR' operation: "+ (bool2||bool1));
		System.out.println ("'Conditional AND' operation: "+ (bool2&&bool1));

	}
}