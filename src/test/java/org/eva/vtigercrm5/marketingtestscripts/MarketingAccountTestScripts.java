package org.eva.vtigercrm5.marketingtestscripts;

import org.eva.vtigercrm5.core.BaseTest;
import org.eva.vtigercrm5.pages.marketing.accounts.MarketingAccountLandingPage;
import org.eva.vtigercrm5.pages.marketing.accounts.MarketingAccountsNewCreateAccount;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MarketingAccountTestScripts extends BaseTest {
	
	@DataProvider
	public Object[][] fillUpBasicInfoProvider() {
		String[] strArray1= {"9835737634","pluse","a telephonic","man@gmail.com","kaushambi","utter pradesh","212214","India","work while you work "};
		String[] strArray2= {"6335737634","circle","marketing","shiv@gmail.com","meza","utter pradesh","212206","India","work while you work "};
		String[] strArray3= {"8135737634","tringle"," sales","virendra@gmail.com","bhadohi","utter pradesh","212244","India","work while you work "};
		String[][] doubleStrArray= {strArray1,strArray2,strArray3};
		return doubleStrArray;

	}
	
	 
	@Test(groups = {"Smoke"},dataProvider="fillUpBasicInfoProvider")
	public void verifyVT001CreateAccount(String phone,String tickSymbole,String faxName,String email,String city,String state,String pinCode,String country,String description) throws InterruptedException {
		
		webUtil.printMessage("====  verifyVT001CreateAccount starts from here====");
		commnCode.goToMarketingAccountsLink();
		commnCode.creatNewPluseButton();
		MarketingAccountsNewCreateAccount malp= new MarketingAccountsNewCreateAccount(webUtil);
		String expAccountName =malp.fillUpBasicInformation(  phone,  tickSymbole,  faxName,  email,  city,  state,  pinCode,  country,  description);		
		commnCode.saveButton();
		commnCode.goToMarketing();
		commnCode.goToMarketingAccountsLink();
		MarketingAccountLandingPage macLandingPage=new MarketingAccountLandingPage(webUtil);
		String actAccountName=macLandingPage.innerTextOfSearchedElement(expAccountName, "accountname");
		webUtil.verifyText(actAccountName, expAccountName, "Hi Man Singh Your Assertion condition is failed");
		webUtil.printMessage("====  verifyVT001CreateAccount ends from here====");
	}
@Test(priority=1,dependsOnMethods = {"verifyVT001CreateAccount","verifyVT003SearchAccount"},alwaysRun=true)
	public void verifyVT002DeleteAccount() throws InterruptedException {
		webUtil.printMessage("====  verifyVT002DeleteAccount starts from here====");
		commnCode.goToMarketingAccountsLink();
		commnCode.creatNewPluseButton();
		MarketingAccountsNewCreateAccount malp=new MarketingAccountsNewCreateAccount(webUtil);
		String actAccountName =malp.fillUpBasicInformation();		
		commnCode.saveButton();
		MarketingAccountLandingPage acLandingPage=new MarketingAccountLandingPage(webUtil);
		String expResult="No Account Found !";
		String actResult=acLandingPage.deleteAndSearchAccountStatus(actAccountName, "accountname");
		webUtil.verifyText(actResult, expResult, "Hi Man Singh Your Assertion condition is failed");
		webUtil.printMessage("====  verifyVT002DeleteAccount ends from here====");
	}

@Test(priority=1,enabled = true,groups= {"Regression"})
	public void verifyVT003SearchAccount() throws InterruptedException {
		webUtil.printMessage("====  verifyVT003SearchAccount Starts from here====");
		commnCode.goToMarketingAccountsLink();
		commnCode.creatNewPluseButton();
		MarketingAccountsNewCreateAccount malp= new MarketingAccountsNewCreateAccount(webUtil);
		String expAccountName =malp.fillUpBasicInformation();		
		commnCode.saveButton();
		commnCode.goToMarketing();
		commnCode.goToMarketingAccountsLink();
		MarketingAccountLandingPage malandingPage=new MarketingAccountLandingPage(webUtil);
		String actAccountName=malandingPage.innerTextOfSearchedElement(expAccountName, "accountname");
		webUtil.verifyText(actAccountName, expAccountName, "Hi Man Singh Your Assertion condition is failed");
		webUtil.printMessage("====  verifyVT003SearchAccount ends from here====");
	}

@Test(priority = 1,groups= {"Smoke","Regression"})
	public void verifyVT004DuplicateAccount() {
		webUtil.printMessage("======= verifyVT004DuplicateAccount Starts from here ======");
		commnCode.goToMarketingAccountsLink();
		commnCode.creatNewPluseButton();
		MarketingAccountsNewCreateAccount malp=new MarketingAccountsNewCreateAccount(webUtil);
		malp.fillUpBasicInformation();		
		commnCode.saveButton();
		MarketingAccountLandingPage acLandingPage=new MarketingAccountLandingPage(webUtil);
		acLandingPage.DuplicateAndEditStatus();
		webUtil.printMessage("======= verifyVT004DuplicateAccount ends from here ======");
	}

@Test(groups="Regression")
	public void verifyVT005AccountEditable()  {
		
		webUtil.printMessage("===== verifyVT005AccountEditable starts from here ======");
		commnCode.goToMarketingAccountsLink();
		commnCode.creatNewPluseButton();
		MarketingAccountsNewCreateAccount malp= new MarketingAccountsNewCreateAccount(webUtil);
		String acNameBeforeEdit=malp.fillUpBasicInformation();		
		commnCode.saveButton();
		MarketingAccountLandingPage acLandingPage= new MarketingAccountLandingPage(webUtil);
		String acNameAfterEdit=acLandingPage.editAccountInformation();
		if (!acNameBeforeEdit.equalsIgnoreCase(acNameAfterEdit)) {  ///  !...not equalsIgnoreCase
			System.out.println("Passed !,your Account name is editable because your before edit A/C name ="+acNameBeforeEdit+" "
					+ "and after edit A/C name ="+acNameAfterEdit+" is different");

		} else {
			System.out.println("Failed !,your Account name is editable because your before edit A/C name ="+acNameBeforeEdit+" "
					+ "and after edit A/C name ="+acNameAfterEdit+" is same");
		}
		webUtil.printMessage("===== verifyVT005AccountEditable ends from here ======");
	}
}