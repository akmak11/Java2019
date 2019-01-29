class One
{
	void f() throws ExceptionInF
	{
		try
		{
			g();
		}
		catch (Exception e)
		{
			System.out.println("Exception caught in f()");
			throw new ExceptionInF("");
		}

	}

	void g() throws ExceptionInG
	{
		throw new ExceptionInG("Exception caught in g()");
	}
}