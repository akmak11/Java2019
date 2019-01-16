
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
		return (2019-dob.year);
	}
	double maxHeartRate()
	{
		return (220-this.calcAgeInYears());
	}
	double targetMaxHeartRate()
	{
		return (0.5*this.maxHeartRate());
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