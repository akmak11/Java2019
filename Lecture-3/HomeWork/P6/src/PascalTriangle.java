/*
Author-Akshay Makkar
Version:1.0.0
Purpose: To print Pascal Triangle with user defined rows
*/

import java.util.*;
class PascalTriangle
{
	public static void main (String []args)
	{
		char choice;
		do
		{
			System.out.println("Enter the number of rows of Pascal's Triangle:");
			Scanner scan= new Scanner(System.in);
			int rows = scan.nextInt();
			int startAt=1; 
			int c1, c2, c3;	// counter variables
			for(c1=0;c1<rows;c1++)	//defines no. of rows
			{
				for(c2=rows; c2>c1; c2--) 
				{
					System.out.print(" ");
				}
            	startAt  = 1;
				for(c3=0;c3<=c1;c3++)
				{
					System.out.print(startAt+ " ");
                	startAt =startAt  * (c1 - c3) / (c3 + 1);	// claculates the value to be displayed
				}
				System.out.println();
			}
			System.out.println("Do you want to try the program for some other value -- Y/N ??");
			choice=scan.next().charAt(0);	//asks for choice
		}
		while (choice=='Y');
	}
}