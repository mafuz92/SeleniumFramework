package test_groupDependsOn;

import org.testng.annotations.Test;

public class GroupDependsOn {


	@Test (groups = {"sanitySuite", "regressionSuite"})
	public void test(){
		System.out.println ("from class GroupDependsOn.java");
	}
	
	@Test
	public void test1(){
		System.out.println ("test1");
	}

	@Test
	public void test2(){
		System.out.println ("test2");
	}
	
	@Test (groups = {"sanitySuite"})
	public void test3(){
		System.out.println ("from class GroupDependsOn.java");
	}
	

	
}
