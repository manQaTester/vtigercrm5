package org.eva.vtigercrm5.core;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseExecutionFlow {
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Extent-Report Object Initializtion");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Connect To The Data Base");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launch The Browser");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Logged-in The Application");
	}
	
	@Test()
	public void testCase() {
		System.out.println("TestCase");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Logged-Out From The Application");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Closed All Related Window");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Disconnect To The Data Base");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("Extent-Report Object Finalization");
	}
 
}
