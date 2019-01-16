import java.util.*;
public class EmployeeTest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the details of employee (fName,lName,mSalary,1stLineAddress,2ndLineAddress,PinCode");
		String fName = scan.nextLine();
		String lName = scan.nextLine();
		double mSalary = scan.nextDouble();
		scan.nextLine();
		String fAddress = scan.nextLine();
		String lAddress = scan.nextLine();
		long pc = scan.nextLong();
		System.out.println("\n");
		
		Employee e2 = new Employee(fName,lName,mSalary,fAddress,lAddress,pc);
		double ySalary = e2.calcYearlySalary();
		System.out.println("Yearly Salary (befor raise):"+ySalary);
		e2.displayInfo();
	}
}