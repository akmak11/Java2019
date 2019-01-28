class ExceptionHandling
{
	public static void main(String[] args)
	{
		try
		{	
			throw new Exception ("Exception Thrown");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Execution reached here.");
		}
	}
}