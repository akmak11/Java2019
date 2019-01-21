class Point2D
{
	private float x;
	private float y;

	Point2D()
	{
		x=0.0f;
		y=0.0f;
	}

	Point2D(float x,float y)
	{
		this.x=x;
		this.x=y;
	}

	void setX(float x)
	{
		this.x=x;
	}

	void setY(float y)
	{
		this.y=y;
	}

	float getX()
	{
		return x;
	}

	float getY()
	{
		return y;
	}

	void setXY(float x,float y)
	{

	}

	float getXY()
	{
		return 0f;
	}

	String toStringg()
	{
		return (("("+x+","+y+")"));
	}
}