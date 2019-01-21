public class Cylinder extends Circle
{
	private double height;
	
	Cylinder()
	{
		super();
		height = 1.0;
	}

	Cylinder(double r)
	{
		super(r);
		height = 1.0;
	}

	Cylinder (double r,double h)
	{
		super(r);
		height = h;
	}

	Cylinder (double r,double h,String c)
	{
		super(r,c);
		height=h;
	}

	void setHeight(double h)
	{
		height = h;
	}

	double getHeight()
	{
		return height;
	}

	double getVolume()
	{
		return ((getArea()*height));
	}
}