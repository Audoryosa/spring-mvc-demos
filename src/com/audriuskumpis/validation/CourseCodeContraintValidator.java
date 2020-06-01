package com.audriuskumpis.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeContraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		coursePrefix = constraintAnnotation.value();
	}

	@Override // theCode = what user inputs
	public boolean isValid(String theCode, ConstraintValidatorContext validatorContext) {
		boolean result;
		
		if(theCode != null) {
			result = theCode.startsWith(coursePrefix);
		} else {
			return true;
		}
		
		return result;
	}

}
