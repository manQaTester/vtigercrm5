package org.eva.vtigercrm5.pages.marketing.leadsOr;

import org.eva.vtigercrm5.utils.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class MarketingLeadsLandingPageOr {

	public MarketingLeadsLandingPageOr(WebUtil webtl) {
		PageFactory.initElements(webtl.getDriver(),this );
	}
	
	@FindBy(xpath="//table[@class='lvt small']//tr[2]//td[4]//a")
	private WebElement accountNameTB;
	
	@FindBy(xpath="//table[@class='lvt small']//tr[2]//td[4]")
	private WebElement firstNameLNK;
	 
}
