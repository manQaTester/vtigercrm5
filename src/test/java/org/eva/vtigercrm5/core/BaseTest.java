package org.eva.vtigercrm5.core;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.eva.vtigercrm5.pages.common.CommonCodes;
import org.eva.vtigercrm5.utils.DataUtilByRahulSir;
import org.eva.vtigercrm5.utils.WebUtil;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import lombok.Getter;

@Getter
public class BaseTest {

	protected WebUtil webUtil=WebUtil.getInstance();;
	protected CommonCodes commnCode;
	private ExtentReports extent;

	@BeforeGroups(groups = "Smoke")
	public void beforeGroups() {
//		webUtil = WebUtil.getInstance();
//		webUtil.launchBrowser("chrome"); // driver is initialized from here,
//		webUtil.goToHitUrl("http://localhost:8888");
//		commnCode = new CommonCodes(webUtil);
//		commnCode.login();
	}

	@BeforeSuite(groups = "Smoke")
	public void beforeSuite() {
		System.out.println("Extent-Report Initialization");
		String timeStamp=webUtil.currentDateWithTime();
		  extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("ExtentReports\\VtigerExtentReport"+timeStamp+".html");
		extent.attachReporter(spark);
	}

	@BeforeTest(groups = "Smoke")
	public void beforeTest() {
		System.out.println("Connect To The Data Base");
	}

	@Parameters({"browserName"})
	@BeforeClass(groups = "Smoke")
	public void beforeTestCases(String browserName) {
//		webUtil = WebUtil.getInstance();
		webUtil.launchBrowser(browserName); // driver is initialized from here,
		webUtil.openUrl("http://localhost:8888");
	}

	@Parameters({"userName","password"})
	@BeforeMethod(groups = "Smoke")
	public void beforeMethod(String userName,String password,Method mt) {
		ExtentTest extTest=extent.createTest(mt.getName());// fetch method name(testcase Name)
		webUtil.setExtTest(extTest);
		commnCode = new CommonCodes(webUtil);
		commnCode.login(userName,password);
	}
	
	@AfterMethod(groups = "Smoke")
	public void afterMethod(ITestResult itest,Method mt) {
		// check status of the method if fail then enter this condition
		if(itest.getStatus()==ITestResult.FAILURE) {
			String snapPath=webUtil.takeSnapshotOfPage(mt.getName());
			webUtil.getExtTest().addScreenCaptureFromPath(snapPath);
			//add SnapShot in extent report to the given file path
		}
		commnCode.logOut();
		extent.flush();
	}

	@AfterClass(groups = "Smoke")
	public void afterClass() {
		if (null != webUtil) {
			webUtil.myClose();
			webUtil.quit();
		}
	}

	@AfterTest(groups = "Smoke")
	public void afterTest() {
		System.out.println("Disconnect From The Data Base");
	}

	@AfterSuite(groups = "Smoke")
	public void afterSuite() {
		System.out.println("Extent-Report Finalization");
		extent.flush();// Writes test information from the started reporters to their output view 

	}
	
	
	@DataProvider
	public Object[][] getData(Method method) {
		DataUtilByRahulSir data=new DataUtilByRahulSir();
		List<Map<String, String>> testcaseDataMapList=data.getAllTestCaseData(method.getName());
		int matchingTcIDCount=testcaseDataMapList.size();
		
	  Object[][] dim2Arr=  new Object[matchingTcIDCount][1];
	  for(int i=0;i<=matchingTcIDCount-1;i++) {
		  dim2Arr[i][0]=testcaseDataMapList.get(i);
	  }
	   return dim2Arr;
	}

}
