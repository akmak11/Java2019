package com.ncu.assignment.processor;
public class Project
{
	public String name;
	public Datee startDate;
	public Datee endDate;
	public String role;
	public String [] responsibilities;

	public void setProject(String name,String role)
	{
		this.name=name;
		this.role=role;
	}

	public void setStartDate (int d,int m, int y)
	{
		startDate.setValueDate(d,m,y);	
	}

	public void setEndDate (int d,int m, int y)
	{
		endDate.setValueDate(d,m,y);	
	}
}