package test_groupDependsOn;

import org.testng.annotations.Test;

public class DependsOn {

	
	
	@Test
	public void openBrowser(){
		System.out.println ("open browser first");
	}
	
	@Test (dependsOnMethods = {"openBrowser"})
	public void aLogInn(){
		System.out.println ("Login");
	}
	
	
	
	
}
