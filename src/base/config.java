package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import utils.SWDFunctions;


public class config extends SWDFunctions {

	//public String browserName = "ch"; // manual

	@BeforeSuite
	public void beforeSuite(){
		// db conntion
	}

	@Parameters ("browser")
	@BeforeMethod
	public void setUp(String browser){
		if (browser.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");	
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");	
			driver = new ChromeDriver();
		} else
			System.out.print("THERE ARE NO BROWSER TO TEST");

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
