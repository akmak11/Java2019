public class Employee
{
	String firstName;
	String lastName;
	double monthlySalary;
	Address add;
	Employee(String fName, String lName, double mSalary,String fLine, String sLine,long pc)
	{
		firstName=fName;
		lastName=lName;
		monthlySalary=mSalary;
		add = new Address (fLine,sLine,pc);
	}
	double calcYearlySalary()
	{
		return (12*this.monthlySalary);
	}
	double calcRaise()
	{
		return (1.10*this.calcYearlySalary());
	}
	void displayInfo()
	{
		System.out.println("Employee details:\n"+this.firstName+" "+this.lastName+"\nYearly Salary (after raise):"+this.calcRaise());
		System.out.println("Address is: "+this.add.firstLine+"\n"+this.add.secondLine+"\n"+this.add.pinCode);
	}
}