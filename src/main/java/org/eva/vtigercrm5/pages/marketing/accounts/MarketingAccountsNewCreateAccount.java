package org.eva.vtigercrm5.pages.marketing.accounts;

import org.eva.vtigercrm5.pages.marketing.accountsOr.MarketingAccountsNewCreateAccountOr;
import org.eva.vtigercrm5.utils.WebUtil;

public class MarketingAccountsNewCreateAccount extends MarketingAccountsNewCreateAccountOr {
	
	private WebUtil webtl;
	public MarketingAccountsNewCreateAccount(WebUtil webtl) {
		super(webtl);
		this.webtl=webtl;
	}

	public String fillUpBasicInformation() {
		String ranName=webtl.getRandomName(10);
		webtl.sendKeys(getAccountNameTB(),ranName);
		webtl.sendKeys(getWebsiteTB(), ""+ranName+".er@gmail.com");
		webtl.sendKeys(getPhoneTB(), "8947863734");
		webtl.sendKeys(getTickerSymbolTB(),"plus");
		webtl.sendKeys(getFaxNameTB(),"A fax called telecopying");
		webtl.sendKeys(getPhonenumberTB(),""+ranName+".evs@gmail.com");
		webtl.sendKeys(getBillCityTB(),"kaushambi");
		webtl.sendKeys(getBillStateTB(),"utter pradesh");
		webtl.sendKeys(getBillCodeTB() ,"68536");
		webtl.sendKeys(getBillCountryTB(),"india");
		webtl.click(getCopyBillingAddressRB());
		webtl.sendKeys(getDescriptionTB(),"Do work hard until you do");
		return ranName;
	}
	
	public String fillUpBasicInformation(String phone,String tickSymbole,String faxName,String email,String city,String state,String pinCode,String country,String description) {
		String ranName=webtl.getRandomName(10);
		webtl.sendKeys(getAccountNameTB(),ranName);
		webtl.sendKeys(getWebsiteTB(), ""+ranName+".er@gmail.com");
		webtl.sendKeys(getPhoneTB(), phone);
		webtl.sendKeys(getTickerSymbolTB(),tickSymbole);
		webtl.sendKeys(getFaxNameTB(),faxName);
		webtl.sendKeys(getPhonenumberTB(),""+ranName+""+email+"");
		webtl.sendKeys(getBillCityTB(),city);
		webtl.sendKeys(getBillStateTB(),state);
		webtl.sendKeys(getBillCodeTB() ,pinCode);
		webtl.sendKeys(getBillCountryTB(),country);
		webtl.click(getCopyBillingAddressRB());
		webtl.sendKeys(getDescriptionTB(),description);
		return ranName;
	}
	
	public void fillUpMoreInformation(String chooseIndustryValueAttribute) {
		webtl.sendKeys(getOtherphoneTB(),"9876573434");
		webtl.sendKeys(getEmployeesTB(),"5345");
		webtl.sendKeys(getOtherEmailTB(),"8947863734");
		webtl.sendKeys(getOwnershipTB(),"72.27%");
		webtl.selectByValueAttribute(getIndustryTB(),chooseIndustryValueAttribute );
	}
	
}
