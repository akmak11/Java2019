
class DateOfBirth
{
	int days;
	int month;
	int year;
}


class HeartRates
{
	String firstName;
	String lastName;
	DateOfBirth dob = new DateOfBirth();
	HeartRates()
	{
		;
	}
	HeartRates(String fName,String lName,int day,int month,int year)
	{
		firstName=fName;
		lastName=lName;
		dob.days=day;
		dob.month=month;
		dob.year=year;
	}
	double calcAgeInYears()
	{
		return (dob.year+((dob.month*30)+dob.days)/365);
	}
	double maxHeartRate()
	{
		return (220-this.calcAgeInYears());
	}
	double targetMaxHeartRate()
	{
		return (1/2*this.maxHeartRate());
	}
	double targetMinHeartRate()
	{
		return (0.85*this.maxHeartRate());
	}
	String DoB()
	{
		return (this.dob.days+"/"+this.dob.month+"/"+this.dob.year);
	}
}