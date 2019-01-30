import java.util.*;
class StudentDriver
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Student stu1 = new Student();
		System.out.println("Enter the name of Student:");
		stu1.firstName = scan.nextLine();
		stu1.lastName = scan.nextLine();



		System.out.println("Enter the address details: (Line1,Line2,City,State,PinCode)");
		System.out.print("Line1: ");
		String line1 = scan.nextLine();
		System.out.print("\nLine2: ");
		String line2 = scan.nextLine();
		System.out.print("\nCity: ");
		String city = scan.nextLine();
		System.out.print("\nState: ");
		String state = scan.nextLine();
		System.out.print("\nPinCode: ");
		int pinCode = scan.nextInt();
		stu1.addr.setValueAddress(line1,line2,city,state,pinCode);


		System.out.println("Enter the DOB: (date,month,year)");
		int date,month,year;
		date = scan.nextInt();
		month = scan.nextInt();
		year = scan.nextInt();
		stu1.dob.setValueDate(date,month,year);



		System.out.println("Enter the number of skills the student possess");
		int noOfSkills = scan.nextInt();
		stu1.skills = new String [noOfSkills];

		for (int i=0;i<noOfSkills;i++)
		{
			System.out.println("Enter skill no. "+(i+1));
			scan.nextLine();
			stu1.skills[i]=scan.nextLine();
		}



		System.out.println("How many qualifications does the student have?");
		int noOfQual = scan.nextInt();
		stu1.qual = new Qualification [noOfQual];
		System.out.println("Enter the data for each Qualification:");
		for (int i=0; i<noOfQual;i++)
		{
			System.out.println((i+1)+".");
			System.out.println("Name");
			scan.nextLine();
			String qualName = scan.nextLine();
			System.out.println("University");
			String uni = scan.nextLine();
			System.out.println("Institute");
			String insti = scan.nextLine();
			System.out.println("CGPA");
			float cgpa = scan.nextFloat();
			stu1.qual[i] = new Qualification();
			stu1.qual[i].setQual(qualName,uni,insti,cgpa);
		}



		System.out.println("How many projects does the student have done?");
		int noOfProjects = scan.nextInt();
		stu1.projects = new Project[noOfProjects];
		System.out.println("Enter the data for each project: Name, StartDate, EndDate, Role, Responsibilities");
		for (int i=0;i<noOfProjects;i++)
		{
			System.out.println("Project No. "+(i+1)+".");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Started on");
			int sDay = scan.nextInt();
			int sMonth = scan.nextInt();
			int sYear = scan.nextInt();
			System.out.println("Ended on");
			int eDay = scan.nextInt();
			int eMonth = scan.nextInt();
			int eYear = scan.nextInt();
			System.out.println("Role:");
			scan.nextLine();
			String role = scan.nextLine();
			System.out.println("How many responsibilities were there for this project?");
			int noOfRespo = scan.nextInt();
			stu1.projects[i] = new Project();
			stu1.projects[i].responsibilities = new String[noOfRespo];

			for (int j=0;j<noOfRespo;j++)
			{
				System.out.println("Enter responsibility no. "+(j+1));
				scan.nextLine();
				stu1.projects[i].responsibilities[j] = scan.nextLine();
			}

			stu1.projects[i].setProject(name,role);
			stu1.projects[i].startDate = new Date();
			stu1.projects[i].setStartDate(sDay,sMonth,sYear);
			stu1.projects[i].endDate = new Date();
			stu1.projects[i].setEndDate(eDay,eMonth,eYear);
		}



		System.out.println("Enter student's email address");
		stu1.eMail = scan.nextLine();
		System.out.println("Enter student's contact number");
		stu1.contactNo = scan.nextLine();



		stu1.display();
	}
}