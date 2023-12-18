package org.eva.vtigercrm5.core;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertion {
	
	@Test
	public void softAssert1() {
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(5, 5 );
//		System.out.println("hello");
		sa.assertAll();
		System.out.println("end of the soft assert");// it is not printed 
	}
	
	@Test 
	public void softAssert2() {
// it is handled using it because assert thorws an Error not
//	Exception and Throwable is the Super class of all Error And Exception.
		
		
		try {
			Assert.assertEquals(5, 7);
		}catch(Throwable th) {
			th.getMessage();
		}
		System.out.println("hi");
	}
	
	
	@Test
public void hardAssert() {
	Assert.assertEquals(32,8,"Hi Man Singh");
	System.out.println("hello bro!");
}

}
