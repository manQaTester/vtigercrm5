package org.eva.vtigercrm5.core;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	                       //  first Method ////
	
	@DataProvider()
	public Object[][] detailsProvider() {

		String[] str1Array = new String[3];
		str1Array[0] = "Man Singh";
		str1Array[1] = "9593574475";
		str1Array[2] = "Pashchim Sharira Kaushambi";

		String[] str2Array = { "Anil Kumar", "924574475", "Pashchim Sharira Kaushambi" };

		String[] str3Array = new String[3];
		str3Array[0] = "Shiv Babu";
		str3Array[1] = "9593734475";
		str3Array[2] = "Meza";

		String[][] strDoubleArray = { str1Array, str2Array, str3Array };

//	String[][] strDoubleArray=new String[3][3];
//	strDoubleArray[0]=str1Array;
//	strDoubleArray[1]=str2Array;
//	strDoubleArray[2]=str3Array;

		return strDoubleArray;

	}

	                        //  Second Method ////

	@Test(priority = 1, dataProvider = "detailsProvider")
	public void manDetails(String name, String mobile, String address) {
		System.out.println("My Name is " + name + " and My Mobile Number is " + mobile + " i live in " + address);
	}

	@DataProvider
	public Object[][] personalData() {
		String[] strArr1 = { "man", "satyendra", "akash", "arif" };
		String[] strArr2 = { "Anil", "virendra", "kundesh", "ravindra" };
		String[][] doubleArr = { strArr1, strArr2 };
		return doubleArr;
	}
	
	@Test(priority = 2, dataProvider = "personalData")
	public void checkData(String friend1, String friend2, String friend3, String friend4) {
		System.out.println(friend1 + " , " + friend2 + " , " + friend3 + " , " + friend4);
	}
	
	                              //  Third Method ////

	@DataProvider
	public Object[][] dataProviderExample() {
		return new Object[][] { { "hello", "Akash" }, { "hii", "Man" } };
	}
	
	@Test(priority = 2,dataProvider="dataProviderExample")
	public void dataExample(String wish,String name) {
		System.out.println(wish+" > "+name);
		
	}
}
