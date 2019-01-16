import java.util.*;
public class EmployeeTest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int num=scan.nextInt();
		Employee employees[]=new Employee[num];
		int i;
		for (i=0;i<num;i++)
		{
			employees[i] = new Employee();
			System.out.print("Enter the name of Employee:");
			employees[i].name = scan.nextLine();
			scan.nextLine();
			System.out.println("Enter the Year of Joining:");
			employees[i].yearOfJoining = scan.nextInt();
			System.out.println("Enter the address of Employee:");
			scan.nextLine();
			employees[i].address = scan.nextLine();
		}
		System.out.println("Name\t\tYear\t\tAddress");
		for (i=0;i<num;i++)
		{
			employees[i].displayInfo();
		}
	}
}