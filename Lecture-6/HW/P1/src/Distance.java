import java.util.*;
class Distance
{
	float feet;
	float inch;
	Distance(float f, float i)
	{
		this.feet=f;
		this.inch=i;
	}
	Distance()
	{
		this.feet=0;
		this.inch=0;
	}
	void setFeet(float feet)
	{
		this.feet=feet;
	}
	void setInch(float inch)
	{
		this.inch=inch;
	}
	float getFeet()
	{
		return this.feet;
	}
	float getInch()
	{
		return this.inch;
	}
	void sum(Distance obj)
	{
		float sumfeet = this.feet+obj.feet;
		float suminch = this.inch+obj.inch;
		while (suminch>12)
		{
			sumfeet+=1;
			suminch=suminch%12;
		}
		System.out.println("Sum of distances = "+sumfeet+"feet "+suminch+"inch");
	}
}