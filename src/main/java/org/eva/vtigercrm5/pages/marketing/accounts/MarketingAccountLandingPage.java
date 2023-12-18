package org.eva.vtigercrm5.pages.marketing.accounts;

import org.eva.vtigercrm5.pages.common.CommonCodes;
import org.eva.vtigercrm5.pages.marketing.accountsOr.MarketingAccountLandingPageOr;
import org.eva.vtigercrm5.utils.WebUtil;

public class MarketingAccountLandingPage extends MarketingAccountLandingPageOr{
 
	private WebUtil webtl;
	public MarketingAccountLandingPage(WebUtil webtl) {
		super(webtl);
		this.webtl=webtl;
		
	}
	public String clickOfSearchedElement(String searchName,String SearchTypeAttributValue) {
		CommonCodes cc= new CommonCodes(webtl);
		cc.searchForElement(searchName,SearchTypeAttributValue );
		webtl.click(getAccountNameTB());
		String actAccountName=webtl.myInnerText(getAccountNameTB());
		return actAccountName;

	}
	public String innerTextOfSearchedElement(String searchName,String SearchTypeAttributValue) {
		CommonCodes cc=new CommonCodes(webtl);
		cc.searchForElement(searchName,SearchTypeAttributValue );
		String actAccountName=webtl.myInnerText(getAccountNameTB());
		return actAccountName;
	}
	public String deleteAndSearchAccountStatus(String searchName,String SearchTypeAttributValue) {
		webtl.click(getAccountDelete());
		webtl.popUpAccept();
		CommonCodes cc= new CommonCodes(webtl);
		cc.searchForElement(searchName,SearchTypeAttributValue );
		String actResult=webtl.myInnerText(getSearchResult());
		return actResult;
	}
	public void DuplicateAndEditStatus() {
		String emailBeforeDuplicate=webtl.myInnerText(getEmailTb());
		webtl.click(getDuplicateBT());
		webtl.clear(getAcName1());
		String accountName=webtl.getRandomName(10);
		webtl.sendKeys(getAcName1(),accountName);
		CommonCodes cc= new CommonCodes(webtl);
		cc.saveButton();
		String emailAfterDuplicate=webtl.myInnerText(getEmailTb());
		if (emailBeforeDuplicate.equalsIgnoreCase(emailAfterDuplicate)) {
			webtl.printMessage("Passed !,the privious data "+emailBeforeDuplicate+" and current data "+emailAfterDuplicate+" is matched successfully");
		} else {
			webtl.printMessage("Failed !,the privious data "+emailBeforeDuplicate+" and current data "+emailAfterDuplicate+" is matched successfully");
		}
	}

	public String editAccountInformation() {
		webtl.click(getEditBT());
		webtl.clear(getAcName1());
		String acNameAfrterEdit=webtl.getRandomName(10);
		webtl.sendKeys(getAcName1(),acNameAfrterEdit);
		CommonCodes cc= new CommonCodes(webtl);
		cc.saveButton();
		String acNameAfterEdit=webtl.myInnerText(getAcName2());
		return acNameAfterEdit;
	}
}
