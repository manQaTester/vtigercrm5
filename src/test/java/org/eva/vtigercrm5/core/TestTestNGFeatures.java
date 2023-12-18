package org.eva.vtigercrm5.core;

import org.testng.annotations.Test;

public class TestTestNGFeatures {
	
	@Test(priority=2,enabled=false)
	public void methodOne() {
		System.out.println("methodOne");
	}
	
	@Test(priority=-2)
	public void methodTwo() {
		System.out.println("methodTwo");
	}
	
	
	// By Default >>>  alwaysRun = false
	//whenever the method depends on it if those method throw exception then this method is skkiped....
	@Test(dependsOnMethods = {"methodSix"},alwaysRun = true)  //  By Default >>> @Test(priority=0)
//	If set to true, this test method will always be run even 
//	if it depends on a method that failed.This attribute will be ignored
//	 if this test doesn't depend on any method or group.
	public void methodThree() {
		System.out.println("methodThree");
	}
	
	
	@Test(priority=0)
	public void methodFour() {
		System.out.println("methodFour");
	}
	
	
	@Test(priority=1,enabled=true)
	public void methodFive() {
		System.out.println("methodFive");
	}

	@Test
	public void methodSix() {
		int x=2/0;
		System.out.println("methodSix");
	}
}
