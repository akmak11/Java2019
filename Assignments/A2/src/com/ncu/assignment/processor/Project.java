package com.ncu.assignment.processor;
public class Project
{
	String name;
	Date startDate;
	Date endDate;
	String role;
	String [] responsibilities;

	void setProject(String name,String role)
	{
		this.name=name;
		this.role=role;
	}

	void setStartDate (int d,int m, int y)
	{
		startDate.setValueDate(d,m,y);	
	}

	void setEndDate (int d,int m, int y)
	{
		endDate.setValueDate(d,m,y);	
	}
}