class Employee
{
	String firstName;
	String lastName;
	double monthlySalary;
	Employee()
	{
		firstName="Akshay";
		lastName="Makkar";
		monthlySalary=100;
	}
	Employee(String fName, String lName, double mSalary)
	{
		firstName=fName;
		lastName=lName;
		monthlySalary=mSalary;
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
	}
}