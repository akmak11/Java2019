import java.util.*;
class IllustrateExceptions
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Menu:\n1.Arithmetic Exception\n2.ArrayIndexOutOfBoundsException\n3.NumberFormatException\n4.NullPointerException\n5.IllegalArgumentException");
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		switch (choice)
		{
			case 1:
			{
				try
				{
					int a=20;
					int b=0;
					System.out.println("Result: "+(a/b));
				}
				catch (ArithmeticException e)
				{
					System.out.println(e);
				}
				break;
			}

			case 2:
			{
				try
				{
					int a[] = new int[5];
					a[5] = 10;
				}
				catch (ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e);
				}
				break;
			}

			case 3:
			{
				try
				{
					int b = Integer.parseInt("ABC");
				}
				catch (NumberFormatException e)
				{
					System.out.println(e);
				}
				break;
			}

			case 4:
			{
				try
				{
					String ab = null;
					System.out.println(ab.length());
				}
				catch (NullPointerException e)
				{
					System.out.println(e);
				}
				break;
			}

			case 5:
			{
				try
				{
					String x = null;
					setTitle(x);
				}

				catch (IllegalArgumentException e)
				{
					System.out.println(e);
				}
				break;
			}

			default: System.out.println("Invalid Choice");
		}
	}

	public static void setTitle(String t)
	{
		if (t==null)
		{
			throw new IllegalArgumentException ();
		}
	}
}