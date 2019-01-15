import java.util.*;
class Date
{
	int month,year,day;
	Date()
	{
		this.month=1;
		this.day=1;
		this.year=2000;
	}
	Date(int d, int m, int y)
	{
		this.month=m;
		this.day=d;
		this.year=y;
	}
	void displayDate()
	{
		System.out.println("The Date is: "+this.day+"/"+this.month+"/"+this.year);
	}
}

public class DateTest
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		Date d1 = new Date();
		d1.displayDate();
		Date d2;
		System.out.println("Enter the Day, Month and Year");
		int d = scan.nextInt();
		int m = scan.nextInt();
		int y = scan.nextInt();
		d2 = new Date(d,m,y);
		d2.displayDate();
	}
}