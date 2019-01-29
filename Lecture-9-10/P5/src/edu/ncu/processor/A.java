package edu.ncu.processor;
import edu.ncu.exception.*;
public class A
{
	public void meth() throws LevelOneException
	{
		throw new LevelOneException("LevelOneException");
	}
}