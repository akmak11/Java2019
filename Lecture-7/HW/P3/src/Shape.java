class Shape
{
	private String color;
	private boolean filled;

	Shape()
	{
		color="Red";
		filled=true;
	}

	Shape(String c, boolean f)
	{
		color=c;
		filled=f;
	}

	String getColor()
	{
		return color;
	}

	void setColor(String c)
	{
		color=c;
	}

	boolean isFilled()
	{
		return filled;
	}

	void setFilled(boolean f)
	{
		filled=f;
	}

	public String toString()
	{
		return getColor()+"\t"+isFilled();
	}
}