package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import utils.SWDFunctions;


public class config extends SWDFunctions {

	// cross-browser 
	// driver quite and close

	@BeforeTest
	public void beforeTestStart(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");	
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		// 
	}

}
