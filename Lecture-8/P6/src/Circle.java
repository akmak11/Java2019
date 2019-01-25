class Circle implements GeometricObject
{
	protected double radius;

	Circle()
	{
		radius = 1.0;
	}

	Circle(double r)
	{
		radius=r;
	}

	public double getPerimeter()
	{
		return (2*3.14*radius);
	}

	public double getArea()
	{
		return (3.14*radius*radius);
	}

}