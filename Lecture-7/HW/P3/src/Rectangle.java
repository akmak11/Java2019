class Rectangle extends Shape
{
	double width,length;

	Rectangle()
	{
		super();
		length=1.0;
		width=1.0;
	}

	Rectangle(double w,double l)
	{
		super();
		length=l;
		width=w;
	}

	Rectangle(double w,double l,boolean f,String c)
	{
		super(c,f);
		length=l;
		width=w;
	}

	void setWidth(double w)
	{
		width = w;
	}

	double getWidth()
	{
		return width;
	}

	void setLength(double l)
	{
		length = l;
	}

	double getLength()
	{
		return length;
	}

	double getArea()
	{
		return ((width*length));
	}

	double getPerimeter()
	{
		return ((2*(length+width)));
	}

	public String toString()
	{
		return getColor()+"\t"+isFilled()+"\t"+getLength()+"\t"+getWidth()+"\t"+getArea()+"\t"+getPerimeter();
	}
}