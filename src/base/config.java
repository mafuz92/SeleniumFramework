package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utils.SWDFunctions;


public class config extends SWDFunctions {

	@BeforeSuite
	public void beforeSuite(){
		// db conntion
		// suite start time
	}

	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

	@AfterTest
	public void closeDriver(){
		driver.quit();
	}
	
	@AfterSuite
	public void afterSuite(){
		// db conntion
		// suite end time
	}
}
