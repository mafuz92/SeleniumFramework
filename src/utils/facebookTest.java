package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class facebookTest {

	public static void main(String[] args) {

		// Dynamic Path
		//System.setProperty("webdriver.chrome.driver", "C://Users//talentTEK//Documents//GitHub//SeleniumFramework//Drivers//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	
		
		
		// OS
		WebDriver driver = new ChromeDriver();
		// Different browsers
		driver.get("http://www.facebook.com");
//		qa.facebook.com
//		stage.facebook.com

		
		String fname = "//input[@name='firstname1']";
		String lname = "//input[@name='lastname1']";
		
		// reusable function
		
		driver.findElement(By.xpath(fname)).sendKeys("Hassan");
		driver.findElement(By.xpath(lname)).sendKeys("Bhuiyan");
		// less duplicate or less code
		
	}

}
