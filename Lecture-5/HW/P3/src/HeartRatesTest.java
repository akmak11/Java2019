import java.util.*;
public class HeartRatesTest
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values for 2 persons: FirstName,LastName,DoB(dd/mm/yyyy)");
		HeartRates p1 = new HeartRates();
		HeartRates p2 = new HeartRates();
		for(int i=0;i<2;i++)
		{
			String fName=scan.nextLine();
			String lName=scan.nextLine();
			int days=scan.nextInt();
			int month=scan.nextInt();
			int year=scan.nextInt();
			if (i==0)
				p1 = HeartRates(fName,lName,days,month,year);
			if (i==1)
				p2 = HeartRates(fName,lName,days,month,year);
		}
		System.out.println("\t\tFirstName\t\tLastName\t\tDoB\t\tMaximumHeartRate\t\tTargetHeartRate(Min)\t\tTargetHeartRate(Max)");
		System.out.print("Person-1:\t\t");
		double ageInYears=p1.calcAgeInYears();
		double maxHR = p1.maxHeartRate();
		double targetHRMin=p1.targetMaxHeartRate();
		double targetHRMax=p1.targetMinHeartRate();
		System.out.println(p1.firstName+"\t\t"+p1.lastName+"\t\t"+p1.DoB()+"\t\t"+p1.maxHeartRate+"\t\t"+p1.targetMaxHeartRate+"\t\t"+p1.targetMinHeartRate);
		System.out.print("Person-2:\t\t");
		ageInYears=p2.calcAgeInYears();
		maxHR = p2.maxHeartRate();
		targetHRMin=p2.targetMaxHeartRate();
		targetHRMax=p2.targetMinHeartRate();
		System.out.println(p2.firstName+"\t\t"+p2.lastName+"\t\t"+p2.DoB()+"\t\t"+p2.maxHeartRate+"\t\t"+p2.targetMaxHeartRate+"\t\t"+p2.targetMinHeartRate());
	}
}