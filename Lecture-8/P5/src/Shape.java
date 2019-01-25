abstract class Shape
{
	protected String color;
	protected boolean filled;

	Shape()
	{
		color = "Red";
		filled = false;
	}

	Shape (String c,boolean f)
	{
		color = c;
		filled = f;
	}

	String getColor()
	{
		return this.color;
	}

	void setColor(String c)
	{
		this.color = c;
	}

	boolean isFilled()
	{
		return this.filled;
	}

	void setFilled(boolean f)
	{
		this.filled=f;
	}

	abstract double getArea();
	abstract double getPerimeter();
	abstract public String toString();
}