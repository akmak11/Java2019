/*
Author-Akshay Makkar
Version:1.0.0
Purpose: To print equivalent years/months/days of no. of minutes
*/

class MinuteYear
{
	public static void main (String [] args)
	{
		long minute=1000;	//sample data
		long days,months,year,remaining;
		year= minute/(60*24*365); 	//no. of years
		remaining=minute%(60*24*365);	//remaining minutes
		months=remaining/30;
		remaining=remaining%30;
		days=remaining;
		System.out.println(minute+" minutes are equal to -- "+year+" years "+months+" months "+days+" days.");
	}
}