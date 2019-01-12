/*
Author-Akshay Makkar
Version:1.0.0
Purpose: To check if the entered character is a vowel or a consonant
*/

import java.util.*;
class Vowel
{
	public static void main (String []args)
	{
		System.out.println("Enter a character to check whether it is a vowel or consonant:");
		Scanner scan = new Scanner(System.in);	
		char ch = scan.next().charAt(0);	//character input
		
		if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')	//checks for vowel
			System.out.println("The entered character is a vowel");
		else
			System.out.println("The entered character is a consonant");
	}
}