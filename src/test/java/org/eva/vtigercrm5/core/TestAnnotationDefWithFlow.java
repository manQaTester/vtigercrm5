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

public class TestAnnotationDefWithFlow {
	
	// Suite -  it is a collection of testCases i.e test Suite
	 
	
/**   _______  EXECUTION FLOW OF TESTCASES WITH THIER ANNOTATIONS  _____
 * @author Man Singh
 * 1.@BeforeSuite:-it will only run at once before all the test cases in the suite.
 * 2.@BeforeTest:- it will run before first @Test(Annotated) test cases.it can be executed
 *                multiple times before the test cases.
 * 3.@BeforeClass:-it will be executed before first @Test annotated method execution.
 * 4.@BeforeMethod:-it will be executed before every @Test annotated method execution.  
 * 5.@Test:- it will executed after @Before annotation.
 * 6.AfterMethod:-this will be executed after every @Test annotated method.
 * 7.AfterClass:-this will be executed after all the @Test methods in the current class.
 * 8.AfterTest:-it will executed after all @Test annotated methods completely executed
 *              of those classes 
 * 9.AfterSuite:-it will only run at once after all the test cases in the suite.          
 * 
 */	
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("After Suite");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
@Test(priority=1)
	public void test1() {
		System.out.println("test1");
	}
}
