import java.util.*;
class TestMyTime
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Validate v = new Validate();
		boolean vh=false,vm=false,vs=false;


		System.out.println("Enter HOUR:");
		int h = scan.nextInt();
		try {vh = v.validateHour (h);}
		catch (IllegalArgumentException e) {System.out.println(e);}


		System.out.println("Enter MINUTE:");
		int m = scan.nextInt();
		try {vm = v.validateMinute (m);}
		catch (IllegalArgumentException e) {System.out.println(e);}


		System.out.println("Enter SECOND:");
		int s = scan.nextInt();
		try {vs = v.validateSecond (s);}
		catch (IllegalArgumentException e) {System.out.println(e);}


		MyTime time = new MyTime();
		try
		{	time.setTime(vh,vm,vs,h,m,s);
		}
		catch (IllegalArgumentException e)
		{	System.out.println(e);
		}

		MyTime ns = time.nextSecond();
		System.out.println("\nNext Second is: "+"\t"+ns.toString());
		MyTime nm = time.nextMinute();
		System.out.println("Next Minute is: "+"\t"+nm.toString());
		MyTime nh = time.nextHour();
		System.out.println("Next Hour is: "+"\t\t"+nh.toString());


		MyTime ps = time.previousSecond();
		System.out.println("\nPrevious Second is: "+"\t"+ps.toString());
		MyTime pm = time.previousMinute();
		System.out.println("Previous Minute is: "+"\t"+pm.toString());
		MyTime ph = time.previousHour();
		System.out.println("Previous Hour is: "+"\t"+ph.toString());


	}
}