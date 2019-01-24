class Square extends Rectangle
{
	Square()
	{
		super();
		length=1.0;
		width=1.0;
	}

	Square(double s)
	{
		super();
		length=s;
		width=s;
	}

	Square(double s,boolean f,String c)
	{
		super(s,s,f,c);
	}

	void setSide(double s)
	{
		length = s;
		width = s;
	}

	double getSide()
	{
		return length;
	}

	void setWidth(double s)
	{
		width = s;
	}

	void setLength(double s)
	{
		width = s;
	}

	public String toString()
	{
		return getColor()+"\t"+isFilled()+"\t"+getLength()+"\t"+getWidth()+"\t"+getArea()+"\t"+getPerimeter();
	}
}