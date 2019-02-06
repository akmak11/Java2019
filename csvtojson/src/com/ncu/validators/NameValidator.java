package com.ncu.validators;
import com.ncu.exceptions.*;
import java.io.*;
import java.util.regex.*;
import java.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class NameValidator
{
	boolean nameValidator (String filename)
	{
		System.out.println("\n\nFile name is: "+filename);
		boolean b;

		Properties prop = new Properties();
		FileInputStream input = null;

		Logger logger = Logger.getLogger(NameValidator.class);
		PropertyConfigurator.configure("C:\\Users\\Akshay\\Desktop\\Java2019\\csvtojson\\configs\\logger\\logger.properties");
		
		try
		{
			input = new FileInputStream("C:\\Users\\Akshay\\Desktop\\Java2019\\csvtojson\\configs\\constants\\exceptions.properties");
			prop.load(input);
			emptyFileName(filename);
			missingDot(filename);
			fileFormat(filename);
			fileLength(filename);
			specialCharacter(filename);
			csvOnly(filename);
			fileNotAvailable(filename);
			fileExists(filename);
		}
		catch (EmptyFileNameException e)		{logger.error("\n"+e+(prop.getProperty("emptyNameMessage")));}
		catch (MissingExtensionException e)		{logger.error("\n"+e+(prop.getProperty("extensionMessage")));}
		//catch (FileAlreadyExists e)				{logger.error("\n\n"+e+(prop.getProperty("fileExistsMessage")));}
		catch (FileNameLengthException e)		{logger.error("\n"+e+(prop.getProperty("longFileNameMessage")));}
		catch (InvalidExtensionException e)		{logger.error("\n"+e+(prop.getProperty("invalidException")));}
		catch (FileNotAvailable e)				{logger.error("\n"+e+(prop.getProperty("notAvailableMessage")));}
		catch (SpecialCharacterException e)		{logger.error("\n"+e+(prop.getProperty("specialcharacterMessage")));}
		catch (Exception e)						{logger.error("\n"+e);}

		return true;			// valid filename
	}

	
	private void emptyFileName(String filename) throws EmptyFileNameException
	{
		if (filename=="")
			throw new EmptyFileNameException ("");
	}

	private void missingDot(String filename) throws MissingExtensionException
	{
		Pattern costPattern = Pattern.compile("\\.");
		Matcher costMatcher = costPattern.matcher(filename);
		boolean value = costMatcher.find();
		if (value==false)
			throw new MissingExtensionException ("");
	}

	private void fileFormat(String filename) throws InvalidExtensionException
	{
		String [] extn = filename.split(("\\."));
		if (extn.length<=1)
			throw new InvalidExtensionException ("");
	}

	private void fileLength(String filename) throws FileNameLengthException
	{
		String nameLength = filename.split("\\.") [0];
		if (nameLength.length()>25)
			throw new FileNameLengthException ("");
	}

	private void specialCharacter(String filename) throws SpecialCharacterException
	{
		filename = filename.split("\\.")[0];
		Pattern patternGet = Pattern.compile("[@#$%^&(,)_]");
		Matcher check = patternGet.matcher(filename);
		boolean finalValue = check.find();
		if (finalValue==true)
			throw new SpecialCharacterException ("");
	}

	private void csvOnly (String filename)  throws InvalidExtensionException
	{
		String [] name = filename.split("\\.");
		if (name[1].equals("csv")==false)
			throw new InvalidExtensionException ("");
	}

	/*private void jsonOnly(String filename)  throws InvalidExtensionException
	{
		String [] name  = filename.split("\\.");
		if (name[1].equals("json")==true)
			throw new InvalidExtensionException ("Invalid extension");
	}*/

	private void fileNotAvailable(String filename) throws FileNotAvailable
	{
		File f = new File(filename);
		if(f.exists()==false)
			throw new FileNotAvailable ("");
	}

	private void fileExists (String filename) throws FileAlreadyExists
	{
		File f = new File("./"+filename);
		if(f.exists()==true)
			throw new FileAlreadyExists ("");
	}
}

class testnameValidator
{
	public static void main(String[] args)
	{
		NameValidator csvObject = new NameValidator();
		boolean checkValidator = csvObject.nameValidator("");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("example");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("example.");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("abcdefghijklmnopqrstuvwxyz.csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("ex@mple.csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.nameValidator("example.csv");
		System.out.println(checkValidator);
	}
}