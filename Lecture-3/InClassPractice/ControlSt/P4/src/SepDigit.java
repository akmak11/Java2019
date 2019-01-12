/*
Author-Akshay Makkar
Version:1.0.0
Purpose: To separate and print digits of a 5 digit number
*/

import java.util.*;
class SepDigit
{
	public static void main (String [] args)
	{
		char choice;
		do //iterates at least once before asking for choice
		{
			System.out.println("Enter a five digit number:");
			Scanner scan= new Scanner(System.in);
			long num = scan.nextLong();
			do //checks if the number is 5 digit or not
			{
				if (num>99999 || num<10000)	//to prevent loop from executing if number is a 5 digit number
				{
					System.out.println("Invaild Input. Please enter a Five Digit Number");
					num = scan.nextLong();
				}
			}
			while (num>99999 || num<10000);
			long count,digit,newnum=num;
			for (count=5; count>=1; count--)
			{
				digit=newnum/(long)(Math.pow(10,(count-1)));	// extracts the first digit of number
				System.out.print(digit+"   ");
				newnum=num%(long)(Math.pow(10,(count-1)));		//updates the number removing the first digit
				if (count==1)
					System.out.println("");
			}
			
			System.out.println("Do you want to try the program for some other value -- Y/N ??");
			choice=scan.next().charAt(0);	//asks for choice
		}
		while (choice=='Y');
	}
}