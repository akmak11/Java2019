package com.ncu.validators;
import com.ncu.exceptions.*;
import java.io.*;
import java.util.regex.*;
import java.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
class NameValidator
{
	boolean nameValidator (String filename, String filetype)
	{
		System.out.println("File name is: "+filename+ " and its type is: "+filetype);
		boolean b;

		Properties prop = new Properties();
		FileInputStream input = null;

		Logger logger = Logger.getLogger(NameValidator.class);
		PropertyConfigurator.configure("C:\\Users\\Akshay\\Desktop\\Java2019\\csvtojson\\configs\\logger\\logger.properties");
		
		try 	{input = new FileInputStream("C:\\Users\\Akshay\\Desktop\\Java2019\\csvtojson\\configs\\constants\\exceptions.properties");prop.load(input);emptyFileName(filename);}
		catch 	(EmptyFileNameException e)	{logger.error("\n\n"+e+(prop.getProperty("emptyNameMessage")));}
		catch   (Exception e) {System.out.println(e);}

		//try {missingDot(filename);}
		//catch 	(MissingDotException e)			{System.out.println(e);}

		b=fileFormat(filename);
		if (b==true)
			return false;

		b=fileLength(filename);
		if (b==true)
			return false;

		b=specialCharacter(filename);
		if (b==true)
			return false;

		if (filetype == "csv")
		{
			b=csvOnly(filename);
			if (b==true)
				return false;
		}
		else
		{
			b=jsonOnly(filename);
			if (b==true)
				return true;
			else
				return false;
		}

		if (filetype == "csv")
		{
			b=fileNotAvailable(filename);
			if(b==true)
				return false;
		}
		else
		{
			b=fileExist(filename);
			if (b==true)
				return false;
		}

		return true;			// valid filename
	}

	private void emptyFileName(String filename) throws EmptyFileNameException
	{
		if (filename=="")
			throw new EmptyFileNameException ("EmptyFileName");
	}

	/*private void missingDot(String filename) throws MissingDotException
	{
		Pattern costPattern = Pattern.compile("[.]");
		Matcher costMatcher = costPattern.matcher(filename);
		boolean value = costMatcher.find();
		if (value==true)
			throw new MissingDotException ("Missing dot in filename");
	}*/


	boolean fileFormat(String filename)
	{
		String [] extn = filename.split(".");
		if (extn.length<=1)
			return true;
		else
			return false;
	}

	boolean fileLength(String filename)
	{
		String nameLength = filename.split(".") [0];
		if (nameLength.length()>25)
			return true;
		else
			return false;
	}

	boolean specialCharacter(String filename)
	{
		filename = filename.split(".")[0];
		Pattern patterGet = Pattern.compile("[@#$%^&(,)_]");
		Matcher check = patterGet.matcher(filename);
		boolean finalValue = check.find();
		if (finalValue==true)
			return true;
		else 
			return false;
	}

	boolean csvOnly (String filename)
	{
		String [] name = filename.split(".");
		if (name[1].equals("csv")==true)
			return false;
		else
			return true;
	}

	boolean jsonOnly(String filename)
	{
		String [] name  = filename.split(".");
		if (name[1].equals("json")==true)
			return false;
		else
			return true;
	}

	boolean fileNotAvailable(String filename)
	{
		File f = new File(filename);
		if(f.exists()==true)
			return false;
		else
			return true;
	}

	boolean fileExist (String filename)
	{
		File f = new File("./"+filename);
		if(f.exists()==true)
			return true;
		else
			return false;
	}
}

class testnameValidator
{
	public static void main(String[] args)
	{
		NameValidator csvObject = new NameValidator();
		boolean checkValidator = csvObject.nameValidator("","csv");
		System.out.println(checkValidator);
	}
}