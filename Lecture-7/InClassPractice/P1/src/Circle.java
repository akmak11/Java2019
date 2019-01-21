public class Circle
{
	private double radius;
	private String color;

	Circle()
	{
		radius = 1.0;
		color = "Red";
	}

	Circle (double r)
	{
		radius = r;
		color  = "Red";
	}

	Circle (double r, String c)
	{
		radius = r;
		color =c;
	}

	void setRadius(double r)
	{
		radius = r;
	}

	double getRadius()
	{
		return radius;
	}

	void setColor(String c)
	{
		color = c;
	}

	String getColor()
	{
		return color;
	}

	double getArea()
	{
		return ((radius*radius*3.14));
	}
}