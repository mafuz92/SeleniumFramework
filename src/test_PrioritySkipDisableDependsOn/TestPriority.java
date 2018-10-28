package test_PrioritySkipDisableDependsOn;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestPriority {

	@Test (priority=4)
	public void test2(){
		System.out.println ("Test 2");
	}
	
	@Test (priority=1)
	public void test_qa(){
		System.out.println ("Test qa");
	}
	
	@Test (priority=2)
	public void test1(){
		System.out.println ("Test 1");
	}
	
	// do not execute this test
	@Test (enabled=false, priority=2)
	public void test4(){
		System.out.println ("Test 4");
	}
	
	@Test
	public void skipTest(){
		System.out.println ("Skip the test because feature is old");
		throw new SkipException ("Skipping it becuase this test case no longer needed: JIRA-1233");
	}
}
