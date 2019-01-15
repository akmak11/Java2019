import java.util.*;
public class Box
{
	Box() //non parameterized construtor
	{
		width=1;
		height=1;
		depth=1;
	}

	Box(double w,double h,double d) //parameterized constructor with 3 arguments
	{
		width=w;
		height=h;
		depth=d;
	}
	Box(double w,double d)	//parameterized constructor with 2 arguments
	{
		width=w;
		height=1;
		depth=d;
	}

	Scanner scan = new Scanner(System.in);
	double width;
	double height;
	double depth;
	void setDim()
	{
		System.out.println("Enter the dimensions: Width, Height and Depth");
		width=scan.nextInt();
		height=scan.nextInt();
		depth=scan.nextInt();
	}
	double volume()
	{
		return (width*height*depth);
	}
}