import java.util.*;
public class HeartRatesTest
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values for 2 persons: FirstName,LastName,DoB(dd/mm/yyyy)");
		HeartRates p[] = new HeartRates[2];
		for(int i=0;i<2;i++)
		{
			String fName=scan.nextLine();
			String lName=scan.nextLine();
			int days=scan.nextInt();
			int month=scan.nextInt();
			int year=scan.nextInt();			
			p[i] = new HeartRates(fName,lName,days,month,year);
			scan.nextLine();
			
		}
		System.out.println("\t\tFirstName\t\tLastName\t\tDoB\t\tMaximumHeartRate\t\tTargetHeartRate(Min)\t\tTargetHeartRate(Max)");
		System.out.print("Person-1:\t\t");
		double ageInYears=p[0].calcAgeInYears();
		double maxHR = p[0].maxHeartRate();
		double targetHRMin=p[0].targetMaxHeartRate();
		double targetHRMax=p[0].targetMinHeartRate();
		System.out.println(p[0].firstName+"\t\t"+p[0].lastName+"\t\t"+p[0].DoB()+"\t\t\t"+maxHR+"\t\t"+targetHRMax+"\t\t\t\t"+targetHRMin);
		System.out.print("Person-2:\t\t");
		ageInYears=p[1].calcAgeInYears();
		maxHR = p[1].maxHeartRate();
		targetHRMin=p[1].targetMaxHeartRate();
		targetHRMax=p[1].targetMinHeartRate();
		System.out.println(p[1].firstName+"\t\t"+p[1].lastName+"\t\t"+p[1].DoB()+"\t\t\t"+maxHR+"\t\t"+targetHRMax+"\t\t\t\t"+targetHRMin);
	
	}
}