package org.eva.vtigercrm5.pages.marketing.leadsOr;

import org.eva.vtigercrm5.utils.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class MarketingLaedsNewCreateLeadOr {
	
	public MarketingLaedsNewCreateLeadOr(WebUtil webtl) {
		
		PageFactory.initElements(webtl.getDriver(), this);
	}
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement sirNameTB;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTB;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTB;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phoneTB;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailNameTB;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyTB;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement laneTB;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poboxTB;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement cityTB;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement countryTB;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement stateTB;

	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptionTB;

}
