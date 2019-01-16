import java.util.*;
public class StudentGrades
{
	Scanner scan = new Scanner(System.in);
	int subjects[]=new int [10];


	public static void main(String []args)
	{
		// declare and initialize the array
      	float grades[][] = new float [11][6];

      	StudentGrades student = new StudentGrades();	//object declaration and initialization
      	student.getGrades(grades);
      	student.printGrades(grades);
    }




    void getGrades(float grades[][])
    {
    	int stu;
    	int no_Subject;
     	int subject;
     	float grade;
     	System.out.println("Enter the student number, subject, and grade:");
     	for (int i=0;i<10;i++)
      	{
      		stu=i+1;
      		System.out.println("How many subjects does Student "+stu+" has?");
			no_Subject=scan.nextInt();
			subjects[i]=no_Subject;
			for (int j=0;j<no_Subject;j++)
			{
				System.out.print("Enter Subject: ");
				subject = scan.nextInt();
				System.out.println("");
				System.out.print("Enter Grade: ");
				grade = scan.nextFloat();
				System.out.println("");
				grades[i][subject-1] += grade;
			}
		}
	}




	void printGrades(float grades[][])
	{
		float subSum=0,stuSum=0;
		System.out.println("\t\t\tSub1\t\tSub2\t\tSub3\t\tSub4\t\tSub5\t\tStuAvg");
		for (int i=0; i<10;i++)
		{
			System.out.print("Stu-"+(i+1)+"\t\t\t");
			for (int j=0; j<5;j++)
			{
				System.out.print(grades[i][j]+"\t\t");
				stuSum+=grades[i][j];
			}
			System.out.print((stuSum/subjects[i]));
			stuSum=0;
			System.out.println("");
		}
	}
}