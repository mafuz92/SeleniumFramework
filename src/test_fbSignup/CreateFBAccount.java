package test_fbSignup;

import org.testng.annotations.Test;

import base.config;

public class CreateFBAccount extends config {

	
	@Test
	public void verifyDropdownFuntionlity(){
		dropDownByIdUsingValue("", "");
	}
}
