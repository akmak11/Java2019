/*
Author-Akshay Makkar
Version:1.0.0
Purpose: To print name of month corresponding to entered
*/

import java.util.*;
class Month
{
	public static void main (String [] args)
	{
		char choice;
			do 		// iterates at least once
				{
					System.out.println("Enter a number b/w 1 to 12");
					Scanner scan=new Scanner(System.in);
					int month = scan.nextInt();
					switch (month)	// comparing input with month number
					{
						case 1:
							System.out.println("January"); break;
						case 2:
							System.out.println("February"); break;
						case 3:
							System.out.println("March"); break;
						case 4:
							System.out.println("April"); break;
						case 5:
							System.out.println("May"); break;
						case 6:
							System.out.println("June"); break;
						case 7:
							System.out.println("July"); break;
						case 8:
							System.out.println("August"); break;
						case 9:
							System.out.println("September"); break;
						case 10:
							System.out.println("October"); break;
						case 11:
							System.out.println("November"); break;
						case 12:
							System.out.println("December"); break;
						default:
							System.out.println("Invalid Input"); break;
					}
					
					System.out.println("Do you want to continue: Y/N ??");
					
					choice = scan.next().charAt(0);			//choice to continue
				}
				while (choice=='Y');
			}
		}