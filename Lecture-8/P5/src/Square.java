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
		super(s,s,c,f);
		setWidth(s);
		setLength(s);
	}

	void setSide(double s)
	{
		setLength(s);
		setWidth(s);
	}

	double getSide()
	{
		return getLength();
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
		return (getColor()+"\t"+isFilled()+"\t"+getLength()+"\t"+getWidth()+"\t"+getArea()+"\t"+getPerimeter());
	}
}
