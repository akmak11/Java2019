class ResizableCircle extends Circle implements Resizable
{
	ResizableCircle (double r)
	{
		super(r);
	}

	public double resize (int p)
	{
		return ((radius*(100+p))/100);
	}
}