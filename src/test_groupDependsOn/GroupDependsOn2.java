package test_groupDependsOn;

import org.testng.annotations.Test;

public class GroupDependsOn2 {


	@Test (groups = {"sanitySuite", "regressionSuite", "smokeSuite"})
	public void test(){
		System.out.println ("from class GroupDependsOn2.java");
	}
	
	
	
	
}
