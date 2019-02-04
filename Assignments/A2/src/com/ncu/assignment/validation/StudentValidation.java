package com.ncu.assignment.validation;
import com.ncu.assignment.exception.*;
import com.ncu.assignment.processor.*;
import com.ncu.assignment.validation.StudentValidationMessage;

public class StudentValidation
{
	public static void validateDate(Datee d) throws DateFormatException
	{
		if ((d.day<0 || d.day>31) || (d.month<0 || d.month>12) || (d.year<0))
			throw new DateFormatException (StudentValidationMessage.dateException);
	}

	public static void validateMandatoryFields(String fName, Address ad, Datee dob, String email, String cNo) throws MandatoryMissingException
	{
		if (fName==null || ad==null || dob==null || email==null || cNo==null)
			throw new MandatoryMissingException (StudentValidationMessage.mandatoryException);
	}

	public static void validateSkills(int skill) throws MandatoryMissingException
	{
		if (skill<1)
			throw new MandatoryMissingException (StudentValidationMessage.mandatoryException);
	}

	public static void validateQual(int qual) throws MandatoryMissingException
	{
		if (qual<1)
			throw new MandatoryMissingException (StudentValidationMessage.mandatoryException);
	}
}