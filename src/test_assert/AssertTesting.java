package test_assert;

import locators.fb_login_loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import values.fb_login_values;
import base.config;

public class AssertTesting extends config {

	fb_login_values fv = new fb_login_values();
	fb_login_loc fl = new fb_login_loc();

	@Test
	public void testFbSignUpTest(){

		WebElement convertIntoText = driver.findElement(By.xpath(fl.signUpTextLoc));
		String actText = convertIntoText.getText();
		System.out.println ("Actual is : " +actText);
		
		Assert.assertEquals(actText, fv.signUpValue);
	}

}
