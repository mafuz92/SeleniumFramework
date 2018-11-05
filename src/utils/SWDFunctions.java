package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SWDFunctions {

	// init the webdriver
	public WebDriver driver;

	// getText
	public void getTextByXpath (String loc){
		WebElement convertIntoText = driver.findElement(By.xpath(loc));
		String actText = convertIntoText.getText();
		System.out.println ("Actual is : " +actText);
	}
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
	public void dropDownByIdUsingValue (String loc, String value){
		WebElement mySelectElement = driver.findElement(By.id(loc));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText(value);

	}
	public void dropDownByIdUsingIndex (String loc, int x){
		WebElement mySelectElement = driver.findElement(By.id(loc));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByIndex(x);

	}
	// alert - popup

	// drag n drop

	// slider

	// iFrame

	// connect db


}
