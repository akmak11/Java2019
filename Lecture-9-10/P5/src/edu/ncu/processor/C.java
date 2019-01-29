package edu.ncu.processor;
import edu.ncu.exception.*;
public class C extends B
{
	public void meth() throws LevelThreeException
	{
		throw new LevelThreeException("LevelThreeException");
	}
}