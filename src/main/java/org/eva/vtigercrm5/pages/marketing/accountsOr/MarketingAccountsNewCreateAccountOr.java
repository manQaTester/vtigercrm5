package org.eva.vtigercrm5.pages.marketing.accountsOr;

import org.eva.vtigercrm5.utils.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class MarketingAccountsNewCreateAccountOr {
	public MarketingAccountsNewCreateAccountOr(WebUtil webtl) {
		PageFactory.initElements(webtl.getDriver(),this);
		
	}

//	   _______________ fillUpBasicInformation ___________________
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement AccountNameTB;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement websiteTB;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneTB;
	
	@FindBy(xpath="//input[@name='tickersymbol']")
	private WebElement tickerSymbolTB;
	
	@FindBy(xpath="//input[@name='fax']")
	private WebElement faxNameTB;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement phonenumberTB;

	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAddressTB;
	
	@FindBy(xpath="//input[@name='bill_pobox']")
	private WebElement billPoBoxTB;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement billCityTB ;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billStateTB;
	
	@FindBy(xpath="//input[@name='bill_code']")
	private WebElement billCodeTB;
	
	@FindBy(xpath="//input[@name='bill_country']")
	private WebElement billCountryTB;
	
	@FindBy(xpath="//b[text()='Copy Shipping address']/parent::td/following-sibling::td//input")
	private WebElement CopyBillingAddressRB;
	
	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement productLNK;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptionTB;
	
//	   _______________ fillUpBasicInformation ___________________

	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherphoneTB;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement employeesTB;
	
	@FindBy(xpath="//input[@name='email2']")
	private WebElement otherEmailTB;
	
	@FindBy(xpath="//input[@name='ownership']")
	private WebElement ownershipTB;
	
	@FindBy(xpath="//select[@name='industry'] ")
	private WebElement industryTB;
	public WebElement getAccountNameTB() {
		return AccountNameTB;
	}

}
