import java.util.*;
class TestMyTime2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter HOUR:");
		int h = scan.nextInt();
		try
		{	if (h>23 || h<0)
				throw new IllegalArgumentException ("Invalid HOUR!");	}
		catch (IllegalArgumentException e) {System.out.println(e);}


		System.out.println("Enter MINUTE:");
		int m = scan.nextInt();
		try   {		if (m>59 || m<0)
						throw new IllegalArgumentException ("Invalid MINUTE!");		}
		catch (IllegalArgumentException e) {System.out.println(e);}

		System.out.println("Enter SECOND:");
		int s = scan.nextInt();
		try   {		if (s>59 || s<0)
						throw new IllegalArgumentException ("Invalid SECOND!");		}
		catch (IllegalArgumentException e) {System.out.println(e);}


		MyTime2 time = new MyTime2();
		try		{ time.setTime(h,m,s); }
		catch (IllegalArgumentException e) { System.out.println(e); }

		MyTime2 ns = time.nextSecond();
		System.out.println("\nNext Second is: "+"\t"+ns.toString());
		MyTime2 nm = time.nextMinute();
		System.out.println("Next Minute is: "+"\t"+nm.toString());
		MyTime2 nh = time.nextHour();
		System.out.println("Next Hour is: "+"\t\t"+nh.toString());


		MyTime2 ps = time.previousSecond();
		System.out.println("\nPrevious Second is: "+"\t"+ps.toString());
		MyTime2 pm = time.previousMinute();
		System.out.println("Previous Minute is: "+"\t"+pm.toString());
		MyTime2 ph = time.previousHour();
		System.out.println("Previous Hour is: "+"\t"+ph.toString());
	}
}