package test_readWriteFromExcelFile;

import locators.fb_login_loc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.Xls_Reader;
import base.config;

public class ReadWriteExcel extends config {

	//String excelPath = "C:\Users\talentTEK\Documents\GitHub\SeleniumFramework\tc.xlsx";
	String excelPath = System.getProperty("user.dir")+ "//tc.xlsx";
	
	Xls_Reader xl = new Xls_Reader(excelPath);
	fb_login_loc logIn = new fb_login_loc();

	@Test
	public void readFromExcel(){
		// xl file location 
		// which row and col

		// getCellData(String sheetName,String colName,int rowNum)
		// sheetName = "fb"
		// colName = "TestData"
		// rowNum =  4
		// enter email or phone number
		typeByXpath (logIn.emailPhone, xl.getCellData("fb", "TestData", 4));


	}

	@Test
	public void writeFromExcel(){
		// xl file location 
		// which row and col
		
		String RK = driver.findElement(By.xpath(logIn.signUpTextLoc)).getText();
		System.out.println (RK); //Sign Up
	
		

	}

}
