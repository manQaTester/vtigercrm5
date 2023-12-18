package org.eva.vtigercrm5.pages.marketing.leadsOr;

import org.eva.vtigercrm5.utils.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class MarketingLeadsInformationPageOr {
	
	public MarketingLeadsInformationPageOr(WebUtil webtl) {
		PageFactory.initElements(webtl.getDriver(),this);
	}
 
	@FindBy(xpath="//td[text()='Lead No']/following-sibling::td")
	private WebElement leadNumber;
	
	@FindBy(xpath="//td[text()='Actions']/preceding::input[@title='Delete [Alt+D]']")
	private WebElement deleteBT;
	
	@FindBy(xpath="//span[@class='genHeaderSmall']")
	private WebElement leadStatus;

	@FindBy(xpath="//span[@id='dtlview_First Name']")
	private WebElement firstName;
	 
	}

