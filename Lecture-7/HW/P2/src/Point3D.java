class Point3D extends Point2D
{
	private float z;

	Point3D()
	{
		super();
		z=0.0f;
	}

	Point3D(float x,float y,float z)
	{
		super(x,y);
		this.z=z;
	}

	void setZ(float z)
	{
		this.z=z;
	}

	float getZ()
	{
		return z;
	}

	void setXYZ(float x,float y,float z)
	{

	}

	float getXYZ()
	{
		return 0f;
	}

	String toStringg()
	{
		return (("("+getX()+","+getY()+","+z+")"));
	}
}