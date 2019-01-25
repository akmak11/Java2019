class Circle extends Shape
{
	protected double radius;

	Circle()
	{
		super();
		radius = 1;
	}

	Circle (double r)
	{
		super();
		radius = r;
	}

	Circle(double r,String c,boolean f)
	{
		super(c,f);
		radius=r;
	}

	double getRadius ()
	{
		return radius;
	}

	void setRadius(double r)
	{
		this.radius = r;
	}

	double getArea()
	{
		return (3.14*radius*radius);
	}

	double getPerimeter()
	{
		return (2*3.14*radius);
	}

	public String toString()
	{
		return (getColor()+"\t"+isFilled()+"\t"+getRadius()+"\t"+getArea()+"\t"+getPerimeter());
	}
}