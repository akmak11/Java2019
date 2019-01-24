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
		setX(x);
		setY(y);
		this.z=z;
	}

	float[] getXYZ()
	{
		float xyz [] = new float [3];
		xyz[0] = getX();
		xyz[1] = getY();
		xyz[2] = getZ();
		return xyz;	
	}

	public String toString()
	{
		return "("+getX()+", "+getY()+", "+getZ()+")";
	}
}