class Point
{
	private float x;
	private float y;
	private float dist;

	Point()
	{
		this.x=0;
		this.y=0;
	}

	Point (float x,float y)
	{
		this.x=x;
		this.y=y;
	}

	void setValueX(float x)
	{
		this.x=x;
	}
	void setValueY(float y)
	{
		this.y=y;
	}
	float getValueX()
	{
		return x;
	}

	float getValueY()
	{
		return y;
	}

	static Point calcDistance(Point p1,Point p2)
	{
		Point temp = new Point();
		temp.dist = (float) Math.sqrt(Math.pow((p1.getValueX()-p2.getValueX()),2)+Math.pow((p1.getValueY()+p2.getValueY()),2));
		return temp;
	}

	void display()
	{
		System.out.println("Distance b/w two points is: "+this.dist);
	}
}