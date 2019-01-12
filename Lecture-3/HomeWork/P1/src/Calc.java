/*
Author-Akshay Makkar
Version:1.0.0
Purpose: To print result of different arithmetic operations carrried on two numbers
*/

import java.util.*;
class Calc
{
	public static void main (String [] args)
	{
		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		int num1= scan.nextInt();	// inputs number
		int num2= scan.nextInt();

//different arithmetic operations

		int add = num1+num2; 
		int sub = num1-num2;
		int mul = num1*num2;
		int div = num1/num2;
		int mod = num1%num2;
		System.out.println("Addition = "+ add + "\n" + "Subtraction = "+ sub + "\n" + "Multiplication = "+ mul + "\n" + "Division = "+ div + "\n" + "Modulus = "+ mod);
	}
}