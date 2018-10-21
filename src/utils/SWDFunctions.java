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
	// to click
	public void clickByXpath (String locator){
		driver.findElement(By.xpath (locator)).click();
	}

}
