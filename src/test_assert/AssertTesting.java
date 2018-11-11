package test_assert;

import locators.fb_login_loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import values.fb_login_values;
import base.config;

public class AssertTesting extends config {

	fb_login_values fv = new fb_login_values();
	fb_login_loc fl = new fb_login_loc();

	// Expected - Coming from business (requirements)
	// Actual (while you execute) - what has been development (means what you see in application)

	@Test
	public void testAssertion(){

		WebElement convertIntoText = driver.findElement(By.xpath(fl.signUpTextLoc));
		String actText = convertIntoText.getText();
		System.out.println ("Actual is : " +actText);

		Assert.assertEquals(actText, fv.signUpValue);
	}

	@Test
	public void testSoftAssert(){

		System.out.println ("Skip the test because feature is old");

		SoftAssert sa= new SoftAssert();
		WebElement convertIntoText = driver.findElement(By.xpath(fl.signUpTextLoc));
		String actText = convertIntoText.getText();
		sa.assertEquals(actText, fv.signUpValue);
		System.out.println("Assertion Failed");

		throw new SkipException ("Skipping it becuase this test case no longer needed: JIRA-1233");
	}



}
