package org.eva.vtigercrm5.pages.marketing.accountsOr;

import org.eva.vtigercrm5.utils.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.Getter;

@Getter
public class MarketingAccountLandingPageOr {
	
	public MarketingAccountLandingPageOr(WebUtil webtl) {
		PageFactory.initElements(webtl.getDriver(),this);
	}
	@FindBy(xpath="//table[@class='lvt small']//tr[2]//td[3]//a")
	private WebElement accountNameTB;

	@FindBy(xpath="//td[text()='Actions']/preceding::input[@title='Delete [Alt+D]']")
	private WebElement accountDelete;

	@FindBy(xpath="//span[@class='genHeaderSmall']")
	private WebElement searchResult ;

	@FindBy(xpath="//td[text()='Actions']/preceding::input[@title='Duplicate [Alt+U]']")
	private WebElement duplicateBT;

	@FindBy(xpath="//input[@name='accountname']")
	private WebElement acName1;

	@FindBy(xpath="//span[@id='dtlview_Account Name']")
	private WebElement acName2;

	@FindBy(xpath="//span[@id='dtlview_Email']")
	private WebElement emailTb;

	@FindBy(xpath="//td[text()='Actions']/preceding::input[@title='Edit [Alt+E]']")
	private WebElement editBT;

}
