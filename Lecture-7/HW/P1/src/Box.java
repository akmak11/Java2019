class Box
{
	float width,height,depth;

	Box()
	{
		width =0;
		height=0;
		depth=0;
	}

	Box(float w,float h, float d)
	{
		width=w;
		height=h;
		depth=d;
	}

	void setWidth(float w)
	{
		width = w;
	}

	void setDepth(float d)
	{
		depth = d;
	}

	void setHeight(float h)
	{
		height = h;
	}

	float getWidth()
	{
		return width;
	}

	float getHeight()
	{
		return height;
	}

	float getDepth()
	{
		return depth;
	}

	void display()
	{
		System.out.println((width*depth*height));
	}
}