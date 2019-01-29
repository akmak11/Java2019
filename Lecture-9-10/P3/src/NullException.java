class NullException
{
	public static void main(String[] args)
	{
		Test t = null;
		try 
		{
			t.display();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}

class Test
{
	void display()
	{
		System.out.println("Method Called");
	}
}