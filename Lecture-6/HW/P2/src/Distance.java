import java.util.*;
class Distance
{
	private float feet;
	private float inch;
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
	static Distance sum(Distance obj1,Distance obj2)
	{
		Distance temp = new Distance();
		temp.feet = obj1.feet+obj2.feet;
		temp.inch = obj1.inch+obj2.inch;
		while (temp.inch>12)
		{
			temp.feet+=1;
			temp.inch=temp.inch%12;
		}
		return temp;
	}

	void display()
	{
		System.out.println("Sum of distances = "+this.feet+"feet "+this.inch+"inch");
	}
	
}