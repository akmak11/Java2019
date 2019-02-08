package com.ncu.main;
import com.ncu.exceptions.*;
import com.ncu.validators.*;
import com.ncu.processors.*;
import java.util.*;
class JSONConverter
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String c,csvfilename;
		boolean b;
		NameValidator csvObject = new NameValidator();
		System.out.println("Enter the name of CSV file:");
		csvfilename = scan.nextLine();
		System.out.println("Entered file path is: "+csvfilename);
		b=csvObject.nameValidator(csvfilename);
		csvfilename = csvfilename.split(("\\."))[0];
		if (b==true)
		{
			System.out.println("CSV file is OK");
			CSVprocessor processorObj = new CSVprocessor();
			boolean b1 = processorObj.processCSV((csvfilename+".csv"),(csvfilename+".json"));
			if (b==true)
			{
				System.out.println("Converted");
			}
		}
	}
}