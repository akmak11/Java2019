class Driver 
{
	public static void main(String[] args)
	{
		One o = new One();
		try
		{
			o.f();
		}
		catch (ExceptionInF e)
		{
			System.out.println("Exception thrown by f() caught in Main");
		}
	}
}