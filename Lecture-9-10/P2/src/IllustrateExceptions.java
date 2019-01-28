import java.util.*;
class IllustrateExceptions
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Menu:\n1.ClassNotFoundException\n2.IllegalAccessException\n3.InstantiationException\n4.NoSuchFieldException\n5.NoSuchMethodException");
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		switch (choice)
		{
			case 1:
			{
				try
				{
					
				}
				catch (ClassNotFoundException e)
				{
					System.out.println(e);
				}
				break;
			}

			case 2:
			{
				try
				{

				}
				catch (IllegalAccessException e)
				{
					System.out.println(e);
				}
				break;
			}

			case 3:
			{
				try
				{
					
				}
				catch (InstantiationException e)
				{
					System.out.println(e);
				}
				break;
			}

			case 4:
			{
				try
				{
					
				}
				catch (NoSuchFieldException e)
				{
					System.out.println(e);
				}
				break;
			}

			case 5:
			{
				try
				{
					
				}

				catch (NoSuchMethodException e)
				{
					System.out.println(e);
				}
				break;
			}

			default: System.out.println("Invalid Choice");
		}
	}
}