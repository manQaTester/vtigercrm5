package org.eva.vtigercrm5.salestestscripts;

import org.eva.vtigercrm5.core.BaseTest;
import org.eva.vtigercrm5.pages.marketing.leads.MarketingLaedsNewCreateLead;
import org.eva.vtigercrm5.pages.marketing.leads.MarketingLeadsInformationPage;
import org.eva.vtigercrm5.pages.marketing.leads.MarketingLeadsLandingPage;
import org.testng.annotations.Test;

public class SalesLeadsTestScripts extends BaseTest {
	 
	@Test(groups= {"Smoke"})
	public void verifyVT006SearchLeads() {
		webUtil.printMessage("====  verifyVT008SearchLeads starts from here====");
		getCommnCode().goToMarketingLeadsLink();
		getCommnCode().creatNewPluseButton();
		MarketingLaedsNewCreateLead creatLead=new MarketingLaedsNewCreateLead(webUtil);
		String expFirstName =creatLead.newCreatMarketingLeads();
		getCommnCode().saveButton();
		getCommnCode().goToMarketingLeadsLink();
		MarketingLeadsLandingPage malp=new MarketingLeadsLandingPage(webUtil);
		String searchedName=malp.innerTextOfSearchedElement(expFirstName, "firstname");
		webUtil.verifyText(searchedName, expFirstName, "Hi Man Singh Your Expectation isn't Matched With actual Value");
		webUtil.printMessage("====  verifyVT008SearchLeads starts from here====");
	}

	public void verifyVT007CreateLeads() {
		webUtil.printMessage("====  verifyVT009CreateLeads ends from here====");
		getCommnCode().goToMarketingLeadsLink();
		getCommnCode().creatNewPluseButton();
		MarketingLaedsNewCreateLead creatLead=new MarketingLaedsNewCreateLead(webUtil);
		String expFirstName =creatLead.newCreatMarketingLeads();
		getCommnCode().saveButton();
		getCommnCode().goToMarketingLeadsLink();
		MarketingLeadsLandingPage mlLandingPage=new MarketingLeadsLandingPage(webUtil);
		String searchData=mlLandingPage.innerTextOfSearchedElement(expFirstName, "firstname");
		if (searchData.contains(expFirstName)) {
			webUtil.printMessage("your search data "+searchData+" is matched that you are searching");
			webUtil.printMessage("Passed !, "+searchData+" name is created successfully");
		} else {
			webUtil.printMessage("your search data data "+searchData+" is not  matched that you are searching");
			webUtil.printMessage("Failed !, "+searchData+" name is not created successfully");
		}
		webUtil.printMessage("====  verifyVT009CreateLeads ends from here====");
	}
@Test(priority=2)
	public void verifyVT008DeleteLead() {
		webUtil.printMessage("====  verifyVT0010DeleteLead starts from here====");
		getCommnCode().goToMarketingLeadsLink();
		getCommnCode().creatNewPluseButton();
		MarketingLaedsNewCreateLead creatLead=new MarketingLaedsNewCreateLead(webUtil);
		creatLead.newCreatMarketingLeads();
		getCommnCode().saveButton();
		webUtil.thread(3000);
		MarketingLeadsInformationPage mlInfoPage=new MarketingLeadsInformationPage(webUtil);
		String leadResult=mlInfoPage.deleteAndInnerTextOfSearchedLeadNumber();
		String expResult="No Lead Found !";
 if (expResult.equalsIgnoreCase(leadResult)) {
		System.out.println("Passed!,your created lead has been deleted successfully");
} else {
	System.out.println("failed!,your created lead hasn't been deleted successfully");
}
		webUtil.printMessage("====  verifyVT0010DeleteLead ends from here====");
	}
@Test(priority =-2)
	public void verifyVT09LeadsTableLinks() {
		webUtil.printMessage("===== verifyVT011LeadsTableLinks starts from here ======");
		getCommnCode().goToMarketingLeadsLink();
		getCommnCode().creatNewPluseButton();
		MarketingLaedsNewCreateLead creatLead=new MarketingLaedsNewCreateLead(webUtil);
		String expLeadsName=creatLead.newCreatMarketingLeads();
		getCommnCode().saveButton();
		webUtil.thread(3000);
		getCommnCode().goToMarketingLeadsLink();
		MarketingLeadsLandingPage mlLandingPage=new MarketingLeadsLandingPage(webUtil);
		String firstNameBeforeClickText=mlLandingPage.innerTextOfSearchedElement(expLeadsName, "firstname");
		MarketingLeadsInformationPage mlip=new MarketingLeadsInformationPage(webUtil);
		String firstNameAfterClickText=mlip.firstName();
		 
		if (firstNameBeforeClickText.equalsIgnoreCase(firstNameAfterClickText)) {
			webUtil.printMessage("Passed !,first name is same After clicking the first name link in marketing leads");
		} else {
			webUtil.printMessage("Passed !,first name is not same After clicking the first name link in marketing leads");
		}
		webUtil.printMessage("====  verifyVT011LeadsTableLinks ends from here====");
	
}
}
