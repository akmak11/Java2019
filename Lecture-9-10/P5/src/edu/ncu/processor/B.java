package edu.ncu.processor;
import edu.ncu.exception.*;
public class B extends A
{
	public void meth() throws LevelTwoException
	{
		throw new LevelTwoException("LevelTwoException");
	}
}