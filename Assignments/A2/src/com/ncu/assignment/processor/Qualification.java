package com.ncu.assignment.processor;
public class Qualification
{
	String qualName;
	String university;
	String institute;
	float cgpa;

	void setQual (String qname, String uni, String insti, float p)
	{
		qualName = qname;
		university = uni;
		institute = insti;
		cgpa = p;
	}
}