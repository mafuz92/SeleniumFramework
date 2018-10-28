package utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationPrec {

	@Test
	public void myTest(){
		System.out.println ("TEST 1: My Actual Test start");
	}
	@Test
	public void myTest2(){
		System.out.println ("TEST 2: My Actual Test start");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println ("Before test START");
		// OPEN BROWSER
	}
	@AfterTest
	public void afterTest(){
		System.out.println ("After test END");
	}

	@BeforeMethod
	public void beforeEachMethod (){
		System.out.println ("Open new browser before each test");
	}

	@AfterMethod
	public void afterEachMethod (){
		System.out.println ("Close browser after each test");
	}

	@BeforeSuite
	public void beforeSuite(){
		System.out.println ("Suite start at: ");
		// time
		// db connection
	}

	@AfterSuite
	public void afterSuite(){
		System.out.println ("Suite ended at: ");
		// db disconnect
		//connectDB ("");
	}
	



}
