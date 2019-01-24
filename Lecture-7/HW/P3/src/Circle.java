class Circle extends Shape
{
	double radius;

	Circle()
	{
		super();
		radius=1.0;
	}

	Circle(double r)
	{
		super();
		radius=r;
	}

	Circle(double r,boolean f,String c)
	{
		super(c,f);
		radius=r;
	}

	void setRadius(double r)
	{
		radius = r;
	}

	double getRadius()
	{
		return radius;
	}

	double getArea()
	{
		return ((radius*radius*3.14));
	}

	double getPerimeter()
	{
		return ((2*3.14*radius));
	}

	public String toString()
	{
		return getColor()+"\t"+isFilled()+"\t"+radius+"\t"+getArea()+"\t"+getPerimeter();
	}
}