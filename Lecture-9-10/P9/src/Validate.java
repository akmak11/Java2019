class Validate
{
	boolean validateHour(int h) throws IllegalArgumentException
	{
		if (h<0 || h>23)
			throw new IllegalArgumentException("INVALID HOUR INPUT");
		else
			return true;
	}

	boolean validateMinute(int m) throws IllegalArgumentException
	{
		if (m<0 || m>59)
			throw new IllegalArgumentException("INVALID MINUTE INPUT");
		else
			return true;
	}

	boolean validateSecond(int s) throws IllegalArgumentException
	{
		if (s<0 || s>59)
			throw new IllegalArgumentException("INVALID SECOND INPUT");
		else
			return true;
	}
}