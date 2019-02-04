package com.ncu.assignment.processor;
public class Qualification
{
	public String qualName;
	public String university;
	public String institute;
	public float cgpa;

	public void setQual (String qname, String uni, String insti, float p)
	{
		qualName = qname;
		university = uni;
		institute = insti;
		cgpa = p;
	}
}