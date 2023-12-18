package org.eva.vtigercrm5.pages.marketing.contactsOr;

import org.eva.vtigercrm5.utils.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class MarketingcontactsCreateContactOr {
	
	public MarketingcontactsCreateContactOr(WebUtil webtl) {
		PageFactory.initElements(webtl.getDriver(),this);
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
	
	@FindBy(xpath="//textarea[@name='mailingstreet']")
	private WebElement mailingStreetTB;
	
	@FindBy(xpath="//input[@name='mailingpobox']")
	private WebElement maillingPoBoxTB;
	
	@FindBy(xpath="//input[@name='mailingcity']")
	private WebElement maillingCityTB;
	
	@FindBy(xpath="//input[@name='mailingstate']")
	private WebElement mailingStateTB;
	
	@FindBy(xpath="//input[@name='mailingcountry']")
	private WebElement maillingCountryTB;
	
	@FindBy(xpath="//b[text()='Copy Other Address']/following::input[@name='cpy']")
	private WebElement CopyMailingAddressRB;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptionTB;

}
