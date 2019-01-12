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
		String ch = scan.nextLine();	//character input in string
		do 		//checks whether input is string  or character
		{
			if (ch.length()>1)
			{
				System.out.println("Re-enter the character");
				ch = scan.nextLine();
			}
		}
		while (ch.length()>1);
		char c = ch.charAt(0); // converts string to character
		if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')	//checks for vowel
			System.out.println("The entered character is a vowel");
		else
			System.out.println("The entered character is a consonant");
	}
}