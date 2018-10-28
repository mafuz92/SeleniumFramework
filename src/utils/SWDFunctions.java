package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
;
public class SWDFunctions {

	// init the webdriver
	public WebDriver driver;

	// to type
	public void typeByXpath (String locator, String value){
		driver.findElement (By.xpath(locator)).sendKeys (value);
	}
	public void typeByCss(String locator, String value){
		driver.findElement (By.cssSelector(locator)).sendKeys (value);
	}
	public void typeById(String locator, String value){
		driver.findElement (By.id(locator)).sendKeys (value);
	}


	// to click
	public void clickByXpath (String locator){
		driver.findElement(By.xpath (locator)).click();
	}

	// radio button
	public void pickRadioButtonByIndexUsingXpath(int x){
		// get list of the radio button
		// click by index number
	}

	// dropdown

	// alert - popup

	// drag n drop

	// slider

	// iFrame

	// connect db


}
