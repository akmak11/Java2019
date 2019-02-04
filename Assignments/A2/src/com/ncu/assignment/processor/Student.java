package com.ncu.assignment.processor;
public class Student
{
	public String firstName;
	public String lastName;
	public Address addr = new Address();
	public Datee dob = new Datee();
	public String [] skills;
	public Qualification qual[];
	public Project projects[];
	public String eMail;
	public String contactNo;
	
	public void display()
	{
		System.out.println("Name of Student: "+firstName+" "+lastName);
		System.out.println("Address: "+addr.line1+", "+addr.line2+", "+addr.city+", "+addr.state+"-"+addr.pinCode);
		System.out.println("DOB: "+dob.day+"/"+dob.month+"/"+dob.year);		


		System.out.println("Skills:");
		for (int i=0;i<skills.length;i++)
		{
			System.out.println((i+1)+". "+skills[i]);
		}


		System.out.println("Qualifications: ");
		for (int i=0;i<qual.length;i++)
		{
			System.out.println((i+1)+". "+qual[i].qualName+"- From "+qual[i].institute+" under "+qual[i].university+" with "+qual[i].cgpa+" cgpa.");
		}


		System.out.println("Projects:");
		for (int i=0;i<projects.length;i++)
		{
			System.out.println((i+1)+". "+projects[i].name);
			System.out.println("Started on: "+projects[i].startDate.day+"/"+projects[i].startDate.month+"/"+projects[i].startDate.year);
			System.out.println("Ended on: "+projects[i].endDate.day+"/"+projects[i].endDate.month+"/"+projects[i].endDate.year);
			System.out.println("Role: "+projects[i].role);
			System.out.print("Responsibilities: ");
			for (int j=0;j<projects[i].responsibilities.length;j++)
			{
				System.out.print(projects[i].responsibilities[j]+"\t");
			}
			System.out.println();
		}



		System.out.println("E-Mail Address: "+eMail);
		System.out.println("Contact Number: "+contactNo);
	}
}