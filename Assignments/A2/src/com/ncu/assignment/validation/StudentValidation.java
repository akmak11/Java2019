import com.ncu.assignment.exception.*;
import com.ncu.assignment.validation.StudentValidationMessage;
package com.ncu.assignment.validation;
public class StudentValidation
{
	public static void validateDate(Date d) throws DateFormatException
	{
		if ((d.day<0 || d.day>31) || (d.month<0 || d.month>12) || (d.year<0))
			throw new DateFormatException (dateException);
	}

	public static void validateMandatoryFields(String fName, Address ad, Date dob, String email, String cNo) throws MandatoryMissingException
	{
		if (fname==null || ad==null || dob==null || email==null || cNo==null)
			throw new MandatoryMissingException (mandatoryException);
	}

	public static void validateSkills(int skill) throws MandatoryMissingException
	{
		if (skill<1)
			throw new MandatoryMissingException (mandatoryException);
	}

	public static void validateQual(int qual) throws MandatoryMissingException
	{
		if (qual<1)
			throw new MandatoryMissingException (mandatoryException);
	}
}