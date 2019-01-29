package edu.ncu.main;
import edu.ncu.exception.*;
import edu.ncu.processor.*;
public class Driver
{
	public static void main(String[] args)
	{
		A a = new C();
		try 
		{
			a.meth();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}	
}