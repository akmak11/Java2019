/*
Author-Akshay Makkar
Version:1.0.0
Purpose: To find sum of the given series
*/

import java.util.*;
class Series
{
	public static void main (String []args)					 //main funtion 
	{
		System.out.println("Enter the value of 'x':");
		Scanner scan = new Scanner (System.in);				//input of x
		int x = scan.nextInt();
		System.out.println("Enter the number of terms wanted: ");
		int terms = scan.nextInt();							//no. of terms input
		float sum = 0;
		long fac=1;											//initialized factorial term for denominator to 1
		if (terms==1)
			System.out.println("Sum is: "+sum+1);			//if user asks for only 1 term
		else if (terms==2)
			System.out.println("Sum is: "+(sum+1+x));		// if user asks for only 2 terms
		else
		{
			sum = 1+x;										// if more than 3 terms are asked, sum of first two will be 1+x
			
			for (int counter=2; counter<=(terms-1); counter++)		// loop to calculate further terms and add them
			{
				float term1 = (counter*x);
				float term2 = factorial(counter);
				float term3 = term1/term2;		// to calculate the third term and so on according to expression
				sum=sum+term3;
			}
			System.out.println("Sum is: "+sum);
		}
	}
	public static long factorial (int arg)					// to calculate and return factorial
	{
		int num=arg;
		long fac=1;
		for (int counter=1; counter<=arg; ++counter)
			fac*=counter;
		return fac;
	}
}