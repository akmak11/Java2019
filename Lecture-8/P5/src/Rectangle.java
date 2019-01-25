class Rectangle extends Shape
{
	protected double width;
	protected double length;

	Rectangle()
	{
		super();
		width = 1;
		length = 1;
	}

	Rectangle(double l,double w)
	{
		super();
		length = l;
		width = w;
	}

	Rectangle(double l,double w,String c,boolean f)
	{
		super(c,f);
		length = l;
		width = w;
	}

	double getWidth()
	{
		return width;
	}

	double getLength()
	{
		return length;
	}

	void setLength(double l)
	{
		length = l;
	}

	void setWidth(double w)
	{
		width = w;
	}

	double getArea()
	{
		return (length*width);
	}

	double getPerimeter()
	{
		return ((2*(length+width)));
	}

	public String toString()
	{
		return (getColor()+"\t"+isFilled()+"\t"+getLength()+"\t"+getWidth()+"\t"+getArea()+"\t"+getPerimeter());
	}
}